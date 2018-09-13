package com.repository.crm.Po;

import java.util.Date;

public class Patriarch {
    private Integer id;

    private String patriarchUuid;

    private String patriarchPhone;

    private String patriarchName;

    private String childrenGrade;

    private String patriarchPassword;

    private Integer partriarchRole;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String createUid;

    private String updateUid;

    private String remark;

    private Integer sort;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatriarchUuid() {
        return patriarchUuid;
    }

    public void setPatriarchUuid(String patriarchUuid) {
        this.patriarchUuid = patriarchUuid == null ? null : patriarchUuid.trim();
    }

    public String getPatriarchPhone() {
        return patriarchPhone;
    }

    public void setPatriarchPhone(String patriarchPhone) {
        this.patriarchPhone = patriarchPhone == null ? null : patriarchPhone.trim();
    }

    public String getPatriarchName() {
        return patriarchName;
    }

    public void setPatriarchName(String patriarchName) {
        this.patriarchName = patriarchName == null ? null : patriarchName.trim();
    }

    public String getChildrenGrade() {
        return childrenGrade;
    }

    public void setChildrenGrade(String childrenGrade) {
        this.childrenGrade = childrenGrade == null ? null : childrenGrade.trim();
    }

    public String getPatriarchPassword() {
        return patriarchPassword;
    }

    public void setPatriarchPassword(String patriarchPassword) {
        this.patriarchPassword = patriarchPassword == null ? null : patriarchPassword.trim();
    }

    public Integer getPartriarchRole() {
        return partriarchRole;
    }

    public void setPartriarchRole(Integer partriarchRole) {
        this.partriarchRole = partriarchRole;
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

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid == null ? null : updateUid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}