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
 * cc待跟进查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CcFollowUpDto.java; v 0.1 2018年5月18日 下午1:34:57  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CcFollowUpDto extends BaseDto {
	
	 private String ccUuid;
	 private String crUuid;
	 private String name; 
	 private  String phone;
	 private  String grade;
	 private  String keyPointType;
	 private  String startDate; 
	 private  String endDate;
	 private Integer leadsStatus;

}
