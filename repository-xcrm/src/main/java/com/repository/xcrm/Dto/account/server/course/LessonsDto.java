package com.repository.xcrm.Dto.account.server.course;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:04
 **/
public class LessonsDto {
    /**
     * 课程uuid
     */
    private String courseUuid;
    /**
     * 课程id号
     */
    private String courseId;
    /**
     * 课节id号
     */
    private String lessonId;
    /**
     * 班次
     */
    private String classNo;
    /**
     * 老师uuid
     */
    private String teacherUuid;
    /**
     * 老师姓名
     */
    private String teacherName;
    /**
     * 上课日期
     */
    private String lessonDate;
    /**
     * 上课开始时间
     */
    private String startTime;
    /**
     * 上课结束时间
     */
    private String endTime;
    /**
     * 上课时长
     */
    private Double length;
    /**
     * 学生数
     */
    private int studentCount;
    @Override
    public String toString() {
        return "LessonsVo [courseUuid=" + courseUuid + ", courseId=" + courseId + ", lessonId=" + lessonId
                + ", classNo=" + classNo + ", teacherUuid=" + teacherUuid + ", teacherName=" + teacherName
                + ", lessonDate=" + lessonDate + ", startTime=" + startTime + ", endTime=" + endTime + ", length="
                + length + ", studentCount=" + studentCount + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
    public String getCourseUuid() {
        return courseUuid;
    }
    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }
    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getLessonId() {
        return lessonId;
    }
    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }
    public String getClassNo() {
        return classNo;
    }
    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }
    public String getTeacherUuid() {
        return teacherUuid;
    }
    public void setTeacherUuid(String teacherUuid) {
        this.teacherUuid = teacherUuid;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getLessonDate() {
        return lessonDate;
    }
    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public Double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
}
