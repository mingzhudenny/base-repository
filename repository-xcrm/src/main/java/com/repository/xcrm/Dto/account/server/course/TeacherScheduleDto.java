package com.repository.xcrm.Dto.account.server.course;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：课时课表信息
 * @author： denny
 * @create： 2018-03-21 11:25
 **/
public class TeacherScheduleDto {
    private String teacherUuid;
    private String teacherName;
    private List<ClassDto> classVos = new ArrayList<>();
    @Override
    public String toString() {
        return "TeacherScheduleVo [teacherUuid=" + teacherUuid + ", teacherName=" + teacherName + ", classVos="
                + classVos + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
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

    public List<ClassDto> getClassVos() {
        return classVos;
    }

    public void setClassVos(List<ClassDto> classVos) {
        this.classVos = classVos;
    }
}
