/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.io.Serializable;

import lombok.Data;

/**
 * <pre>
 * 测评知识点正确率
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: StudentAccuracySummary.java, v 0.1 2018年7月26日 下午7:32:30  Exp $
 */
@Data
public class StudentAccuracySummary implements Serializable {
	
	/**  */
	private static final long serialVersionUID = -7649716109371574203L;

	private Integer itemId;
	
	private String displayName;
	/** 正确率 */
	private Double studentAccuracy;

}
