package com.repository.xcrm.Dto.account.server.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:24
 **/
public class TeacherClassScheduleGetDto {
    /**
     * 课表老师老师uuid
     */
    private String teacherUuid;
    /**
     * 课表老师姓名
     */
    private String teacherName;

    private String subject;

    private String teacherPhone;

    /**
     * 老师可以排课的课表
     */
    List<CourseClassScheduleDto> classScheduleVos = new ArrayList<>();

    @Override
    public String toString() {
        return "TeacherClassScheduleGetVo [teacherUuid=" + teacherUuid + ", teacherName=" + teacherName + ", subject="
                + subject + ", teacherPhone=" + teacherPhone + ", classScheduleVos=" + classScheduleVos
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public List<CourseClassScheduleDto> getClassScheduleVos() {
        return classScheduleVos;
    }

    public void setClassScheduleVos(List<CourseClassScheduleDto> classScheduleVos) {
        this.classScheduleVos = classScheduleVos;
    }
}
