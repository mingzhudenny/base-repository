package com.repository.crm.Po;

import java.util.Date;

public class HstRoomRegisterAccount {
    private Integer id;

    private Integer hstRoomId;

    private String hstRegisterAccountUuid;

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

    public Integer getHstRoomId() {
        return hstRoomId;
    }

    public void setHstRoomId(Integer hstRoomId) {
        this.hstRoomId = hstRoomId;
    }

    public String getHstRegisterAccountUuid() {
        return hstRegisterAccountUuid;
    }

    public void setHstRegisterAccountUuid(String hstRegisterAccountUuid) {
        this.hstRegisterAccountUuid = hstRegisterAccountUuid == null ? null : hstRegisterAccountUuid.trim();
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