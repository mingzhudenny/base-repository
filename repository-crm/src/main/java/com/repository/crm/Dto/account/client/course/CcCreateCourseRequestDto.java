/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.course;

import lombok.Data;

/**
 * <pre>
 * cc 提交课程请求
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CcCreateCourseRequestDto.java; v 0.1 2018年5月26日 上午11:36:26  Exp $
 */
@Data
public class CcCreateCourseRequestDto {
	
	private String courseOrderUuid;
	private String teacherName;
	private String type;
	private String length;
	private String style;
	private String hz;
	private String level;
	private String dates;
	private String startTime;
	private String endTime;
	private String other;
	private String userUuid;


}
