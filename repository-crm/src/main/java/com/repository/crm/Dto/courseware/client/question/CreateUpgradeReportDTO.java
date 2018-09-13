/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 生成提分报告的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CreateUpgradeReportDTO.java, v 0.1 2018年8月1日 下午5:22:48  Exp $
 */
@Data
public class CreateUpgradeReportDTO {
	
	/** leadsUuid */
	private String leadsUuid;
	/** 客户平台的用户标识 */
	private String userCode;
	/** 试卷名称（测评名称）  */
	private String testPaperName;
	/** 试卷类型Id  */
	private Integer testPaperTypeId;
	/** 年级  */
	private String grade;
	/** 年级Id  */
	private Integer gradeId;
	/** 地区Id ,传入省份  */
	private Integer locationId;
	/** 学生姓名，不能超过6个字符  */
	private String studentName;
	/** 考生号，不能超过50个字符，不能重复，每个学生唯一  */
	private String studentCode;
	/** 学校名称  */
	private String schoolName;
	/** 班级名称  */
	private String className;
	/** 提分策报告Logo，为空则使用默认logo，
	 * 支持jpg、png、jpeg格式，大小小于1M，
	 * （进行Base64编码后传递，此参数不参与签名）  */
	private Byte[] reportLogo;
	/** 试卷信息  */
	private List<TestPaperInfo> testPaperList;


}
