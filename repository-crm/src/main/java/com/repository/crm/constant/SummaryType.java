/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * 
 * <pre>
 * 软云 评测结果类型  1 测评知识点正确率  2 测评能力结构标签正确率  3 测评解题方法标签正确率  
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: SummaryType.java, v 0.1 2018年7月30日 下午2:49:26  Exp $
 */
public enum SummaryType {

	KNOW_LEDGE_POINT(1, "知识点正确率"),
	ABILITY_STRUCTURE(2, "能力结构标签正确率"),
	ANALYTIC_METHOD(3, "解题方法标签正确率");
	SummaryType(Integer value, String name) {
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
