package com.repository.xcrm.newPo;

import java.util.Date;

public class ClassinRegisterDetail {
    private Integer id;

    private String sid;

    private String safeKey;

    private String timeStamp;

    private String accountUuid;

    private String telephone;

    private String nickname;

    private String password;

    private String md5pass;

    private String filedata;

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

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid == null ? null : accountUuid.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMd5pass() {
        return md5pass;
    }

    public void setMd5pass(String md5pass) {
        this.md5pass = md5pass == null ? null : md5pass.trim();
    }

    public String getFiledata() {
        return filedata;
    }

    public void setFiledata(String filedata) {
        this.filedata = filedata == null ? null : filedata.trim();
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