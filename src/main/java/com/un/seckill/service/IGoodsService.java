package com.un.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.un.seckill.pojo.Goods;
import com.un.seckill.vo.GoodsVo;

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
public interface IGoodsService extends IService<Goods> {

	/**
	 * 功能描述: 获取商品列表

	 * @since: 1.0.0
	 * @Author:un
	 */
	List<GoodsVo> findGoodsVo();


	/**
	 * 功能描述: 获取商品详情

	 * @since: 1.0.0
	 * @Author:un
	 */
	GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
