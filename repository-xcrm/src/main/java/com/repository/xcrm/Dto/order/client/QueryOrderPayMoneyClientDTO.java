package com.repository.xcrm.Dto.order.client;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 获取支付金额的客户端传递参数
 *
 * @author csy
 * @time  2018年5月3日 下午4:02:38
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryOrderPayMoneyClientDTO extends BaseDto{
	/**
	 * 课时包类型
	 */
	private String coursePriceType;
	/**
	 * 课时包活动类型
	 */
	private String coursePriceActivityType;
	/**
	 * 购买时长
	 */
	private String buyLength;
	/**
	 * 优惠码
	 */
	private String promotionCode;
}
