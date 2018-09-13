/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.client.course;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryPersonalCountDto.java, v 0.1 2018年5月4日 下午1:21:53  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryPersonalCountDto extends  BaseDto {
	
	/** 上课日期 */
	private String courseDateStart;
	
	private String courseDateEnd;
	
	private String createDateStart;
	/** 提交日期 */
	private String createDateEnd;
	
	private String teamUuid;
	

}
