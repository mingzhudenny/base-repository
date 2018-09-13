/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.product.server.couponcode;

import java.util.Date;

/**
 * <pre>
 * 兑换码
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CouponCodeDto.java, v 0.1 2018年4月10日 下午1:52:53  Exp $
 */
public class CouponCodeDto {	

	private Long id;
	
	private String channelName;	

	private String batchNumber;

	private String couponCode;

	private Integer isUse;
	
	@SuppressWarnings("unused")
	private String isUseDesc;

	private Date useTime;

	private String leadsName;
	
	private String leadsPhone;

	private Integer codeStatus;

	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Integer getIsUse() {
		return isUse;
	}

	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}

	public String getIsUseDesc() {
		
		if(this.getIsUse()!=null && this.getIsUse()>0){
			
			return "已经使用";
			
		}else{
			
			return  "未使用";
		}
		
	}

	public void setIsUseDesc(String isUseDesc) {
		this.isUseDesc = isUseDesc;
	}

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public String getLeadsName() {
		return leadsName;
	}

	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}

	public String getLeadsPhone() {
		return leadsPhone;
	}

	public void setLeadsPhone(String leadsPhone) {
		this.leadsPhone = leadsPhone;
	}

	public Integer getCodeStatus() {
		return codeStatus;
	}

	public void setCodeStatus(Integer codeStatus) {
		this.codeStatus = codeStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	


}
