/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.task.server;

/**
 * <pre>
 * 课程的模板消息
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseMessage.java, v 0.1 2017年5月10日 上午11:52:10  Exp $
 */
public class CourseMessage {

	private String openId;
	
	private String title;//标题
	
	private String courseTime;//上课时间
	
	private String subject;//科目
	
	private String courseType;//课程类型
	
	private String stuName;//学生姓名
	
	private String stuPhone;//学生手机号码
	
	private String tcName;//老师姓名
	
	private String tcPhone;//老师手机号码  
	
	private String userName;//教务老师
	
	private String userPhone;//教务老师的手机号码
	
	private String grade;
	
	private Integer type;	
	
	private Integer hstRoomId;//测评课好视通房间号

	public Integer getHstRoomId() {
		return hstRoomId;
	}

	public void setHstRoomId(Integer hstRoomId) {
		this.hstRoomId = hstRoomId;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCourseType() {
		if(this.getType() == null){
			return null;
		}
		if(this.getType().equals(0)){
			return "测评课";
		}else if(this.getType().equals(1)){
			return "正式课";
		}
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuPhone() {
		return stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public String getTcName() {
		return tcName;
	}

	public void setTcName(String tcName) {
		this.tcName = tcName;
	}

	public String getTcPhone() {
		return tcPhone;
	}

	public void setTcPhone(String tcPhone) {
		this.tcPhone = tcPhone;
	}
	
	

}
