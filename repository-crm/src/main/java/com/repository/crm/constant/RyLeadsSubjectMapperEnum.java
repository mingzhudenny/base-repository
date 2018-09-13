/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;


/**
 * 
 * <pre>
 *  软云和leads科目的对应关系
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyLeadsSubjectMapperEnum.java, v 0.1 2018年8月14日 下午3:25:00  Exp $
 */
public enum RyLeadsSubjectMapperEnum {

	
	SUBJECT_1(1,"语文"),
	SUBJECT_2(2,"数学"),
	SUBJECT_3(3,"英语"),
	SUBJECT_4(4,"物理"),
	SUBJECT_5(5,"化学"),
	SUBJECT_6(6,"生物"),
	SUBJECT_7(7,"历史"),
	SUBJECT_8(8,"地理"),
	SUBJECT_9(9,"语文"),
	SUBJECT_10(10,"数学"),
	SUBJECT_11(11,"英语"),
	SUBJECT_12(12,"物理"),
	SUBJECT_13(13,"化学"),
	SUBJECT_14(14,"生物"),
	SUBJECT_15(15,"历史"),
	SUBJECT_16(16,"地理"),
	SUBJECT_17(17,"政治"),
	SUBJECT_19(19,"政治"),
	SUBJECT_20(20,"数学"),
	SUBJECT_21(21,"语文"),
	SUBJECT_22(22,"数学"),
	SUBJECT_23(23,"英语");
	
	RyLeadsSubjectMapperEnum(Integer value,String name){
		this.name = name;
		this.value = value;
	}
	private String name;
	private Integer value;
	
	public Integer getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	
}
