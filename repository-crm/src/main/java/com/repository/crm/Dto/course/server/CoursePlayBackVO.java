package com.repository.crm.Dto.course.server;

import com.repository.crm.constant.CourseType;

/**
 * 
 * <pre>
 * 课程回放返回的数据
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CoursePlayBackVO.java, v 0.1 2018年4月25日 下午1:50:43  Exp $
 */
public class CoursePlayBackVO {

    /**
     * 上课房间UUids
     */
    private String classRoomUuid;
    /**
     * 课程类型
     */
    private Integer courseType;
    /**
     * 学生uuid
     */
    private String leadsUuid;
    /**
     * 学生姓名
     */
    private String leadsName;
    /**
     * 学生电话
     */
    private String leadsPhone;
    /**
     * 销售姓名
     */
    private String userName;
    /**
     * 销售类型
     */
    private String userType;
    /**
     * 团队姓名
     */
    private String teamName;
    /**
     * 课程uuid
     */
    private String courseUuid;
    /**
     * 上课日期
     */
    private String courseDate;
    /**
     * 上课开始时间
     */
    private String courseStartTime;
    /**
     * 上课结束时间
     */
    private String courseEndTime;

    /**
     *  老师姓名
     */
    private String tcName;

    /**
     * 老师手机号
     */
    private String tcPhone;

	public String getClassRoomUuid() {
        return classRoomUuid;
    }

    public void setClassRoomUuid(String classRoomUuid) {
        this.classRoomUuid = classRoomUuid;
    }

    public String getCourseType() {
        if (courseType==CourseType.TEST_COURSE.getKey()){
            return CourseType.findByKey(courseType).getValue();
        }else if (courseType==CourseType.FORMAL_COURSE.getKey()){
            return CourseType.findByKey(courseType).getValue();
        }else if (courseType==CourseType.DEBUG_COURSE.getKey()){
            return CourseType.findByKey(courseType).getValue();
        }
        return "";
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid;
    }

    public String getLeadsName() {
        return leadsName;
    }

    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName;
    }

    public String getLeadsPhone() {
        return leadsPhone;
    }

    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }

    public String getCourseStartTime() {
        return courseStartTime;
    }

    public void setCourseStartTime(String courseStartTime) {
        this.courseStartTime = courseStartTime;
    }

    public String getCourseEndTime() {
        return courseEndTime;
    }

    public void setCourseEndTime(String courseEndTime) {
        this.courseEndTime = courseEndTime;
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName;
    }

    public String getTcPhone() {
        return tcPhone;
    }

    public void setTcPhone(String tcPhone) {
        this.tcPhone = tcPhone;
    }
}
