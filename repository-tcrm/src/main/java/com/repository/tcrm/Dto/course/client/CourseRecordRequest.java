package com.repository.tcrm.Dto.course.client;



import javax.validation.constraints.Pattern;

/**
 * @Author ywj
 * <p>
 */
public class CourseRecordRequest extends BaseRequest{
    private String subject;
    @Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2})|$", message = "开始日期格式错误，正确格式：yyyy-MM-dd！")
    private String startDate;
    @Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2})|$", message = "结束日期格式错误，正确格式：yyyy-MM-dd！")
    private String endDate;
    private Integer courseType; //课程类型  0:测评课;1:正式课;2:调试课
    private String userName;    //姓名(学生或老师)

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "CourseRecordRequest{" +
                "subject='" + subject + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", courseType=" + courseType +
                ", userName='" + userName + '\'' +
                "} " + super.toString();
    }
}
