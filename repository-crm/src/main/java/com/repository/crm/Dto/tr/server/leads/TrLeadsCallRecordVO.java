package com.repository.crm.Dto.tr.server.leads;

import java.util.Date;

public class TrLeadsCallRecordVO {
    private Long id;

    private String leadsUuid;

    private String leadsName;

    private String leadsPhone;

    private String grade;

    private String subject;

    private Date registTime;

    private Date assignTime;

    private String saleName;

    private String team;

    private String firstCallTime;

    private Integer firstDayCallSuccess;

    private Integer isCallSuccess;

    private String bridgeDuration;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;
    /** 是否拨打成功   0 失败  大于 0 成功  */
    @SuppressWarnings("unused")
	private String isCallSuccessDesc;
    /** 24小时内是否拨打成功   0 失败   大于 0 成功 */
    @SuppressWarnings("unused")
    private String firstDayCallSuccessDesc;
    
    

    public String getIsCallSuccessDesc() {
    	
    	if(this.getIsCallSuccess()!=null && this.getIsCallSuccess() >0){
    		
    		return "成功";
    	}else{
    	
    		return "失败";
    	}
		
	}

	public void setIsCallSuccessDesc(String isCallSuccessDesc) {
		this.isCallSuccessDesc = isCallSuccessDesc;
	}

	public String getFirstDayCallSuccessDesc() {
		
      if(this.getFirstDayCallSuccess()!=null && this.getFirstDayCallSuccess() >0){
    		
    		return "成功";
    		
    	}else{
    	
    		return "失败";
    	}
		
	}

	public void setFirstDayCallSuccessDesc(String firstDayCallSuccessDesc) {
		this.firstDayCallSuccessDesc = firstDayCallSuccessDesc;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public String getLeadsName() {
        return leadsName;
    }

    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName == null ? null : leadsName.trim();
    }

    public String getLeadsPhone() {
        return leadsPhone;
    }

    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone == null ? null : leadsPhone.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    public String getFirstCallTime() {
        return firstCallTime;
    }

    public void setFirstCallTime(String firstCallTime) {
        this.firstCallTime = firstCallTime;
    }

    public Integer getFirstDayCallSuccess() {
        return firstDayCallSuccess;
    }

    public void setFirstDayCallSuccess(Integer firstDayCallSuccess) {
        this.firstDayCallSuccess = firstDayCallSuccess;
    }

    public Integer getIsCallSuccess() {
        return isCallSuccess;
    }

    public void setIsCallSuccess(Integer isCallSuccess) {
        this.isCallSuccess = isCallSuccess;
    }

    public String getBridgeDuration() {
        return bridgeDuration;
    }

    public void setBridgeDuration(String bridgeDuration) {
        this.bridgeDuration = bridgeDuration == null ? null : bridgeDuration.trim();
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
        this.version = version;
    }
}