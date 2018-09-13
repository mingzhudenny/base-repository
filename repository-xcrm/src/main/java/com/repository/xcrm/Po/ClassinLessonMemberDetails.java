package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：课节下出勤成员的时间信息对象
 * @author： denny
 * @create： 2018-05-11 17:13
 **/
@Data
public class ClassinLessonMemberDetails {
    private int id;
    private String clientClassId;
    private String clientCourseId;
    private String account;
    private String nickname;
    private String identity;
    private String firstEnterTime;
    private String lastExitTime;
    private String studyTime;
    private String inOutTime;
    private String inOutType;
    private String platFormType;
    private String exitStatus;
    private String outTime;
    private Date createTime;
    private Date updateTime;
}
