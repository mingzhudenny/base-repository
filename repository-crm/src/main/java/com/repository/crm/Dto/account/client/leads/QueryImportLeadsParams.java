/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.leads;

/**
 * <pre>
 * 导入leads数据的查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryImportLeadsParams.java, v 0.1 2018年3月24日 下午2:24:48  Exp $
 */
public class QueryImportLeadsParams extends BaseParams {
	/** 创建人*/
	private String createUserUuid;
	/** 导入时间开始 */
	private String importStartDate;
	/** 导入时间 结束*/
	private String importEndDate;
	/** 报名时间 开始*/
    private String registStartDate;
    /** 报名时间 结束*/
	private String registEndDate;

	
	public String getCreateUserUuid() {
		return createUserUuid;
	}

	public void setCreateUserUuid(String createUserUuid) {
		this.createUserUuid = createUserUuid;
	}

	public String getImportStartDate() {
		return importStartDate;
	}

	public void setImportStartDate(String importStartDate) {
		this.importStartDate = importStartDate;
	}

	public String getImportEndDate() {
		return importEndDate;
	}

	public void setImportEndDate(String importEndDate) {
		this.importEndDate = importEndDate;
	}

	public String getRegistStartDate() {
		return registStartDate;
	}

	public void setRegistStartDate(String registStartDate) {
		this.registStartDate = registStartDate;
	}

	public String getRegistEndDate() {
		return registEndDate;
	}

	public void setRegistEndDate(String registEndDate) {
		this.registEndDate = registEndDate;
	}
	
	
	

}
