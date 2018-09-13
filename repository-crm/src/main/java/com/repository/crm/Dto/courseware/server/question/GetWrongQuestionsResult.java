/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: GetWrongQuestionsResult.java, v 0.1 2018年8月3日 下午3:06:18  Exp $
 */
@Data
public class GetWrongQuestionsResult {
	
	/** 题集的题目信息集合 */
	private List<WrongQuestionModel> Questions;
	/** 总页数 */
	private Integer TotalPageCount;

}
