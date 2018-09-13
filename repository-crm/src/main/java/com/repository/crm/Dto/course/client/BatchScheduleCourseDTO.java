/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.course.client;

import java.util.List;

import com.repository.crm.Po.CpCourse;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: BatchScheduleCourseDTO.java, v 0.1 2018年4月16日 下午5:24:56  Exp $
 */
@Data
public class BatchScheduleCourseDTO {
	
	List<CpCourse> courseList;

}
