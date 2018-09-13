package com.repository.xcrm.Dto.order.server;

import com.base.utils.validate.ValidateUtil;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-04 11:16
 **/
public class WaitPayLeadsInfoDto {

    private String uuid;//leadsUuid
    private String name;//姓名
    private String phone;//电话号码
    private String grade;//年级
    private String subject;//科目
    private String refuseCause;//审核备注
    private String isCheck;//订单状态 是否审核0：待审核 2：审核拒绝3：没有提交付费申请
    private String courseUuid;//课程uuid
    private String payUuid;//支付订单uuid

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRefuseCause() {
        return refuseCause;
    }

    public void setRefuseCause(String refuseCause) {
        this.refuseCause = refuseCause;
    }

    public String getIsCheck() {
        String defaultValue = "3";//没有提交付费申请
        if(ValidateUtil.isNotEmpty(isCheck)){
            return isCheck;
        }
        return defaultValue;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }

    public String getPayUuid() {
        return payUuid;
    }

    public void setPayUuid(String payUuid) {
        this.payUuid = payUuid;
    }
}
