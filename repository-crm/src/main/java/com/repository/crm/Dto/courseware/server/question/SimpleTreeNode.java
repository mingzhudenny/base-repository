/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 章节
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: SimpleTreeNode.java, v 0.1 2018年7月24日 下午7:27:57  Exp $
 */
@Data
public class SimpleTreeNode {
	
	/** 父节点ID*/
	private Integer parentNodeId;
	/** 章节id */
	private Integer nodeId;
	/** 章节名称 */
	private String nodeName;
	/** 排序 */
	private Integer orderIndex;
	/** 子层节点 */
	private List<SimpleTreeNode> children;	

}
