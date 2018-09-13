package com.repository.crm.Po;

import java.util.Date;

public class HstRoom {
    private Integer id;

    private String hstRoomName;

    private String hstRoomId;

    private String courseUuid;

    private String hstRoomPwd;

    private Integer hstRoomType;

    private Integer isSuccess;

    private String code;

    private String codeDes;

    private Date createDate;

    private Date updateDate;

    private Integer version;

    private String creater;

    private String updater;

    private String status;

    private String courseEndDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHstRoomName() {
        return hstRoomName;
    }

    public void setHstRoomName(String hstRoomName) {
        this.hstRoomName = hstRoomName == null ? null : hstRoomName.trim();
    }

    public String getHstRoomId() {
        return hstRoomId;
    }

    public void setHstRoomId(String hstRoomId) {
        this.hstRoomId = hstRoomId == null ? null : hstRoomId.trim();
    }

    public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid == null ? null : courseUuid.trim();
    }

    public String getHstRoomPwd() {
        return hstRoomPwd;
    }

    public void setHstRoomPwd(String hstRoomPwd) {
        this.hstRoomPwd = hstRoomPwd == null ? null : hstRoomPwd.trim();
    }

    public Integer getHstRoomType() {
        return hstRoomType;
    }

    public void setHstRoomType(Integer hstRoomType) {
        this.hstRoomType = hstRoomType;
    }

    public Integer getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseEndDate(String courseEndDate) {
        this.courseEndDate = courseEndDate == null ? null : courseEndDate.trim();
    }
}