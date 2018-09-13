package com.repository.crm.Po;

import java.util.Date;

public class TcInterviewSchedule {
    private Long id;

    private String teacherUuid;

    private String tcName;

    private String interviewDate;

    private String interviewTime;

    private String interviewUuid;

    private String interviewUser;

    private String interviewAccount;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;

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
        this.teacherUuid = teacherUuid == null ? null : teacherUuid.trim();
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName == null ? null : tcName.trim();
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate == null ? null : interviewDate.trim();
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime == null ? null : interviewTime.trim();
    }

    public String getInterviewUuid() {
        return interviewUuid;
    }

    public void setInterviewUuid(String interviewUuid) {
        this.interviewUuid = interviewUuid == null ? null : interviewUuid.trim();
    }

    public String getInterviewUser() {
        return interviewUser;
    }

    public void setInterviewUser(String interviewUser) {
        this.interviewUser = interviewUser == null ? null : interviewUser.trim();
    }

    public String getInterviewAccount() {
        return interviewAccount;
    }

    public void setInterviewAccount(String interviewAccount) {
        this.interviewAccount = interviewAccount;
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
        this.version = version;
    }
}