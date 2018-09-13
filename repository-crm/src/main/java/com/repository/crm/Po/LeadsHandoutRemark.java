package com.repository.crm.Po;

import java.util.Date;

public class LeadsHandoutRemark {
    private Integer id;

    private String leadsUuid;

    private String clientReamrk;

    private String coursePlanRemark;

    private String firstCourseSubject;

    private String firstCourseStartTime;

    private String firstCourseEndTime;

    private Integer isAddSubject;

    private String addSubject;

    private String beforeStudy;

    private String studyInfo;

    private String leadsCharacterFamily;

    private String familyFocus;

    private String courseInfo;

    private String otherInfo;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String createUid;

    private String updateUid;

    private String remark;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public String getClientReamrk() {
        return clientReamrk;
    }

    public void setClientReamrk(String clientReamrk) {
        this.clientReamrk = clientReamrk == null ? null : clientReamrk.trim();
    }

    public String getCoursePlanRemark() {
        return coursePlanRemark;
    }

    public void setCoursePlanRemark(String coursePlanRemark) {
        this.coursePlanRemark = coursePlanRemark == null ? null : coursePlanRemark.trim();
    }

    public String getFirstCourseSubject() {
        return firstCourseSubject;
    }

    public void setFirstCourseSubject(String firstCourseSubject) {
        this.firstCourseSubject = firstCourseSubject == null ? null : firstCourseSubject.trim();
    }

    public String getFirstCourseStartTime() {
        return firstCourseStartTime;
    }

    public void setFirstCourseStartTime(String firstCourseStartTime) {
        this.firstCourseStartTime = firstCourseStartTime == null ? null : firstCourseStartTime.trim();
    }

    public String getFirstCourseEndTime() {
        return firstCourseEndTime;
    }

    public void setFirstCourseEndTime(String firstCourseEndTime) {
        this.firstCourseEndTime = firstCourseEndTime == null ? null : firstCourseEndTime.trim();
    }

    public Integer getIsAddSubject() {
        return isAddSubject;
    }

    public void setIsAddSubject(Integer isAddSubject) {
        this.isAddSubject = isAddSubject;
    }

    public String getAddSubject() {
        return addSubject;
    }

    public void setAddSubject(String addSubject) {
        this.addSubject = addSubject == null ? null : addSubject.trim();
    }

    public String getBeforeStudy() {
        return beforeStudy;
    }

    public void setBeforeStudy(String beforeStudy) {
        this.beforeStudy = beforeStudy == null ? null : beforeStudy.trim();
    }

    public String getStudyInfo() {
        return studyInfo;
    }

    public void setStudyInfo(String studyInfo) {
        this.studyInfo = studyInfo == null ? null : studyInfo.trim();
    }

    public String getLeadsCharacterFamily() {
        return leadsCharacterFamily;
    }

    public void setLeadsCharacterFamily(String leadsCharacterFamily) {
        this.leadsCharacterFamily = leadsCharacterFamily == null ? null : leadsCharacterFamily.trim();
    }

    public String getFamilyFocus() {
        return familyFocus;
    }

    public void setFamilyFocus(String familyFocus) {
        this.familyFocus = familyFocus == null ? null : familyFocus.trim();
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo == null ? null : courseInfo.trim();
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo == null ? null : otherInfo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid == null ? null : updateUid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}