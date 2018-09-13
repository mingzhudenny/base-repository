/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ScoreInfo.java, v 0.1 2018年7月26日 下午7:43:26  Exp $
 */
@Data
public class ScoreInfo {
	
	/** 题目的id */
	private Integer QuestionId;
	/** 得分 */
	private Double Score;
    /** 答题是否正确  1 正确 */
	private Integer IsCorrect;
	/**学生答案,对于学生答案不做处理，直接用于页面展示或者其它接口返回 */
	private String StudentAnswer;

}
