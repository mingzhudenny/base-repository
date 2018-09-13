package com.repository.crm.Dto.kpi.server.leads;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

import com.base.utils.validate.PhoneUtil;
import com.base.utils.validate.ValidateUtil;

/**
 * 
 * <pre>
 * 推荐leads 显示列表
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RecommendLeadsVo.java, v 0.1 2018年6月19日 上午10:50:18  Exp $
 */
public class RecommendLeadsVo {

	private String leadsUuid;
	private String leadsName;
	private String leadsPhone;
	private String grade;
	private String subject;
	private String recommendCcName;
	private String recommendCrName;
	private String signUpDate;
	@SuppressWarnings("unused")
	private String phoneLocation;//号码归属地
	private String ccName;
	private String crName;
	private String isManagerCourse;//是否安排排课
	private String isPay;//是否付费
	private String jh;
	private String dy;
	private String keyNum;
	private String payTime;
	private  String introducer;//转介绍人
	/**  付款金额  */
	private BigDecimal payMoney;
	/**  录入人   */
	private String createUser;
	/**  录入leads的老师的名字   */
	private String tcName;
	/**  推荐类型   */
	private String recommendType;
	
	@Override
	public String toString() {
		return "RecommendLeadsVo [leadsUuid=" + leadsUuid + ", leadsName=" + leadsName + ", leadsPhone=" + leadsPhone
				+ ", grade=" + grade + ", subject=" + subject + ", recommendCcName=" + recommendCcName
				+ ", recommendCrName=" + recommendCrName + ", signUpDate=" + signUpDate 
				+ ", isManagerCourse=" + isManagerCourse + ", isPay=" + isPay 
				+ ", getLeadsUuid()=" + getLeadsUuid() + ", getLeadsName()=" + getLeadsName() + ", getLeadsPhone()="
				+ getLeadsPhone() + ", getGrade()=" + getGrade() + ", getSubject()=" + getSubject()
				+ ", getRecommendCcName()=" + getRecommendCcName() + ", getRecommendCrname()=" + getRecommendCrName()
				+ ", getSignUpDate()=" + getSignUpDate() 
				+ ", getIsManagerCourse()=" + getIsManagerCourse() + ", getIsPay()=" + getIsPay() 
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public String getTcName() {
		return tcName;
	}

	public void setTcName(String tcName) {
		this.tcName = tcName;
	}

	public String getCreateUser() {
		if(StringUtils.isNotBlank(this.getTcName())){
			
			return this.getTcName();
		}
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getRecommendType() {
		
		if(StringUtils.isBlank(recommendType)){
			
			return "";
		}
		
		if(recommendType.equals("1")){
			
			return "CR推荐";
			
		}else{
			
			return "合肥老师推荐";
		}
		
	}

	public void setRecommendType(String recommendType) {
		this.recommendType = recommendType;
	}
	

	public BigDecimal getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPhoneLocation() {
		if(ValidateUtil.phoneVerifier(leadsPhone)){
			return PhoneUtil.getMobileNoTrack(leadsPhone);
		}
		return "暂无归属地";
	}
	public void setPhoneLocation(String phoneLocation) {
		this.phoneLocation = phoneLocation;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getRecommendCcName() {
		return recommendCcName;
	}

	public void setRecommendCcName(String recommendCcName) {
		this.recommendCcName = recommendCcName;
	}

	
	public String getRecommendCrName() {
		return recommendCrName;
	}

	public void setRecommendCrName(String recommendCrName) {
		this.recommendCrName = recommendCrName;
	}

	public String getSignUpDate() {
		return signUpDate;
	}
	public void setSignUpDate(String signUpDate) {
		this.signUpDate = signUpDate;
	}
	public String getIsManagerCourse() {
		if(ValidateUtil.isNotEmpty(isManagerCourse)){
			if(isManagerCourse.equals("1")){
				return "已排课";
			}else if(isManagerCourse.equals("0")){
				return "未排课";
			}
		}
		return "未排课";
	}
	public void setIsManagerCourse(String isManagerCourse) {
		this.isManagerCourse = isManagerCourse;
	}
	public String getIsPay() {
		if(null == isPay && !(("1").equals(isPay))){
			return "未支付";
		}else if(("1").equals(isPay)){
			return "已支付";
		}
		return "未支付";
	}
	public void setIsPay(String isPay) {
		this.isPay = isPay;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getCrName() {
		return crName;
	}
	public void setCrName(String crName) {
		this.crName = crName;
	}
	public String getJh() {
		return jh;
	}
	public void setJh(String jh) {
		this.jh = jh;
	}
	public String getDy() {
		return dy;
	}
	public void setDy(String dy) {
		this.dy = dy;
	}
	public String getKeyNum() {
		return keyNum;
	}
	public void setKeyNum(String keyNum) {
		this.keyNum = keyNum;
	}

	public String getIntroducer() {
		return introducer;
	}

	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}
}
