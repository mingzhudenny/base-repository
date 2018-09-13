/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * createPromotionExercise 返回的结果
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CreatePromotionExerciseResult.java, v 0.1 2018年8月3日 上午11:05:08  Exp $
 */
@Data
public class CreatePromotionExerciseResult {
	
	/**  题集id，用于提交成绩 */
	private String TeacherExamId;
	/**  题集的题目信息集合 */
	private List<TeacherExamQuestionModel> Questions;

}
