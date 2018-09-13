/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.leads;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * Cc我的leads
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CcLeadsDto.java; v 0.1 2018年6月26日 下午1:13:22  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CcLeadsDto extends BaseDto{
	
	private String userUuid;
	private String name;
	private String phone;
	private String grade;
	private String keyPointType;
	private String startDate;
	private String endDate;
	
}
