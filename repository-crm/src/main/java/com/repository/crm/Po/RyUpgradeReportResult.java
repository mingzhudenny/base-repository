package com.repository.crm.Po;

import java.util.Date;

public class RyUpgradeReportResult {
    private Integer id;

    private Integer upgradeReportId;

    private String reportRecordId;

    private String studentCode;

    private String errorMessages;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpgradeReportId() {
        return upgradeReportId;
    }

    public void setUpgradeReportId(Integer upgradeReportId) {
        this.upgradeReportId = upgradeReportId;
    }

    public String getReportRecordId() {
        return reportRecordId;
    }

    public void setReportRecordId(String reportRecordId) {
        this.reportRecordId = reportRecordId == null ? null : reportRecordId.trim();
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode == null ? null : studentCode.trim();
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages == null ? null : errorMessages.trim();
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}