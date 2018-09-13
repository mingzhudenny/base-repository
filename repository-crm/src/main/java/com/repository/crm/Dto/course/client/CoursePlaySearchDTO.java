/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.course.client;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CoursePlaySearchDTO.java, v 0.1 2018年4月25日 下午1:46:05  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CoursePlaySearchDTO extends BaseDto{
	
	
	private String leadsParam;
	private String teacherParam;
	private String userParam;
	private String courseType; 
	private String courseStartDate;
	private String courseEndDate;
	/** 是否有课程回放*/
	private Integer isPlay;
	

}
