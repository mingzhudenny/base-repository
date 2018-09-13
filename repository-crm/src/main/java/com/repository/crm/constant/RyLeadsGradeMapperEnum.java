/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * <pre>
 * 软云和leads年级的对应关系
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyLeadsGradeMapperEnum.java, v 0.1 2018年8月13日 上午11:30:37  Exp $
 */
public enum RyLeadsGradeMapperEnum {

	
	  GRADE_1(9,"小三"),
	  GRADE_2(10,"小四"),
	  GRADE_3(11,"小五"),
	  GRADE_4(12,"小六"),
	  GRADE_5(12,"预初"),
	  GRADE_6(1,"初一"),
	  GRADE_7(2,"初二"),
	  GRADE_8(3,"初三"),
	  GRADE_9(3,"初四"),
	  GRADE_10(4,"高一"),
	  GRADE_11(5,"高二"),
	  GRADE_12(6,"高三");
	
	RyLeadsGradeMapperEnum(Integer value,String name){
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
