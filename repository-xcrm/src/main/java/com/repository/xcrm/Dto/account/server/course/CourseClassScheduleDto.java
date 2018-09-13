package com.repository.xcrm.Dto.account.server.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:08
 **/
public class CourseClassScheduleDto {
    private String classScheduleUuid;
    /**
     * 课表年级
     */
    private String grade;
    /**
     * 课表学生数量
     */
    private Integer studentCount;

    private String scheduleDate;

    /**
     * 时间配置开始时间
     */
    private String scheduleStartTime;

    /**
     * 时间配置结束时间
     */
    private String scheduleEndTime;

    List<CourseLeadsDto> courseLeadsVos = new ArrayList<>();

    @Override
    public String toString() {
        return "CourseClassScheduleVo [classScheduleUuid=" + classScheduleUuid + ", grade=" + grade + ", studentCount="
                + studentCount + ", scheduleStartTime=" + scheduleStartTime + ", scheduleEndTime=" + scheduleEndTime
                + ", courseLeadsVos=" + courseLeadsVos + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getClassScheduleUuid() {
        return classScheduleUuid;
    }

    public void setClassScheduleUuid(String classScheduleUuid) {
        this.classScheduleUuid = classScheduleUuid;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
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

    public List<CourseLeadsDto> getCourseLeadsVos() {
        return courseLeadsVos;
    }

    public void setCourseLeadsVos(List<CourseLeadsDto> courseLeadsVos) {
        this.courseLeadsVos = courseLeadsVos;
    }
}
