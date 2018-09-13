package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinSmallBoardEnd {
    private Long id;

    private String classId;

    private String courseId;

    private String closeTime;

    private String startTime;

    private String smallBoardCount;

    private String smallBoardTotal;

    private String smallBoardPeriod;

    private String smallBoardDcount;

    private Integer status;

    private Date createTime;

    private Date updateTme;

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

    public String getSmallBoardCount() {
        return smallBoardCount;
    }

    public void setSmallBoardCount(String smallBoardCount) {
        this.smallBoardCount = smallBoardCount == null ? null : smallBoardCount.trim();
    }

    public String getSmallBoardTotal() {
        return smallBoardTotal;
    }

    public void setSmallBoardTotal(String smallBoardTotal) {
        this.smallBoardTotal = smallBoardTotal == null ? null : smallBoardTotal.trim();
    }

    public String getSmallBoardPeriod() {
        return smallBoardPeriod;
    }

    public void setSmallBoardPeriod(String smallBoardPeriod) {
        this.smallBoardPeriod = smallBoardPeriod == null ? null : smallBoardPeriod.trim();
    }

    public String getSmallBoardDcount() {
        return smallBoardDcount;
    }

    public void setSmallBoardDcount(String smallBoardDcount) {
        this.smallBoardDcount = smallBoardDcount == null ? null : smallBoardDcount.trim();
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

    public Date getUpdateTme() {
        return updateTme;
    }

    public void setUpdateTme(Date updateTme) {
        this.updateTme = updateTme;
    }
}