package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinAnswerEnd {
    private Long id;

    private String classId;

    private String courseId;

    private String startTime;

    private String closeTime;

    private String answerCount;

    private String answerAverageaccuracy;

    private String answersUid;

    private String answersSelecteditem;

    private String answersLastCommitTime;

    private String answersRecvQuestionTime;

    private String participantsIdentity;

    private String participantsUid;

    private String correctitems;

    private String participantsShowName;

    private String accuracy;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime == null ? null : closeTime.trim();
    }

    public String getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(String answerCount) {
        this.answerCount = answerCount == null ? null : answerCount.trim();
    }

    public String getAnswerAverageaccuracy() {
        return answerAverageaccuracy;
    }

    public void setAnswerAverageaccuracy(String answerAverageaccuracy) {
        this.answerAverageaccuracy = answerAverageaccuracy == null ? null : answerAverageaccuracy.trim();
    }

    public String getAnswersUid() {
        return answersUid;
    }

    public void setAnswersUid(String answersUid) {
        this.answersUid = answersUid == null ? null : answersUid.trim();
    }

    public String getAnswersSelecteditem() {
        return answersSelecteditem;
    }

    public void setAnswersSelecteditem(String answersSelecteditem) {
        this.answersSelecteditem = answersSelecteditem == null ? null : answersSelecteditem.trim();
    }

    public String getAnswersLastCommitTime() {
        return answersLastCommitTime;
    }

    public void setAnswersLastCommitTime(String answersLastCommitTime) {
        this.answersLastCommitTime = answersLastCommitTime == null ? null : answersLastCommitTime.trim();
    }

    public String getAnswersRecvQuestionTime() {
        return answersRecvQuestionTime;
    }

    public void setAnswersRecvQuestionTime(String answersRecvQuestionTime) {
        this.answersRecvQuestionTime = answersRecvQuestionTime == null ? null : answersRecvQuestionTime.trim();
    }

    public String getParticipantsIdentity() {
        return participantsIdentity;
    }

    public void setParticipantsIdentity(String participantsIdentity) {
        this.participantsIdentity = participantsIdentity == null ? null : participantsIdentity.trim();
    }

    public String getParticipantsUid() {
        return participantsUid;
    }

    public void setParticipantsUid(String participantsUid) {
        this.participantsUid = participantsUid == null ? null : participantsUid.trim();
    }

    public String getCorrectitems() {
        return correctitems;
    }

    public void setCorrectitems(String correctitems) {
        this.correctitems = correctitems == null ? null : correctitems.trim();
    }

    public String getParticipantsShowName() {
        return participantsShowName;
    }

    public void setParticipantsShowName(String participantsShowName) {
        this.participantsShowName = participantsShowName == null ? null : participantsShowName.trim();
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy == null ? null : accuracy.trim();
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
}