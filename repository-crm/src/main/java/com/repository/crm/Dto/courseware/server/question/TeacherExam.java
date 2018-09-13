/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 题集
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TeacherExam.java, v 0.1 2018年7月24日 下午6:59:00  Exp $
 */
@Data
public class TeacherExam {
	
	
	/** 题集的标识id */
	private  String  teacherExamId ;	
	/** 教材版本Id   */
	private Integer bookVersionId;
	/** 题集的名字 */
	private  String  teacherExamName ;
	/** 题集的创建时间，格式：yyyy/MM/dd HH:mm:ss */
	private  String  createDateTime ;
	private Date createDate;
	private String createUserId;
	/**题集的题目信息集合 */
	private  List<TeacherExamQuestionModel>  questions ;

}
