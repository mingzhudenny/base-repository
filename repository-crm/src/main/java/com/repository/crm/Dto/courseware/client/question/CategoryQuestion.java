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
 * @version $Id: CategoryQuestion.java, v 0.1 2018年7月31日 上午10:33:52  Exp $
 */
@Data
public class CategoryQuestion {
	
	/** 题目id */
	private Integer QuestionId;
	/** 得分，保留一位有效数字  */
	private Double Score;
	/** 排序  */
	private Integer OrderIndex;

}
