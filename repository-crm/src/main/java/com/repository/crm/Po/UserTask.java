package com.repository.crm.Po;

import java.util.Date;

public class UserTask {
    private Long id;

    private String leadsUuid;

    private String userUuid;

    private Boolean giveUpStatus;

    private String giveUpCause;

    private String connectStatus;

    private String giveUpDes;

    private Byte distributionType;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    private String assignerUuid;

    private Boolean keyPoint;

    private Integer dayCallNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Boolean getGiveUpStatus() {
        return giveUpStatus;
    }

    public void setGiveUpStatus(Boolean giveUpStatus) {
        this.giveUpStatus = giveUpStatus;
    }

    public String getGiveUpCause() {
        return giveUpCause;
    }

    public void setGiveUpCause(String giveUpCause) {
        this.giveUpCause = giveUpCause == null ? null : giveUpCause.trim();
    }

    public String getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus == null ? null : connectStatus.trim();
    }

    public String getGiveUpDes() {
        return giveUpDes;
    }

    public void setGiveUpDes(String giveUpDes) {
        this.giveUpDes = giveUpDes == null ? null : giveUpDes.trim();
    }

    public Byte getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Byte distributionType) {
        this.distributionType = distributionType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public String getAssignerUuid() {
        return assignerUuid;
    }

    public void setAssignerUuid(String assignerUuid) {
        this.assignerUuid = assignerUuid == null ? null : assignerUuid.trim();
    }

    public Boolean getKeyPoint() {
        return keyPoint;
    }

    public void setKeyPoint(Boolean keyPoint) {
        this.keyPoint = keyPoint;
    }

    public Integer getDayCallNumber() {
        return dayCallNumber;
    }

    public void setDayCallNumber(Integer dayCallNumber) {
        this.dayCallNumber = dayCallNumber;
    }
}