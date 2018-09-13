/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: PrivateQuestion.java, v 0.1 2018年8月6日 上午11:17:00  Exp $
 */
@Data
public class PrivateQuestion {
	
	/** 题目的序号，从1开始 */
	private Integer questionIndex;
	/** 题目的分数，保留一位有效数字  */
	private Double score;
	/** 题干信息  */
	private String stem;
	/** 知识点id  */
	private Integer knowledgePointId;
	/** 解题方法标签id  */
	private String analyticMethod;
	/** 能力结构标签id  */
	private String abilityStructure;
	/** 题目难度  */
	private Integer questionLevel;
	/** 题目解析  */
	private String analysis;
	/** 章节id  */
	private List<Integer> sectionMappings;
	/** 选项信息，选择题需要  */
	private List<QuestionOptionInfo> questionOptions;
	/** 答案  */
	private String answer;
	/** 题型id */
	private Integer questionCategoryId;
}
