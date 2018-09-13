/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.course;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryWaitManagerDto.java, v 0.1 2018年5月19日 下午3:56:53  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryWaitManagerDto extends BaseDto{
	
	private String userUuid;
	private  String nameOrPhone;

}
