package com.un.seckill.vo;

import com.un.seckill.pojo.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单详情返回对象
 * <p>
 *
 *
 *
 * @author un
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailVo {
	private Order order;

	private GoodsVo goodsVo;
}
