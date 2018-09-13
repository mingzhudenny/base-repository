package com.repository.xcrm.Dto.account.server.course;

import java.util.ArrayList;
import java.util.List;

import com.base.utils.validate.ValidateUtil;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:16
 **/
public class FormalCourseDto {
    /**
     * 课程uuid
     */
    private String courseUuid;
    /**
     * 老师uuid
     */
    private String teacherUuid;
    /**
     * 老师姓名
     */
    private String teacherName;
    /**
     * 首节课开始时间
     */
    private String firstCourseTime;
    /**
     * 科目
     */
    private String subject;
    /**
     * 年级
     */
    private String grade;
    /**
     * 课程类型
     */
    private String courseType;
    /**
     * 学生信息
     */
    private List<CourseLeadsDto> leadsVos = new ArrayList<>();
    @Override
    public String toString() {
        return "FormalCourseVo [courseUuid=" + courseUuid + ", teacherUuid=" + teacherUuid + ", teacherName="
                + teacherName + ", firstCourseTime=" + firstCourseTime + ", subject=" + subject + ", grade=" + grade
                + ", courseType=" + courseType + ", leadsVos=" + leadsVos + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
    public String getCourseUuid() {
        return courseUuid;
    }
    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
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
    public String getFirstCourseTime() {
        return firstCourseTime;
    }
    public void setFirstCourseTime(String firstCourseTime) {
        this.firstCourseTime = firstCourseTime;
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
    public String getCourseType() {
        if(ValidateUtil.isNotEmpty(courseType)){
            if(courseType.equals("1")){
                return "正式课";
            }else{
                return "测评课";
            }
        }
        return "正式课";
    }
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
    public List<CourseLeadsDto> getLeadsVos() {
        return leadsVos;
    }
    public void setLeadsVos(List<CourseLeadsDto> leadsVos) {
        this.leadsVos = leadsVos;
    }
}
