package com.repository.crm.Dto.kpi.server.course;

import java.math.BigDecimal;

import com.repository.crm.constant.CourseFeedBackStatusType;
import com.repository.crm.constant.CourseRequestStatusType;
import com.repository.crm.constant.PayType;

/**
 * 用户排课数据明细信息
 * 
 * @ClassName: UserCourseDetailVo
 * @author csy
 * @date 2017年12月25日 下午1:50:09
 *
 */
public class UserCourseDetailDto {

	/**
	 * 学生姓名
	 */
	private String leadsName;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 科目
	 */
	private String subject;
	/**
	 * 课时类型
	 */
	private Byte courseType;
	/**
	 * 课时级别
	 */
	private Byte courseLevel;
	/**
	 * 上课时长
	 */
	private BigDecimal length;
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
	 * 老师姓名
	 */
	private String teacherName;
	/**
	 * 销售姓名
	 */
	private String userName;
	/**
	 * 团队姓名
	 */
	private String teamName;
	/**
	 * 课程提交时间
	 */
	private String courseCommitTime;
	/**
	 * 排课时间
	 */
	private String courseManagerTime;
	/**
	 * 课程要求排课状态
	 */
	private Integer courseRequesetStatus;
	/**
	 * 课程反馈状态
	 */
	private Byte courseFeedBackStatus;
	/**
	 * 反馈备注
	 */
	private String courseFeedBackRemark;
	/**
	 * 是否支付 0：未支付1：已支付
	 */
	private Byte isPay;

	@Override
	public String toString() {
		return "UserCourseDetailVo [leadsName=" + leadsName + ", grade=" + grade + ", subject=" + subject
				+ ", courseType=" + courseType + ", courseLevel=" + courseLevel + ", length=" + length + ", courseDate="
				+ courseDate + ", courseStartTime=" + courseStartTime + ", courseEndTime=" + courseEndTime
				+ ", teacherName=" + teacherName + ", userName=" + userName + ", teamName=" + teamName
				+ ", courseCommitTime=" + courseCommitTime + ", courseManagerTime=" + courseManagerTime
				+ ", courseRequesetStatus=" + courseRequesetStatus + ", courseFeedBackStatus=" + courseFeedBackStatus
				+ ", courseFeedBackRemark=" + courseFeedBackRemark + ", isPay=" + isPay + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCourseType() {
		if(courseType!= null){
			if(courseType == 0){
				return "测评课";
			}else if(courseType == 1){
				return "正式课";
			}
		}
		return "未知";
	}

	public void setCourseType(Byte courseType) {
		this.courseType = courseType;
	}

	public String getCourseLevel() {
		if(courseLevel!= null){
			if(courseLevel == 0){
				return "普通";
			}else if(courseLevel == 1){
				return "清北";
			}else if(courseLevel == 2){
				return "明星课程";
			}
		}
		return "未知";
	}

	public void setCourseLevel(Byte courseLevel) {
		this.courseLevel = courseLevel;
	}

	public BigDecimal getLength() {
		return length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
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

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCourseCommitTime() {
		return courseCommitTime;
	}

	public void setCourseCommitTime(String courseCommitTime) {
		this.courseCommitTime = courseCommitTime;
	}

	public String getCourseManagerTime() {
		return courseManagerTime;
	}

	public void setCourseManagerTime(String courseManagerTime) {
		this.courseManagerTime = courseManagerTime;
	}

	public String getCourseRequesetStatus() {
		CourseRequestStatusType courseRequestStatusType;
		if (courseRequesetStatus != null) {
			courseRequestStatusType = CourseRequestStatusType.findByKey(courseRequesetStatus);
			return courseRequestStatusType.getValue();
		}
		return "暂无";
	}

	public void setCourseRequesetStatus(Integer courseRequesetStatus) {
		this.courseRequesetStatus = courseRequesetStatus;
	}

	public String getCourseFeedBackStatus() {
		CourseFeedBackStatusType backStatusType;
		if(courseFeedBackStatus != null){
			backStatusType = CourseFeedBackStatusType.findByKey(courseFeedBackStatus);
			return backStatusType.getValue();
		}
		return null;
	}

	public void setCourseFeedBackStatus(Byte courseFeedBackStatus) {
		this.courseFeedBackStatus = courseFeedBackStatus;
	}

	public String getCourseFeedBackRemark() {
		return courseFeedBackRemark;
	}

	public void setCourseFeedBackRemark(String courseFeedBackRemark) {
		this.courseFeedBackRemark = courseFeedBackRemark;
	}

	public String getIsPay() {
		PayType payType;
		if(isPay != null){
			payType = PayType.findByKey(isPay);
			return payType.getValue();
		}
		return "暂无";
	}

	public void setIsPay(Byte isPay) {
		this.isPay = isPay;
	}
}
