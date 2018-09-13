/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.client.leads;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 推荐leads 查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RecommendLeadsDto.java; v 0.1 2018年6月19日 上午10:56:28  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class RecommendLeadsDto extends BaseDto {
	
	/** 学生姓名 */
	private String leadsName;
	/** 学生手机号码 */
	private String leadsPhone;
	/** 学生年级 */
	private String grade;
	/** 学生科目 */
	private String subject;
	/** 推荐的cc */
	private String recommendCcName;
	/** 推荐的cr */
	private String recommendCrName;
	/** 报名时间  */
	private String signUpStartTime;
	private String signUpEndTime;
	/** 是否排课 */
	private String isManagerCourse;
	/** 是否付费  */
	private String isPay;
	/** 录入人  */
	private String createUser;
	/** 推荐类型   1 cr推荐  2 合肥老师推荐 */
	private Integer recommendType;

}
