/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TeacherExamQuestionModel.java, v 0.1 2018年7月24日 下午6:55:58  Exp $
 */
@Data
public class TeacherExamQuestionModel {	
	
	/** 题目信息 */
	private  QuestionInfoModel question ;
	/**题目在题集的排序 */
	private  Integer order ;
	/**题目在题集的分数，练习没有分数  */
	private  Double score ;

}
