/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.server.course;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TeamCourseCountDto.java, v 0.1 2018年5月4日 下午1:26:05  Exp $
 */
@Data
public class TeamCourseCountDto {
	
	private String teamUuid;
	
	private String teamName;
	
	private Integer testCourseCount;
	
	private Integer formalCourseCount;

}
