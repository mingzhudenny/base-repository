package com.repository.crm.Dto.account.server.course;

import java.math.BigDecimal;

import com.base.utils.validate.ValidateUtil;


/**
 * cc待排课vo
 * @author csy
 * @date 2017年3月8日
 */
public class WaitManagerCourseVo {
 
    private String uuid; //预约课程的uuid
    private String leadsUuid;//leads uuid
    private String requestUuid;//课程请求uuid
	private String name; //姓名
	private String phone; //电话号码
	private String grade;//年级
	
	private Byte type;//课程类型
	private BigDecimal length;//课程时长
    private String subject;//科目
	
	private String requestStatus;//课程请求的状态
	private String requestRefusecContent;//课程请求拒绝原因
	
	public String getRequestUuid() {
		return requestUuid;
	}
	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	public Byte getType() {
		return type;
	}
	public void setType(Byte type) {
		this.type = type;
	}
	public BigDecimal getLength() {
		return length;
	}
	public void setLength(BigDecimal length) {
		this.length = length;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getRequestStatus() {
		
		if(requestStatus == null){
			
			return "3";
		}
		if(!ValidateUtil.isNotEmpty(requestStatus)||!ValidateUtil.isNotStringNull(requestStatus)){
			return "3";
		}
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getRequestRefusecContent() {
		return requestRefusecContent;
	}
	public void setRequestRefusecContent(String requestRefusecContent) {
		this.requestRefusecContent = requestRefusecContent;
	}
	
}
