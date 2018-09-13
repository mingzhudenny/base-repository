package com.repository.crm.Dto.account.server.leads;

import java.util.Date;

import lombok.Data;

/**
 * 
 * <pre>
 * cc我的leads
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CcLeadsVo.java, v 0.1 2018年6月26日 下午1:11:47  Exp $
 */
@Data
public class CcLeadsVo {

	private String leadsUuid;//leads的uuid
	private String leadsName;//leads姓名
	private String leadsPhone;//leads电话号码
	private String connectStatus;//拨打状态
	private String grade;//年级
	private String channelLevel;//渠道级别
	private Date signupDate;//报名时间
	private String remarkContent;//最新备注内容
    private Date inChargeDate;//cc负责时间
    private boolean keyPoint;//是否优先跟进0：否1：是
    private Integer isDebugging;
    /** 号码所在地 */
    private String phoneLocation;   		

}
