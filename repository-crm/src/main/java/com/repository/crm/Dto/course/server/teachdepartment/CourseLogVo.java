package com.repository.crm.Dto.course.server.teachdepartment;

import com.base.utils.validate.ValidateUtil;

/**
 * 
 * <pre>
 * 上课进出房间日志
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseLogVo.java, v 0.1 2018年7月13日 下午3:15:11  Exp $
 */
public class CourseLogVo implements Comparable<CourseLogVo>{

	/**
	 * 客户端
	 */
	private String systemClient;
	/**
	 * 登录用户名
	 */
	private String loginName;
	/**
	 * 用户类型
	 */
	private String userType;
	/**
	 * 进入时间
	 */
	private String enterTime;
	/**
	 * 离开时间
	 */
	private String leaveTime;
	/**
	 * 进入或者是退出房间 0:退出房间; 1:进入房间
	 */
	private String recordType;
	@Override
	public String toString() {
		return "CourseLogVo [systemClient=" + systemClient + ", loginName=" + loginName + ", userType=" + userType
				+ ", enterTime=" + enterTime + ", leaveTime=" + leaveTime + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getSystemClient() {
		if(ValidateUtil.isNotEmpty(systemClient)){
			if(systemClient.equals("0")){
				systemClient = "好视通";
			}else if(systemClient.equals("1")){
				systemClient = "客户端";
			}else{
				systemClient = "未知";
			}
		}else{
			systemClient = "未知";
		}
		return systemClient;
	}
	public void setSystemClient(String systemClient) {
		this.systemClient = systemClient;
	}	
	public String getRecordType() {
		
		if(ValidateUtil.isNotEmpty(recordType)){
			
			if(recordType.equals("1")){
				
				return "进入房间";
				
			}else {
				
				return "退出房间";					
			}
		}
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserType() {
		if(ValidateUtil.isNotEmpty(userType)){
			if(userType.equals("0")){
				return "学生";
			}else if(userType.equals("1")){
				return "老师";
			}else if(userType.equals("2")){
				return "教学监课";
			}else if(userType.equals("STUDENT")){
				return "学生";
			}else if(userType.equals("TEACHER")){
				return "老师";
			}else if(userType.equals("PATRIARCH")){
				return "家长";
			}else if(userType.equals("CC")){
				return "CC";
			}else if(userType.equals("CR")){
				return "CR";
			}else if(userType.equals("MONITOR")){
				return "教学监课";
			}else{
				return "未知";
			}
		}
		return "未知";
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
	@Override
	public int compareTo(CourseLogVo o) {
		if (ValidateUtil.isNotEmpty(this.getEnterTime()) &&
				ValidateUtil.isNotEmpty(o.getEnterTime())){
			return this.getEnterTime().compareTo(o.getEnterTime());
		}else {
			return 0;
		}

	}
}
