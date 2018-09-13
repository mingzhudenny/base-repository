package com.repository.xcrm.constants;

/**
 * 课程类型
 *
 * @author csy
 * @time  2018年4月27日 上午11:46:49
 */
public enum CourseType {

	TEST(0,"测评课"),
	FORMAL(1,"正式课"),
	DEBUG(2,"调试课");
	 
	private Integer key;
	private String value;
	
	private CourseType(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public static CourseType findByKey(Integer key){
		switch (key) {
			case 0:
				return TEST;
			case 1:
				return FORMAL;
			case 2:
				return DEBUG;
			default:
				return null;
		}
	}
	
}
