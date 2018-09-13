/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.Date;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyUpgradeReportDTO.java, v 0.1 2018年8月22日 下午5:47:20  Exp $
 */
@Data
public class RyUpgradeReportDTO {
	
	private Integer id;

    private String leadsUuid;
    
    private String testPaperName;
    
    private Date createDate;
    
    private String reportRecordId;
    
    private String reportUrl;

}
