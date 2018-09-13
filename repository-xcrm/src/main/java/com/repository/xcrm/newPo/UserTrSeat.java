package com.repository.xcrm.newPo;

import java.util.Date;

public class UserTrSeat {
    private Integer id;

    private Integer userUuid;

    private Integer seatsNo;

    private String seatsPassword;

    private String hotlinePhone;

    private String seatsCallStatus;

    private String seatsStatus;

    private Integer dayCallNum;

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

    public Integer getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(Integer userUuid) {
        this.userUuid = userUuid;
    }

    public Integer getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(Integer seatsNo) {
        this.seatsNo = seatsNo;
    }

    public String getSeatsPassword() {
        return seatsPassword;
    }

    public void setSeatsPassword(String seatsPassword) {
        this.seatsPassword = seatsPassword == null ? null : seatsPassword.trim();
    }

    public String getHotlinePhone() {
        return hotlinePhone;
    }

    public void setHotlinePhone(String hotlinePhone) {
        this.hotlinePhone = hotlinePhone == null ? null : hotlinePhone.trim();
    }

    public String getSeatsCallStatus() {
        return seatsCallStatus;
    }

    public void setSeatsCallStatus(String seatsCallStatus) {
        this.seatsCallStatus = seatsCallStatus == null ? null : seatsCallStatus.trim();
    }

    public String getSeatsStatus() {
        return seatsStatus;
    }

    public void setSeatsStatus(String seatsStatus) {
        this.seatsStatus = seatsStatus == null ? null : seatsStatus.trim();
    }

    public Integer getDayCallNum() {
        return dayCallNum;
    }

    public void setDayCallNum(Integer dayCallNum) {
        this.dayCallNum = dayCallNum;
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