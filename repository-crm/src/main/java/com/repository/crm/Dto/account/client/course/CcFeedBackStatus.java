/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.course;

import lombok.Data;

/**
 * <pre>
 * cc待反馈更新反馈状态
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CcFeedBackCourseDto.java, v 0.1 2018年5月22日 下午1:14:26  Exp $
 */
@Data
public class CcFeedBackStatus  {	

	
	private String courseOrderUuid;	 
	private Integer feedbackStatus;
	private String feedbackDes;
	

}
