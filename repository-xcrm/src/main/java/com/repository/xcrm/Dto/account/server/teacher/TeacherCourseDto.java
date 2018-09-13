package com.repository.xcrm.Dto.account.server.teacher;

import java.io.Serializable;

/**
 * @description：正式生排课表老师展示数据
 * @author： denny
 * @create： 2018-03-20 17:46
 **/
public class TeacherCourseDto extends TeacherDto implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 科目
     */
    private String subject;
    /**
     * 年级
     */
    private String grade;

    private String des;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
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

    @Override
    public String toString() {
        return "TeacherCourseDto{" +
                "subject='" + subject + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
