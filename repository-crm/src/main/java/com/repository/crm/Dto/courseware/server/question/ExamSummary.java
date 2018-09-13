/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ExamSummary.java, v 0.1 2018年7月30日 下午2:06:02  Exp $
 */
@Data
public class ExamSummary {
	
	/** 此次测评知识点正确率 */
	private List<StudentAccuracySummary> knowledgePointAnalysis;
	/** 此次测评能力结构标签正确率 */
	private List<StudentAccuracySummary> abilityStructureAnalysis;
	/** 此次测评解题方法标签正确率 */
	private List<StudentAccuracySummary> analyticMethodAnalysis;
	/** 此次测评题目得分情况 */
	private List<StudentQuestionSummary> examQuestionAnalysis;

}
