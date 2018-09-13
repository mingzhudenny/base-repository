package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinAuthorizeEnd {
    private Long id;

    private String classId;

    private String courseId;

    private String startTime;

    private String closeTime;

    private String authorizeUid;

    private String authorizeCount;

    private String authorizeTotal;

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

    public String getAuthorizeUid() {
        return authorizeUid;
    }

    public void setAuthorizeUid(String authorizeUid) {
        this.authorizeUid = authorizeUid == null ? null : authorizeUid.trim();
    }

    public String getAuthorizeCount() {
        return authorizeCount;
    }

    public void setAuthorizeCount(String authorizeCount) {
        this.authorizeCount = authorizeCount == null ? null : authorizeCount.trim();
    }

    public String getAuthorizeTotal() {
        return authorizeTotal;
    }

    public void setAuthorizeTotal(String authorizeTotal) {
        this.authorizeTotal = authorizeTotal == null ? null : authorizeTotal.trim();
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