/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.io.Serializable;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: StudentQuestionSummary.java, v 0.1 2018年7月26日 下午7:34:24  Exp $
 */
@Data
public class StudentQuestionSummary implements Serializable{

	/**  */
	private static final long serialVersionUID = -8911938625702318140L;
	
	private Integer questionId;
	/** 得分 */
	private Double score;
	
	private String studentAnswer;
	/** 学生是否做对，1表示做对 */
	private Integer isCorrect;

}
