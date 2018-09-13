/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.course.client.teachdepartment;

import java.util.List;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 完课管理查询条件
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseEndDTO.java; v 0.1 2018年7月13日 下午3:20:23  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CourseEndDTO extends BaseDto{
	
	private List<Integer> courseTypes;
	private String courseCastType; 
	private String leadsParam; 
	private String teacherParam;
	private String courseStartDate; 
	private String courseEndDate;
	private Integer courseType;

}
