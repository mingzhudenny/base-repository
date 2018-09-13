package com.repository.crm.Po;

import java.util.Date;

public class RyTeacherExam {
    private Integer id;

    private String teacherExamId;

    private String teacherExamName;

    private Integer bookVersionId;

    private Double totleScore;

    private String createDateTime;

    private Integer examStatus;

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

    public String getTeacherExamId() {
        return teacherExamId;
    }

    public void setTeacherExamId(String teacherExamId) {
        this.teacherExamId = teacherExamId == null ? null : teacherExamId.trim();
    }

    public String getTeacherExamName() {
        return teacherExamName;
    }

    public void setTeacherExamName(String teacherExamName) {
        this.teacherExamName = teacherExamName == null ? null : teacherExamName.trim();
    }

    public Integer getBookVersionId() {
        return bookVersionId;
    }

    public void setBookVersionId(Integer bookVersionId) {
        this.bookVersionId = bookVersionId;
    }

    public Double getTotleScore() {
        return totleScore;
    }

    public void setTotleScore(Double totleScore) {
        this.totleScore = totleScore;
    }

    public String getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime == null ? null : createDateTime.trim();
    }

    public Integer getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(Integer examStatus) {
        this.examStatus = examStatus;
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