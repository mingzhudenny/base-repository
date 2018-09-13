/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.course.server;

import java.util.Date;

/**
 * 
 * <pre>
 * 老师课表
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TeacherCourseSchedule.java, v 0.1 2018年6月30日 下午5:36:42  Exp $
 */
public class TeacherCourseSchedule {
	
	private String uuid;
	
	private String stuName;//学生想姓名
	
	private String saleName;//销售姓名
	
	private String grade;//年级
	
	private String subject;//科目
	
	private String courseDate;//上课日期 格式："2017-06-06"
	
	private String startTime;//开始时间
	
	private String endTime;//结束时间
	
	private Date date;//用于排序	
	
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	 

}
