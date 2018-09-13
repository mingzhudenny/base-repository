package com.repository.crm.constant;
/**
 * 地区类型
 * @author csy
 * @date 2017年12月15日 下午2:29:32
 */
public enum AreaType {

	PROVINCE(1),
	CITY(2),
	COUNT(3);
	
	private Integer type;

	private AreaType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}
