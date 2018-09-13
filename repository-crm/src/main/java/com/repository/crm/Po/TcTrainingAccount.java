package com.repository.crm.Po;

import java.util.Date;

public class TcTrainingAccount {
    private Long id;

    private String trainingDate;

    private Integer trainingAccount;
    
    private Integer natureOfWork;
    
    private String trainingTime;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Long version;
    
    

    public Integer getNatureOfWork() {
		return natureOfWork;
	}

	public void setNatureOfWork(Integer natureOfWork) {
		this.natureOfWork = natureOfWork;
	}

	public String getTrainingTime() {
		return trainingTime;
	}

	public void setTrainingTime(String trainingTime) {
		this.trainingTime = trainingTime;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(String trainingDate) {
        this.trainingDate = trainingDate == null ? null : trainingDate.trim();
    }

    public Integer getTrainingAccount() {
        return trainingAccount;
    }

    public void setTrainingAccount(Integer trainingAccount) {
        this.trainingAccount = trainingAccount;
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