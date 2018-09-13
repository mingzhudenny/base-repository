package com.repository.xcrm.Po;

import java.util.Date;

public class AnlanIbCallLog {
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

    private String ingroupId;

    private String ingroupName;

    private String hotline;

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

    public String getIngroupId() {
        return ingroupId;
    }

    public void setIngroupId(String ingroupId) {
        this.ingroupId = ingroupId == null ? null : ingroupId.trim();
    }

    public String getIngroupName() {
        return ingroupName;
    }

    public void setIngroupName(String ingroupName) {
        this.ingroupName = ingroupName == null ? null : ingroupName.trim();
    }

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline == null ? null : hotline.trim();
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