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
 * @version $Id: RyStudentAnswerRecordDTO.java, v 0.1 2018年7月27日 下午1:21:09  Exp $
 */
@Data
public class RyStudentAnswerRecordDTO {
	
	/** 题目的id */
	private Integer questionId;

	private String studentAnswer;

}
