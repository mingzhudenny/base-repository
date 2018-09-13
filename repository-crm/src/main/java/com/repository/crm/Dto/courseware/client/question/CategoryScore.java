/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 保存题集的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CategoryScore.java, v 0.1 2018年7月31日 上午10:30:22  Exp $
 */
@Data
public class CategoryScore {
	
	/**  题型id */
	private Integer CategoryId;
	/**  题型总分，保留一位有效数字 */
	private  Double CategoryTotalScore;
	/**  排序 */
	private  Integer OrderIndex;
	/**  题目分数集合 */
	private  List< CategoryQuestion> CategoryQuestions;
    
}
