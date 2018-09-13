package com.repository.crm.Dto.kpi.client.course;

import com.repository.crm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：排课数据KPI
 * @author： denny
 * @create： 2018-06-15 10:51
 **/
@Data
public class ArrangeCourseClientDto extends BaseDto{
    /**
     * 学生姓名
     */
    private String leadsName;
    /**
     * 课程要求上课日期
     */
    private String courseRequestStartDate;
    /**
     * 课程要求上课结束日期
     */
    private String courseRequestEndDate;
    /**
     * 科目
     */
    private String subject;
    /**
     * 年级
     */
    private String grade;
    /**
     * 课程类别
     */
    private String courseType;
    /**
     * 课程级别
     */
    private String courseLevel;
    /**
     * 老师姓名
     */
    private String teacherName;
    /**
     * 销售姓名
     */
    private String saleName;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 课程要求提交开始时间
     */
    private String courseCommitStartTime;
    /**
     * 课程要求提交结束时间
     */
    private String courseCommitEndTime;
    /**
     * 排课提交开始时间
     */
    private String arrangeCourseStartTime;
    /**
     * 排课提交结束时间
     */
    private String arrangeCourseEndTime;
    /**
     * 反馈状态
     */
    private String feedbackStaus;
    /**
     * 老师分支
     */
    private String branch;
    /**
     * 销售类型
     */
    private String saleType;

    /**
     * 排课上课日期
     */
    private String courseStartDate;
    /**
     * 排课上课结束日期
     */
    private String courseEndDate;
}
