package com.repository.xcrm.Po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：课程 dto
 * @author： denny
 * @create： 2018-03-21 10:31
 **/
@Data
public class CpClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String uuid;

    private String teacherScheduleUuid;

    private String className;

    private String teacherUuid;

    private Integer studentCount;

    private String subject;

    private String grade;

    private Integer courseType;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    private String classCode;

    private String classinId;

    private Integer isSuccess;

    private String createUserId;

    private String updateUserId;
}
