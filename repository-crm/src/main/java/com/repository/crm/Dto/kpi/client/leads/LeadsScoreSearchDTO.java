/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.client.leads;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * <pre>
 *  学生成绩报表查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: LeadsScoreSearchDTO.java, v 0.1 2018年4月26日 下午8:15:47  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LeadsScoreSearchDTO extends BaseDto{
	

	/** leads 手机号码或者姓名  */
	private String leadsParams;
	/** 科目  */
	private String subject;
	/** 签单时间开始  */
	private String createDateStart;
	/** 签单时间结束 */
	private String createDateEnd;	
	

}
