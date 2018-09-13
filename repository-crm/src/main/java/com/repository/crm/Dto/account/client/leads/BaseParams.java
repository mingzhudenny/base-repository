/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.leads;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: BaseParams.java, v 0.1 2018年3月24日 下午2:35:16  Exp $
 */
@Data
public class BaseParams {
	
	private Integer pageIndex;
	
	private Integer pageNumber;
	
	private String orderBy;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	

}
