package com.repository.crm.constant;


/**
 * 
 * <pre>
 * 退费状态
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RefundStatusType.java, v 0.1 2018年4月17日 下午5:02:50  Exp $
 */
public enum RefundStatusType {
	
	NO_REFUND(0,"否"),
	REFUND(1,"是");
	
	private Integer value;
	private String name;

	RefundStatusType(Integer value,String name){
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
