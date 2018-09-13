package com.repository.crm.Dto.account.server.course;

import com.base.utils.validate.ValidateUtil;

/**
 * 待付费学员的信息
 * @author csy
 *
 */
public class WaitPayLeadsInfoVo {

	private String uuid;//leadsUuid
	private String name;//姓名
	private String phone;//电话号码
	private String grade;//年级
	private String subject;//科目
	private String courseOrderUuid;//课程Uuid
	private String payOrderUuid;//支付订单uuid
	private String isCheck;//是否审核0：待审核 2：审核拒绝3：没有提交付费申请
	private String refuseCause;//拒绝原因
	private Integer orderType;//订单类型
	private String orderTypeDes;//订单类型描述

	public String getOrderTypeDes() {
		if(orderType != null){
			if(orderType==0){
				orderTypeDes = "普通课程订单";
			}else if(orderType==1){
				orderTypeDes = "换科换老师课程订单";
			}else if(orderType==2){
				orderTypeDes = "扩科课程订单";
			}
		}
		return orderTypeDes;
	}
	public void setOrderTypeDes(String orderTypeDes) {
		this.orderTypeDes = orderTypeDes;
	}
	public Integer getOrderType() {
		return orderType;
	}
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
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
	public String getCourseOrderUuid() {
		return courseOrderUuid;
	}
	public void setCourseOrderUuid(String courseOrderUuid) {
		this.courseOrderUuid = courseOrderUuid;
	}
	public String getIsCheck() {
		String defaultValue = "3";//没有提交付费申请
		if(ValidateUtil.isNotEmpty(isCheck)){
			return isCheck;
		}
		return defaultValue;
	}
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	public String getPayOrderUuid() {
		return payOrderUuid;
	}
	public void setPayOrderUuid(String payOrderUuid) {
		this.payOrderUuid = payOrderUuid;
	}
	public String getRefuseCause() {
		return refuseCause;
	}
	public void setRefuseCause(String refuseCause) {
		this.refuseCause = refuseCause;
	}
}
