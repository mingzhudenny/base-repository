package com.repository.crm.Dto.account.client.leads;

import java.util.Date;

/**
 * tmk名单对象
 * @author ywj
 *
 */
public class TmkListTemplate implements java.io.Serializable{
	
	/**  */
	private static final long serialVersionUID = -4185177111889083810L;
	private String uuid;//学生的UUID
	private String channel;//渠道
	private String name;
	private String phone;
	private String grade;
	private String subject;
	private String remark;
	private String registTime;//报名时间
	private String password;
	private String createUserUuid;
	private Date createDate;

	
	
	

	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public TmkListTemplate() {}
	public TmkListTemplate(String channel, String name, String phone, String grade, String subject, String remark,String registTime,String userUuid) {
		this.channel = channel;
		this.name = name;
		this.phone = phone;
		this.grade = grade;
		this.subject = subject;
		this.remark=remark;
		this.registTime = registTime;
		this.createUserUuid=userUuid;
	}	
	
	public String getCreateUserUuid() {
		return createUserUuid;
	}
	public void setCreateUserUuid(String createUserUuid) {
		this.createUserUuid = createUserUuid;
	}
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getRegistTime() {
		return registTime;
	}
	public void setRegistTime(String registTime) {
		this.registTime = registTime;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
