package com.repository.tcrm.Dto.course.server;

import com.repository.tcrm.Dto.BaseDto;


/**
 * @Author ywj
 * <p>
 */
public class CourseDto extends BaseDto{

    /**  */
	private static final long serialVersionUID = 7080822092258887218L;
	private String courseUuid;
    private String leadsUuid;
    private String teacherUuid;
    private String userUuid;    //调试课 cc\cr的uuid
    private String courseDate;
    private String startTime;
    private String endTime;
    private String subject;
    private String grade;
    private String teacherName;
    private String studentName;
    private String realStartTime;
    private String realEndTime;
    private Integer classStatus;
    private Integer studentClassStatus;
    private Integer ccClassStatus;
    private Integer crClassStatus;
    private Integer pushStatus;
    private String classAppraiseUuid;   //学生对老师的上课评价uuid，若为空则未评价
    private String classTeacherAppraiseUuid;//老师对学生上课的反馈
    private Integer courseType; //课程类型  0:测评课;1:正式课;2:调试课
    private Integer studentSex; //学生性别  0：男，1：女
    private String subjectVersion;  //教材版本
    private String studyStatus; //学习情况
    private String monthPoint;  //月考试听知识点
    private String termPoint;  //期中期末试听点
    private String otherPoint;  //其他知识试听点
	public String getCourseUuid() {
		return courseUuid;
	}
	public void setCourseUuid(String courseUuid) {
		this.courseUuid = courseUuid;
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
	public String getUserUuid() {
		return userUuid;
	}
	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
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
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getRealStartTime() {
		return realStartTime;
	}
	public void setRealStartTime(String realStartTime) {
		this.realStartTime = realStartTime;
	}
	public String getRealEndTime() {
		return realEndTime;
	}
	public void setRealEndTime(String realEndTime) {
		this.realEndTime = realEndTime;
	}
	public Integer getClassStatus() {
		return classStatus;
	}
	public void setClassStatus(Integer classStatus) {
		this.classStatus = classStatus;
	}
	public Integer getStudentClassStatus() {
		return studentClassStatus;
	}
	public void setStudentClassStatus(Integer studentClassStatus) {
		this.studentClassStatus = studentClassStatus;
	}
	public Integer getCcClassStatus() {
		return ccClassStatus;
	}
	public void setCcClassStatus(Integer ccClassStatus) {
		this.ccClassStatus = ccClassStatus;
	}
	public Integer getCrClassStatus() {
		return crClassStatus;
	}
	public void setCrClassStatus(Integer crClassStatus) {
		this.crClassStatus = crClassStatus;
	}
	public Integer getPushStatus() {
		return pushStatus;
	}
	public void setPushStatus(Integer pushStatus) {
		this.pushStatus = pushStatus;
	}
	public String getClassAppraiseUuid() {
		return classAppraiseUuid;
	}
	public void setClassAppraiseUuid(String classAppraiseUuid) {
		this.classAppraiseUuid = classAppraiseUuid;
	}
	public String getClassTeacherAppraiseUuid() {
		return classTeacherAppraiseUuid;
	}
	public void setClassTeacherAppraiseUuid(String classTeacherAppraiseUuid) {
		this.classTeacherAppraiseUuid = classTeacherAppraiseUuid;
	}
	public Integer getCourseType() {
		return courseType;
	}
	public void setCourseType(Integer courseType) {
		this.courseType = courseType;
	}
	public Integer getStudentSex() {
		return studentSex;
	}
	public void setStudentSex(Integer studentSex) {
		this.studentSex = studentSex;
	}
	public String getSubjectVersion() {
		return subjectVersion;
	}
	public void setSubjectVersion(String subjectVersion) {
		this.subjectVersion = subjectVersion;
	}
	public String getStudyStatus() {
		return studyStatus;
	}
	public void setStudyStatus(String studyStatus) {
		this.studyStatus = studyStatus;
	}
	public String getMonthPoint() {
		return monthPoint;
	}
	public void setMonthPoint(String monthPoint) {
		this.monthPoint = monthPoint;
	}
	public String getTermPoint() {
		return termPoint;
	}
	public void setTermPoint(String termPoint) {
		this.termPoint = termPoint;
	}
	public String getOtherPoint() {
		return otherPoint;
	}
	public void setOtherPoint(String otherPoint) {
		this.otherPoint = otherPoint;
	}

}
