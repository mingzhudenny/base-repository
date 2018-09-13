package com.repository.xcrm.Dto.course.server;

import com.base.utils.date.DateUtil;
import com.base.utils.validate.ValidateUtil;
import lombok.Data;

/**
 * @description：课程消耗
 * @author： denny
 * @create： 2018-05-15 18:50
 **/
public class QueryCourseConsumptionDto {
    /**
     * 课节ID
     */
   private String classId;
    /**
     * 课程ID
     */
   private String courseId;
    /**
     * 课程名称
     */
   private String courseName;
    /**
     * 课节名称
     */
   private String className;
    /**
     * 上课日期
     */
   private String courseDate;
    /**
     * 上课开始时间
     */
   private String courseStartTime;
    /**
     * 上课结束时间
     */
   private String courseEndTime;
    /**
     * 学生姓名
     */
   private String studentName;
    /**
     * 学生手机号码
     */
   private String studentPhone;
    /**
     * 老师姓名
     */
   private String teacherName;
    /**
     * 老师手机号码
     */
   private String teacherPhone;
    /**
     * 实际上课时长
     */
   private String realClassLength;
    /**
     * 课程回放地址
     */
   private String classPlayBackAddress;
    /**
     * 学生出勤
     */
   private String studentAttendance;
    /**
     * 学生上课时长
     */
   private String studentClassLength;
    /**
     * 老师出勤
     */
   private String teacherAttendance;
    /**
     * 老师上课时长
     */
   private String teacherClassLength;

    /**
     * 进入房间时间
     */
   private String inTime;
    /**
     * 退出房间时间
     */
   private String outTime;
    /**
     * 手机号
     */
   private String account;
    /**
     * 昵称
     */
   private String nickname;
    /**
     * 身份
     */
   private String identity;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getRealClassLength() {
        if (ValidateUtil.isNotEmpty(realClassLength)||!realClassLength.equals("0")){
            realClassLength=DateUtil.getTimeStrBySecond(Integer.parseInt(realClassLength));
        }
        return realClassLength;
    }

    public void setRealClassLength(String realClassLength) {
        this.realClassLength = realClassLength;
    }

    public String getClassPlayBackAddress() {
        return classPlayBackAddress;
    }

    public void setClassPlayBackAddress(String classPlayBackAddress) {
        this.classPlayBackAddress = classPlayBackAddress;
    }

    public String getStudentAttendance() {
        return studentAttendance;
    }

    public void setStudentAttendance(String studentAttendance) {
        this.studentAttendance = studentAttendance;
    }

    public String getStudentClassLength() {
        if (ValidateUtil.isNotEmpty(studentClassLength)||!studentClassLength.equals("0")){
            studentClassLength=DateUtil.getTimeStrBySecond(Integer.parseInt(studentClassLength));
        }
        return studentClassLength;
    }

    public void setStudentClassLength(String studentClassLength) {
        this.studentClassLength = studentClassLength;
    }

    public String getTeacherAttendance() {
        return teacherAttendance;
    }

    public void setTeacherAttendance(String teacherAttendance) {
        this.teacherAttendance = teacherAttendance;
    }

    public String getTeacherClassLength() {
        if (ValidateUtil.isNotEmpty(teacherClassLength)||!teacherClassLength.equals("0")){
            teacherClassLength=DateUtil.getTimeStrBySecond(Integer.parseInt(teacherClassLength));
        }
        return teacherClassLength;
    }

    public void setTeacherClassLength(String teacherClassLength) {
        this.teacherClassLength = teacherClassLength;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
