package com.repository.threeparty.constant;

import lombok.Data;

/**
 * classin基本的返回值 Data,errno,error
 *
 * @author csy
 * @time  2018年5月8日 上午10:43:53
 */
@Data
public class ClassInBaseResponseParams {

	/**
	 * 返回值
	 */
	private String Data;
	/**
	 * 返回状态码
	 */
	private String errno;
	/**
	 * 返回码说明
	 */
	private String error;
}
