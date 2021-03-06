package com.repository.crm.Po;

 

import java.util.Date;
import java.util.List;
/**
 * password;remark;openId;teacherNotes;含有这些字段，TcTeacherVO没有这些属性
 * @author 171124-02
 *
 */
public class TcTeacher {
    private Long id;

    private String uuid;
    
    private Long trainingAccountId;
    
    private String trainingQuestionNumber;
    
    private String address;//长期居住地址
    
    private String registerRemark;//待邀约对老师的备注
    
    private String invitationUuid;//邀约人
    
    private Date updateTime;//空闲时间更新的时间
    
    private String branch;//老师的分部
    
    private Long interviewScheduleId;
    
    private Date invitationDate;

    private String tcName;

    private String password;

    private Integer sex;

    private Integer natureOfWork;

    private String phone;

    private String email;

    private String qq;

    private String wechat;

    private String idNumber;

    private String major;

    private Integer payGrade;

    private Integer hourlyWage;

    private String schoolLocation;

    private String grade;

    private Integer education;

    private Integer highestEducation;

    private String province;

    private String city;

    private String district;

    private Integer artsOrScience;

    private String subject;

    private String teachingSubject;

    private String secondSubject;

    private String thirdSubject;

    private String gradePreference;

    private Integer haveVideo;

    private Integer agentType;

    private String agentUuid;

    private String bank;

    private String bankAddress;

    private String cardNumber;

    private Integer teacherStatus;
    
    private Integer isPass;

    private String remark;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Long version;

    private String referral;
    
    private String openId;//老师微信的openId    
    
    private Date inventoryDate;//入库时间
    
    private Date interviewDate;//面试的时间
    
    private String interviewUuid;//面试人的UUID
    
    private String teacherNotes;//老师的监课备注   
    
    private String emergencyPhone;
    
    private String emergencyRelation;
    
    private String teacherLeaveTime;    

	public String getTeacherLeaveTime() {
		return teacherLeaveTime;
	}

	public void setTeacherLeaveTime(String teacherLeaveTime) {
		this.teacherLeaveTime = teacherLeaveTime;
	}

	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}

	public String getEmergencyRelation() {
		return emergencyRelation;
	}

	public void setEmergencyRelation(String emergencyRelation) {
		this.emergencyRelation = emergencyRelation;
	}

	public String getInterviewUuid() {
		return interviewUuid;
	}

	public void setInterviewUuid(String interviewUuid) {
		this.interviewUuid = interviewUuid;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Long getInterviewScheduleId() {
		return interviewScheduleId;
	}

	public void setInterviewScheduleId(Long interviewScheduleId) {
		this.interviewScheduleId = interviewScheduleId;
	}

	public Date getInvitationDate() {
		return invitationDate;
	}

	public void setInvitationDate(Date invitationDate) {
		this.invitationDate = invitationDate;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getInvitationUuid() {
		return invitationUuid;
	}

	public void setInvitationUuid(String invitationUuid) {
		this.invitationUuid = invitationUuid;
	}

	public String getRegisterRemark() {
		return registerRemark;
	}

	public void setRegisterRemark(String registerRemark) {
		this.registerRemark = registerRemark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTrainingQuestionNumber() {
		return trainingQuestionNumber;
	}

	public void setTrainingQuestionNumber(String trainingQuestionNumber) {
		this.trainingQuestionNumber = trainingQuestionNumber;
	}

	public String getTeacherNotes() {
		return teacherNotes;
	}

	public void setTeacherNotes(String teacherNotes) {
		this.teacherNotes = teacherNotes;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public Integer getIsPass() {
		return isPass;
	}

	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}

	public Date getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(Date inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	private List<Integer> beforStatusList;//前置状态
    

	public Long getTrainingAccountId() {
		return trainingAccountId;
	}

	public void setTrainingAccountId(Long trainingAccountId) {
		this.trainingAccountId = trainingAccountId;
	}

	public List<Integer> getBeforStatusList() {
		return beforStatusList;
	}

	public void setBeforStatusList(List<Integer> beforStatusList) {
		this.beforStatusList = beforStatusList;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName == null ? null : tcName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getNatureOfWork() {
        return natureOfWork;
    }

    public void setNatureOfWork(Integer natureOfWork) {
        this.natureOfWork = natureOfWork;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(Integer payGrade) {
        this.payGrade = payGrade;
    }

    public Integer getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Integer hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation == null ? null : schoolLocation.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(Integer highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getArtsOrScience() {
        return artsOrScience;
    }

    public void setArtsOrScience(Integer artsOrScience) {
        this.artsOrScience = artsOrScience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject == null ? null : teachingSubject.trim();
    }

    public String getSecondSubject() {
        return secondSubject;
    }

    public void setSecondSubject(String secondSubject) {
        this.secondSubject = secondSubject == null ? null : secondSubject.trim();
    }

    public String getThirdSubject() {
        return thirdSubject;
    }

    public void setThirdSubject(String thirdSubject) {
        this.thirdSubject = thirdSubject == null ? null : thirdSubject.trim();
    }

    public String getGradePreference() {
        return gradePreference;
    }

    public void setGradePreference(String gradePreference) {
        this.gradePreference = gradePreference == null ? null : gradePreference.trim();
    }

    public Integer getHaveVideo() {
        return haveVideo;
    }

    public void setHaveVideo(Integer haveVideo) {
        this.haveVideo = haveVideo;
    }

    public Integer getAgentType() {
        return agentType;
    }

    public void setAgentType(Integer agentType) {
        this.agentType = agentType;
    }

    public String getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(String agentUuid) {
        this.agentUuid = agentUuid == null ? null : agentUuid.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public Integer getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(Integer teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral == null ? null : referral.trim();
    }
}