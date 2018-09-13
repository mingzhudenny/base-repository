/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.tr.client.realtimeoutbound;

import java.util.List;

import com.repository.crm.Dto.account.client.leads.BaseParams;

/**
 * <pre>
 * 查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TrOutboundParams.java, v 0.1 2017年12月1日 下午4:04:35  Exp $
 */
public class TrOutboundParams extends BaseParams{
	
	
	private String leadsParams;//学生姓名或者手机号码
	
	private String saleName;
	
	private String saleType;
	
	private String team;
	
	private String  startTime;//电话进入系统时间
	
	private String  endTime;//电话进入系统时间		
	/** 分配日期  */
	private String distributionDateStart;
	
	private String distributionDateEnd;
	/** 报名时间 */
	private String registTimeStart;
	
	private String registTimeEnd;

	private String cno;
	
	private String status;//接听状态
	
	private  List<String> cnoList;
	
	private List<String> phoneList;		
	
	
	public String getRegistTimeStart() {
		return registTimeStart;
	}

	public void setRegistTimeStart(String registTimeStart) {
		this.registTimeStart = registTimeStart;
	}

	public String getRegistTimeEnd() {
		return registTimeEnd;
	}

	public void setRegistTimeEnd(String registTimeEnd) {
		this.registTimeEnd = registTimeEnd;
	}

	public String getDistributionDateStart() {
		return distributionDateStart;
	}

	public void setDistributionDateStart(String distributionDateStart) {
		this.distributionDateStart = distributionDateStart;
	}

	public String getDistributionDateEnd() {
		return distributionDateEnd;
	}

	public void setDistributionDateEnd(String distributionDateEnd) {
		this.distributionDateEnd = distributionDateEnd;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public List<String> getCnoList() {
		return cnoList;
	}

	public void setCnoList(List<String> cnoList) {
		this.cnoList = cnoList;
	}

	public List<String> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getLeadsParams() {
		return leadsParams;
	}

	public void setLeadsParams(String leadsParams) {
		this.leadsParams = leadsParams;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	

}
