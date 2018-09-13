/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.leads;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: LeadsRemarkDto.java, v 0.1 2018年5月24日 下午2:07:03  Exp $
 */
@Data
public class LeadsRemarkDto {
	
	private String leadsUuid;
	private String leadsPhone;
	private String content;
	private String userUuid;

}
