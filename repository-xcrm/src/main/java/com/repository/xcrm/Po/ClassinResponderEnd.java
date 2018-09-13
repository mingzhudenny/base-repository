package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinResponderEnd {
    private Long id;

    private String classId;

    private String courseId;

    private String startTime;

    private String closeTime;

    private String responderCount;

    private String responderPersonsUid;

    private String responderPersonsCount;

    private String responderPersonsScount;

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

    public String getResponderCount() {
        return responderCount;
    }

    public void setResponderCount(String responderCount) {
        this.responderCount = responderCount == null ? null : responderCount.trim();
    }

    public String getResponderPersonsUid() {
        return responderPersonsUid;
    }

    public void setResponderPersonsUid(String responderPersonsUid) {
        this.responderPersonsUid = responderPersonsUid == null ? null : responderPersonsUid.trim();
    }

    public String getResponderPersonsCount() {
        return responderPersonsCount;
    }

    public void setResponderPersonsCount(String responderPersonsCount) {
        this.responderPersonsCount = responderPersonsCount == null ? null : responderPersonsCount.trim();
    }

    public String getResponderPersonsScount() {
        return responderPersonsScount;
    }

    public void setResponderPersonsScount(String responderPersonsScount) {
        this.responderPersonsScount = responderPersonsScount == null ? null : responderPersonsScount.trim();
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