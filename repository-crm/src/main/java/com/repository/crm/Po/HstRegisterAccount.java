package com.repository.crm.Po;

import java.util.Date;

public class HstRegisterAccount {
    private Integer id;

    private String uuid;

    private String accountUuid;

    private String hstUserName;

    private String hstUserPwd;

    private String hstUserNickName;

    private Integer accountType;

    private Date createDate;

    private Date updateDate;

    private Integer version;

    private String creater;

    private String updater;

    private Integer status;

    private String code;

    private String codeDes;

    private Integer isSuccess;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid == null ? null : accountUuid.trim();
    }

    public String getHstUserName() {
        return hstUserName;
    }

    public void setHstUserName(String hstUserName) {
        this.hstUserName = hstUserName == null ? null : hstUserName.trim();
    }

    public String getHstUserPwd() {
        return hstUserPwd;
    }

    public void setHstUserPwd(String hstUserPwd) {
        this.hstUserPwd = hstUserPwd == null ? null : hstUserPwd.trim();
    }

    public String getHstUserNickName() {
        return hstUserNickName;
    }

    public void setHstUserNickName(String hstUserNickName) {
        this.hstUserNickName = hstUserNickName == null ? null : hstUserNickName.trim();
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCodeDes() {
        return codeDes;
    }

    public void setCodeDes(String codeDes) {
        this.codeDes = codeDes == null ? null : codeDes.trim();
    }

    public Integer getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
    }
}