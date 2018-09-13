package com.repository.tcrm.Dto.order.server;



import lombok.Data;
import lombok.EqualsAndHashCode;

//@Data
//@EqualsAndHashCode(callSuper=false)
public class CourseOrderDto {

	private String courseOrderUuid;
	
	private String courseRequestUuid;
	
	private String coursePayRequestUuid;
	
	private String leadsUuid;
	
	private String teacherUuid;
	
	private String leadsName;
	
	private String LeadsPhone;
	
	private String subject;
	
	private String grade;
	
	private String crUuid;

	public String getCourseOrderUuid() {
		return courseOrderUuid;
	}

	public void setCourseOrderUuid(String courseOrderUuid) {
		this.courseOrderUuid = courseOrderUuid;
	}

	public String getCourseRequestUuid() {
		return courseRequestUuid;
	}
 
	public void setCourseRequestUuid(String courseRequestUuid) {
		this.courseRequestUuid = courseRequestUuid;
	}

	public String getCoursePayRequestUuid() {
		return coursePayRequestUuid;
	}

	public void setCoursePayRequestUuid(String coursePayRequestUuid) {
		this.coursePayRequestUuid = coursePayRequestUuid;
	}

	public String getLeadsUuid() {
		return leadsUuid;
	}

	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
	}

	public String getTeacherUuid() {
		return teacherUuid;
	}

	public void setTeacherUuid(String teacherUuid) {
		this.teacherUuid = teacherUuid;
	}

	public String getLeadsName() {
		return leadsName;
	}

	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}

	public String getLeadsPhone() {
		return LeadsPhone;
	}

	public void setLeadsPhone(String leadsPhone) {
		LeadsPhone = leadsPhone;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCrUuid() {
		return crUuid;
	}

	public void setCrUuid(String crUuid) {
		this.crUuid = crUuid;
	}
	
	
	
}
