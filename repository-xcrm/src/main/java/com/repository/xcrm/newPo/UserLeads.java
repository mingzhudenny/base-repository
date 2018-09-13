package com.repository.xcrm.newPo;

import java.util.Date;

public class UserLeads {
    private Integer id;

    private String leadsUuid;

    private String userUuid;

    private String userName;

    private Integer giveUpStatus;

    private String giveUpCause;

    private String giveUpDes;

    private String connectStatus;

    private Integer distributionType;

    private Integer dayCallNumber;

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

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getGiveUpStatus() {
        return giveUpStatus;
    }

    public void setGiveUpStatus(Integer giveUpStatus) {
        this.giveUpStatus = giveUpStatus;
    }

    public String getGiveUpCause() {
        return giveUpCause;
    }

    public void setGiveUpCause(String giveUpCause) {
        this.giveUpCause = giveUpCause == null ? null : giveUpCause.trim();
    }

    public String getGiveUpDes() {
        return giveUpDes;
    }

    public void setGiveUpDes(String giveUpDes) {
        this.giveUpDes = giveUpDes == null ? null : giveUpDes.trim();
    }

    public String getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus == null ? null : connectStatus.trim();
    }

    public Integer getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Integer distributionType) {
        this.distributionType = distributionType;
    }

    public Integer getDayCallNumber() {
        return dayCallNumber;
    }

    public void setDayCallNumber(Integer dayCallNumber) {
        this.dayCallNumber = dayCallNumber;
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