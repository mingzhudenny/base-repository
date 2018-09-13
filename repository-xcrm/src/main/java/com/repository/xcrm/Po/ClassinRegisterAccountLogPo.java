package com.repository.xcrm.Po;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-03 10:23
 **/
public class ClassinRegisterAccountLogPo {
    private Integer id;

    private String accountUuid;

    private String classInId;

    private Integer accountType;

    private String accountPwd;

    private String classInCode;

    private Date createDate;

    private Date updateDate;

    private Integer version;

    private String creater;

    private String updater;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid == null ? null : accountUuid.trim();
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getClassInId() {
        return classInId;
    }

    public void setClassInId(String classInId) {
        this.classInId = classInId;
    }

    public String getAccountPwd() {
        return accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd == null ? null : accountPwd.trim();
    }

    public String getClassInCode() {
        return classInCode;
    }

    public void setClassInCode(String classInCode) {
        this.classInCode = classInCode == null ? null : classInCode.trim();
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
}
