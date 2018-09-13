/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 生成报告返回的错误信息
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CreateReportError.java, v 0.1 2018年8月1日 下午7:12:31  Exp $
 */
@Data
public class CreateReportError {
	
	/** 考生号，若不是考生信息错误，该字段返回为空 */
	private String StudentCode;
	/** 错误信息集合 */
	private List<String> ErrorMessages;

}
