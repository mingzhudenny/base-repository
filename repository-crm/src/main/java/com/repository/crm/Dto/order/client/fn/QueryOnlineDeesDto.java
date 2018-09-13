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
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryOnlineDeesDto.java; v 0.1 2018年5月15日 下午5:00:50  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryOnlineDeesDto extends BaseDto{
	
	private String studentName;
	private String studentPhone	;
	private String checkStartTime;
	private String checkEndTime;
	private String payType;
	private	String saleName;
	private String teamName;

}
