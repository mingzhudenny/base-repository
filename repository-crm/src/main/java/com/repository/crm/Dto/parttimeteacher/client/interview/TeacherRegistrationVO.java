/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.parttimeteacher.client.interview;

import java.util.Date;
import java.util.List;

import com.repository.crm.constant.TeacherEnum.NatureOfWork;
import com.repository.crm.constant.TeacherEnum.TeacherStatus;



/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TeacherRegistrationVO.java, v 0.1 2017年3月24日 下午2:17:33  Exp $
 */
public class TeacherRegistrationVO {
	
    private Long id;
    
    private String uuid;    

    private String tcName;

    private Integer natureOfWork;
    
    private Integer education;
    
    private Integer highestEducation;
    
    private String email;

    private String phone;

    private String schoolLocation;

    private String subject;

    private String teachingSubject;
 
    private String agentUuid;

    private Integer teacherStatus;

    private Date createDate; 

    private Date updateDate;
	
	private int pageIndex;
	
	private int pageNumber;
	
	private String orderBy;	
	
	private String agentName;//代理姓名
	
	private Date createDateStart;
	
	private Date createDateEnd;	
	
	private Date registrationTime;//报名时间
	
	private Date interviewDate;//面试或者培训时间
	
	private String recordType;//面试,培训类型
	
	private String natureOfWorkDesc;//工作性质显示	
    
    private List<Integer> statusList;//老师的状态
    
	private String registrationTimeStart;
    
	private String registrationTimeEnd;
	
	private String teacherStatusDesc;
	
	private Integer haveVideo ; 

	private String remark;
	
	private String referral;//推荐人    
	
	private String interviewUser;//面试人
	
	private String invitationUser;//邀约人	
	
	private String wechat;	

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getInterviewUser() {
		return interviewUser;
	}

	public void setInterviewUser(String interviewUser) {
		this.interviewUser = interviewUser;
	}

	public String getInvitationUser() {
		return invitationUser;
	}

	public void setInvitationUser(String invitationUser) {
		this.invitationUser = invitationUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReferral() {
		return referral;
	}

	public void setReferral(String referral) {
		this.referral = referral;
	}

	public Integer getHaveVideo() {
		return haveVideo;
	}

	public void setHaveVideo(Integer haveVideo) {
		this.haveVideo = haveVideo;
	}

	public Integer getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(Integer highestEducation) {
		this.highestEducation = highestEducation;
	}

	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
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
	

	public List<Integer> getStatusList() {
		return statusList;
	}

	public void setStatusList(List<Integer> statusList) {
		this.statusList = statusList;
	}

    
    public String getRegistrationTimeStart() {
		return registrationTimeStart;
	}

	public void setRegistrationTimeStart(String registrationTimeStart) {
		this.registrationTimeStart = registrationTimeStart;
	}

	public String getRegistrationTimeEnd() {
		return registrationTimeEnd;
	}

	public void setRegistrationTimeEnd(String registrationTimeEnd) {
		this.registrationTimeEnd = registrationTimeEnd;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Date getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}

	public String getNatureOfWorkDesc() {
		if(this.getNatureOfWork()==null){
			return null;
		}
		if(this.getNatureOfWork().equals(NatureOfWork.FULL_TIME.getValue())){
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

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation == null ? null : schoolLocation.trim();
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

    public String getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(String agentUuid) {
        this.agentUuid = agentUuid == null ? null : agentUuid.trim();
    }

    public Integer getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(Integer teacherStatus) {
        this.teacherStatus = teacherStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }  

}
