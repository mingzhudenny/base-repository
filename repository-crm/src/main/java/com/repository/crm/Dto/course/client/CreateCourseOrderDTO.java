/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.course.client;

import java.util.Date;

import lombok.Data;

/**
 * <pre>
 * 创建课程订单
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CreateCourseOrderDTO.java, v 0.1 2018年4月12日 下午1:58:51  Exp $
 */
@Data
public class CreateCourseOrderDTO {
	
	private String stuPhone;
	
	private String tcPhone;
	
	private String grade;
	
	private String subject;
	
	private Long userId;
	
	private String userUuid;
	
	private String userName;
	
	private Date createDate;

}
