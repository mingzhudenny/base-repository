package com.repository.crm.Dto.kpi.server.course;

import com.base.utils.validate.ValidateUtil;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-15 13:14
 **/
public class ArrangeCourseDetailKpiDto {

    private String leadsUuid;
    private String leadsName;
    private String grade;
    private String subject;
    private String courseType;
    private String courseLevel;
    private String courseLength;
    private String courseDate;
    private String courseStartTime;
    private String courseEndTime;
    private String teacherName;
    private String saleName;
    private String teamName;
    private String commitTime;
    private String arrangeCourseTime;
    private String courseFeedBackStatus;
    private String ispay;
    private String feedBackRemark;
    /**
     * 课程要求上课日期
     */
    private String courseRequestDate;

    /**
     * 课程要求上课时间
     */
    private String courseRequestStartTime;
    /**
     * 课程要求上课结束时间
     */
    private String courseRequestEndTime;

    public String getFeedBackRemark() {
        return feedBackRemark;
    }
    public void setFeedBackRemark(String feedBackRemark) {
        this.feedBackRemark = feedBackRemark;
    }
    public String getLeadsUuid() {
        return leadsUuid;
    }
    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid;
    }
    public String getLeadsName() {
        return leadsName;
    }
    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName;
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
    public String getCourseType() {
        if(ValidateUtil.isNotEmpty(courseType)){
            if(courseType.equals("0")){
                return "测评课";
            }
            if(courseType.equals("1")){
                return "正式课";
            }
        }
        return "暂无";
    }
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
    public String getCourseLevel() {
        if(ValidateUtil.isNotEmpty(courseLevel)){
            if(courseLevel.equals("0")){
                return "普通";
            }
            if(courseLevel.equals("1")){
                return "清北";
            }
            if(courseLevel.equals("2")){
                return "明星课程";
            }
        }
        return "暂无";
    }
    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }
    public String getCourseLength() {
        return courseLength;
    }
    public void setCourseLength(String courseLength) {
        this.courseLength = courseLength;
    }
    public String getCourseDate() {
        return courseDate;
    }
    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }
    public String getCourseStartTime() {
        return courseStartTime;
    }
    public void setCourseStartTime(String courseStartTime) {
        this.courseStartTime = courseStartTime;
    }
    public String getCourseEndTime() {
        return courseEndTime;
    }
    public void setCourseEndTime(String courseEndTime) {
        this.courseEndTime = courseEndTime;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getSaleName() {
        return saleName;
    }
    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getCommitTime() {
        return commitTime;
    }
    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }
    public String getArrangeCourseTime() {
        return arrangeCourseTime;
    }
    public void setArrangeCourseTime(String arrangeCourseTime) {
        this.arrangeCourseTime = arrangeCourseTime;
    }
    public String getCourseFeedBackStatus() {
        return courseFeedBackStatus;
    }
    public void setCourseFeedBackStatus(String courseFeedBackStatus) {
        this.courseFeedBackStatus = courseFeedBackStatus;
    }
    public String getIspay() {
        if(ValidateUtil.isNotEmpty(ispay)){
            if(ispay.equals("0")){
                return "未付费";
            }
            if(ispay.equals("1")){
                return "已付费";
            }
        }
        return "未付费";
    }
    public void setIspay(String ispay) {
        this.ispay = ispay;
    }

    public String getCourseRequestDate() {
        return courseRequestDate;
    }

    public void setCourseRequestDate(String courseRequestDate) {
        this.courseRequestDate = courseRequestDate;
    }

    public String getCourseRequestStartTime() {
        return courseRequestStartTime;
    }

    public void setCourseRequestStartTime(String courseRequestStartTime) {
        this.courseRequestStartTime = courseRequestStartTime;
    }

    public String getCourseRequestEndTime() {
        return courseRequestEndTime;
    }

    public void setCourseRequestEndTime(String courseRequestEndTime) {
        this.courseRequestEndTime = courseRequestEndTime;
    }
}
