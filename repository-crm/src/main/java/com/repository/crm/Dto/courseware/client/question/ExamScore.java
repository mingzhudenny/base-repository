/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 保存题集
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ExamScore.java, v 0.1 2018年7月31日 上午10:29:00  Exp $
 */
@Data
public class ExamScore {
	
	/** 题集总分  */
	private Integer TotleScore;
	/** 题型分数集合  */
	private List<CategoryScore> CategoryScores;

}
