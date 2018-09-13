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
 * @version $Id: IntelligentCategoryCountModel.java, v 0.1 2018年8月3日 上午10:29:52  Exp $
 */
@Data
public class IntelligentCategoryCountModel {

	/** 题型ID */
	private Integer questionCategoryId;
	/** 题目数量（总数不超过50题） */
	private Integer questionCount;
}
