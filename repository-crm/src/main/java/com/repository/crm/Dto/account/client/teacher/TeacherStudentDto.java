/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.teacher;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 老师学生关联关系
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TeacherStudentDto.java, v 0.1 2018年6月9日 下午2:01:43  Exp $
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TeacherStudentDto extends BaseDto {
	
	/**   学生姓名或者手机号码 */
	private String stuNameOrPhone;
	/** 老师姓名或者手机号码 */
	private String tcNameOrPhone;

}
