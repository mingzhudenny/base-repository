/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 获取题目的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryExerciseDTO.java, v 0.1 2018年7月27日 上午10:34:44  Exp $
 */
@Data
public class QueryExerciseDTO2 {
	
	private String userCode;
	/** 学科 */
	private Integer courseId;
	/** 教材版本*/
	private Integer bookVersionId;
	/** 教材*/
	private Integer courseMappingId;
	/** 难度*/
	private Integer questionLevelId;
	/** 知识点 */
	private List<Integer> knowledgePointIds;
	/** 章节 */
	private List<Integer> sectionIds;

}
