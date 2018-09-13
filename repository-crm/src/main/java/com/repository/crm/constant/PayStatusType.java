package com.repository.crm.constant;

/**
 * 支付状态
 * @author csy
 * @date 2017年3月10日
 */
public enum PayStatusType {
	
	WAITCHECK((byte)0,"待审核"),
	SUCCESS((byte)1,"支付成功"),
	FAIL((byte)2,"支付失败");
	
	private byte value;
	private String name;

	PayStatusType(byte value,String name){
		this.name = name;
		this.value = value;
	}
	
	public byte getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	
	public static PayStatusType findByValue(byte value) { 
	    switch (value) {
	      case 0:
	        return WAITCHECK;
	      case 1:
	        return SUCCESS;
	      case 2:
	        return FAIL;
	      default:
	        return null;
	    }
	  }
	
	
	
}
