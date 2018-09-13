package com.repository.tcrm.Vo;

import java.util.List;

/**
 * @Author ywj
 * <p>
 */
public class TeacherCourseRecordListVo {
    private String courseDate;
    private List<TeacherCourseRecordVo> list;

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }

    public List<TeacherCourseRecordVo> getList() {
        return list;
    }

    public void setList(List<TeacherCourseRecordVo> list) {
        this.list = list;
    }
}
