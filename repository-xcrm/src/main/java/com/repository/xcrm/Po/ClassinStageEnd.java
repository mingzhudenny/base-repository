package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinStageEnd {
    private Long id;

    private String classId;

    private String courseId;

    private String closeTime;

    private String startTime;

    private String stageUid;

    private String downCount;

    private String upTotal;

    private String upCount;

    private String downTotal;

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

    public String getStageUid() {
        return stageUid;
    }

    public void setStageUid(String stageUid) {
        this.stageUid = stageUid == null ? null : stageUid.trim();
    }

    public String getDownCount() {
        return downCount;
    }

    public void setDownCount(String downCount) {
        this.downCount = downCount == null ? null : downCount.trim();
    }

    public String getUpTotal() {
        return upTotal;
    }

    public void setUpTotal(String upTotal) {
        this.upTotal = upTotal == null ? null : upTotal.trim();
    }

    public String getUpCount() {
        return upCount;
    }

    public void setUpCount(String upCount) {
        this.upCount = upCount == null ? null : upCount.trim();
    }

    public String getDownTotal() {
        return downTotal;
    }

    public void setDownTotal(String downTotal) {
        this.downTotal = downTotal == null ? null : downTotal.trim();
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