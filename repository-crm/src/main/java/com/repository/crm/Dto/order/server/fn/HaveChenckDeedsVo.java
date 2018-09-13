package com.repository.crm.Dto.order.server.fn;

import java.util.List;

import com.base.utils.validate.ValidateUtil;
import com.repository.crm.constant.PayStyleType;



/**
 * 已经审核的业绩订单信息
 * @author csy
 * @date 2017年3月10日
 */
public class HaveChenckDeedsVo {

	private String payUuid;//支付请求订单uuid
	private String payNo;//支付订单号
	private String leadsUuid;//leadsuuid
	private String leadsName;//leads姓名
	private String leadsPhone;//leads电话号码
	private String teamName;//签单时的团队
	private String grade;//年级
	private String courseHour;//购买课时
	private String money;//支付金额
	private String submitter;//订单提交人
	private String submitTime;//订单提交时间
	private String checkStatus;//审核状态
	private String checkTime;//审核时间
	private String checkUser;//审核人
	private String promotionCode;
	private String inActivity;
	private String payRemark;//付费备注
	private String type;
	private String length;
	private String payType;//支付方式
	private String giveLength;//贈送課時
	private Double sumLength;//總課時
	private Integer receiptStatus;//发票状态
	private String invoiceNum;
    /** 贷款人 */
	private String lender;
	 /** 贷款人手机号码  */
	private String lenderPhone;
	 /** 付费截图  */
	private String payPicture;
	/** 销售类型 */
	private String saleType;
	/** 付费截图图片的url地址*/
	private List<String> payPictureUrl;
	
	
	public List<String> getPayPictureUrl() {
		return payPictureUrl;
	}
	public void setPayPictureUrl(List<String> payPictureUrl) {
		this.payPictureUrl = payPictureUrl;
	}
	public String getSaleType() {
		return saleType;
	}
	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}
	public String getPayPicture() {
		return payPicture;
	}
	public void setPayPicture(String payPicture) {
		this.payPicture = payPicture;
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

	/**
	 * 课时包信息
	 */
	private String coursePriceInfo;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
	public String getPayType() {
		if(ValidateUtil.isNotEmpty(payType)){
			if(payType.equals(PayStyleType.BANK.getValue())){
				return PayStyleType.BANK.getName();
			}else if(payType.equals(PayStyleType.WEBPAY.getValue())){
				return PayStyleType.WEBPAY.getName();
			}else if(payType.equals(PayStyleType.TAOBAO.getValue())){
				return PayStyleType.TAOBAO.getName();
			}else if(payType.equals(PayStyleType.WEINXIN.getValue())){
				return PayStyleType.WEINXIN.getName();
			}else if(payType.equals(PayStyleType.ALIPAY.getValue())){
				return PayStyleType.ALIPAY.getName();
			}else if(payType.equals(PayStyleType.PINGPP.getValue())){
				return PayStyleType.PINGPP.getName();
			}else if(payType.equals(PayStyleType.BAIDUPAY.getValue())){
				return PayStyleType.BAIDUPAY.getName();
			}else if (payType.equals(PayStyleType.LOVEHAIMI.getValue())){
				return PayStyleType.LOVEHAIMI.getName();
			}else if (payType.equals(PayStyleType.KUSTAGING.getValue())){
				return PayStyleType.KUSTAGING.getName();
			}
		}
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
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
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getCheckUser() {
		return checkUser;
	}
	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getReceiptStatus() {
       if (receiptStatus !=null){
		   return receiptStatus==1?"已开":"未开";
	   }else {
       	 return "未开";
	   }
	}

	public void setReceiptStatus(Integer receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
}
