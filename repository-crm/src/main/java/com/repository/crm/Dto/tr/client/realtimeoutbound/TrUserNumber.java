/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.tr.client.realtimeoutbound;

/**
 * 
 * <pre>
 * 学生手机号码和销售的坐席号码
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TrUserNumber.java, v 0.1 2017年12月20日 下午3:32:43  Exp $
 */
public class TrUserNumber {
	
	private String cnos;//坐席号
	
	private String phones;//学生手机号码

	public String getCnos() {
		return cnos;
	}

	public void setCnos(String cnos) {
		this.cnos = cnos;
	}

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}

		

}
