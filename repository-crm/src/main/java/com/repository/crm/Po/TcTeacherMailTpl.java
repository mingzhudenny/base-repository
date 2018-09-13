package com.repository.crm.Po;

import java.util.Date;

public class TcTeacherMailTpl {
    private Long id;

    private Integer purpose;

    private String copyTo;

    private String mailTitle;

    private String sender;

    private String msgTlp;

    private String mailFile;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Long version;

    private String teacherUrl;

    private String mailTpl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }

    public String getCopyTo() {
        return copyTo;
    }

    public void setCopyTo(String copyTo) {
        this.copyTo = copyTo == null ? null : copyTo.trim();
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle == null ? null : mailTitle.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getMsgTlp() {
        return msgTlp;
    }

    public void setMsgTlp(String msgTlp) {
        this.msgTlp = msgTlp == null ? null : msgTlp.trim();
    }

    public String getMailFile() {
        return mailFile;
    }

    public void setMailFile(String mailFile) {
        this.mailFile = mailFile == null ? null : mailFile.trim();
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getTeacherUrl() {
        return teacherUrl;
    }

    public void setTeacherUrl(String teacherUrl) {
        this.teacherUrl = teacherUrl == null ? null : teacherUrl.trim();
    }

    public String getMailTpl() {
        return mailTpl;
    }

    public void setMailTpl(String mailTpl) {
        this.mailTpl = mailTpl == null ? null : mailTpl.trim();
    }
}