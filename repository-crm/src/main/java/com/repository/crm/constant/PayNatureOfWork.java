/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * <pre>
 * 薪资管理的工作类型
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: NatureOfWork.java, v 0.1 2017年6月20日 下午3:36:45  Exp $
 */
public enum PayNatureOfWork {
	
			
    	FULL_TIME(1,"社招全职"),PART_TIME(2,"兼职"),SCHOOL_RECRUIT(3,"校招全职");	
    	  			
    	private Integer value;
		private String name;
		PayNatureOfWork(Integer value,String name){
			this.value = value;
			this.name = name;
		 }		
		
		public String getName() {
			return name;
		}
		public Integer getValue() {
			return value;
		}

	

}
