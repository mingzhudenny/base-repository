package com.repository.xcrm.Po;

import java.util.Date;

public class AnlanObCallLog {
    private Integer id;

    private String userLogin;

    private String userGroup;

    private String extension;

    private String phoneNumber;

    private String startTime;

    private String isArchive;

    private String archiveTime;

    private String endTime;

    private String totalSeconds;

    private String queueSeconds;

    private String talkSeconds;

    private String recordingUrl;

    private String uniqueid;

    private String callerId;

    private String status;

    private String statusValue;

    private String statusType;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin == null ? null : userLogin.trim();
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup == null ? null : userGroup.trim();
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getIsArchive() {
        return isArchive;
    }

    public void setIsArchive(String isArchive) {
        this.isArchive = isArchive == null ? null : isArchive.trim();
    }

    public String getArchiveTime() {
        return archiveTime;
    }

    public void setArchiveTime(String archiveTime) {
        this.archiveTime = archiveTime == null ? null : archiveTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getTotalSeconds() {
        return totalSeconds;
    }

    public void setTotalSeconds(String totalSeconds) {
        this.totalSeconds = totalSeconds == null ? null : totalSeconds.trim();
    }

    public String getQueueSeconds() {
        return queueSeconds;
    }

    public void setQueueSeconds(String queueSeconds) {
        this.queueSeconds = queueSeconds == null ? null : queueSeconds.trim();
    }

    public String getTalkSeconds() {
        return talkSeconds;
    }

    public void setTalkSeconds(String talkSeconds) {
        this.talkSeconds = talkSeconds == null ? null : talkSeconds.trim();
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl == null ? null : recordingUrl.trim();
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid == null ? null : uniqueid.trim();
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId == null ? null : callerId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue == null ? null : statusValue.trim();
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType == null ? null : statusType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}