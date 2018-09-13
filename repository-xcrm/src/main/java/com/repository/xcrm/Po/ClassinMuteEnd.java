package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinMuteEnd {
    private Long id;

    private String classId;

    private String courseId;

    private String closeTime;

    private String startTime;

    private String muteEndPersonsUid;

    private String muteEndPersonsTotal;

    private String muteAllCount;

    private String muteAllTotal;

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

    public String getMuteEndPersonsUid() {
        return muteEndPersonsUid;
    }

    public void setMuteEndPersonsUid(String muteEndPersonsUid) {
        this.muteEndPersonsUid = muteEndPersonsUid == null ? null : muteEndPersonsUid.trim();
    }

    public String getMuteEndPersonsTotal() {
        return muteEndPersonsTotal;
    }

    public void setMuteEndPersonsTotal(String muteEndPersonsTotal) {
        this.muteEndPersonsTotal = muteEndPersonsTotal == null ? null : muteEndPersonsTotal.trim();
    }

    public String getMuteAllCount() {
        return muteAllCount;
    }

    public void setMuteAllCount(String muteAllCount) {
        this.muteAllCount = muteAllCount == null ? null : muteAllCount.trim();
    }

    public String getMuteAllTotal() {
        return muteAllTotal;
    }

    public void setMuteAllTotal(String muteAllTotal) {
        this.muteAllTotal = muteAllTotal == null ? null : muteAllTotal.trim();
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