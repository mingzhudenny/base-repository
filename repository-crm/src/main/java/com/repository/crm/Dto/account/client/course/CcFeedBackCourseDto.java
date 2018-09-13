/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.course;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * cc待反馈查询条件
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CcFeedBackCourseDto.java, v 0.1 2018年5月22日 下午1:14:26  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CcFeedBackCourseDto extends BaseDto {		

	private String userUuid;
	private String nameOrPhone;
	

}
