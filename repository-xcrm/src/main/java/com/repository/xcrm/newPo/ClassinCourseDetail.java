package com.repository.xcrm.newPo;

import java.util.Date;

public class ClassinCourseDetail {
    private Integer id;

    private String courseUuid;

    private Integer courseType;

    private String sid;

    private String safeKey;

    private String timeStamp;

    private String courseName;

    private String folderId;

    private String filedata;

    private String expiryTime;

    private String mainTeacherAccount;

    private String courseIntroduce;

    private String classinId;

    private String classinCode;

    private String classinDes;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String createUuid;

    private String updateUuid;

    private String remark;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid == null ? null : courseUuid.trim();
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSafeKey() {
        return safeKey;
    }

    public void setSafeKey(String safeKey) {
        this.safeKey = safeKey == null ? null : safeKey.trim();
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp == null ? null : timeStamp.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId == null ? null : folderId.trim();
    }

    public String getFiledata() {
        return filedata;
    }

    public void setFiledata(String filedata) {
        this.filedata = filedata == null ? null : filedata.trim();
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime == null ? null : expiryTime.trim();
    }

    public String getMainTeacherAccount() {
        return mainTeacherAccount;
    }

    public void setMainTeacherAccount(String mainTeacherAccount) {
        this.mainTeacherAccount = mainTeacherAccount == null ? null : mainTeacherAccount.trim();
    }

    public String getCourseIntroduce() {
        return courseIntroduce;
    }

    public void setCourseIntroduce(String courseIntroduce) {
        this.courseIntroduce = courseIntroduce == null ? null : courseIntroduce.trim();
    }

    public String getClassinId() {
        return classinId;
    }

    public void setClassinId(String classinId) {
        this.classinId = classinId == null ? null : classinId.trim();
    }

    public String getClassinCode() {
        return classinCode;
    }

    public void setClassinCode(String classinCode) {
        this.classinCode = classinCode == null ? null : classinCode.trim();
    }

    public String getClassinDes() {
        return classinDes;
    }

    public void setClassinDes(String classinDes) {
        this.classinDes = classinDes == null ? null : classinDes.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getCreateUuid() {
        return createUuid;
    }

    public void setCreateUuid(String createUuid) {
        this.createUuid = createUuid == null ? null : createUuid.trim();
    }

    public String getUpdateUuid() {
        return updateUuid;
    }

    public void setUpdateUuid(String updateUuid) {
        this.updateUuid = updateUuid == null ? null : updateUuid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}