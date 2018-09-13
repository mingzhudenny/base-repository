/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * 
 * <pre>
 * 师训中心
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: NotesType.java, v 0.1 2018年1月25日 下午12:01:31  Exp $
 */
public enum Branch {
	
	SHANG_HAI("1", "上海"), HE_FEI("2", "合肥");
	
	Branch(String value, String name) {
		this.value = value;
		this.name = name;
	}

	private String name;
	private String value;

	public String getName() {
		
		return name;
	}

	public String getValue() {
		return value;
	}

}
