package com.repository.crm.Dto.course.server.teachdepartment;

/**
 * 
 * <pre>
 * 完课管理列表显示
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseCastVo.java, v 0.1 2018年7月13日 下午3:16:07  Exp $
 */
public class CourseEndVo {

	/**
	 * 课程uuid
	 */
	private String courseUuid;
	/**
	 * 课耗日志类型
	 */
	private Integer courseCastType;   
	/**
	 * 扣除上课时长
	 */
	private String castLength;
	/**
	 * 老师上课时长
	 */
	private String teacherLength;
	/**
	 * 学生上课时长
	 */
	private String studentLength;
	/**
	 * 实际上课时长
	 */
	private String realLength;
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
	 * 学生姓名
	 */
	private String leadsName;
	/**
	 * 学生电话号码
	 */
	private String leadsPhone;
	/**
	 * 老师姓名
	 */
	private String teacherName;
	/**
	 * 老师电话号码
	 */
	private String teacherPhone;
	/**
	 * 课程类型
	 */
	private Integer courseType;
	/**
	 * 更新时间
	 */
	private String updateTime;

	/**
	 * 老师课时审核
	 */
	private Integer teacherCheckLength;

	@Override
	public String toString() {
		return "CourseCastVo [courseUuid=" + courseUuid + ", courseCastType=" + courseCastType + ", castLength="
				+ castLength + ", teacherLength=" + teacherLength + ", studentLength=" + studentLength + ", realLength="
				+ realLength + ", courseDate=" + courseDate + ", courseStartTime=" + courseStartTime
				+ ", courseEndTime=" + courseEndTime + ", leadsName=" + leadsName + ", leadsPhone=" + leadsPhone
				+ ", teacherName=" + teacherName + ", teacherPhone=" + teacherPhone + ", courseType=" + courseType
				+ ", updateTime=" + updateTime + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getCourseUuid() {
		return courseUuid;
	}
	public void setCourseUuid(String courseUuid) {
		this.courseUuid = courseUuid;
	}
	public String getCourseCastType() {
		if(courseCastType != null){
			if(courseCastType == 0){
				return "失败";
			}else if(courseCastType == 1){
				return "成功";
			}else if(courseCastType == 2){
				return "待反馈";
			}else if(courseCastType == 3){
				return "异常";
			}else if(courseCastType == 4){
				return "已处理";
			}else {
				return "未知状态";
			}
		}
		return "未知状态";
	}
	public void setCourseCastType(Integer courseCastType) {
		this.courseCastType = courseCastType;
	}
	public String getCastLength() {
		return castLength;
	}
	public void setCastLength(String castLength) {
		this.castLength = castLength;
	}
	public String getTeacherLength() {
		return teacherLength;
	}
	public void setTeacherLength(String teacherLength) {
		this.teacherLength = teacherLength;
	}
	public String getStudentLength() {
		return studentLength;
	}
	public void setStudentLength(String studentLength) {
		this.studentLength = studentLength;
	}
	public String getRealLength() {
		return realLength;
	}
	public void setRealLength(String realLength) {
		this.realLength = realLength;
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
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public String getCourseType() {
		if(courseType != null){
			if(courseType == 0){
				return "测评课";
			}else if(courseType == 1){
				return "正式课";
			}else if(courseType == 2){
				return "调试课";
			}else{
				return "未知";
			}
		}
		return "未知";
	}
	public void setCourseType(Integer courseType) {
		this.courseType = courseType;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getTeacherCheckLength() {
		return teacherCheckLength;
	}

	public void setTeacherCheckLength(Integer teacherCheckLength) {
		this.teacherCheckLength = teacherCheckLength;
	}
}
