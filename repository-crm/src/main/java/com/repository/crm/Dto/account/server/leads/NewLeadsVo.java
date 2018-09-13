package com.repository.crm.Dto.account.server.leads;

import lombok.Data;

/**
 * 
 * <pre>
 * 新名单分配列表显示
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: NewLeadsVo.java, v 0.1 2018年6月25日 下午4:07:09  Exp $
 */
@Data
public class NewLeadsVo {

	private String uuid;//leadsuuid
	private String name;//leads姓名
	private String phone;//leads 电话号码
	private String signupDate;//报名时间
	private String channelLevel;//报名的渠道等级
	private String grade;//年级
	private String subject;//科目
	private String recommendCcName;
	private String recommendCrName;
	private String phoneLocaltion;
	private String province;
	private String city;
	private String count;
	private String schoolName;
	private String gradeRank;
	/** 渠道名称*/
	private String channelName;

}
