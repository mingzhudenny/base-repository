/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import lombok.Data;

/**
 * <pre>
 * GetCoursesAssessementHistory 接口返回的数据
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: GetCoursesAssessementHistory.java, v 0.1 2018年8月3日 下午2:58:51  Exp $
 */
@Data
public class GetCoursesAssessementHistory {
	
	/**  时间，格式yyyy/MM/dd */
	private String Date;
	/** 学科当天之前（含当天）能力分值，精确小数点后两位  */
	private Double Score;

}
