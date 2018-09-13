package com.repository.xcrm.Po;

import java.util.Date;

public class ClassinShareWidgetEnd {
    private Long id;

    private String classId;

    private String courseId;

    private String startTime;

    private String closeTime;

    private String shareWidgetFilesEndTime;

    private String shareWidgetFilesStartTime;

    private String shareWidgetFilesFileName;

    private String shareWidgetCount;

    private String shareWidgetTotal;

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

    public String getShareWidgetFilesEndTime() {
        return shareWidgetFilesEndTime;
    }

    public void setShareWidgetFilesEndTime(String shareWidgetFilesEndTime) {
        this.shareWidgetFilesEndTime = shareWidgetFilesEndTime == null ? null : shareWidgetFilesEndTime.trim();
    }

    public String getShareWidgetFilesStartTime() {
        return shareWidgetFilesStartTime;
    }

    public void setShareWidgetFilesStartTime(String shareWidgetFilesStartTime) {
        this.shareWidgetFilesStartTime = shareWidgetFilesStartTime == null ? null : shareWidgetFilesStartTime.trim();
    }

    public String getShareWidgetFilesFileName() {
        return shareWidgetFilesFileName;
    }

    public void setShareWidgetFilesFileName(String shareWidgetFilesFileName) {
        this.shareWidgetFilesFileName = shareWidgetFilesFileName == null ? null : shareWidgetFilesFileName.trim();
    }

    public String getShareWidgetCount() {
        return shareWidgetCount;
    }

    public void setShareWidgetCount(String shareWidgetCount) {
        this.shareWidgetCount = shareWidgetCount == null ? null : shareWidgetCount.trim();
    }

    public String getShareWidgetTotal() {
        return shareWidgetTotal;
    }

    public void setShareWidgetTotal(String shareWidgetTotal) {
        this.shareWidgetTotal = shareWidgetTotal == null ? null : shareWidgetTotal.trim();
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