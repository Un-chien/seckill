package com.un.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.un.seckill.pojo.Goods;
import com.un.seckill.vo.GoodsVo;

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
public interface GoodsMapper extends BaseMapper<Goods> {

	/**
	 * 功能描述: 获取商品列表
	 *
	 * @param:
	 * @return:
	 *
	 *
	 *
	 * @since: 1.0.0
	 * @Author:un
	 */
	List<GoodsVo> findGoodsVo();

	/**
	 * 功能描述: 获取商品详情
	 *
	 * @param:
	 * @return:
	 *
	 *
	 *
	 * @since: 1.0.0
	 * @Author:un
	 * @param goodsId
	 */
	GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
