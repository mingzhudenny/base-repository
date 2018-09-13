package com.repository.crm.Dto.kpi.server.student;

import java.util.Date;

import lombok.Data;
/**
 * <pre>
 * 销售部-新签学生列表返回实体
 * </pre>
 *
 * @author wqz
 * @version 
 */
@Data
public class SigningRenewalStudentsServerDto {
	/**学生姓名*/
	private String name;
	/**新签学生列表页，跟进提醒（还剩多少）天数*/
	private Integer followDays;
	/**手机号*/
	private String phone;
	/**年级*/
	private String grade;
	/**省id*/
	private Integer provinceId;
	/**省*/
	private String province;
	/**市id*/
	private Integer cityId;
	/**市*/
	private String city;
	/**市*/
	private String phoneLocaltion;
	/**新签时间*/
	private String updateDate;
	/**最新跟进记录*/
	private String content;
	/**7:停课*/
	private Integer keyPoint;
	/**负责时间*/
	private String createDate;
	/**以上是新签列表页输出*/	
	private String leadsUuid;
	private String leadsName;
	private String leadsPhone;
	private String subject;
	private String ccName;
	private String crName;
	private String crTeam;
	private String handOutRemark;
	private String handOutTime;
	private String ccTeam;
	/**已续费学生列表页，跟进提醒（还剩多少）天数*/
	private Integer closedDays;
	
}
