/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import lombok.Data;

/**
 * <pre>
 * 软云用户注册
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyUserDTO.java; v 0.1 2018年7月25日 下午4:50:51  Exp $
 */
@Data
public class RyUserDTO {	
	
	/** 软云*/
	private String userCode;	
	private String name;
	private Integer userTypeId;
	private Integer courseId;
	private Integer gradeId; 

}
