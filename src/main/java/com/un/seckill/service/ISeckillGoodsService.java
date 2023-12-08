package com.un.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.un.seckill.pojo.SeckillGoods;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 *
 *
 *
 * @author un
 *
 */
public interface ISeckillGoodsService extends IService<SeckillGoods> {
    List<SeckillGoods> findSeckillGoods();
}
