/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.server.leads;

import com.repository.crm.Po.Leads;
import com.repository.crm.Po.LeadsGrade;
import com.repository.crm.Po.LeadsHandoutRemark;

import lombok.Data;

/**
 * <pre>
 * 移交表显示
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: HandOutRemarkVo.java, v 0.1 2018年5月24日 上午10:20:11  Exp $
 */
@Data
public class HandOutRemarkVo {	
	
	private LeadsGrade leadsGrade;	
	
	private LeadsHandoutRemark leadsHandoutRemark;
	
	private Leads leads;	

}
