package com.repository.crm.Dto.parttimeteacher.client.interview;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.repository.crm.Po.TcTeacherNotes;
import com.repository.crm.constant.Branch;
import com.repository.crm.constant.TeacherEnum.NatureOfWork;
import com.repository.crm.constant.TeacherEnum.TeacherStatus;



public class TcTeacherDetailVO {
    private Long id;

    private String uuid;
    
    private String address;
    
    private String registerNotes;//待邀约对老师的备注
    
    private String branch;//师训中心

    private String tcName;

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

    private String province;//省级

    private String city;//市级

    private String district;//区级

    private Integer artsOrScience;

    private String subject;

    private String teachingSubject;

    private String secondSubject;

    private String thirdSubject;

    private String gradePreference;

    private String agentUuid;

    private String bank;

    private String bankAddress;

    private String cardNumber;

    private Integer teacherStatus;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;
    
	private String token;
	
	private int pageIndex;
	
	private int pageNumber;
	
	private String orderBy;	
	
	private int startIndex;
	
	private Integer haveVideo;//是否收到视频
	
	private String agentName;//代理姓名
	
	private String  interviewRemark;//面试评价	
	
	private String  interviewUser;//面试人	
	
	private String courseStatus; //排课状态
	
	@SuppressWarnings("unused")
	private String inventoryStatus;//入库状态
	
	 private Date registrationTime;
	
	 private Date interviewDate;
	 
	 private String natureOfWorkDesc;//工作性质显示
	
	private Date createDateStart;
	
	private Date createDateEnd;
	
	private String payGradeDesc;//薪资等级
	
	private String remark;//排课备注
	
	 private String referral;
	 
	 private Integer isPass;
	 
	 private List<TcInterviewRecordVO> interviewList;//面试记录
	 
	 private List<TcInterviewRecordVO> interviewRecord;//全职老师的面试评价
	 
	 private List<TcTeacherNotes> notesList;//监课列表	 
	 	 
	 private String branchDesc;
	 
	 
	 
	public String getBranchDesc() {
		
		if(StringUtils.isBlank(this.getBranch())){
			return branchDesc;
		}
		if(Branch.SHANG_HAI.getValue().equals(this.getBranch())){
			
			return Branch.SHANG_HAI.getName();
			
		}else if(Branch.HE_FEI.getValue().equals(this.getBranch())){
			
			return Branch.HE_FEI.getName();
		}
		return branchDesc;
	}

	public void setBranchDesc(String branchDesc) {
		this.branchDesc = branchDesc;
	}

	public String getBranch() {		
		
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRegisterNotes() {
		return registerNotes;
	}

	public void setRegisterNotes(String registerNotes) {
		this.registerNotes = registerNotes;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<TcInterviewRecordVO> getInterviewRecord() {
		return interviewRecord;
	}

	public void setInterviewRecord(List<TcInterviewRecordVO> interviewRecord) {
		this.interviewRecord = interviewRecord;
	}

	public List<TcTeacherNotes> getNotesList() {
		return notesList;
	}

	public void setNotesList(List<TcTeacherNotes> notesList) {
		this.notesList = notesList;
	}

	public String getReferral() {
		return referral;
	}

	public void setReferral(String referral) {
		this.referral = referral;
	}

	public Integer getIsPass() {
		return isPass;
	}

	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}
	
	public String getNatureOfWorkDesc() {
		if(this.getNatureOfWork()==null){
			return natureOfWorkDesc;
		}
		if(NatureOfWork.FULL_TIME.getValue().equals(this.getNatureOfWork())){
			return NatureOfWork.FULL_TIME.getName();
		}else if(NatureOfWork.PART_TIME.getValue().equals(this.getNatureOfWork())){
			return NatureOfWork.PART_TIME.getName();
		}else if(NatureOfWork.SCHOOL_RECRUIT.getValue().equals(this.getNatureOfWork())){
			return NatureOfWork.SCHOOL_RECRUIT.getName();
		}
		return natureOfWorkDesc;
	}

	public void setNatureOfWorkDesc(String natureOfWorkDesc) {
		this.natureOfWorkDesc = natureOfWorkDesc;
	}
    public List<TcInterviewRecordVO> getInterviewList() {
		return interviewList;
	}

	public void setInterviewList(List<TcInterviewRecordVO> interviewList) {
		this.interviewList = interviewList;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPayGradeDesc() {
		return payGradeDesc;
	}

	public void setPayGradeDesc(String payGradeDesc) {
		this.payGradeDesc = payGradeDesc;
	}

	public Date getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewRemark() {
		return interviewRemark;
	}

	public void setInterviewRemark(String interviewRemark) {
		this.interviewRemark = interviewRemark;
	}

	public String getInterviewUser() {
		return interviewUser;
	}

	public void setInterviewUser(String interviewUser) {
		this.interviewUser = interviewUser;
	}

	public String getCourseStatus() {
		
		if(TeacherStatus.LECTURER_1.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.LECTURER_1.getName();
		}else if(TeacherStatus.LECTURER_2.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.LECTURER_2.getName();
		}
		return courseStatus;
		
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public String getInventoryStatus() {
		if(this.getTeacherStatus()<TeacherStatus.SECOND_TRAINING1.getValue()){
			return "未入库";
		}else{
			return "已入库";
		}
	}

	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}

	public Integer getHaveVideo() {
		return haveVideo;
	}

	public void setHaveVideo(Integer haveVideo) {
		this.haveVideo = haveVideo;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Date getCreateDateStart() {
		return createDateStart;
	}

	public void setCreateDateStart(Date createDateStart) {
		this.createDateStart = createDateStart;
	}

	public Date getCreateDateEnd() {
		return createDateEnd;
	}

	public void setCreateDateEnd(Date createDateEnd) {
		this.createDateEnd = createDateEnd;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
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
        this.bank = bank;
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
        this.teacherStatus = teacherStatus ;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version ;
    }
}