package com.repository.crm.Dto.order.server.fn;

import java.util.Date;

import com.base.utils.validate.ValidateUtil;


/**
 * 已经审核子单的展示信息vo
 * @author csy
 * @date 2017年4月19日
 */
public class HaveCheckChildOrderVo {

	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * leads姓名
	 */
	private String leadsName;
	/**
	 * leads电话号码
	 */
	private String leadsPhone;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 金额
	 */
	private String money;
	/**
	 * 提交人
	 */
	private String userName;
	/**
	 * 提交时间
	 */
	private Date submitTime;
	/**
	 * 审核状态
	 */
	private Byte checkStatus;
	/**
	 * 审核时间
	 */
	private Date checkTime;
	/**
	 * 审核人
	 */
	private String gaUserName;
	
	private String type;
	
	private String length;
	
	/**
	 * 课时包信息
	 */
	private String coursePriceInfo;
	
	@Override
	public String toString() {
		return "HaveCheckChildOrderVo [orderNo=" + orderNo + ", leadsName=" + leadsName + ", leadsPhone=" + leadsPhone
				+ ", grade=" + grade + ", money=" + money + ", userName=" + userName + ", submitTime=" + submitTime
				+ ", checkStatus=" + checkStatus + ", checkTime=" + checkTime + ", gaUserName=" + gaUserName 
				+ ", getOrderNo()=" + getOrderNo() + ", getLeadsName()=" + getLeadsName() + ", getLeadsPhone()="
				+ getLeadsPhone() + ", getGrade()=" + getGrade() + ", getMoney()=" + getMoney() + ", getUserName()="
				+ getUserName() + ", getSubmitTime()=" + getSubmitTime() + ", getCheckStatus()=" + getCheckStatus()
				+ ", getCheckTime()=" + getCheckTime() + ", getGaUserName()=" + getGaUserName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public String getCoursePriceInfo() {
		if(ValidateUtil.isNotEmpty(type)&&ValidateUtil.isNotEmpty(length)){
			coursePriceInfo = type+length+"课时包";
		}
		return coursePriceInfo;
	}

	public void setCoursePriceInfo(String coursePriceInfo) {
		this.coursePriceInfo = coursePriceInfo;
	}

	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
	public Byte getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(Byte checkStatus) {
		this.checkStatus = checkStatus;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public String getGaUserName() {
		return gaUserName;
	}
	public void setGaUserName(String gaUserName) {
		this.gaUserName = gaUserName;
	}
}
