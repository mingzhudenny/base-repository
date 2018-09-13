/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.product.client.couponcode;

import com.repository.crm.Dto.account.client.leads.BaseParams;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 兑换码
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryCouponCodeDto.java, v 0.1 2018年4月10日 下午1:52:53  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryCouponCodeDto extends BaseParams{
	

	private String channelUuid;

}
