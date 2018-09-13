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
 * @version $Id: NoTeacherCourseDto.java, v 0.1 2018年6月9日 下午4:49:20  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class NoTeacherCourseDto  extends BaseDto{
	
	/** 学生的姓名或者手机号码  */
	private String stuNameOrPhone;


}
