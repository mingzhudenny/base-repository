package com.repository.crm.Dto.kpi.server.course;

import com.repository.crm.constant.CourseType;

/**
 * 用户排课数量展示vo
 * @ClassName: UserCourseCountVo 
 * @author csy
 * @date 2017年12月25日 下午1:44:27 
 *
 */
public class UserCourseCountDto {

	/**
	 * 用户uuid
	 */
	private String userUuid;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 课程类型0：测评课1：正式课2：调试课
	 */
	private Integer courseType;
	/**
	 * 排课数量
	 */
	private Integer count;
	@Override
	public String toString() {
		return "UserCourseCountVo [userUuid=" + userUuid + ", userName=" + userName + ", courseType=" + courseType
				+ ", count=" + count + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getUserUuid() {
		return userUuid;
	}
	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCourseType() {
		CourseType coursesType =null;
		if(courseType != null){
			coursesType = CourseType.findByKey(courseType);
		}
		if(coursesType != null){
			return coursesType.getValue();
		}
		return "暂无";
	}
	public void setCourseType(Integer courseType) {
		this.courseType = courseType;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
