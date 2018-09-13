package com.repository.xcrm.Dto.account.client.course;

/**
 * @description：老师对学生所上课程的反馈
 * @author： denny
 * @create： 2018-03-23 16:31
 **/
public class TeacherToLeadsFeedBackDto {
    /**
     * 学生uuid
     */
    private String leadsUuid;

    /**
     * 性格与习惯
     */
    private String mettleHabits;

    /**
     * 课堂习惯
     */
    private String classRoomHabit;

    /**
     * 课后建议
     */
    private String suggestAfterClass;

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
