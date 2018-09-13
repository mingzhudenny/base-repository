/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;


public class PayManageEnum {
	
	
	public enum GradeType {		
		
		  QINBEI(1,"清北"),
		  GENERAL(2,"非清北");
		
		GradeType(Integer value,String name){
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
	public enum GradeStatus {		
		
		  ENABLED(0,"使用中"),
		  DISABLED(1,"已停用");
		
		GradeStatus(Integer value,String name){
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
	
	
}
