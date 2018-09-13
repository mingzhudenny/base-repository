/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * <pre>
 * 发送的邮件的用途
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: MailPouse.java, v 0.1 2017年7月17日 上午11:55:56  Exp $
 */
public enum MailPurpose {
	
	PURPOSE_1(1,"全职老师报名"),PURPOSE_2(2,"兼职老师报名"),PURPOSE_3(3,"面试通过"),
	PURPOSE_4(4,"面试未通过"),PURPOSE_5(5,"培训通过"),PURPOSE_6(6,"培训未通过"),
	PURPOSE_7(7,"待邀约个人邮件"),PURPOSE_8(8,"面试试讲邮件")
	;		
	MailPurpose(Integer value,String name){
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
