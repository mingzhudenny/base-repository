/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 练习题
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: Exercise.java, v 0.1 2018年7月27日 上午10:21:51  Exp $
 */
@Data
public class Exercise {
	
	private String TeacherExamId;
	
	private List<TeacherExamQuestionModel> Questions;

}
