package com.repository.xcrm.Dto.app.server.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-11 21:16
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class AppClassDto {
    /**
     * 老师uuid
     */
    private String teacherUuid;
    /**
     * 老师课表uuid
     */
    private String teacherScheduleUuid;
    /**
     * 上课日期
     */
    private String courseDate;
    /**
     * 开始时间
     */
    private String courseStartTime;
    /**
     * 结束时间
     */
    private String courseEndTime;
    /**
     * 课程uuid
     */
    private String courseUuid;
    /**
     * 课程类别
     */
    private String courseType;
    /**
     * 老师姓名
     */
    private String teacherName;
    /**
     * 科目
     */
    private String subject;
    /**
     * 是否进入教室
     */
    private boolean isEnterClassroom;

    /**
     * 评价uuid
     */
    private String classAppraiseUuid;

    /**
     * 老师反馈uuid
     */
    private String teacherFeedBackUuid;
    /**
     * 课程classinid
     */
    private String classInId;
    /**
     * 课节classinid
     */
    private String classInLessonId;
}
