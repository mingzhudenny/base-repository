package com.repository.crm.Dto.order.server.fn;

import java.util.Date;

/**
 * 待审核子单的要展示的vo
 * @author csy
 * @date 2017年3月31日
 */
public class WaitCheckChildOrderVO {
	
	/**
	 * 支付请求的订单号
	 */
   private String payUuid;
	/**
	 * 子订单号
	 */
	private String childOrderNo;
	/**
	 * leadsuuid
	 */
	private String leadsUuid;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 电话号码
	 */
	private String phone;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 支付金额
	 */
	private Double money;
	
	/**
	 * 提交人
	 */
	private String userName;
	/**
	 * 提交时间
	 */
	private Date createDate;
	
	@Override
	public String toString() {
		return "WaitCheckChildOrderVO [payUuid=" + payUuid + ", childOrderNo=" + childOrderNo + ", leadsUuid="
				+ leadsUuid + ", name=" + name + ", phone=" + phone + ", grade=" + grade + ", money=" + money
				+ ", userName=" + userName + ", createDate=" + createDate + ", getPayUuid()=" + getPayUuid()
				+ ", getChildOrderNo()=" + getChildOrderNo() + ", getLeadsUuid()=" + getLeadsUuid() + ", getName()="
				+ getName() + ", getPhone()=" + getPhone() + ", getGrade()=" + getGrade() + ", getMoney()=" + getMoney()
				+ ", getUserName()=" + getUserName() + ", getCreateDate()=" + getCreateDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getPayUuid() {
		return payUuid;
	}
	public void setPayUuid(String payUuid) {
		this.payUuid = payUuid;
	}
	public String getChildOrderNo() {
		return childOrderNo;
	}
	public void setChildOrderNo(String childOrderNo) {
		this.childOrderNo = childOrderNo;
	}
	public String getLeadsUuid() {
		return leadsUuid;
	}
	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
