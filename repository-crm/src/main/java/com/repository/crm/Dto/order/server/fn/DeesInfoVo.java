package com.repository.crm.Dto.order.server.fn;

import java.math.BigDecimal;

import com.base.utils.validate.ValidateUtil;
import com.repository.crm.constant.IsRefund;
import com.repository.crm.constant.PayStatusType;
import com.repository.crm.constant.PayStyleType;

/**
 * 业绩统计的时候要展示的数据vo
 * @author csy
 * @date 2017年3月11日
 */
public class DeesInfoVo {
    
	private String payUuid;//支付请求订单uuid
	private String payNo;//支付订单号
	private String leadsUuid;//leadsuuid
	private String leadsName;//leads姓名
	private String leadsPhone;//leads电话号码
	private String grade;//年级
	private String courseHour;//购买课时
	private String money;//支付金额
	private String submitter;//订单提交人 所属销售
	private String teamName;//订单提交人所属团队
	private String payType;//支付方式
	private String payTime;//支付时间
	private String checkTime;//审核时间
	private String checkUser;//审核人
	private String promotionCode;
	private String inActivity;
	private String payRemark;//付费备注
	private String type;
	private String length;
	private String giveLength;//贈送課時
	private Double sumLength;//總課時
	/**
	 * 课时包信息
	 */
	private String coursePriceInfo;
	/** 是否退费 */
	 private Byte isPay;
	
	private String isPayDesc;	
	/** 销售类型 */
	private String saleType;
	
	private Integer isRefund;//退费 0.否 1.是
	 
	@SuppressWarnings("unused")
	private String isRefundDesc;//退费 0.否 1.是
	/** 退费金额 */
	private BigDecimal refundAmount;
	
	
	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Integer getIsRefund() {
		return isRefund;
	}

	public void setIsRefund(Integer isRefund) {
		this.isRefund = isRefund;
	}

	public String getIsRefundDesc() {
		
		if(this.getIsRefund() == null){
			
			return null;
		}
		if(this.getIsRefund()>0){
			
			return IsRefund.REFUND.getName();
			
		}else{
			
			return IsRefund.NO_REFUND.getName();
			
		}
		
	}

	public void setIsRefundDesc(String isRefundDesc) {
		this.isRefundDesc = isRefundDesc;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public String getInActivity() {
		return inActivity;
	}

	public void setInActivity(String inActivity) {
		this.inActivity = inActivity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public Byte getIsPay() {
		return isPay;
	}

	public void setIsPay(Byte isPay) {
		this.isPay = isPay;
	}

	public String getIsPayDesc() {
		
		if(this.getIsPay() == null){
			
			return null;
		}
		if(this.getIsPay().equals(PayStatusType.WAITCHECK.getValue())){
			
			return PayStatusType.WAITCHECK.getName();
			
		}else if(this.getIsPay().equals(PayStatusType.SUCCESS.getValue())){
			
			return PayStatusType.SUCCESS.getName();
			
		}else if(this.getIsPay().equals(PayStatusType.FAIL.getValue())){
			
			return PayStatusType.FAIL.getName();
			
		}
		return isPayDesc;
	}

	public void setIsPayDesc(String isPayDesc) {
		this.isPayDesc = isPayDesc;
	}

	public String getGiveLength() {
		if(!ValidateUtil.isNotEmpty(giveLength)){
			giveLength = "0";
		}
		return giveLength;
	}

	public void setGiveLength(String giveLength) {
		this.giveLength = giveLength;
	}

	public Double getSumLength() {
		if(!ValidateUtil.isNotEmpty(courseHour)){
			courseHour = "0";
		}
		if(!ValidateUtil.isNotEmpty(giveLength)){
			giveLength = "0";
		}
		sumLength = Double.valueOf(courseHour)+Double.valueOf(giveLength);
		return sumLength;
	}

	public void setSumLength(Double sumLength) {
		this.sumLength = sumLength;
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
	public String getPayRemark() {
		payRemark = "";
		if(ValidateUtil.isNotEmpty(promotionCode)){
			payRemark = "优惠码:"+promotionCode;
		}else{
			payRemark = "优惠码:无";
		}
		if(ValidateUtil.isNotEmpty(inActivity)){
			payRemark += ";参与活动:"+inActivity;
		}else{
			payRemark += ";参与活动:无";
		}
		return payRemark;
	}
	public void setPayRemark(String payRemark) {
		this.payRemark = payRemark;
	}
	public String getPayUuid() {
		return payUuid;
	}
	public void setPayUuid(String payUuid) {
		this.payUuid = payUuid;
	}
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getLeadsUuid() {
		return leadsUuid;
	}
	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
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
	public String getCourseHour() {
		return courseHour;
	}
	public void setCourseHour(String courseHour) {
		this.courseHour = courseHour;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getSubmitter() {
		return submitter;
	}
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPayType() {
		if(!ValidateUtil.isNotEmpty(payType)){
			return PayStyleType.WEBPAY.getValue();
		}
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getCheckUser() {
		return checkUser;
	}
	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

}
