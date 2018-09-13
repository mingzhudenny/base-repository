package com.repository.crm.Po;

import java.util.Date;

public class TcAgentMsgTpl {
    private Long id;

    private String qqLink;

    private String qqGroup;

    private String msgTpl;

    private String attachment;

    private String mailFile;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Long version;

    private String mailTpl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQqLink() {
        return qqLink;
    }

    public void setQqLink(String qqLink) {
        this.qqLink = qqLink == null ? null : qqLink.trim();
    }

    public String getQqGroup() {
        return qqGroup;
    }

    public void setQqGroup(String qqGroup) {
        this.qqGroup = qqGroup == null ? null : qqGroup.trim();
    }

    public String getMsgTpl() {
        return msgTpl;
    }

    public void setMsgTpl(String msgTpl) {
        this.msgTpl = msgTpl == null ? null : msgTpl.trim();
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
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

    public String getMailTpl() {
        return mailTpl;
    }

    public void setMailTpl(String mailTpl) {
        this.mailTpl = mailTpl == null ? null : mailTpl.trim();
    }
}