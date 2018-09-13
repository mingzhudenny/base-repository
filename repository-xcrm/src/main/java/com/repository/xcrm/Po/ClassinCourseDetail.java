package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：课程对象
 * @author： denny
 * @create： 2018-05-11 17:06
 **/
@Data
public class ClassinCourseDetail {
    private int id;
    private String courseId;
    private String courseName;
    private String coverImg;
    private String studentNum;
    private String classCount;
    private String courseBtime;
    private String courseEtime;
    private String courseStatus;
    private String addtime;
    private String expiryTime;
    private String folderName;
    private Date createTime;
    private Date updateTime;
}

