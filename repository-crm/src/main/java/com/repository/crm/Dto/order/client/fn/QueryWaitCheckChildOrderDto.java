/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.order.client.fn;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 待审核子单查询条件
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryWaitCheckChildOrder.java; v 0.1 2018年5月15日 下午5:00:50  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryWaitCheckChildOrderDto extends BaseDto{
	
	private  String name;
	private String phone;
	private String submitter;
	private String submitStartTime;
	private String submitEndTime;
}
