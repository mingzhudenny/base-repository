package com.repository.crm.Dto.account.client.course;

/**
 * 
 * <pre>
 * 提交付费申请
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: PayRequestDTO.java, v 0.1 2018年4月8日 下午3:32:14  Exp $
 */
public class PayRequestDTO {
	
	
	private String leadsUuid;
	
	private String payOrderUuid;
	
	private String courseOrderUuid;
	
	private String coursePriceType;
	
	private String coursePriceActivityType;
	
	private String buyLength;
	
	private String promotionCode;
	
	private String inActivities;	
	
	private String payType;
	
	private String bank;
	
	private String payTime;
	
	private String giveLength;
	
	 /** 贷款人 */
	private String lender;
	 /** 贷款人手机号码  */
	private String lenderPhone;
	 /** 付费截图  */
	private String payPicture;	
	
	private String userUuid;
	
	private String teamUuid;	

	public String getTeamUuid() {
		return teamUuid;
	}

	public void setTeamUuid(String teamUuid) {
		this.teamUuid = teamUuid;
	}

	public String getUserUuid() {
		return userUuid;
	}

	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
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

	public String getLeadsUuid() {
		return leadsUuid;
	}

	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
	}

	public String getPayOrderUuid() {
		return payOrderUuid;
	}

	public void setPayOrderUuid(String payOrderUuid) {
		this.payOrderUuid = payOrderUuid;
	}

	public String getCourseOrderUuid() {
		return courseOrderUuid;
	}

	public void setCourseOrderUuid(String courseOrderUuid) {
		this.courseOrderUuid = courseOrderUuid;
	}

	public String getCoursePriceType() {
		return coursePriceType;
	}

	public void setCoursePriceType(String coursePriceType) {
		this.coursePriceType = coursePriceType;
	}

	public String getCoursePriceActivityType() {
		return coursePriceActivityType;
	}

	public void setCoursePriceActivityType(String coursePriceActivityType) {
		this.coursePriceActivityType = coursePriceActivityType;
	}

	public String getBuyLength() {
		return buyLength;
	}

	public void setBuyLength(String buyLength) {
		this.buyLength = buyLength;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
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

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getGiveLength() {
		return giveLength;
	}

	public void setGiveLength(String giveLength) {
		this.giveLength = giveLength;
	}
	
	
	
	
	

}
