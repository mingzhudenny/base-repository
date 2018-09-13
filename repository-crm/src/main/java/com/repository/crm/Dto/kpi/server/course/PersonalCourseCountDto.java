/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.server.course;

import lombok.Data;

/**
 * <pre>
 * 销售排课柱状图显示
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: PersonalCourseCountDto.java, v 0.1 2018年5月4日 下午1:26:05  Exp $
 */
@Data
public class PersonalCourseCountDto {
	
	private String teamUuid;
	
	private String saleName;
	
	/**
	 * 课程类型0：测评课1：正式课2：调试课
	 */
	private Integer courseType; 
	
	private Integer courseSum;
	
	private Integer testCourseCount;
	
	private Integer formalCourseCount;

}
