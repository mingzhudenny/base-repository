/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.io.Serializable;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyUserSessiion.java, v 0.1 2018年7月26日 下午2:52:30  Exp $
 */
@Data
public class RyUserSessiion implements Serializable{
	
	 /**  */
	private static final long serialVersionUID = -3608941272423813473L;

	private String SessionId;
	 
	 private Integer ExpireAt;
	 
	 private String UserIndicateId;
	

}
