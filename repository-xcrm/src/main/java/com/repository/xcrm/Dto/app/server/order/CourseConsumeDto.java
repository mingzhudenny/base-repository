package com.repository.xcrm.Dto.app.server.order;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-12 13:19
 **/
public class CourseConsumeDto {

    /**
     * 支付订单申请uuid
     */
    private String payUuid;
    /**
     * 学生uuid
     */
    private String leadsUuid;
    /**
     * 学生姓名
     */
    private String leadName;
    /**
     * 购买课时
     */
    private Double buyLength;
    /**
     * 赠送课时
     */
    private Double giveLength;

    /**
     * 累计总消耗课时 (cp_course 累加统计得来)
     */
    private Double haveCourseLength;
    /**
     * 消耗购买课时
     */
    private Double havebuyCourseLength;

    /**
     * 消耗赠送课时
     */
    private Double haveGiveLength;

    /**
     * 总课时
     */
    private Double sumLength;
    /**
     * 剩余课时
     */
    private Double remainderCourseLength;

    /**
     * 学生手机号
     */
    private String phone;

    /**
     * 消耗课时 (cp_pay_request)
     */
    private Double consumeLength;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 科目
     */
    private String subject;

    /**
     * 课时级别
     */
    private Byte courseLevel;

    public String getPayUuid() {
        return payUuid;
    }

    public void setPayUuid(String payUuid) {
        this.payUuid = payUuid;
    }

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public Double getBuyLength() {
        return buyLength;
    }

    public void setBuyLength(Double buyLength) {
        this.buyLength = buyLength;
    }

    public Double getGiveLength() {
        return giveLength;
    }

    public void setGiveLength(Double giveLength) {
        this.giveLength = giveLength;
    }

    public Double getHaveCourseLength() {
        if (haveCourseLength !=null){
            double i=60;
            //得到小时
            haveCourseLength =haveCourseLength/i;
            //保留两位小数
            BigDecimal bg = new BigDecimal(haveCourseLength);
            haveCourseLength = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            return haveCourseLength;
        }else {
            return Double.valueOf(0);
        }
    }

    public void setHaveCourseLength(Double haveCourseLength) {
        this.haveCourseLength = haveCourseLength;
    }

    public Double getHavebuyCourseLength() {
        return havebuyCourseLength;
    }

    public void setHavebuyCourseLength(Double havebuyCourseLength) {
        this.havebuyCourseLength = havebuyCourseLength;
    }

    public Double getHaveGiveLength() {
        return haveGiveLength;
    }

    public void setHaveGiveLength(Double haveGiveLength) {
        this.haveGiveLength = haveGiveLength;
    }

    public Double getSumLength() {
        if (haveCourseLength !=null){
            double i=60;
            //得到小时
            haveCourseLength =haveCourseLength/i;
            //保留两位小数
            BigDecimal bg = new BigDecimal(haveCourseLength);
            sumLength = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            return sumLength;
        }else {
            return Double.valueOf(0);
        }
    }

    public void setSumLength(Double sumLength) {
        this.sumLength = sumLength;
    }

    public Double getRemainderCourseLength() {
        if (haveCourseLength!=null && buyLength !=null && giveLength !=null){
            return remainderCourseLength = (buyLength+giveLength)-haveCourseLength;
        }else if (haveCourseLength!=null && buyLength !=null && giveLength==null){
            return remainderCourseLength = buyLength-haveCourseLength;
        }else {
            return Double.valueOf(0);
        }
    }

    public void setRemainderCourseLength(Double remainderCourseLength) {
        this.remainderCourseLength = remainderCourseLength;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getConsumeLength() {
        return consumeLength;
    }

    public void setConsumeLength(Double consumeLength) {
        this.consumeLength = consumeLength;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCourseLevel() {
        if (courseLevel == 0){
            return "普通";
        }else if (courseLevel == 1){
            return "清北";
        }else if(courseLevel == 2){
            return "明星";
        }
        return "";
    }

    public void setCourseLevel(Byte courseLevel) {
        this.courseLevel = courseLevel;
    }
}
