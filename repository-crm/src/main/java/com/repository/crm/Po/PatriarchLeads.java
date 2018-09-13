package com.repository.crm.Po;

import java.util.Date;

public class PatriarchLeads {
    private Integer id;

    private String patriarchLeadsUuid;

    private String patriarchUuid;

    private String patriarchPhone;

    private String leadsUuid;

    private String leadsPhone;

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

    public String getPatriarchLeadsUuid() {
        return patriarchLeadsUuid;
    }

    public void setPatriarchLeadsUuid(String patriarchLeadsUuid) {
        this.patriarchLeadsUuid = patriarchLeadsUuid == null ? null : patriarchLeadsUuid.trim();
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

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public String getLeadsPhone() {
        return leadsPhone;
    }

    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone == null ? null : leadsPhone.trim();
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