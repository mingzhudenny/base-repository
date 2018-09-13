package com.repository.xcrm.Dto.account.server.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:09
 **/
public class ClassDto {
    private String teacherUuid;
    private String teacherScheduleUuid;
    private String courseDate;
    private String courseStartTime;
    private String courseEndTime;
    private String courseUuid;
    private String courseType;
    private String grade;
    private List<CourseLeadsDto> courseLeadsVos = new ArrayList<>();
    public String getTeacherUuid() {
        return teacherUuid;
    }
    public void setTeacherUuid(String teacherUuid) {
        this.teacherUuid = teacherUuid;
    }
    public String getTeacherScheduleUuid() {
        return teacherScheduleUuid;
    }
    public void setTeacherScheduleUuid(String teacherScheduleUuid) {
        this.teacherScheduleUuid = teacherScheduleUuid;
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
    public String getCourseUuid() {
        return courseUuid;
    }
    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }

    public List<CourseLeadsDto> getCourseLeadsVos() {
        return courseLeadsVos;
    }

    public void setCourseLeadsVos(List<CourseLeadsDto> courseLeadsVos) {
        this.courseLeadsVos = courseLeadsVos;
    }

    public String getCourseType() {
        return courseType;
    }
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ClassVo [teacherUuid=" + teacherUuid + ", teacherScheduleUuid=" + teacherScheduleUuid + ", courseDate="
                + courseDate + ", courseStartTime=" + courseStartTime + ", courseEndTime=" + courseEndTime
                + ", courseUuid=" + courseUuid + ", courseLeadsVos=" + courseLeadsVos + ", getTeacherUuid()="
                + getTeacherUuid() + ", getTeacherScheduleUuid()=" + getTeacherScheduleUuid() + ", getCourseDate()="
                + getCourseDate() + ", getCourseStartTime()=" + getCourseStartTime() + ", getCourseEndTime()="
                + getCourseEndTime() + ", getCourseUuid()=" + getCourseUuid() + ", getCourseLeadsVos()="
                + getCourseLeadsVos() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
}
