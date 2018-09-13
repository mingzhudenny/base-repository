package com.repository.crm.constant;

/**
 * 
 * <pre>
 * orderType
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: OrdType.java, v 0.1 2018年5月18日 下午4:44:32  Exp $
 */
public enum OrderType {
	
	/** 普通 */
	ORDER_TYPE_0(0,"普通"),
	/** 换科换老师 */
	ORDER_TYPE_1(1,"换科换老师"),
	/** 扩科  */
	ORDER_TYPE_2(2,"扩科");
	
	private Integer value;
	private String desc;
	
	private OrderType(Integer value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
