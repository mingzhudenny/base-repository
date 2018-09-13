/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto;

import java.io.Serializable;

/**
 * <pre>
 * 各个服务调用返回的对象
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ResultDTO.java, v 0.1 2018年4月11日 下午1:14:24  Exp $
 */
public class ResultDTO  implements Serializable{
	
	/**  */
	private static final long serialVersionUID = -6590927422038065102L;

	private Boolean isSuccess;
	
	private String code;
	
	private String message;
	
	private Object data;

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}	 

}
