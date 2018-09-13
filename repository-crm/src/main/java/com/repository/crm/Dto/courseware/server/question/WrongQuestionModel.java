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
 * @version $Id: WrongQuestionModel.java, v 0.1 2018年8月3日 下午3:03:42  Exp $
 */
@Data
public class WrongQuestionModel {
	
	/** 题目信息 */
	private QuestionInfoModel Question;
	/** 学生最近做错答案 */
	private String StudentAnswer;
	/** 学生最近做错时间  yyyy/MM/dd HH:mm:ss  */
	private String  Date;

}
