package com.repository.xcrm.Po;

import java.util.Date;

/**
 * @description：老师对学生所上课程的反馈 po
 * @author： denny
 * @create： 2018-03-23 16:21
 **/
public class CpClassTeacherFeedBack {

    private Long id;

    private String uuid;

    private String classTeacherUuid;

    private  String leadsUuid;

    private String mettleHabits;

    private String classRoomHabit;

    private String suggestAfterClass;

    private Integer status;

    private String createUserId;

    private String updateUserId;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getClassTeacherUuid() {
        return classTeacherUuid;
    }

    public void setClassTeacherUuid(String classTeacherUuid) {
        this.classTeacherUuid = classTeacherUuid;
    }

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid;
    }

    public String getMettleHabits() {
        return mettleHabits;
    }

    public void setMettleHabits(String mettleHabits) {
        this.mettleHabits = mettleHabits;
    }

    public String getClassRoomHabit() {
        return classRoomHabit;
    }

    public void setClassRoomHabit(String classRoomHabit) {
        this.classRoomHabit = classRoomHabit;
    }

    public String getSuggestAfterClass() {
        return suggestAfterClass;
    }

    public void setSuggestAfterClass(String suggestAfterClass) {
        this.suggestAfterClass = suggestAfterClass;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
