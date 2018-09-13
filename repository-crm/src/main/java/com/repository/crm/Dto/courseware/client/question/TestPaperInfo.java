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
 * @version $Id: TestPaperInfo.java, v 0.1 2018年8月2日 下午1:08:39  Exp $
 */
@Data
public class TestPaperInfo {
	
	/** 题目Id */
	private Integer questionId;
	/** 题目序号 */
	private Integer questionNunber;
	/** 题目满分，保留一位小数  */
	private Double fullScore;	
	/** 题目得分，保留一位小数 */
	private Double score;
}
