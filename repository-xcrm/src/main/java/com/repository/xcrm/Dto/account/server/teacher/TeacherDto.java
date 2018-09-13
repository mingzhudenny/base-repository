package com.repository.xcrm.Dto.account.server.teacher;

import java.io.Serializable;

/**
 * @description：teacher 基本传输参数
 * @author： denny
 * @create： 2018-03-20 16:40
 **/
public class TeacherDto implements Serializable{
    private static final long serialVersionUID = 1L;

    private String teacherUuid;
    /**
     * 老师姓名
     */
    private String teacherName;
    /**
     * 老师手机号
     */
    private String teacherPhone;

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

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    @Override
    public String toString() {
        return "TeacherDto{" +
                "teacherUuid='" + teacherUuid + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherPhone='" + teacherPhone + '\'' +
                '}';
    }
}
