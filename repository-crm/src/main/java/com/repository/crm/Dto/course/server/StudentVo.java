package com.repository.crm.Dto.course.server;

import com.repository.crm.Po.Student;

/**
 * 正式生分配信息
 * @author csy
 * @date 2017-01-05
 */
public class StudentVo extends Student{
    
	
	private String firstCourseTime;//第一节正式课时间
	private String firstCourseSubject;//第一节正式课科目
	private String connectStatus;//接通状态
	public String getFirstCourseTime() {
		return firstCourseTime;
	}
	public void setFirstCourseTime(String firstCourseTime) {
		this.firstCourseTime = firstCourseTime;
	}
	public String getFirstCourseSubject() {
		return firstCourseSubject;
	}
	public void setFirstCourseSubject(String firstCourseSubject) {
		this.firstCourseSubject = firstCourseSubject;
	}
	public String getConnectStatus() {
		return connectStatus;
	}
	public void setConnectStatus(String connectStatus) {
		this.connectStatus = connectStatus;
	}
	
}
