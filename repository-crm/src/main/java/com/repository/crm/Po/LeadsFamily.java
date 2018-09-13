package com.repository.crm.Po;

import java.util.Date;

public class LeadsFamily {
    private Integer id;

    private String leadsUuid;

    private Integer familyRoleId;

    private String familyRoleName;

    private String phone;

    private Date createTime;

    private Date updateTime;

    private String createUid;

    private String updateUid;

    private String remark;

    private Integer sort;

    private Integer version;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public Integer getFamilyRoleId() {
        return familyRoleId;
    }

    public void setFamilyRoleId(Integer familyRoleId) {
        this.familyRoleId = familyRoleId;
    }

    public String getFamilyRoleName() {
        return familyRoleName;
    }

    public void setFamilyRoleName(String familyRoleName) {
        this.familyRoleName = familyRoleName == null ? null : familyRoleName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}