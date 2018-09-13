package com.repository.xcrm.Dto.account.server.teacher;

import java.io.Serializable;

/**
 * @description：师资库要展示的数据信息
 * @author： denny
 * @create： 2018-03-20 17:56
 **/
public class TeacherLibraryDto extends TeacherDto implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 老师状态
     */
    private Byte teacherStatus;
    /**
     * 老师状态
     */
    private String teacherDes;
    /**
     * 所教科目
     */
    private String subject;
    /**
     * 支付薪水
     */
    private String payMoney;
    /**
     * 创建时间
     */
    private String createTime;

    public Byte getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(Byte teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public String getTeacherDes() {
        return teacherDes;
    }

    public void setTeacherDes(String teacherDes) {
        this.teacherDes = teacherDes;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TeacherLibraryDto{" +
                "teacherStatus=" + teacherStatus +
                ", teacherDes='" + teacherDes + '\'' +
                ", subject='" + subject + '\'' +
                ", payMoney='" + payMoney + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
