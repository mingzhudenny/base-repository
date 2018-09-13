/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.io.Serializable;

import lombok.Data;

/**
 * <pre>
 * 教材版本
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: BookVersionInfo.java, v 0.1 2018年7月24日 下午7:17:03  Exp $
 */
@Data
public class BookVersionInfo implements Serializable{
	
	
	/**  */
	private static final long serialVersionUID = -2956659433719127639L;
	/** 教材版本ID*/
	private Integer bookVersionId;
	/** 教材版本名称 */
	private String bookVersionName;

}
