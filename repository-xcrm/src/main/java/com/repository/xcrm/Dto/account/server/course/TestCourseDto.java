package com.repository.xcrm.Dto.account.server.course;

import com.base.utils.validate.ValidateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:26
 **/
public class TestCourseDto {

    /**
     * 课程uuid
     */
    private String courseUuid;
    /**
     * 科目
     */
    private String subject;
    /**
     * 年级
     */
    private String grade;
    /**
     * 班次
     */
    private String classNo;
    /**
     * 上课日期
     */
    private String courseDate;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 老师uuid
     */
    private String teacherUuid;
    /**
     * 老师姓名
     */
    private String teacherName;

    /**
     *课程id号
     */
    private String classInId;
    /**
     * 课节id号
     */
    private String classInLessonId;
    /**
     * 学生uuid
     */
    private String leadsUuid;
    /**
     * 学生姓名
     */
    private String leadsName;
//	/**
//	 * 所述销售
//	 */
//	private String saleName;

    /**
     * 学生手机号
     */
    private String leadsPhone;

    /**
     * 课程状态
     */
    private String courseStatus;

    /**
     * 反馈状态
     */
    private String feedbackStaus;

    /**
     * 反馈描述
     */
    private String feedbackDes;

    /**
     * 学生信息
     */
    private List<CourseLeadsDto> leadsVos = new ArrayList<>();

    /**
     *返给前端的状态 0.未填写,1.已填写
     */
    private String status;
    /**
     * 上课内容
     */
    private String classContent;

    /**
     * 教学目标
     */
    private String teachGoal;

    private String teacherFeedBackUuid;

    @Override
    public String toString() {
        return "TestCourseVo [courseUuid=" + courseUuid + ", subject=" + subject + ", grade=" + grade + ", classNo="
                + classNo + ", courseDate=" + courseDate + ", startTime=" + startTime + ", endTime=" + endTime
                + ", teacherUuid=" + teacherUuid + ", teacherName=" + teacherName + ", leadsVos=" + leadsVos
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
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

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassInId() {
        return classInId;
    }

    public void setClassInId(String classInId) {
        this.classInId = classInId;
    }

    public String getClassInLessonId() {
        return classInLessonId;
    }

    public void setClassInLessonId(String classInLessonId) {
        this.classInLessonId = classInLessonId;
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

    public String getLeadsPhone() {
        return leadsPhone;
    }

    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getFeedbackStaus() {
        return feedbackStaus;
    }

    public void setFeedbackStaus(String feedbackStaus) {
        this.feedbackStaus = feedbackStaus;
    }

    public String getFeedbackDes() {
        return feedbackDes;
    }

    public void setFeedbackDes(String feedbackDes) {
        this.feedbackDes = feedbackDes;
    }

    public List<CourseLeadsDto> getLeadsVos() {
        return leadsVos;
    }

    public void setLeadsVos(List<CourseLeadsDto> leadsVos) {
        this.leadsVos = leadsVos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClassContent() {
        return classContent;
    }

    public void setClassContent(String classContent) {
        this.classContent = classContent;
    }

    public String getTeachGoal() {
        return teachGoal;
    }

    public void setTeachGoal(String teachGoal) {
        this.teachGoal = teachGoal;
    }

    public String getTeacherFeedBackUuid() {
        if (!ValidateUtil.isNotEmpty(teacherFeedBackUuid)){
            return "0";
        }
        return teacherFeedBackUuid;
    }

    public void setTeacherFeedBackUuid(String teacherFeedBackUuid) {
        this.teacherFeedBackUuid = teacherFeedBackUuid;
    }
}
