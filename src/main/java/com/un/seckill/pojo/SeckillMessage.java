package com.un.seckill.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 秒杀信息
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
public class SeckillMessage {
	private User user;
	private Long goodId;
}
