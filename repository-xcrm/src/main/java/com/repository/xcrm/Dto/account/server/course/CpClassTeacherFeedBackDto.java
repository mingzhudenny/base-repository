package com.repository.xcrm.Dto.account.server.course;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-24 18:10
 **/
public class CpClassTeacherFeedBackDto {

    private String classTeacherUuid;

    private  String leadsUuid;

    private String mettleHabits;

    private String classRoomHabit;

    private String suggestAfterClass;

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
}
