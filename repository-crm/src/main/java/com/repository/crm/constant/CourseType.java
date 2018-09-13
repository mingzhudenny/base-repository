package com.repository.crm.constant;

/**
 * 课程类型
 * @ClassName: CourseType 
 * @author csy
 * @date 2017年12月25日 下午3:52:06 
 *
 */
public enum CourseType {

	TEST_COURSE(0,"测评课"),
	FORMAL_COURSE(1,"正式课"),
	DEBUG_COURSE(2,"调试课");
	
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
			return TEST_COURSE;
		case 1:
			return FORMAL_COURSE;		
		case 2:
			return DEBUG_COURSE;
		default:
			return null;
		}
	}
}
