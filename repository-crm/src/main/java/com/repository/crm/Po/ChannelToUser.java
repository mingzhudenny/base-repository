package com.repository.crm.Po;

import java.util.Date;

public class ChannelToUser {
    private Integer id;

    private String channelUserUuid;

    private String channelUuid;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelUserUuid() {
        return channelUserUuid;
    }

    public void setChannelUserUuid(String channelUserUuid) {
        this.channelUserUuid = channelUserUuid == null ? null : channelUserUuid.trim();
    }

    public String getChannelUuid() {
        return channelUuid;
    }

    public void setChannelUuid(String channelUuid) {
        this.channelUuid = channelUuid == null ? null : channelUuid.trim();
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
}