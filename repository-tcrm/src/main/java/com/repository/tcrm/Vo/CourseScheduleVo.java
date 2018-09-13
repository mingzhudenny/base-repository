package com.repository.tcrm.Vo;

import java.util.List;

/**
 * @Author ywj
 * <p>
 */
public class CourseScheduleVo {
    private String courseDate;    //课程日期
    private List<TeacherCourseRemindVo> CourseScheduleList;    //课程信息

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }

    public List<TeacherCourseRemindVo> getCourseScheduleList() {
        return CourseScheduleList;
    }

    public void setCourseScheduleList(List<TeacherCourseRemindVo> courseScheduleList) {
        CourseScheduleList = courseScheduleList;
    }
}
