/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import lombok.Data;

/**
 * <pre>
 * 地区
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: LocationInfo.java, v 0.1 2018年7月24日 下午7:46:30  Exp $
 */
@Data
public class LocationInfo {

	/** 地区ID */
	private Integer LocationId;
	/** 地区名称 */
	private String LocationName;
	/** 排序字段 */
	private Integer OrderIndex;

}
