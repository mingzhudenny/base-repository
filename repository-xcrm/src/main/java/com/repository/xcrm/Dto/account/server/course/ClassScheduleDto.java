package com.repository.xcrm.Dto.account.server.course;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 10:56
 **/
public class ClassScheduleDto {
    /**
     * 老师课表uuid
     */
    private String teacherScheduleUuid;
    /**
     * 老师的uuid
     */
    private String teacherUuid;
    /**
     * 老师姓名
     */
    private String teacherName;
    private String teacherPhone;
    /**
     * 课表年级
     */
    private String grade;
    /**
     * 课程时间配置uuid
     */
    private String classScheduleUuid;
    /**
     * 课表学生数量
     */
    private Integer studentCount;
    /**
     * 课表日期
     */
    private String date;
    /**
     * 周几
     */
    private String week;
    /**
     * 时间配置开始时间
     */
    private String scheduleStartTime;
    /**
     * 时间配置结束时间
     */
    private String courseDate;
    private String scheduleEndTime;
    private String courseUuid;
    private String leadsUuid;
    private String leadsName;
    private String ccName;
    private String crName;
    private String saleName;

    public String getCourseDate() {
        return courseDate;
    }
    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }
    public String getCourseUuid() {
        return courseUuid;
    }
    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }
    public String getTeacherPhone() {
        return teacherPhone;
    }
    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
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
    public String getTeacherScheduleUuid() {
        return teacherScheduleUuid;
    }
    public void setTeacherScheduleUuid(String teacherScheduleUuid) {
        this.teacherScheduleUuid = teacherScheduleUuid;
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
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getClassScheduleUuid() {
        return classScheduleUuid;
    }
    public void setClassScheduleUuid(String classScheduleUuid) {
        this.classScheduleUuid = classScheduleUuid;
    }
    public Integer getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getWeek() {
        return week;
    }
    public void setWeek(String week) {
        this.week = week;
    }
    public String getScheduleStartTime() {
        return scheduleStartTime;
    }
    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }
    public String getScheduleEndTime() {
        return scheduleEndTime;
    }
    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }
    public String getCcName() {
        return ccName;
    }
    public void setCcName(String ccName) {
        this.ccName = ccName;
    }
    public String getCrName() {
        return crName;
    }
    public void setCrName(String crName) {
        this.crName = crName;
    }
    public String getSaleName() {
        return saleName;
    }
    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }
}
