package com.repository.xcrm.Dto.account.server.course;

import com.base.utils.validate.ValidateUtil;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 10:58
 **/
public class CourseLeadsDto {
    /**
     * 课程uuid
     */
    private String courseUuid;

    /**
     * 老师课表uuid
     */
    private String teacherScheduleUuid;

    /**
     * 老师uuid
     */
    private String teacherUuid;

    /**
     * 学生的uuid
     */
    private String leadsUuid;

    /**
     * leads电话号码
     */
    private String leadsPhone;

    /**
     * leads姓名
     */
    private String leadsName;

    /**
     * 年级
     */
    private String grade;

    /**
     * cc姓名
     */
    private String ccName;
    /**
     * cr姓名
     */
    private String crName;
    /**
     * 销售姓名
     */
    private String saleName;

    /**
     * 上课日期
     */
    private String courseDate;

    /**
     * 老师课程反馈uuid
     */
    private String classTeacherUuid;

    /**
     * 学生性格与习惯
     */
    private String mettleHabits;

    /**
     * 学生课堂习惯
     */
    private String classRoomHabit;

    /**
     * 课后建议
     */
    private String suggestAfterClass;

    private String remark;

    private String classInId;

    private String materialVersion;

    @Override
    public String toString() {
        return "CourseLeadsVo [courseUuid=" + courseUuid + ", teacherScheduleUuid=" + teacherScheduleUuid
                + ", teacherUuid=" + teacherUuid + ", leadsUuid=" + leadsUuid + ", leadsPhone=" + leadsPhone
                + ", leadsName=" + leadsName + ", grade=" + grade + ", ccName=" + ccName + ", crName=" + crName
                + ", saleName=" + saleName + ", courseDate=" + courseDate + ", getCourseDate()=" + getCourseDate()
                + ", getCourseUuid()=" + getCourseUuid() + ", getTeacherScheduleUuid()=" + getTeacherScheduleUuid()
                + ", getTeacherUuid()=" + getTeacherUuid() + ", getLeadsUuid()=" + getLeadsUuid() + ", getLeadsPhone()="
                + getLeadsPhone() + ", getLeadsName()=" + getLeadsName() + ", getGrade()=" + getGrade()
                + ", getCcName()=" + getCcName() + ", getCrName()=" + getCrName() + ", getSaleName()=" + getSaleName()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
    public String getCourseDate() {
        return courseDate;
    }
    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }
    public String getCourseUuid() {
        if(!ValidateUtil.isNotEmpty(courseUuid)){
            courseUuid = "";
        }
        return courseUuid;
    }
    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }
    public String getTeacherScheduleUuid() {
        return teacherScheduleUuid;
    }
    public void setTeacherScheduleUuid(String teacherScheduleUuid) {
        this.teacherScheduleUuid = teacherScheduleUuid;
    }
    public String getTeacherUuid() {
        return teacherUuid;
    }
    public void setTeacherUuid(String teacherUuid) {
        this.teacherUuid = teacherUuid;
    }
    public String getLeadsUuid() {
        return leadsUuid;
    }
    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid;
    }
    public String getLeadsPhone() {
        return leadsPhone;
    }
    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone;
    }
    public String getLeadsName() {
        return leadsName;
    }
    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getCcName() {
        return ccName;
    }
    public void setCcName(String ccName) {
        this.ccName = ccName;
    }
    public String getCrName() {
        return crName;
    }
    public void setCrName(String crName) {
        this.crName = crName;
    }
    public String getSaleName() {
        if(ValidateUtil.isNotEmpty(crName)){
            saleName = crName;
        }else if(ValidateUtil.isNotEmpty(ccName)){
            saleName = ccName;
        }
        return saleName;
    }
    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getClassTeacherUuid() {
        return classTeacherUuid;
    }

    public void setClassTeacherUuid(String classTeacherUuid) {
        this.classTeacherUuid = classTeacherUuid;
    }

    public String getMettleHabits() {
        if (ValidateUtil.isNotEmpty(mettleHabits)){
            return mettleHabits;
        }
        return "";
    }

    public void setMettleHabits(String mettleHabits) {
        this.mettleHabits = mettleHabits;
    }

    public String getClassRoomHabit() {
        if (ValidateUtil.isNotEmpty(classRoomHabit)){
            return classRoomHabit;
        }
        return "";
    }

    public void setClassRoomHabit(String classRoomHabit) {
        this.classRoomHabit = classRoomHabit;
    }

    public String getSuggestAfterClass() {
        if (ValidateUtil.isNotEmpty(suggestAfterClass)){
            return suggestAfterClass;
        }
        return "";
    }

    public void setSuggestAfterClass(String suggestAfterClass) {
        this.suggestAfterClass = suggestAfterClass;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getClassInId() {
        return classInId;
    }

    public void setClassInId(String classInId) {
        this.classInId = classInId;
    }

    public String getMaterialVersion() {
        return materialVersion;
    }

    public void setMaterialVersion(String materialVersion) {
        this.materialVersion = materialVersion;
    }
}
