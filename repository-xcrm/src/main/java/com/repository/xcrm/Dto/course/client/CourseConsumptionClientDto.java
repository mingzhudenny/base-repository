package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-16 14:00
 **/
@Data
public class CourseConsumptionClientDto extends BaseDto{
    /**
     * 上课开始日期
     */
    private String courseStartDate;
    /**
     * 上课结束日期
     */
    private String courseEndDate;
    /**
     * 学生姓名和手机号
     */
    private String studentParams;
    /**
     * 老师姓名和手机号
     */
    private String teacherParams;

    /**
     * 身份
     */
    private String identity;

    /**
     * 课节ID
     */
    private String classId;
    /**
     * 课程ID
     */
    private String courseId;


}
