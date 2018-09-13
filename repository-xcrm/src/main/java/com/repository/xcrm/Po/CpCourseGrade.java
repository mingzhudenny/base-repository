package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

@Data
public class CpCourseGrade {
    private Integer id;

    private String grade;

    private Date createDate;

    private Date updateDate;

    private Integer version;

    private String creater;

    private String updater;

    private Integer status;
}