package com.repository.crm.Dto.kpi.server.sale;

import com.base.utils.validate.ValidateUtil;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-25 14:29
 **/
public class SaleDetailKpiServerDto {
    private String leadsUuid;
    private String leadsName;
    private String leadsPhone;
    private String phoneLocaltion;
    private String grade;
    private String subject;
    private String leadsGrade;
    private String leadsSubject;
    private String buyLength;
    private String courseLevel;
    private String money;
    private String saleName;
    private String teamName;
    private String payType;
    private String inActivities;
    private String promotionCode;
    private String payTime;
    private String commitTime;
    private String checkStatus;
    private String updateTime;
    private String courseActivitiyLevel;
    private String province;
    private String city;
    private String count;
    private String schoolName;
    private String channelName;
    /** 是否推荐 */
    private Boolean isRecommend;
    /** */
    @SuppressWarnings("unused")
    private String isRecommendDesc;

    /** 课程包类型 */
    private String coursePriceType;


    public String getCoursePriceType() {
        return coursePriceType;
    }

    public void setCoursePriceType(String coursePriceType) {
        this.coursePriceType = coursePriceType;
    }

    public String getLeadsGrade() {
        return leadsGrade;
    }

    public void setLeadsGrade(String leadsGrade) {
        this.leadsGrade = leadsGrade;
    }

    public String getLeadsSubject() {
        return leadsSubject;
    }

    public void setLeadsSubject(String leadsSubject) {
        this.leadsSubject = leadsSubject;
    }

    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getIsRecommendDesc() {

        if(isRecommend == null){

            return null;
        }

        if(isRecommend){

            return "是";

        }else{

            return "否";
        }
        // return isRecommendDesc;
    }

    public void setIsRecommendDesc(String isRecommendDesc) {
        this.isRecommendDesc = isRecommendDesc;
    }

    @Override
    public String toString() {
        return "SaleDetailKpiVo [leadsUuid=" + leadsUuid + ", leadsName=" + leadsName + ", leadsPhone=" + leadsPhone
                + ", grade=" + grade + ", subject=" + subject + ", buyLength=" + buyLength + ", courseLevel="
                + courseLevel + ", money=" + money + ",channelName="+channelName+", saleName=" + saleName + ", teamName=" + teamName + ", payType="
                + payType + ", inActivities=" + inActivities + ", promotionCode=" + promotionCode + ", payTime="
                + payTime + ", commitTime=" + commitTime + ", checkStatus=" + checkStatus + ", updateTime=" + updateTime
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    public String getPhoneLocaltion() {
        return phoneLocaltion;
    }

    public void setPhoneLocaltion(String phoneLocaltion) {
        this.phoneLocaltion = phoneLocaltion;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCourseActivitiyLevel() {
        return courseActivitiyLevel;
    }

    public void setCourseActivitiyLevel(String courseActivitiyLevel) {
        this.courseActivitiyLevel = courseActivitiyLevel;
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
        if(ValidateUtil.isNotEmpty(grade))
            return grade;
        return leadsGrade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        if(ValidateUtil.isNotEmpty(subject))
            return subject;
        return leadsSubject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBuyLength() {
        return buyLength;
    }

    public void setBuyLength(String buyLength) {
        this.buyLength = buyLength;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getInActivities() {
        return inActivities;
    }

    public void setInActivities(String inActivities) {
        this.inActivities = inActivities;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
    
}
