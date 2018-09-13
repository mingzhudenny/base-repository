package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinInoutEnd {
    private Long id;

    private String classId;

    private String courseId;

    private String closeTime;

    private String startTime;

    private String inOutUid;

    private String inOutTotal;

    private String inOutType;

    private String inOutTime;

    private String inOutIdentity;

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

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime == null ? null : closeTime.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getInOutUid() {
        return inOutUid;
    }

    public void setInOutUid(String inOutUid) {
        this.inOutUid = inOutUid == null ? null : inOutUid.trim();
    }

    public String getInOutTotal() {
        return inOutTotal;
    }

    public void setInOutTotal(String inOutTotal) {
        this.inOutTotal = inOutTotal == null ? null : inOutTotal.trim();
    }

    public String getInOutType() {
        return inOutType;
    }

    public void setInOutType(String inOutType) {
        this.inOutType = inOutType == null ? null : inOutType.trim();
    }

    public String getInOutTime() {
        return inOutTime;
    }

    public void setInOutTime(String inOutTime) {
        this.inOutTime = inOutTime == null ? null : inOutTime.trim();
    }

    public String getInOutIdentity() {
        return inOutIdentity;
    }

    public void setInOutIdentity(String inOutIdentity) {
        this.inOutIdentity = inOutIdentity == null ? null : inOutIdentity.trim();
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