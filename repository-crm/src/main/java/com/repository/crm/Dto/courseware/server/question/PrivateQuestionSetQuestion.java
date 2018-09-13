/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import lombok.Data;

/**
 * <pre>
 * 私有题集返回的题目id
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: PrivateQuestionSetQuestion.java, v 0.1 2018年8月6日 下午4:43:54  Exp $
 */
@Data
public class PrivateQuestionSetQuestion {
	
	/** 题目id */
	private Integer QuestionId;
	/** 排序 */
	private Integer OrderIndex;

}
