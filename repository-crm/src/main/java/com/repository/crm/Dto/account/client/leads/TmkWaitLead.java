package com.repository.crm.Dto.account.client.leads;


import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class TmkWaitLead {
	private String name;//lead姓名
	
	private String phone;//学生电话
	
	private String level;//渠道等级
	
	private String channelName;//渠道名字
	
	private String grade;//年级
	
	private String subject;//科目
	
	private String remarkContent;//最新备注

	private Date signupDate;//报名时间
	
	private Date tmkSignTime;//tmk标记时间
	
	private String ccName;//
	
	private String teamName;//lead所属销售团队
	
	private String leadsUuid;
	
	private String channelUuid;
	
	private String teamUuid; 
	
	private String signUpCount;
}
