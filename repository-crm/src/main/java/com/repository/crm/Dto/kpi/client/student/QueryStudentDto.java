/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.client.student;

import java.io.Serializable;
import java.util.List;

import com.repository.crm.Dto.account.client.leads.BaseParams;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 查询学生的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryStudentDto.java; v 0.1 2018年3月28日 上午11:18:50  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryStudentDto extends BaseParams implements Serializable {
	
	/**  */
	private static final long serialVersionUID = 97410428119130448L;
	/**  */
    private String stuParams;
	private String name;
	private String phone;
	private String grade;
	private String subject;
	private String ccName;
	private String ccTeam;
	private String crName;
	private String crTeam;
	/** 移交时间 */
	private  String handOutStartTime;
	private String handOutEndTime;	
	private Integer keyPoint;
	private List<Integer> noKeyPoint;
	/** 报名时间 */
	private String registDateStart;
	private String registDateEnd;

}
