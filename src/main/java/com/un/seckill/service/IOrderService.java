package com.un.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.un.seckill.pojo.Order;
import com.un.seckill.pojo.User;
import com.un.seckill.vo.GoodsVo;
import com.un.seckill.vo.OrderDetailVo;


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
public interface IOrderService extends IService<Order> {

	/**
	 * 功能描述: 秒杀
	 *
	 * @param:
	 * @return:
	 *
	 *
	 *
	 * @since: 1.0.0
	 * @Author:un
	 */
	Order seckill(User user, GoodsVo goods);


    OrderDetailVo detail(Long orderId);

    String createPath(User user, Long goodsId);

	boolean checkPath(String path,User user, Long goodsId);
}
