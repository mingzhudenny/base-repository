package com.repository.crm.Po;

import java.util.Date;

public class CpTimeRecord {
    private Long id;

    private String courseUuid;

    private Integer realLength;

    private Integer leadsLength;

    private Integer teacherLength;

    private Integer castLength;

    private Integer newRealLength;

    private Integer newLeadsLength;

    private Integer newTeacherLength;

    private Integer newCastLength;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;

    private Integer teacherCheckLength;

    private Integer newTeacherCheckLength;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid == null ? null : courseUuid.trim();
    }

    public Integer getRealLength() {
        return realLength;
    }

    public void setRealLength(Integer realLength) {
        this.realLength = realLength;
    }

    public Integer getLeadsLength() {
        return leadsLength;
    }

    public void setLeadsLength(Integer leadsLength) {
        this.leadsLength = leadsLength;
    }

    public Integer getTeacherLength() {
        return teacherLength;
    }

    public void setTeacherLength(Integer teacherLength) {
        this.teacherLength = teacherLength;
    }

    public Integer getCastLength() {
        return castLength;
    }

    public void setCastLength(Integer castLength) {
        this.castLength = castLength;
    }

    public Integer getNewRealLength() {
        return newRealLength;
    }

    public void setNewRealLength(Integer newRealLength) {
        this.newRealLength = newRealLength;
    }

    public Integer getNewLeadsLength() {
        return newLeadsLength;
    }

    public void setNewLeadsLength(Integer newLeadsLength) {
        this.newLeadsLength = newLeadsLength;
    }

    public Integer getNewTeacherLength() {
        return newTeacherLength;
    }

    public void setNewTeacherLength(Integer newTeacherLength) {
        this.newTeacherLength = newTeacherLength;
    }

    public Integer getNewCastLength() {
        return newCastLength;
    }

    public void setNewCastLength(Integer newCastLength) {
        this.newCastLength = newCastLength;
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

    public Integer getTeacherCheckLength() {
        return teacherCheckLength;
    }

    public void setTeacherCheckLength(Integer teacherCheckLength) {
        this.teacherCheckLength = teacherCheckLength;
    }

    public Integer getNewTeacherCheckLength() {
        return newTeacherCheckLength;
    }

    public void setNewTeacherCheckLength(Integer newTeacherCheckLength) {
        this.newTeacherCheckLength = newTeacherCheckLength;
    }
}