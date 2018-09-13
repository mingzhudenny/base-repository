/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.server.leads;

import java.util.Date;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * <pre>
 *  学生成绩报表查询返回数据
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: LeadsScoreDTO.java, v 0.1 2018年4月26日 下午8:15:47  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LeadsScoreDTO extends BaseDto{
	

	/** leads 姓名  */
	private String leadsName;
	/** leads 手机号码  */
	private String leadsPhone;
	/** 手机号码  */
	private String crName;
	/** 科目  */
	private String subject;	
	/** 科目  */
	private Integer firstScore;	
	
	private Integer maxSscore;	
	
	private Date maxSscoreTime;
	
	private Date createDate;
	

}
