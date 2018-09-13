/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.common.client;

import java.io.File;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: MailDto.java, v 0.1 2018年7月9日 下午1:09:33  Exp $
 */
@Data
public class MailDto {
	
	private String title;
	/** 附件类型  1 兼职老师报名  2  清北  3 非清北 */
	private Integer attachmentType;
	/** 邮件类型 */
	private Integer mailPurpose;
	private String content;
	private File[] attachment;
	private String[] mail;
	private String[] cc;

}
