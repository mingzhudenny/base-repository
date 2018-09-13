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
 *  财务 待审核业绩查询条件
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryWaitCheckDeedsDto.java; v 0.1 2018年5月15日 下午5:00:50  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryWaitCheckDeedsDto extends BaseDto{

	
	private String leadsName;
	private String leadsPhone;
	private String submitter;
	private String submitStartTime;
	private String submitEndTime;
	private String courseLevel;
	private String courseActivityLevel;
	private String payType;
	private String saleType;
}
