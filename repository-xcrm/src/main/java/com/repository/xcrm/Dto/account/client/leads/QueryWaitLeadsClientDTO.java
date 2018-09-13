package com.repository.xcrm.Dto.account.client.leads;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class QueryWaitLeadsClientDTO extends BaseDto{
	
	/**
	 * 用户的uuid
	 */
	private String userUuid;
	/**
	 * 优先跟进状态0:未标记1：优先跟进2：无
	 */
	private Integer signStatus;
	/**
	 * leads筛选条件 姓名或者电话
	 */
	private String leadsParam;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 报名开始时间
	 */
	private String signUpStartDate;
	/**
	 * 报名结束时间
	 */
	private String signUpEndDate;
}
