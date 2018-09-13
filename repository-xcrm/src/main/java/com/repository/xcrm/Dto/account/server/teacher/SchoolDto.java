package com.repository.xcrm.Dto.account.server.teacher;

import java.io.Serializable;

/**
 * @description：老师所属院校 dto
 * @author： denny
 * @create： 2018-03-20 17:42
 **/
public class SchoolDto implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String schoolName;
    @Override
    public String toString() {
        return "SchoolVo [id=" + id + ", schoolName=" + schoolName + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
