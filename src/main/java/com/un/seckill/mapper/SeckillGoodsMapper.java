package com.un.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.un.seckill.pojo.SeckillGoods;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 *
 *
 *
 * @author un
 *
 */
public interface SeckillGoodsMapper extends BaseMapper<SeckillGoods> {

    List<SeckillGoods> findSeckillGoods();

}
