/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import lombok.Data;

/**
 * <pre>
 * 题目的选项
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QuestionOptionInfo.java, v 0.1 2018年8月6日 上午11:20:37  Exp $
 */
@Data
public class QuestionOptionInfo {
	
	/** 选项的排序 */
	private Integer orderIndex;
	/** 选项内容  */
	private String text;
	/** 选项标识：如：A、B、C等 s  */
	private String questionOptionId;

}
