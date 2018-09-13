package com.repository.crm.Po;

public class KpiCourseManager {	
	
	private Integer id;

    private String courseRequestUuid;
	
    private String leadsUuid;

    private String leadsName;

    private String grade;

    private String subject;

    private Integer courseType;

    private Integer courseLevel;

    private String courseLength;

    private String courseStartDate;

    private String courseStartTime;

    private String courseEndTime;

    private String teacherName;

    private String branch;

    private String saleName;

    private String teamName;

    private String courseCommitTime;

    private String courseManagerTime;

    private Integer courseFeedbackStatus;

    private String courseFeedbackDes;

    private Integer isPay;

    private String saleType;

    private String courseOrderUuid;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseRequestUuid() {
        return courseRequestUuid;
    }

    public void setCourseRequestUuid(String courseRequestUuid) {
        this.courseRequestUuid = courseRequestUuid == null ? null : courseRequestUuid.trim();
    }
    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public String getLeadsName() {
        return leadsName;
    }

    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName == null ? null : leadsName.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public Integer getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(Integer courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getCourseLength() {
        return courseLength;
    }

    public void setCourseLength(String courseLength) {
        this.courseLength = courseLength == null ? null : courseLength.trim();
    }

    public String getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(String courseStartDate) {
        this.courseStartDate = courseStartDate == null ? null : courseStartDate.trim();
    }

    public String getCourseStartTime() {
        return courseStartTime;
    }

    public void setCourseStartTime(String courseStartTime) {
        this.courseStartTime = courseStartTime == null ? null : courseStartTime.trim();
    }

    public String getCourseEndTime() {
        return courseEndTime;
    }

    public void setCourseEndTime(String courseEndTime) {
        this.courseEndTime = courseEndTime == null ? null : courseEndTime.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getCourseCommitTime() {
        return courseCommitTime;
    }

    public void setCourseCommitTime(String courseCommitTime) {
        this.courseCommitTime = courseCommitTime == null ? null : courseCommitTime.trim();
    }

    public String getCourseManagerTime() {
        return courseManagerTime;
    }

    public void setCourseManagerTime(String courseManagerTime) {
        this.courseManagerTime = courseManagerTime == null ? null : courseManagerTime.trim();
    }

    public Integer getCourseFeedbackStatus() {
        return courseFeedbackStatus;
    }

    public void setCourseFeedbackStatus(Integer courseFeedbackStatus) {
        this.courseFeedbackStatus = courseFeedbackStatus;
    }

    public String getCourseFeedbackDes() {
        return courseFeedbackDes;
    }

    public void setCourseFeedbackDes(String courseFeedbackDes) {
        this.courseFeedbackDes = courseFeedbackDes == null ? null : courseFeedbackDes.trim();
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType == null ? null : saleType.trim();
    }

    public String getCourseOrderUuid() {
        return courseOrderUuid;
    }

    public void setCourseOrderUuid(String courseOrderUuid) {
        this.courseOrderUuid = courseOrderUuid == null ? null : courseOrderUuid.trim();
    }
}