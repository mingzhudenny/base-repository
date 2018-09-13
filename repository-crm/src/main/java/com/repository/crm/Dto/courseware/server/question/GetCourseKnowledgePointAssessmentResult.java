/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import lombok.Data;

/**
 * <pre>
 * 获取学生某个学科的所有知识点测评结果信息
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: GetCourseKnowledgePointAssessmentResult.java, v 0.1 2018年8月3日 下午2:48:07  Exp $
 */
@Data
public class GetCourseKnowledgePointAssessmentResult {
	
	/** 知识点id */
	private Integer KnowledgePointId;
	/** 学生知识点做题数量 */
	private Integer StudentQuestionCount;
	/** 学生知识点做错题目数量  */
	private Integer WrongCount;
	/** 学生知识点当前能力分值，精确小数点后两位  */
	private Double Score;

}
