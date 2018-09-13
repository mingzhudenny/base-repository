/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.parttimeteacher.server.training;

import java.util.Date;

import com.repository.crm.constant.TeacherEnum.TeacherStatus;


/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TeacherTrainingVO.java, v 0.1 2017年4月25日 上午11:48:07  Exp $
 */
public class TeacherTrainingVO {
	
    private Long id;
    
	private String uuid;
	
    private String tcName;

    private String phone;   

    private Date updateDate;//更新时间
    
    private Date createDate;//新增时间

    private String updateDateStart;
    
    private String updateDateEnd; 
    
    private String trainingDate;//培训日期
    
    private String trainingDateStart;//培训日期开始
    
    private String trainingDateEnd;//培训日期结束

    private Integer trainingAccount;//培训账号  查询参数使用
    
    @SuppressWarnings("unused")
	private String account;//列表显示的账号 
    
    private Date interviewPassDate; //面试通过时间
    
    private Integer teacherStatus;//老师状态
    
    private String status;//状态显示
    
    private String orderBy;//排序方式
	
	private int pageIndex;
	
	private int pageNumber;

    
	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getTrainingDateStart() {
		return trainingDateStart;
	}

	public void setTrainingDateStart(String trainingDateStart) {
		this.trainingDateStart = trainingDateStart;
	}

	public String getTrainingDateEnd() {
		return trainingDateEnd;
	}

	public void setTrainingDateEnd(String trainingDateEnd) {
		this.trainingDateEnd = trainingDateEnd;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getTcName() {
		return tcName;
	}

	public void setTcName(String tcName) {
		this.tcName = tcName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateDateStart() {
		return updateDateStart;
	}

	public void setUpdateDateStart(String updateDateStart) {
		this.updateDateStart = updateDateStart;
	}

	public String getUpdateDateEnd() {
		return updateDateEnd;
	}

	public void setUpdateDateEnd(String updateDateEnd) {
		this.updateDateEnd = updateDateEnd;
	}

	public String getTrainingDate() {
		
		return trainingDate+" 14:00";
	}

	public void setTrainingDate(String trainingDate) {
		this.trainingDate = trainingDate;
	}

	public Integer getTrainingAccount() {
		return trainingAccount;
	}

	public void setTrainingAccount(Integer trainingAccount) {
		this.trainingAccount = trainingAccount;
	}

	public String getAccount() {
		
		if(this.getTrainingAccount() == null){
			return null;
		}
		if(this.getTrainingAccount()<10){
			
			return "嗨培训0"+this.getTrainingAccount().toString();
			
		}else{
			
			return "嗨培训"+this.getTrainingAccount().toString();
		}
		
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Date getInterviewPassDate() {
		return interviewPassDate;
	}

	public void setInterviewPassDate(Date interviewPassDate) {
		this.interviewPassDate = interviewPassDate;
	}

	public Integer getTeacherStatus() {
		return teacherStatus;
	}

	public void setTeacherStatus(Integer teacherStatus) {
		this.teacherStatus = teacherStatus;
	}

	public String getStatus() {
		if(this.getTeacherStatus() == null){
			return null;
		}
		if(this.getTeacherStatus().equals(TeacherStatus.FINISH.getValue())){
			return TeacherStatus.FINISH.getName();
			
		}else if(this.getTeacherStatus().equals(TeacherStatus.INTERVIEW.getValue())){
			return TeacherStatus.INTERVIEW.getName();
			
		}else if(this.getTeacherStatus().equals(TeacherStatus.LECTURER_1.getValue())){
			return TeacherStatus.LECTURER_1.getName();
			
		}else if(this.getTeacherStatus().equals(TeacherStatus.LECTURER_2.getValue())){
			return TeacherStatus.LECTURER_2.getName();
			
		}else if(this.getTeacherStatus().equals(TeacherStatus.SECOND_TRAINING1.getValue())){
			return TeacherStatus.SECOND_TRAINING1.getName();
			
		}else if(this.getTeacherStatus().equals(TeacherStatus.TRAIN.getValue())){
			return TeacherStatus.TRAIN.getName();
			
		}else if(this.getTeacherStatus().equals(TeacherStatus.TRASH.getValue())){
			return TeacherStatus.TRASH.getName();
			
		}
		
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
    
    

}
