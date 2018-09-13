/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.course.server;


/**
 * 
 * <pre>
 * 学生课程
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseStudentVO.java, v 0.1 2018年7月2日 下午2:26:05  Exp $
 */
public class CourseStudentVO {
	
	private String stuName;
	
	private String saleName;
	
	private String grade;
	
	private String subject;
	
    private String courseDate;

    private String startTime;

    private String endTime;
	
	private String teacherUuid;//老师的UUID
	
	private String leadsUuid;//学生的UUID	
	
	private String tcName;//老师的姓名		

	public String getTcName() {
		return tcName;
	}

	public void setTcName(String tcName) {
		this.tcName = tcName;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getTeacherUuid() {
		return teacherUuid;
	}

	public void setTeacherUuid(String teacherUuid) {
		this.teacherUuid = teacherUuid;
	}

	public String getLeadsUuid() {
		return leadsUuid;
	}

	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
	}
	
	

}
