package com.repository.crm.Po;

import java.util.Date;

public class TcTeacherDate {
    private Long id;

    private String teacherUuid;

    private String tcDate;

    private String tcTime;

    private Integer notIdle;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacherUuid() {
		return teacherUuid;
	}

	public void setTeacherUuid(String teacherUuid) {
		this.teacherUuid = teacherUuid;
	}

	public String getTcDate() {
        return tcDate;
    }

    public void setTcDate(String tcDate) {
        this.tcDate = tcDate == null ? null : tcDate.trim();
    }

    public String getTcTime() {
        return tcTime;
    }

    public void setTcTime(String tcTime) {
        this.tcTime = tcTime == null ? null : tcTime.trim();
    }

    public Integer getNotIdle() {
        return notIdle;
    }

    public void setNotIdle(Integer notIdle) {
        this.notIdle = notIdle;
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