/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.client.student;

import java.io.Serializable;

import com.repository.crm.Dto.account.client.leads.BaseParams;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * <pre>
 *  查询CR续费学生的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryCrRenewStudentParams.java, v 0.1 2018年4月2日 下午2:43:31  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryCrRenewStudentDto extends BaseParams implements Serializable {


	/**  */
	private static final long serialVersionUID = -3878912906828702577L;
	/**  */
	//学生手机姓名或者手机号码
	private String stuParams;	
	private String grade;
	private String subject;
	private String crUuid;
	//续费时间
    private String createDateStart;
    private String createDateEnd;

}
