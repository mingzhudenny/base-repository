/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.server.student;

import java.util.Date;

import lombok.Data;

/**
 * <pre>
 * CR新签约学生
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CrNewSignedStudentVO.java, v 0.1 2018年4月2日 下午2:57:13  Exp $
 */
@Data
public class CrNewSignedStudentVO {
	
	
	private String leadsUuid;
	
	private String leadsName;
	
	private String leadsPhone;
	
	private String grade;	
	
	private String subject;
	
	private String province;
	
    private String city;

    private String district;  
    /** 签约时间 */ 
    private Date signDate;    
    /** 跟进提醒  */
    private String followUpReminding;
    /** 跟进记录  */
    private String followUpDesc;
    /** 停课提醒 */
    private String stopCourseReminding;
    /** 负责时间  */
    private Date repositionDate;
    /** 移交信息 */
    private String transferInfo;	
     /** 跟进时间   */
    private Date followUpDate;
    /** 最后一次上课的时间  */
    private Date courseDate;
	

}
