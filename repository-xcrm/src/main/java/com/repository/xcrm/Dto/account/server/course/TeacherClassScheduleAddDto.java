package com.repository.xcrm.Dto.account.server.course;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:24
 **/
public class TeacherClassScheduleAddDto {
    /**
     * 老师课表的uuid
     */
    private String uuid;
    /**
     * 老师的uuid
     */
    private String teacherUuid;
    /**
     * 课表日期
     */
    private String scheduleDate;
    /**
     * 课表配置的uuid
     */
    private String scheduleUuid;
    /**
     * 课表结束时间
     */
    private String scheduleEndTime;
    /**
     * 课表开始时间
     */
    private String scheduleStartTime;
    /**
     * 课表类型
     */
    private String courseType;
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getTeacherUuid() {
        return teacherUuid;
    }
    public void setTeacherUuid(String teacherUuid) {
        this.teacherUuid = teacherUuid;
    }
    public String getScheduleDate() {
        return scheduleDate;
    }
    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }
    public String getScheduleUuid() {
        return scheduleUuid;
    }
    public void setScheduleUuid(String scheduleUuid) {
        this.scheduleUuid = scheduleUuid;
    }
    public String getScheduleEndTime() {
        return scheduleEndTime;
    }
    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }
    public String getScheduleStartTime() {
        return scheduleStartTime;
    }
    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }
    public String getCourseType() {
        return courseType;
    }
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
    @Override
    public String toString() {
        return "TeacherClassScheduleAddVo [uuid=" + uuid + ", teacherUuid=" + teacherUuid + ", scheduleDate="
                + scheduleDate + ", scheduleUuid=" + scheduleUuid + ", scheduleEndTime=" + scheduleEndTime
                + ", scheduleStartTime=" + scheduleStartTime + ", courseType=" + courseType + ", getUuid()=" + getUuid()
                + ", getTeacherUuid()=" + getTeacherUuid() + ", getScheduleDate()=" + getScheduleDate()
                + ", getScheduleUuid()=" + getScheduleUuid() + ", getScheduleEndTime()=" + getScheduleEndTime()
                + ", getScheduleStartTime()=" + getScheduleStartTime() + ", getCourseType()=" + getCourseType()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
}
