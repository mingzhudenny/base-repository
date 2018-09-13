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
 * @version $Id: AgentEnum.java, v 0.1 2017年3月11日 上午10:31:06  Exp $
 */
public class AgentEnum {
	
	
	
	/**
	 * 
	 * <pre>
	 * 是否总代
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: AgentEnum.java, v 0.1 2017年3月25日 下午3:03:39  Exp $
	 */
	 public enum GeneralAgent { 
		
		  YES(1,"是"),NO(0,"否");	
		 GeneralAgent(Integer value,String name){
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
	
	
	 public enum AgentType { 
			
		PART_TIME(1,"兼职"),FULL_TIME(2,"公校"),
		SCHOOL(3,"校招"),OTHER (4,"第三方");	
		AgentType(Integer value,String name){
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
	

}
