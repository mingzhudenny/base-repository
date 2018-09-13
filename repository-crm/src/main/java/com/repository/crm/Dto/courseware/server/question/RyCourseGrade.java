/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import com.repository.crm.Po.SysEnum;

import lombok.Data;

/**
 * <pre>
 * 软云的科目，年级
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyCourseGrade.java, v 0.1 2018年8月15日 下午12:00:42  Exp $
 */
@Data
public class RyCourseGrade {
	
	List<SysEnum> gradeList ;
	
	List<SysEnum> courseList;
	
	List<SysEnum> questionLevelList;

}
