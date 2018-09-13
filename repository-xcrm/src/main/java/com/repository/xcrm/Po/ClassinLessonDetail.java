package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：课节对象
 * @author： denny
 * @create： 2018-05-11 17:09
 **/
@Data
public class ClassinLessonDetail {
    private int id;
    private String classId;
    private String className;
    private String classDate;
    private String classTime;
    private String classBTime;
    private String classETime;
    private String seatNum;
    private String record;
    private String live;
    private String replay;
    private String teacherAccount;
    private String teacherName;
    private String clientCourseId;
    private String clientClassId;
    private Date createTime;
    private Date updateTime;
    private String classWebcastUrl;
}
