package com.repository.xcrm.Dto.account.client.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：老师课程信息反馈
 * @author： denny
 * @create： 2018-03-23 16:27
 **/
public class ClassTeacherFeedBackDto {

    /**
     * 课程uuid
     */
    private String courseUuid;

    /**
     * 老师uuid
     */
    private String teacherUuid;

    /**
     * 上课内容
     */
    private String classContent;

    /**
     * 教学目标
     */
    private String teachGoal;

    /**
     * 老师给予学生的反馈
     */
    private List<TeacherToLeadsFeedBackDto> teacherToLeadsFeedBackDtos =new ArrayList<>();

    public String getTeacherUuid() {
        return teacherUuid;
    }

    public void setTeacherUuid(String teacherUuid) {
        this.teacherUuid = teacherUuid;
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

    public List<TeacherToLeadsFeedBackDto> getTeacherToLeadsFeedBackDtos() {
        return teacherToLeadsFeedBackDtos;
    }

    public void setTeacherToLeadsFeedBackDtos(List<TeacherToLeadsFeedBackDto> teacherToLeadsFeedBackDtos) {
        this.teacherToLeadsFeedBackDtos = teacherToLeadsFeedBackDtos;
    }

    public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }
}
