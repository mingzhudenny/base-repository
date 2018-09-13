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
 * @version $Id: GetExerciseDTO.java, v 0.1 2018年8月8日 上午10:49:39  Exp $
 */
@Data
public class GetExerciseDTO {
	
	/** 用户的唯一标识 */
	private String userCode;
	/** 学科id */
	private Integer courseId;
	/** 知识点 id */
	private List<Integer> knowledgePointIds;
	/** 条数  */
	private Integer questionCount;

}
