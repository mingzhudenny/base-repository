/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.common.client;

import lombok.Data;


/**
 * 
 * <pre>
 * 发送短信的DTO
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: MessageDto.java, v 0.1 2018年7月10日 下午2:53:27  Exp $
 */
@Data
public class MessageDto {
	
	private String phone;

	private String content;	

}
