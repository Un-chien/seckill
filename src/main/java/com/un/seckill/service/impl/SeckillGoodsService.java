package com.un.seckill.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.un.seckill.mapper.OrderMapper;
import com.un.seckill.mapper.SeckillGoodsMapper;
import com.un.seckill.pojo.Order;
import com.un.seckill.pojo.SeckillGoods;
import com.un.seckill.service.IOrderService;
import com.un.seckill.service.ISeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeckillGoodsService extends ServiceImpl<SeckillGoodsMapper, SeckillGoods> implements ISeckillGoodsService {

    @Autowired
    private SeckillGoodsMapper seckillGoodsMapper;

    @Override
    public List<SeckillGoods> findSeckillGoods() {
        return seckillGoodsMapper.findSeckillGoods();
    }
}
