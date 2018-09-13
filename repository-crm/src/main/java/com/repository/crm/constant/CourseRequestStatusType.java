package com.repository.crm.constant;

/**
 * 课程请求排课状态
 * @ClassName: CourseRequestStatusType 
 * @author csy
 * @date 2017年12月25日 下午6:45:56 
 *
 */
public enum CourseRequestStatusType {

	REFUSE(0,"拒绝"),
	ARRANGING(1,"待安排"),
	PASS(2,"通过"),
	NOCOMMIT(3,"暂无");
	
	private Integer key;
	private String value;
	private CourseRequestStatusType(Integer key, String value) {
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
	public static CourseRequestStatusType findByKey(Integer key){
		switch (key) {
		case 0:
			return REFUSE;
		case 1:
			return ARRANGING;
		case 2:
			return PASS;
		case 3:
			return NOCOMMIT;
		default:
			return null;
		}
	}
}
