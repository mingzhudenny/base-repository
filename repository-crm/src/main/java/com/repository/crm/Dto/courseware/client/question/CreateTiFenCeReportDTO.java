/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

/**
 * <pre>
 * 提交给软云的生成提分报告的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CreateTiFenCeReportDTO.java, v 0.1 2018年8月1日 下午5:22:48  Exp $
 */

public class CreateTiFenCeReportDTO {
	
	/** 客户平台的用户标识 */
	private String userCode;
	/** 试卷名称（测评名称）  */
	private String juanZiName;
	/** 试卷类型Id  */
	private Integer juanZiTypeId;
	/** 年级Id  */
	private Integer gradeId;
	/** 地区Id ,传入省份  */
	private Integer locationId;
	/** 提分策报告Logo，为空则使用默认logo，
	 * 支持jpg、png、jpeg格式，大小小于1M，
	 * （进行Base64编码后传递，此参数不参与签名）  */
	private Byte[] reportLogo;
	/** 题目信息  */
	private List<JuanZiQuestionInfo> juanZiQuestionInfos;
	/** 学生及做题信息   */
	private List<StudentScoreInfo> studentScores;
	/** 创建人的uuid */
	private String createUserId;
	
	
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getJuanZiName() {
		return juanZiName;
	}
	public void setJuanZiName(String juanZiName) {
		this.juanZiName = juanZiName;
	}
	public Integer getJuanZiTypeId() {
		return juanZiTypeId;
	}
	public void setJuanZiTypeId(Integer juanZiTypeId) {
		this.juanZiTypeId = juanZiTypeId;
	}
	public Integer getGradeId() {
		return gradeId;
	}
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public Byte[] getReportLogo() {
		return reportLogo;
	}
	public void setReportLogo(Byte[] reportLogo) {
		this.reportLogo = reportLogo;
	}
	public List<JuanZiQuestionInfo> getJuanZiQuestionInfos() {
		return juanZiQuestionInfos;
	}
	public void setJuanZiQuestionInfos(List<JuanZiQuestionInfo> juanZiQuestionInfos) {
		this.juanZiQuestionInfos = juanZiQuestionInfos;
	}
	public List<StudentScoreInfo> getStudentScores() {
		return studentScores;
	}
	public void setStudentScores(List<StudentScoreInfo> studentScores) {
		this.studentScores = studentScores;
	}	
	

}
