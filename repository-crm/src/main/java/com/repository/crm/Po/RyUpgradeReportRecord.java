package com.repository.crm.Po;

import java.util.Date;

public class RyUpgradeReportRecord {
    private Integer id;

    private Integer upgradeReportId;

    private Integer questionId;

    private Integer questionNunber;

    private Double fullScore;

    private Double score;

    private Integer recordStatus;

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

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionNunber() {
        return questionNunber;
    }

    public void setQuestionNunber(Integer questionNunber) {
        this.questionNunber = questionNunber;
    }

    public Double getFullScore() {
        return fullScore;
    }

    public void setFullScore(Double fullScore) {
        this.fullScore = fullScore;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
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