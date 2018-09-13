package com.repository.crm.Dto.account.server.course;

import java.util.List;

/**
 * 待支付页面查看支付信息vo
 * @author csy
 * @date 2017年3月21日
 */
public class WaitPayVo {
	
	/** cp_pay_request 的  uuid */
	private String payUuid;

    private String buyLength; //购买课时
 
    private Integer courseLevel; //课程级别

    private String money;//购买金额

    private String inActivities;//参与活动

    private String payType;//付费方式
    
    private String payTime;//支付时间
    
    private String createDate;//提交时间	
	 /** 贷款人 */
	private String lender;
	 /** 贷款人手机号码  */
	private String lenderPhone;
	 /** 付费截图  */
	private String payPicture;		
	/** 付费截图图片的url地址*/
	private List<String> payPictureUrl;

	public List<String> getPayPictureUrl() {
		return payPictureUrl;
	}

	public void setPayPictureUrl(List<String> payPictureUrl) {
		this.payPictureUrl = payPictureUrl;
	}

	

	public String getPayUuid() {
		return payUuid;
	}

	public void setPayUuid(String payUuid) {
		this.payUuid = payUuid;
	}

	public String getLender() {
		return lender;
	}

	public void setLender(String lender) {
		this.lender = lender;
	}

	public String getLenderPhone() {
		return lenderPhone;
	}

	public void setLenderPhone(String lenderPhone) {
		this.lenderPhone = lenderPhone;
	}

	public String getPayPicture() {
		return payPicture;
	}

	public void setPayPicture(String payPicture) {
		this.payPicture = payPicture;
	}

	@Override
	public String toString() {
		return "WaitPayVo [buyLength=" + buyLength + ", courseLevel=" + courseLevel + ", money=" + money
				+ ", inActivities=" + inActivities + ", payType=" + payType + ", payTime=" + payTime + ", createDate="
				+ createDate + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getBuyLength() {
		return buyLength;
	}

	public void setBuyLength(String buyLength) {
		this.buyLength = buyLength;
	}

	public Integer getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(Integer courseLevel) {
		this.courseLevel = courseLevel;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getInActivities() {
		return inActivities;
	}

	public void setInActivities(String inActivities) {
		this.inActivities = inActivities;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
}
