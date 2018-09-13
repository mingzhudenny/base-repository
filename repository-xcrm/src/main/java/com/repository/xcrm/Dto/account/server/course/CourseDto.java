package com.repository.xcrm.Dto.account.server.course;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:07
 **/
public class CourseDto {
    /**
     * 课程uuid
     */
    private String courseUuid;
    /**
     * classIn关联id
     */
    private String classInId;
    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 年级
     */
    private String grade;
    @Override
    public String toString() {
        return "CourseVo [courseUuid=" + courseUuid + ", classInId=" + classInId + ", courseName=" + courseName
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
    public String getCourseUuid() {
        return courseUuid;
    }
    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }
    public String getClassInId() {
        return classInId;
    }
    public void setClassInId(String classInId) {
        this.classInId = classInId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
