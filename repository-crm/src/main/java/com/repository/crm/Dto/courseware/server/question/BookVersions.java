/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 教材版本集合
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: BookVersions.java, v 0.1 2018年7月24日 下午7:16:45  Exp $
 */
@Data
public class BookVersions implements Serializable{
	
	/**  */
	private static final long serialVersionUID = -2423227690566351271L;
	private List<BookVersionInfo> BookVersions;

}
