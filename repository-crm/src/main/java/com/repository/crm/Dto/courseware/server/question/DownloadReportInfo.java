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
 * @version $Id: DownloadReportInfo.java, v 0.1 2018年8月2日 下午5:08:40  Exp $
 */
@Data
public class DownloadReportInfo {
	
	/** 学生姓名 */
	private String  StudentName;
	/** 考生号 */
	private String  StudentCode;
	/** 学校名称 */
	private String  SchoolName;
	/** 班级名称 */
	private String  ClassName;
	/** 下载报告地址 */
	private String  ReportUrl;
	

}
