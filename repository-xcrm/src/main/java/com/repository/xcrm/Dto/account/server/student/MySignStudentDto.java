package com.repository.xcrm.Dto.account.server.student;

import java.util.Date;

/**
 * @description：cc|cr 我的签约学生Dto
 * @author： denny
 * @create： 2018-04-28 11:21
 **/
public class MySignStudentDto {
    /**
     * leads的uuid
     */
    private String leadsUuid;
    /**
     * leads姓名
     */
    private String leadsName;
    /**
     * leads电话号码
     */
    private String leadsPhone;
    /**
     * cc姓名
     */
    private String ccName;
    /**
     * 支付次数
     */
    private Integer payCount;
    /**
     * cr姓名
     */
    private String crName;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 区
     */
    private String count;
    /**
     * 付费时间
     */
    private String payTime;
    /**
     * 是否续费
     */
    private String keyPointDesc;
    /**
     * 拨打状态
     */
    private String connectStatus;
    /**
     * 年级
     */
    private String grade;
    /**
     * 报名时间
     */
    private Date signupDate;
    /**
     * 最新备注内容
     */
    private String remarkContent;
    /**
     * 业绩提交时间
     */
    private Date inChargeDate;
    public Integer getPayCount() {
        return payCount;
    }
    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }
    public String getCrName() {
        return crName;
    }
    public void setCrName(String crName) {
        this.crName = crName;
    }
    //0:暂未被标记1：本月可维护2：本月可续费3:常规维护4：本月重点维护5:退费 6:结课 7:停课
    public String getKeyPointDesc() {

        if (payCount !=null) {

            if(payCount>1){

                return "已续费";
            }else{

                return "没有续费";
            }

        } else {

            return "没有续费";
        }

    }
    public void setKeyPointDesc(String keyPointDesc) {
        this.keyPointDesc = keyPointDesc;
    }
    public String getCcName() {
        return ccName;
    }
    public void setCcName(String ccName) {
        this.ccName = ccName;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPayTime() {
        return payTime;
    }
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
    public String getLeadsUuid() {
        return leadsUuid;
    }
    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid;
    }
    public String getLeadsName() {
        return leadsName;
    }
    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName;
    }
    public String getLeadsPhone() {
        return leadsPhone;
    }
    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public Date getSignupDate() {
        return signupDate;
    }
    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }
    public String getRemarkContent() {
        return remarkContent;
    }
    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent;
    }
    public Date getInChargeDate() {
        return inChargeDate;
    }
    public void setInChargeDate(Date inChargeDate) {
        this.inChargeDate = inChargeDate;
    }
    public String getConnectStatus() {
        return connectStatus;
    }
    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

}
