package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：上课中课节成员的时间
 * @author： denny
 * @create： 2018-05-15 14:02
 **/
@Data
public class ClassinLessonMemberTime {
    private int id;
    private String clientClassId;
    private String clientCourseId;
    private String tfirstEnterTime;
    private String tlastExitETime;
    private String teachTime;
    private String studyTime;
    private String sfirstEnterTime;
    private String slastExitTime;
    private String account;
    private String name;
    private Date createTime;
}
