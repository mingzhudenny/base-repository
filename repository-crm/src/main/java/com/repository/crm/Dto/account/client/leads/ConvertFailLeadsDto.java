/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.leads;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 转换失败的leads 查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ConvertFailLeadsDto.java, v 0.1 2018年6月9日 下午4:00:27  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ConvertFailLeadsDto  extends BaseDto{
	
	/** 学生的姓名或者手机号码  */
	private String stuNameOrPhone;

}
