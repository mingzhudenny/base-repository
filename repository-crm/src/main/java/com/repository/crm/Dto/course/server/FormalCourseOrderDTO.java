package com.repository.crm.Dto.course.server;
/**
 * 
 * <pre>
 * 正式课批量排课
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: FormalCourseOrderDTO.java, v 0.1 2018年4月11日 下午7:51:11  Exp $
 */
public class FormalCourseOrderDTO {
	private String studentName;
	private String teacherName;
	private String userName;
	private String courseOrderUuid;//课程订单uuid
	private String leadsUuid;
	private String teacherUuid;
	private String courseRequestUuid;//课程需求uuid
	private String firstCourseDate;//首次课程日期
	private String courseStuNum;//以上课程数
	private String courseArrNum;//安排课程数
	private String crUuid;//cr的uuid
	private String grade;//年级
	private String subject;//科目
	private String tcPhone;//老师电话
	private String stuPhone;//学生电话
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
	public String getCrUuid() {
		return crUuid;
	}
	public void setCrUuid(String crUuid) {
		this.crUuid = crUuid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCourseOrderUuid() {
		return courseOrderUuid;
	}
	public void setCourseOrderUuid(String courseOrderUuid) {
		this.courseOrderUuid = courseOrderUuid;
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
	public String getCourseRequestUuid() {
		return courseRequestUuid;
	}
	public void setCourseRequestUuid(String courseRequestUuid) {
		this.courseRequestUuid = courseRequestUuid;
	}
	public String getFirstCourseDate() {
		return firstCourseDate;
	}
	public void setFirstCourseDate(String firstCourseDate) {
		this.firstCourseDate = firstCourseDate;
	}
	public String getCourseStuNum() {
		return courseStuNum;
	}
	public void setCourseStuNum(String courseStuNum) {
		this.courseStuNum = courseStuNum;
	}
	public String getCourseArrNum() {
		return courseArrNum;
	}
	public void setCourseArrNum(String courseArrNum) {
		this.courseArrNum = courseArrNum;
	}
	public String getTcPhone() {
		return tcPhone;
	}
	public void setTcPhone(String tcPhone) {
		this.tcPhone = tcPhone;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	
}
