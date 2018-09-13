/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.client.course;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryTeamCountDto.java, v 0.1 2018年5月4日 下午1:21:53  Exp $
 */
@Data
public class QueryTeamCountDto {
	
	/** 上课日期 */
	private String courseDateStart;
	
	private String courseDateEnd;
	
	private String createDateStart;
	/** 提交日期 */
	private String createDateEnd;
	

}
