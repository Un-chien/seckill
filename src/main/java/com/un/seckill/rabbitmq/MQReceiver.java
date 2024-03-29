package com.un.seckill.rabbitmq;

import com.un.seckill.pojo.SeckillMessage;
import com.un.seckill.pojo.SeckillOrder;
import com.un.seckill.pojo.User;
import com.un.seckill.service.IGoodsService;
import com.un.seckill.service.IOrderService;
import com.un.seckill.util.JsonUtil;
import com.un.seckill.vo.GoodsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MQReceiver {
    @Autowired
    private IGoodsService goodsService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private IOrderService orderService;

    @RabbitListener(queues = "seckillQueue")
    public void receive(String message) {
        log.info("接收消息" + message);
        SeckillMessage seckillMessage = JsonUtil.jsonStr2Object(message, SeckillMessage.class);
        Long goodsId = seckillMessage.getGoodId();
        User user = seckillMessage.getUser();
        //判断数据库的库存
        GoodsVo goodsVo = goodsService.findGoodsVoByGoodsId(goodsId);
        if (goodsVo.getGoodsStock() < 1) {
            return;
        }
        //判断是否重复购买
        SeckillOrder seckillOrder = (SeckillOrder) redisTemplate.opsForValue().get("order:" + user.getId() + ":" + goodsId);
        if (seckillOrder != null) {
            return;
        }
        //下单,写入数据库
        orderService.seckill(user, goodsVo);
    }
}
