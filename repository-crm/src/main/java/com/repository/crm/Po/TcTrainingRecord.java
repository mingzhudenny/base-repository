package com.repository.crm.Po;

import java.util.Date;

public class TcTrainingRecord {
    private Long id;

    private String teacheruuid;

    private Integer trainingType;

    private String trainingUserUuid;

    private String trainingUser;

    private Integer isPass;

    private String gradePreference;

    private String teachingSubject;

    private Integer natureOfWork;

    private String schoolLocation;

    private String schollName;

    private Integer is985;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacheruuid() {
        return teacheruuid;
    }

    public void setTeacheruuid(String teacheruuid) {
        this.teacheruuid = teacheruuid == null ? null : teacheruuid.trim();
    }

    public Integer getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(Integer trainingType) {
        this.trainingType = trainingType;
    }

    public String getTrainingUserUuid() {
        return trainingUserUuid;
    }

    public void setTrainingUserUuid(String trainingUserUuid) {
        this.trainingUserUuid = trainingUserUuid == null ? null : trainingUserUuid.trim();
    }

    public String getTrainingUser() {
        return trainingUser;
    }

    public void setTrainingUser(String trainingUser) {
        this.trainingUser = trainingUser == null ? null : trainingUser.trim();
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public String getGradePreference() {
        return gradePreference;
    }

    public void setGradePreference(String gradePreference) {
        this.gradePreference = gradePreference == null ? null : gradePreference.trim();
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject == null ? null : teachingSubject.trim();
    }

    public Integer getNatureOfWork() {
        return natureOfWork;
    }

    public void setNatureOfWork(Integer natureOfWork) {
        this.natureOfWork = natureOfWork;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation == null ? null : schoolLocation.trim();
    }

    public String getSchollName() {
        return schollName;
    }

    public void setSchollName(String schollName) {
        this.schollName = schollName == null ? null : schollName.trim();
    }

    public Integer getIs985() {
        return is985;
    }

    public void setIs985(Integer is985) {
        this.is985 = is985;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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
}