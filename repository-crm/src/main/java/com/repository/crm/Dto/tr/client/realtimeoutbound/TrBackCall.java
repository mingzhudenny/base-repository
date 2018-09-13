/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.tr.client.realtimeoutbound;

/**
 * <pre>
 * 天润来电回访
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TrBackCall.java, v 0.1 2017年11月30日 下午2:57:36  Exp $
 */
public class TrBackCall {
	
	private Long backCount;//回电次数
	
	private String userName;//姓名

	public Long getBackCount() {
		return backCount;
	}

	public void setBackCount(Long backCount) {
		this.backCount = backCount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
