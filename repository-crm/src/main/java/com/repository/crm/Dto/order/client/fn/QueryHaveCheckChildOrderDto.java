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
 * 已审核子弹查询条件
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryHaveCheckChildOrderDto.java; v 0.1 2018年5月15日 上午10:17:41  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryHaveCheckChildOrderDto extends BaseDto{
	
	private String leadsName; 
	private String  leadsPhone;
	private String  submitter;
	private String  startCheckTime; 
	private String  endCheckTime; 
	private String  checkStatus;

}
