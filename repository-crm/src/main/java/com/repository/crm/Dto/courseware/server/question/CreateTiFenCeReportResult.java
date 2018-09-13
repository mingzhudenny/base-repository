/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 生成提策报告返回的内容
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CreateTiFenCeReportResult.java, v 0.1 2018年8月1日 下午7:10:53  Exp $
 */
@Data
public class CreateTiFenCeReportResult {
	
	/** 生成报告记录唯一标识，当数据检测不通过时，值为空 */
	private String reprotRecordId;
	/** 数据检测错误信息 */
	private List<CreateReportError> checkErrorMessage;

}
