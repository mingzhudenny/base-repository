/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 教材，章节
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseMappingChapter.java, v 0.1 2018年8月15日 下午3:29:17  Exp $
 */
@Data
public class CourseMappingChapter {
	
	/** */
	List<CourseMapping> courseMappingList;

}
