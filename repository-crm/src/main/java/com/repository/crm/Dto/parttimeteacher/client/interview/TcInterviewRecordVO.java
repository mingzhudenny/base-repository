package com.repository.crm.Dto.parttimeteacher.client.interview;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.repository.crm.constant.TeacherEnum.AbandonReason;
import com.repository.crm.constant.TeacherEnum.InterviewResult;



public class TcInterviewRecordVO {
    private Long id;

    private String uuid;

    private String teacherUuid;

    private String recordType;

    private Integer payGrade;

    private String interviewResult;

    private String remark;

    private String interviewUser;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Long version;
    
    private String trainingDate;

    private Integer trainingAccount;
    
    private String interviewResultDesc;
    
    
    
    public String getInterviewResultDesc() {
    	
    	if(StringUtils.isBlank(this.getInterviewResult())){
			return null;
		}
		if(InterviewResult.PASS.getValue().equals(Integer.valueOf(this.getInterviewResult()))){
			return InterviewResult.PASS.getName();
			
		}else if(InterviewResult.NO_PASS.getValue().equals(Integer.valueOf(this.getInterviewResult()))){
			return InterviewResult.NO_PASS.getName();
			
		}else if(InterviewResult.TWO_INTERVIEW.getValue().equals(Integer.valueOf(this.getInterviewResult()))){
			return InterviewResult.TWO_INTERVIEW.getName();
			
		}else if(AbandonReason.REASON_1.getValue().equals(Integer.valueOf(this.getInterviewResult()))){
			return AbandonReason.REASON_1.getName();
			
		}else if(AbandonReason.REASON_2.getValue().equals(Integer.valueOf(this.getInterviewResult()))){
			return AbandonReason.REASON_2.getName();
			
		}else if(AbandonReason.REASON_3.getValue().equals(Integer.valueOf(this.getInterviewResult()))){
			return AbandonReason.REASON_3.getName();
			
		}else if(AbandonReason.REASON_4.getValue().equals(Integer.valueOf(this.getInterviewResult()))){
			return AbandonReason.REASON_4.getName();
		}
		return interviewResultDesc;
	}

	public void setInterviewResultDesc(String interviewResultDesc) {
		this.interviewResultDesc = interviewResultDesc;
	}

	public String getTrainingDate() {
		return trainingDate;
	}

	public void setTrainingDate(String trainingDate) {
		this.trainingDate = trainingDate;
	}

	public Integer getTrainingAccount() {
		return trainingAccount;
	}

	public void setTrainingAccount(Integer trainingAccount) {
		this.trainingAccount = trainingAccount;
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

    public String getTeacherUuid() {
        return teacherUuid;
    }

    public void setTeacherUuid(String teacherUuid) {
        this.teacherUuid = teacherUuid == null ? null : teacherUuid.trim();
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public Integer getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(Integer payGrade) {
        this.payGrade = payGrade;
    }

    public String getInterviewResult() {
        return interviewResult;
    }

    public void setInterviewResult(String interviewResult) {
        this.interviewResult = interviewResult == null ? null : interviewResult.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInterviewUser() {
        return interviewUser;
    }

    public void setInterviewUser(String interviewUser) {
        this.interviewUser = interviewUser == null ? null : interviewUser.trim();
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
}