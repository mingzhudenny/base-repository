/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.tr.client.realtimeoutbound;

import com.repository.crm.Dto.account.client.leads.BaseParams;

/**
 * <pre>
 * 天润回访查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TrBackCallParams.java, v 0.1 2017年11月30日 下午3:09:15  Exp $
 */
public class TrBackCallParams extends BaseParams{
	
	/** 用户名字  */
	private String userName;
	/** 团队  */
	private String team;
	/** 回访日期开始  */
	private String backCallDateStart;
	/** 回访日期结束  */
	private String backCallDateEnd;
	
	private Integer countMin;
	
	private Integer countMax;//回访次数
	
	public Integer getCountMin() {
		return countMin;
	}

	public void setCountMin(Integer countMin) {
		this.countMin = countMin;
	}

	public Integer getCountMax() {
		return countMax;
	}

	public void setCountMax(Integer countMax) {
		this.countMax = countMax;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getBackCallDateStart() {
		return backCallDateStart;
	}

	public void setBackCallDateStart(String backCallDateStart) {
		this.backCallDateStart = backCallDateStart;
	}

	public String getBackCallDateEnd() {
		return backCallDateEnd;
	}

	public void setBackCallDateEnd(String backCallDateEnd) {
		this.backCallDateEnd = backCallDateEnd;
	}
	
	
	

}
