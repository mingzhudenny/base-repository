/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * <pre>
 * 邮件附件的类型
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: AttachmentType.java, v 0.1 2018年7月9日 下午6:28:54  Exp $
 */
public enum AttachmentType {
	
	REGIST_MAIL(1,"老师报名"),
	QINGBEI (2,"清北"),
	NO_QINGBEI(3,"非清北");
	
	AttachmentType(Integer value,String name){
		this.value = value;
		this.name = name;
	}
	private String name;
	private Integer value;
	
	public String getName() {
		return name;
	}
	public Integer getValue() {
		return value;
	}
}
