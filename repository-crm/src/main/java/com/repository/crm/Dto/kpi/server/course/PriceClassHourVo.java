/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.server.course;

import java.util.Date;

import lombok.Data;

/**
 * 
 * <pre>
 * 合肥-老师课表订单 -课时包的课程消耗
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: PriceClassHourVo.java, v 0.1 2018年6月26日 下午5:29:45  Exp $
 */
@Data
public class PriceClassHourVo {
	
	/** 课时包*/
	private String priceName;	
	/** 购买课时*/
	private Double buyClassHour;
	/** 赠送课时*/
	private Double giveClassHour;
	/** 业绩提交时间 */
	private Date  submitDate;
	/** 签单人  */
	private String createUser;

}
