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
 * @version $Id: QueryExerciseDTO.java, v 0.1 2018年7月27日 上午10:34:44  Exp $
 */
@Data
public class QueryExerciseDTO {
	
	private String userCode;
	private Integer courseId;
	private List<Integer> knowledgePointIds;

}
