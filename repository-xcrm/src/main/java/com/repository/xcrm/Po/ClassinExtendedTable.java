package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinExtendedTable {
    private Long id;

    private String classId;

    private String courseId;

    private String closeTime;

    private String startTime;

    private String timerEndCount;

    private String diceEndCount;

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

    public String getTimerEndCount() {
        return timerEndCount;
    }

    public void setTimerEndCount(String timerEndCount) {
        this.timerEndCount = timerEndCount == null ? null : timerEndCount.trim();
    }

    public String getDiceEndCount() {
        return diceEndCount;
    }

    public void setDiceEndCount(String diceEndCount) {
        this.diceEndCount = diceEndCount == null ? null : diceEndCount.trim();
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