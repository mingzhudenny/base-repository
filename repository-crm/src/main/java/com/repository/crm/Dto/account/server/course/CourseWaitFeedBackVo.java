package com.repository.crm.Dto.account.server.course;

import com.base.utils.validate.ValidateUtil;

/**
 * 待反馈的信息VO展示
 * @author csy
 *
 */
public class CourseWaitFeedBackVo {

	private String uuid; //leadsUUid
	private String name;//leads姓名
	private String phone;//leads电话号码
	private String subject; //科目
	
	private String courseUuid;//预约课程的uuid
	private String type;//预约课程类型
	private String length;//预约课程时长
	
	private String courseRequestUuid;//课程要求uuid
	private String dates; //上课日期
    private String startTime;//上课开始时间
    private String endTime;//上课结束时间
    
    private String teacherName;//老师姓名
    private String teacherDes;//老师介绍
    
	private Integer hstRoomAcountId;
	private String hstRoomName;
	private String hstRoomTeacherAccont;
	private String hstRoomStudentAccont;
	
	private String userUuid;
	
	private Integer isSendMessage;
	public Integer getIsSendMessage() {
		return isSendMessage;
	}
	public void setIsSendMessage(Integer isSendMessage) {
		this.isSendMessage = isSendMessage;
	}
	public String getUserUuid() {
		return userUuid;
	}
	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}
	public Integer getHstRoomAcountId() {
		return hstRoomAcountId;
	}
	public void setHstRoomAcountId(Integer hstRoomAcountId) {
		this.hstRoomAcountId = hstRoomAcountId;
	}
	public String getHstRoomName() {
		if(ValidateUtil.isNotEmpty(hstRoomName)){
			return hstRoomName;
		}
		return "";
	}
	public void setHstRoomName(String hstRoomName) {
		this.hstRoomName = hstRoomName;
	}
	public String getHstRoomTeacherAccont() {
		if(ValidateUtil.isNotEmpty(hstRoomTeacherAccont)){
			return hstRoomTeacherAccont;
		}
		return "";
	}
	public void setHstRoomTeacherAccont(String hstRoomTeacherAccont) {
		this.hstRoomTeacherAccont = hstRoomTeacherAccont;
	}
	public String getHstRoomStudentAccont() {
		if(ValidateUtil.isNotEmpty(hstRoomStudentAccont)){
			return hstRoomStudentAccont;
		}
		return "";
		
	}
	public void setHstRoomStudentAccont(String hstRoomStudentAccont) {
		this.hstRoomStudentAccont = hstRoomStudentAccont;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCourseUuid() {
		return courseUuid;
	}
	public void setCourseUuid(String courseUuid) {
		this.courseUuid = courseUuid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getCourseRequestUuid() {
		return courseRequestUuid;
	}
	public void setCourseRequestUuid(String courseRequestUuid) {
		this.courseRequestUuid = courseRequestUuid;
	}

	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
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
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherDes() {
		return teacherDes;
	}
	public void setTeacherDes(String teacherDes) {
		this.teacherDes = teacherDes;
	}

}
