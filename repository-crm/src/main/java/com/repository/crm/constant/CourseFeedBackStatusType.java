package com.repository.crm.constant;

/**
 * 课程订单反馈状态类型
 * @ClassName: CourseFeedBackStatusType 
 * @author csy
 * @date 2017年12月26日 上午11:00:36 
 *
 */
public enum CourseFeedBackStatusType {

	NOFEEDBACK((byte)0,"暂无反馈"),
	WAIT((byte)1,"待跟进"),
	SUCCESS((byte)2,"转化成功"),
	SUCCESS_CHANGE_TEACHER((byte)3,"转化成公，换老师"),
	CHANGE_TEACHER_SUCCESS((byte)4,"换老师，转化成功"),
	FAILED((byte)5,"转换失败"),
	TEACHER_NO_COME((byte)6,"老师放鸽子"),
	STUDENT_NO_COME((byte)7,"学生放鸽子");
	
	private CourseFeedBackStatusType(Byte key, String value) {
		this.key = key;
		this.value = value;
	}
	private Byte key;
	private String value;
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
	
	public static CourseFeedBackStatusType findByKey(Byte key){
		switch (key) {
		case 0:
			return NOFEEDBACK;
		case 1:
			return WAIT;
		case 2:
			return SUCCESS;
		case 3:
			return SUCCESS_CHANGE_TEACHER;
		case 4:
			return CHANGE_TEACHER_SUCCESS;
		case 5:
			return FAILED;
		case 6:
			return TEACHER_NO_COME;
		case 7:
			return STUDENT_NO_COME;
		default:
			return null;
		}
	}
	
}
