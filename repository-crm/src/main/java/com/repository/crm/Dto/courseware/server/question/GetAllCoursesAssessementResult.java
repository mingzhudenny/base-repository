/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import lombok.Data;

/**
 * <pre>
 * GetAllCoursesAssessement 返回的数据
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: GetAllCoursesAssessementResult.java, v 0.1 2018年8月3日 下午2:40:16  Exp $
 */
@Data
public class GetAllCoursesAssessementResult {
	
	/**  学科id */
	private Integer CourseId;
	/**  学科做题数量 */
	private Integer StudentQuestionCount;
	/** 学科做错题目数量 */
	private String WrongCount;
	/** 学科当前能力分值，精确小数点后两位  */
	private Double Score;

}
