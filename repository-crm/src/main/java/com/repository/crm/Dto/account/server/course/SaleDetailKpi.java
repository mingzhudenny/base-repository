package com.repository.crm.Dto.account.server.course;

import java.util.Date;

import com.base.utils.validate.ValidateUtil;

/**
 * @description：
 * @author： denny
 * @create： 2017-12-01 21:20
 **/
public class SaleDetailKpi {
    private Integer id;
    private String payUuid;
    private String leadsUuid;
    private String leadsName;
    private String leadsPhone;
    private String phoneLocaltion;
    private String grade;
    private String subject;
    private String leadsGrade;
    private String leadsSubject;
    private String buyLength;
    private Integer courseLevel;
    private String money;
    private String saleName;
    private String teamName;
    private String payType;
    private String inActivities;
    private String promotionCode;
    private String payTime;
    private Date commitTime;
    private String checkStatus;
    private Date updateTime;
    private String courseActivitiyLevel;
    private String province;
    private String city;
    private String count;
    private String schoolName;
	private Boolean isRecommend;	
	/** 课程包类型 */
	private String coursePriceType;

    /**
     * 更新来源 0.财务待审核 1.待付费
     */
	private String updateSource;

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

	public String getCoursePriceType() {
		return coursePriceType;
	}

	public void setCoursePriceType(String coursePriceType) {
		this.coursePriceType = coursePriceType;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCourseLevel(Integer courseLevel) {
        this.courseLevel = courseLevel;
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

    public Integer getCourseLevel() {
        return courseLevel;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPayUuid() {
        return payUuid;
    }

    public void setPayUuid(String payUuid) {
        this.payUuid = payUuid;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean recommend) {
        isRecommend = recommend;
    }

    public String getUpdateSource() {
        return updateSource;
    }

    public void setUpdateSource(String updateSource) {
        this.updateSource = updateSource;
    }
}
