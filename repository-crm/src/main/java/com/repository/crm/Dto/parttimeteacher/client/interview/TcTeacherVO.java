package com.repository.crm.Dto.parttimeteacher.client.interview;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.repository.crm.Po.TcTeacherFile;
import com.repository.crm.constant.Branch;
import com.repository.crm.constant.TeacherEnum.HaveVideo;
import com.repository.crm.constant.TeacherEnum.NatureOfWork;
import com.repository.crm.constant.TeacherEnum.TeacherStatus;



public class TcTeacherVO {
    private Long id;

    private String uuid;
    
    private String address;
    
    private String registerNotes;//待邀约对老师的备注
    
    private String branch;//老师的分部
    
    private String registerRemark;
    
    private String interviewResult;
    
    private Long trainingAccountId;
    
    private String trainingQuestionNumber;
    
    private Integer sumScore;//培训考试得分
    
    private Integer  haveVideo;//是否收到视频

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
    
    private String schoolUuid;//学校的UUID

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
		
	private String agentName;//代理姓名
	
	private String createDateStart;//报名时间
	
	private String createDateEnd;
	
    private String updateDateStart;//更新时间
	
	private String updateDateEnd;
	
	private String agentPhone;//代理的手机号码
	
	private Date registrationTime;//报名时间
	
	private Date interviewDate;//面试或者培训时间
	
	private String recordType;//面试,培训类型
	
	private String natureOfWorkDesc;//工作性质显示
	
	private String subjectDesc;//学科显示
	
	@SuppressWarnings("unused")
	private String haveVideoDesc;//是否视频显示
	
	private String checkType;//校验类型 add  新增的校验 update  更新的校验  checkAll 表示校验多有必填项目
	
	private String operationUser;
	
	private String scholl;//前台传过来的学校名字

    private Integer agentType;//招师方向
    
    private String referral;//推荐人
    
    private List<Long> fileIdList;//文件的ID
    
    private List<TcTeacherFile> fileList; //老师的文件列表     
    
    private Integer trainingAccount;//培训账号 
 
    @SuppressWarnings("unused")
	private String account;//列表显示的账号 
    
    private String trainingDate;//培训日期
	
    private Date inventoryDate;//入库时间
    
    private String teacherStatusDesc;//老师状态的显示
    
    private Integer rate;//进度
    
    private Integer isPass;
    
    @SuppressWarnings("unused")
	private String isPassDesc;  
    
    private List<TcInterviewRecordVO> interviewRecord;//全职老师的面试评价
    
    private String interviewRemark;//全职老师的面试备注    
    
    private String  payGradeParams;//全职老师薪资的参数    
    
    private String trainingDateStart;//培训日期
    
    private String trainingDateEnd;//培训日期        
    
    private String invitationIsNull;//待邀约是否为空    
    
    private String invitationUser;//邀约人        

	private String invitationUuid;//邀约人UUID	
	
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

	public String getRegisterRemark() {
		return registerRemark;
	}

	public void setRegisterRemark(String registerRemark) {
		this.registerRemark = registerRemark;
	}

	public String getInterviewResult() {
		return interviewResult;
	}

	public void setInterviewResult(String interviewResult) {
		this.interviewResult = interviewResult;
	}

	public String getInvitationUuid() {
		return invitationUuid;
	}

	public void setInvitationUuid(String invitationUuid) {
		this.invitationUuid = invitationUuid;
	}
    

	public String getInvitationUser() {
		return invitationUser;
	}

	public void setInvitationUser(String invitationUser) {
		this.invitationUser = invitationUser;
	}

	public String getInvitationIsNull() {
		return invitationIsNull;
	}

	public void setInvitationIsNull(String invitationIsNull) {
		this.invitationIsNull = invitationIsNull;
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

	public String getTrainingDateStart() {
		return trainingDateStart;
	}

	public void setTrainingDateStart(String trainingDateStart) {
		this.trainingDateStart = trainingDateStart;
	}

	public String getTrainingDateEnd() {
		return trainingDateEnd;
	}

	public void setTrainingDateEnd(String trainingDateEnd) {
		this.trainingDateEnd = trainingDateEnd;
	}

	public String getPayGradeParams() {
		return payGradeParams;
	}

	public void setPayGradeParams(String payGradeParams) {
		this.payGradeParams = payGradeParams;
	}

	public Integer getSumScore() {
		return sumScore;
	}

	public void setSumScore(Integer sumScore) {
		this.sumScore = sumScore;
	}

	public String getTrainingQuestionNumber() {
		return trainingQuestionNumber;
	}

	public void setTrainingQuestionNumber(String trainingQuestionNumber) {
		this.trainingQuestionNumber = trainingQuestionNumber;
	}

	public List<TcInterviewRecordVO> getInterviewRecord() {
		return interviewRecord;
	}

	public void setInterviewRecord(List<TcInterviewRecordVO> interviewRecord) {
		this.interviewRecord = interviewRecord;
	}

	public String getInterviewRemark() {
		return interviewRemark;
	}

	public void setInterviewRemark(String interviewRemark) {
		this.interviewRemark = interviewRemark;
	}

	public String getSchoolUuid() {
		return schoolUuid;
	}

	public void setSchoolUuid(String schoolUuid) {
		this.schoolUuid = schoolUuid;
	}

	public Integer getIsPass() {
		return isPass;
	}

	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}

	public String getIsPassDesc() {
		if(this.getIsPass()==null){
			return null;
		}
		if(this.getIsPass().equals(0)){
			return "未审核";
		}else{
			
			return "已审核";
		}
		
	}

	public void setIsPassDesc(String isPassDesc) {
		this.isPassDesc = isPassDesc;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public String getTeacherStatusDesc() {
		
		if(TeacherStatus.BEFORE_INTERVIE.getValue().equals(this.getTeacherStatus()) ){
			return TeacherStatus.BEFORE_INTERVIE.getName();
		}if(TeacherStatus.INTERVIEW.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.INTERVIEW.getName();
		}else if(TeacherStatus.TRAIN.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.TRAIN.getName();
		}else if(TeacherStatus.FINISH.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.FINISH.getName();
		}else if(TeacherStatus.SECOND_TRAINING1.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.SECOND_TRAINING1.getName();
		}else if(TeacherStatus.LECTURER_1.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.LECTURER_1.getName();
		}else if(TeacherStatus.LECTURER_2.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.LECTURER_2.getName();
		}else if(TeacherStatus.TRASH.getValue().equals(this.getTeacherStatus())){
			return TeacherStatus.TRASH.getName();
		}
    	
		return teacherStatusDesc;
	}

	public void setTeacherStatusDesc(String teacherStatusDesc) {
		this.teacherStatusDesc = teacherStatusDesc;
	}
	
    
    public Date getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(Date inventoryDate) {
		this.inventoryDate = inventoryDate;
	}
    

	public Integer getTrainingAccount() {
		return trainingAccount;
	}

	public void setTrainingAccount(Integer trainingAccount) {
		this.trainingAccount = trainingAccount;
	}

	public String getAccount() {
		
		if(this.getTrainingAccount() == null){
			return null;
		}
		if(this.getTrainingAccount()<10){
			
			return "嗨培训0"+this.getTrainingAccount().toString();
			
		}else{
			
			return "嗨培训"+this.getTrainingAccount().toString();
		}		
	
	}
	
	public void setAccount(String account) {
		this.account = account;
	}

	public String getTrainingDate() {
		return trainingDate;
	}

	public void setTrainingDate(String trainingDate) {
		this.trainingDate = trainingDate;
	}

	public Long getTrainingAccountId() {
		return trainingAccountId;
	}

	public void setTrainingAccountId(Long trainingAccountId) {
		this.trainingAccountId = trainingAccountId;
	}
	public String getUpdateDateStart() {
		return updateDateStart;
	}

	public void setUpdateDateStart(String updateDateStart) {
		this.updateDateStart = updateDateStart;
	}

	public String getUpdateDateEnd() {
		return updateDateEnd;
	}

	public void setUpdateDateEnd(String updateDateEnd) {
		this.updateDateEnd = updateDateEnd;
	}

	public void setCreateDateStart(String createDateStart) {
		this.createDateStart = createDateStart;
	}

	public void setCreateDateEnd(String createDateEnd) {
		this.createDateEnd = createDateEnd;
	}

	public List<Long> getFileIdList() {
		return fileIdList;
	}

	public void setFileIdList(List<Long> fileIdList) {
		this.fileIdList = fileIdList;
	}

	public List<TcTeacherFile> getFileList() {
		return fileList;
	}

	public void setFileList(List<TcTeacherFile> fileList) {
		this.fileList = fileList;
	}

	public String getReferral() {
		return referral;
	}

	public void setReferral(String referral) {
		this.referral = referral;
	}

	public Integer getAgentType() {
		return agentType;
	}

	public void setAgentType(Integer agentType) {
		this.agentType = agentType;
	}

	
    public String getScholl() {
		return scholl;
	}

	public void setScholl(String scholl) {
		this.scholl = scholl;
	}

	public String getOperationUser() {
		return operationUser;
	}

	public void setOperationUser(String operationUser) {
		this.operationUser = operationUser;
	}

	public Integer getHaveVideo() {
		return haveVideo;
	}

	public void setHaveVideo(Integer haveVideo) {
		this.haveVideo = haveVideo;
	}

	public String getAgentPhone() {
		return agentPhone;
	}

	public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public Date getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
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

	public String getSubjectDesc() {
		return subjectDesc;
	}

	public void setSubjectDesc(String subjectDesc) {
		this.subjectDesc = subjectDesc;
	}

	public String getHaveVideoDesc() {
		
		if(HaveVideo.YES.getValue().equals(this.getHaveVideo())){
			return HaveVideo.YES.getName();
		}else{
			return HaveVideo.NO.getName();
		}
		
	}

	public void setHaveVideoDesc(String haveVideoDesc) {
		this.haveVideoDesc = haveVideoDesc;
	}
	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}


	public String getCreateDateStart() {
		return createDateStart;
	}

	public String getCreateDateEnd() {
		return createDateEnd;
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
        this.teacherStatus = teacherStatus;
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