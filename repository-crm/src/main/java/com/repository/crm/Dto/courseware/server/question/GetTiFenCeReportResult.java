/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 获取提分策返回的内容
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: GetTiFenCeReportResult.java, v 0.1 2018年8月2日 下午5:07:23  Exp $
 */
@Data
public class GetTiFenCeReportResult {
	
	/** 报告生成状态  4 已经生成报告*/
	private Integer ProcessStatus;
	
	private List<DownloadReportInfo> ReportInfos;

}
