/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 穿件私有题集反悔的内容
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CreatePrivateQuestionSetResult.java, v 0.1 2018年8月6日 下午4:42:42  Exp $
 */
@Data
public class CreatePrivateQuestionSetResult {
	
	/** 题集id  */
	private String TeacherExamId;
	/** 题集中题目id集合 */
	private List<PrivateQuestionSetQuestion> PrivateQuestionSetQuestions;

}
