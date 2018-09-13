/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 知识点集合，树形结构
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: KnowledgePoints.java, v 0.1 2018年7月24日 下午7:37:22  Exp $
 */
@Data
public class KnowledgePoints {
	
	private List<SimpleTreeNode> KnowledgePoints;

}
