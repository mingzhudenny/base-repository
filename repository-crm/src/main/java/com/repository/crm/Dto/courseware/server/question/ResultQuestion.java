/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 根据条件查询返回的题目
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ResultQuestion.java, v 0.1 2018年7月31日 下午1:44:58  Exp $
 */
@Data
public class ResultQuestion {
	
	/** 题目的总数 */
	private Integer QuestionTotal;	
	/** 题目的总数 */
	private List<ZuJuanQuestionInfoModel > Questions;

}
