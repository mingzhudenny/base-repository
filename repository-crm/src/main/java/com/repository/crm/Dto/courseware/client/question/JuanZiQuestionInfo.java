/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import lombok.Data;

/**
 * <pre>
 * 题目信息
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: JuanZiQuestionInfo.java, v 0.1 2018年8月1日 下午5:19:06  Exp $
 */
@Data
public class JuanZiQuestionInfo {

	/** 题目Id */
	private Integer questionId;
	/** 题目序号 */
	private Integer questionNumber;
	/** 题目满分，保留一位小数  */
	private Double fullScore;
}
