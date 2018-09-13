package com.repository.xcrm.Dto.app.server.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：老师课程反馈dto
 * @author： denny
 * @create： 2018-04-20 10:57
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class ClassTeacherFeedBackDto {

    private String uuid;
    /**
     * 学生姓名
     */
    private String leadsName;
    /**
     * 学生uuid
     */
    private  String leadsUuid;
    /**
     * 性格与习惯
     */
    private String mettleHabits;
    /**
     * 课堂习惯
     */
    private String classRoomHabit;
    /**
     * 课后建议
     */
    private String suggestAfterClass;
    /**
     * 创建日期
     */
    private Date createDate;
}
