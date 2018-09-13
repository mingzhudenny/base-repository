package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-27 16:46
 **/
@Data
public class CpClassLesson {
    private Integer id;

    private String uuid;

    private String classinId;

    private String classCode;

    private Integer isSuccess;

    private String courseUuid;

    private String teacherUuid;

    private String classNo;

    private String lessonDate;

    private String startTime;

    private String endTime;

    private Double length;

    private Integer studentCount;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    private String leadsPhone;
}
