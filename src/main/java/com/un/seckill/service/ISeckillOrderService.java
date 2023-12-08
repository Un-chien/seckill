package com.un.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.un.seckill.pojo.Order;
import com.un.seckill.pojo.SeckillOrder;
import com.un.seckill.pojo.User;
import com.un.seckill.vo.GoodsVo;

/**
 * <p>
 *  服务类
 * </p>
 * @author un
 *
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

    Long getResult(User user, Long goodsId);
}
