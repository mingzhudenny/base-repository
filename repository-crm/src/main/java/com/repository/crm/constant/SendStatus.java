/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: SendStatus.java, v 0.1 2017年7月17日 下午2:35:31  Exp $
 */
public enum SendStatus {
	
	 FINISH(1,"已发送"),UNFINISH (0,"未发送");	
	SendStatus(Integer value,String name){
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
