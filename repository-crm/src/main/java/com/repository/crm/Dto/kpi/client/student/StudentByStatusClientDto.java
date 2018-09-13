/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.client.student;

import java.io.Serializable;
import java.util.List;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 查询学生的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryStudentParams.java; v 0.1 2018年3月28日 上午11:18:50  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class StudentByStatusClientDto extends BaseDto implements Serializable {
	
	/**  */
	private static final long serialVersionUID = 4765592945263018937L;
	private String leadsParam;
	private String grade;
	private String ccName;
	private String ccTeamUuid;
	private String crName;
	private String crTeamUuid;
	private String keyPoint;
	private String signUpStartTime;
	private String signUpEndTime;	
	private List<Integer> noKeyPoint;

}
