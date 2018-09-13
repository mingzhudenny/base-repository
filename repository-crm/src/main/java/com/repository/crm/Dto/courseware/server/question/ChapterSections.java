/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 章节集合
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ChapterSections.java, v 0.1 2018年7月24日 下午7:30:29  Exp $
 */
@Data
public class ChapterSections {
	
	private List<SimpleTreeNode> ChapterSections;

}
