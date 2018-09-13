package com.repository.crm.constant;


/**
 * 
 * <pre>
 * 退费状态
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: IsRefund.java, v 0.1 2018年5月11日 上午11:48:05  Exp $
 */
public enum IsRefund {
	
	NO_REFUND(0,"未退费"),
	REFUND(1,"已经退费");
	
	private Integer value;
	private String name;

	IsRefund(Integer value,String name){
		this.name = name;
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	public String getName() {
		return name;
	}	
	
}
