/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 学生及做题信息
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: StudentScoreInfo.java, v 0.1 2018年8月1日 下午5:14:10  Exp $
 */
@Data
public class StudentScoreInfo {

	/** 学生姓名，不能超过6个字符  */
	private String studentName;
	/** 考生号，不能超过50个字符，不能重复，每个学生唯一  */
	private String studentCode;
	/** 学校名称  */
	private String schoolName;
	/** 班级名称  */
	private String className;
	/** 学生题目得分集合  */
	private List<ReportScoreInfo> scoreInfos;
	
}
