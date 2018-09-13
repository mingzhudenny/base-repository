package com.repository.crm.Dto.account.server.leads;

import java.text.ParseException;
import java.util.Date;

import com.base.utils.date.DateUtil;
/**
 * 
 * <pre>
 * 待跟进要展示的vo
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: WaitFollowUpVo.java, v 0.1 2018年5月18日 下午12:08:50  Exp $
 */
public class WaitFollowUpVo {

	private String uuid;//leadsuuid
	private String name;//leads姓名
	private String phone;//电话号码
	private String grade;//年级
	private String subject;//科目
	private String connectStatus;//接通状态
	private String signupDate;//报名时间
	private String inChargeDate;//负责时间
	private Boolean keyPoint;//是否优先跟进
	private String channelLevel;//渠道级别
	private String remarkContent;//最新备注内容
	@SuppressWarnings("unused")
	private Boolean isWarn;//是否是警告leads
	private Integer signUpCount;//报名次数
	@SuppressWarnings("unused")
	private Boolean isRedLeads;//是否要标红leads
	
	/** 渠道名称*/
	private String channelName;
	
	private Boolean tmkSignStatus;
	/** 是否有预约课程  0 否 1  是 */
	private Integer isMarkCourse;
	/** 电话号码所在地*/
	private String phoneLocation;	
	
	public String getPhoneLocation() {
		return phoneLocation;
	}
	public void setPhoneLocation(String phoneLocation) {
		this.phoneLocation = phoneLocation;
	}
	public Integer getIsMarkCourse() {
		return isMarkCourse;
	}
	public void setIsMarkCourse(Integer isMarkCourse) {
		this.isMarkCourse = isMarkCourse;
	}
	public Boolean isTmkSignStatus() {
		return tmkSignStatus;
	}
	public void setTmkSignStatus(Boolean tmkSignStatus) {
		this.tmkSignStatus = tmkSignStatus;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelLevel() {
		return channelLevel;
	}
	public void setChannelLevel(String channelLevel) {
		this.channelLevel = channelLevel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getConnectStatus() {
		return connectStatus;
	}
	public void setConnectStatus(String connectStatus) {
		this.connectStatus = connectStatus;
	}
	public String getSignupDate() {
		return signupDate;
	}
	public void setSignupDate(String signupDate) {
		this.signupDate = signupDate;
	}
	public String getInChargeDate() {
		return inChargeDate;
	}
	public void setInChargeDate(String inChargeDate) {
		this.inChargeDate = inChargeDate;
	}
	public String getRemarkContent() {
		return remarkContent;
	}
	public void setRemarkContent(String remarkContent) {
		this.remarkContent = remarkContent;
	}
	public Boolean isKeyPoint() {
		return keyPoint;
	}
	public void setKeyPoint(Boolean keyPoint) {
		this.keyPoint = keyPoint;
	}
	public Boolean getIsWarn() throws ParseException {
		long betweenMonth = (DateUtil.MillisBetweenLong(DateUtil.parseDateStrToDate(signupDate), new Date()))/3600;
		if(betweenMonth>24&&connectStatus.equals("wait")){
			return true;
		}
		return false;
	}
	public void setIsWarn(Boolean isWarn) {
		this.isWarn = isWarn;
	}
	public Integer getSignUpCount() {
		return signUpCount;
	}
	public void setSignUpCount(Integer signUpCount) {
		this.signUpCount = signUpCount;
	}
	public Boolean getIsRedLeads() {
		if(signUpCount != null && signUpCount>=3){
			return true;
		}
		return false;
	}
	public void setIsRedLeads(Boolean isRedLeads) {
		this.isRedLeads = isRedLeads;
	}	

}
