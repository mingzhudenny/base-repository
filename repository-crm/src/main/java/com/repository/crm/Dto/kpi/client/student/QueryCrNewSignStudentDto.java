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
 *  查询CR新签约学生的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryCrNewSignStudentParams.java, v 0.1 2018年4月2日 下午2:43:31  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryCrNewSignStudentDto extends BaseParams implements Serializable {
	
	/**  */
	private static final long serialVersionUID = -7879904387579135676L;
	/**  */
	//学生手机姓名或者手机号码
	private String stuParams;	
	private String grade;
	private String subject;
	private String crUuid;
	//签约时间
    private String signDateStart;
    private String signDateEnd;

}
