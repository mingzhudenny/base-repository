package com.repository.xcrm.Dto.account.server.course;

import lombok.Data;

/**
 * @description：要创建的课节信息
 * @author： denny
 * @create： 2018-03-21 10:55
 **/
@Data
public class ClassJsonDto {

    /**
     * 课节名称
     */
    private String className;
    /**
     * 上课时间
     */
    private String beginTime;
    /**
     * 下课时间
     */
    private String endTime;
    /**
     * 老师账号（手机号）
     */
    private String teacherAccount;
    /**
     * 老师姓名
     */
    private String teacherName;
    /**
     * 云盘目录 ID
     */
    private String folderId;
    /**
     * 学生上台数
     */
    private String seatNum;
    /**
     * 录课(0 关闭，1 开启)
     */
    private String record;
    /**
     * 直播(0 关闭，1 开启)
     */
    private String live;
    /**
     * 回放(0 关闭，1 开启)
     */
    private String replay;
    /**
     * 助教账号(手机号)
     */
    private String assistantAccount;
    /**
     * 用户自定义标识
     */
    private String customColumn;
    @Override
    public String toString() {
        return "ClassJson [className=" + className + ", beginTime=" + beginTime + ", endTime=" + endTime
                + ", teacherAccount=" + teacherAccount + ", teacherName=" + teacherName + ", folderId=" + folderId
                + ", seatNum=" + seatNum + ", record=" + record + ", live=" + live + ", replay=" + replay
                + ", assistantAccount=" + assistantAccount + ", customColumn=" + customColumn + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
