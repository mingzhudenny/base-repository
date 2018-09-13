package com.repository.xcrm.Dto.account.server.teacher;

import java.io.Serializable;

/**
 * @description：老师离职库
 * @author： denny
 * @create： 2018-03-20 17:34
 **/
public class DimissionTeacherDto extends TeacherDto implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 科目
     */
    private String subject;
    /**
     * 支付薪资
     */
    private String payMoney;
    /**
     * 老师状态0:暂停排课1：可排课2：离职库
     */
    private Integer teacherStatus;
    /**
     * 创建时间
     */
    private String createTime;

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

    public Integer getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(Integer teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
