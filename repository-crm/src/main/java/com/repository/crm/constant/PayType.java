package com.repository.crm.constant;

/**
 * 支付状态
 * @ClassName: PayType 
 * @author csy
 * @date 2017年12月26日 上午11:10:49 
 *
 */
public enum PayType {

	FAILED((byte)0,"失败"),
	SUCCESS((byte)1,"成功");
	
	private Byte key;
	private String value;
	private PayType(Byte key, String value) {
		this.key = key;
		this.value = value;
	}
	public Byte getKey() {
		return key;
	}
	public void setKey(Byte key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public static PayType findByKey(Byte key){
		switch (key) {
		case 0:
			return FAILED;
		case 1:
			return SUCCESS;
		default:
			return null;
		}
	}
}
