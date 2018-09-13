package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;

/**
 * 待反馈返回的leads数据信息Dto
 *
 * @author csy
 * @time  2018年4月16日 下午9:12:36
 */
@Data
public class QueryWaitLeadsServerDTO {

	/**
	 * leadsuuid
	 */
	private String leadsUuid;
	/**
	 * leads姓名
	 */
	private String leadsName;
	/**
	 * leads电话号码
	 */
	private String leadsPhone;
	/**
	 * 预约次数
	 */
	private Integer signUpCount;
	/**
	 * 预约科目
	 */
	private String subject;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 预约渠道等级
	 */
	private String channelLevel;
	/**
	 * 联系状态
	 */
	private String connectStatus;
	/**
	 * 最新跟进备注
	 */
	private String newFollowRemark;
	/**
	 * 报名时间
	 */
	private String signUpDate;
	/**
	 * 负责时间
	 */
	private String chargeDate;

	/**
	 * 号码归属地
	 */
	private String phoneLocaltion;
}
