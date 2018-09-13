/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import lombok.Data;

/**
 * <pre>
 * 新增题集里面的题目
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QuestionInfoDTO.java, v 0.1 2018年7月31日 下午3:03:18  Exp $
 */
@Data
public class QuestionInfoDTO {
	
	/** 题目id */
	private Integer questionId;
	/** 题型id */
	private Integer questionCategoryId;
	/** 题目的分数  */
	private Double score;

}
