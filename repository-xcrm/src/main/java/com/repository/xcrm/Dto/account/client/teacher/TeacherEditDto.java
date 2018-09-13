package com.repository.xcrm.Dto.account.client.teacher;

import com.repository.xcrm.Dto.account.server.teacher.TeacherDto;

import java.io.Serializable;

/**
 * @description：编辑老师要获取的数据
 * @author： denny
 * @create： 2018-03-20 17:58
 **/
public class TeacherEditDto extends TeacherDto implements Serializable{
    private static final long serialVersionUID = 1L;

    private String subject;
    private String wechat;
    private String natureOfWork;
    private String schoolId;
    private String payMoney;
    private String des;
    private String contactInformation;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getNatureOfWork() {
        return natureOfWork;
    }

    public void setNatureOfWork(String natureOfWork) {
        this.natureOfWork = natureOfWork;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        return "TeacherEditDto{" +
                "subject='" + subject + '\'' +
                ", wechat='" + wechat + '\'' +
                ", natureOfWork='" + natureOfWork + '\'' +
                ", schoolId='" + schoolId + '\'' +
                ", payMoney='" + payMoney + '\'' +
                ", des='" + des + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                '}';
    }
}
