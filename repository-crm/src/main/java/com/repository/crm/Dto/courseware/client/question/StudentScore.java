/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: StudentScore.java, v 0.1 2018年7月26日 下午7:50:29  Exp $
 */
@Data
public class StudentScore {	
	
	private String UserCode;
	
	private String UserTrueName;

	private List<ScoreInfo> Scores;
}
