/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 教材
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseMapping.java, v 0.1 2018年8月15日 下午3:30:03  Exp $
 */
@Data
public class CourseMapping {
	
	/** 教材ID*/
	private Integer courseMappingId;
	/** 教材名称*/
	private String courseMappingName;
	/** 章节 */
	List<SimpleTreeNode> chapterList;

}
