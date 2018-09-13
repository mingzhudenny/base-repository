package com.repository.xcrm.Po;

import java.util.Date;

public class AnlanUserCallLog {
    private Integer id;

    private String userLogin;

    private String userGroup;

    private String callCount;

    private String inboundCount;

    private String outboundCount;

    private String outboundArchiveCount;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin == null ? null : userLogin.trim();
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup == null ? null : userGroup.trim();
    }

    public String getCallCount() {
        return callCount;
    }

    public void setCallCount(String callCount) {
        this.callCount = callCount == null ? null : callCount.trim();
    }

    public String getInboundCount() {
        return inboundCount;
    }

    public void setInboundCount(String inboundCount) {
        this.inboundCount = inboundCount == null ? null : inboundCount.trim();
    }

    public String getOutboundCount() {
        return outboundCount;
    }

    public void setOutboundCount(String outboundCount) {
        this.outboundCount = outboundCount == null ? null : outboundCount.trim();
    }

    public String getOutboundArchiveCount() {
        return outboundArchiveCount;
    }

    public void setOutboundArchiveCount(String outboundArchiveCount) {
        this.outboundArchiveCount = outboundArchiveCount == null ? null : outboundArchiveCount.trim();
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
}