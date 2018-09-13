package com.repository.crm.Dto.course.server;

/**
 * 老师信息
 * @author csy
 *
 * @date 2017年10月14日 上午11:33:39 
 */
public class TeacherVo {

	/**
	 * 老师uuid
	 */
	private String teacherUuid;
	/**
	 * 老师姓名
	 */
	private String teacherName;
	/**
	 * 老师电话号
	 */
	private String teacherPhone;
	@Override
	public String toString() {
		return "TeacherVo [teacherUuid=" + teacherUuid + ", teacherName=" + teacherName + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public String getTeacherUuid() {
		return teacherUuid;
	}
	public void setTeacherUuid(String teacherUuid) {
		this.teacherUuid = teacherUuid;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
}
