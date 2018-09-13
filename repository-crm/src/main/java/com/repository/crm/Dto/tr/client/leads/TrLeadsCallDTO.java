/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.tr.client.leads;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 天润回访查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TrBackCallParams.java, v 0.1 2017年11月30日 下午3:09:15  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class TrLeadsCallDTO extends BaseDto{
	

	/** 分配时间开始  */
	private String assignTimeStart;
	/** 分配时间结束  */
	private String assignTimeEnd;
	/** 报名时间开始  */
	private String registTimeStart;
	/** 报名时间结束 */
	private String registTimeEnd;	
	

}
