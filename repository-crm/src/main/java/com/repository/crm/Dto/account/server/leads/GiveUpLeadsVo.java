package com.repository.crm.Dto.account.server.leads;

import java.util.Date;

/**
 * 放弃的藏经阁的leads要展示的数据
 * @author csy
 * @date 2017年3月1日
 */
public class GiveUpLeadsVo {

	private String uuid;//leadsuuid
	private String name;//leads姓名
	private String phone;//leads 电话号码
	private String channelName;//渠道名称
	private Date giveUpTime;//放弃时间
	private String giveUpDes;//放弃原因
	private String giveUpRemark;//放弃备注
	private Date signUpDate;//报名时间
	private String ccUuid;
	private String userName;//前销售
	//leads创建时间
	private String leadsCreateDate;
	
	public String getCcUuid() {
		return ccUuid;
	}
	public void setCcUuid(String ccUuid) {
		this.ccUuid = ccUuid;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getGiveUpTime() {
		return giveUpTime;
	}
	public void setGiveUpTime(Date giveUpTime) {
		this.giveUpTime = giveUpTime;
	}
	public String getGiveUpDes() {
		return giveUpDes;
	}
	public void setGiveUpDes(String giveUpDes) {
		this.giveUpDes = giveUpDes;
	}
	public String getGiveUpRemark() {
		return giveUpRemark;
	}
	public void setGiveUpRemark(String giveUpRemark) {
		this.giveUpRemark = giveUpRemark;
	}
	public Date getSignUpDate() {
		return signUpDate;
	}
	public void setSignUpDate(Date signUpDate) {
		this.signUpDate = signUpDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLeadsCreateDate() {
		return leadsCreateDate;
	}

	public void setLeadsCreateDate(String leadsCreateDate) {
		this.leadsCreateDate = leadsCreateDate;
	}
}
