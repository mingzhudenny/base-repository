package com.repository.crm.Dto.common.server.sysEnum;

import lombok.Data;

/**
 * 枚举基本的参数
 *
 * @author csy
 * @time  2018年4月18日 下午1:31:16
 */
@Data
public class SysEnumBaseServerDto {

	/**
	 * 枚举uuid
	 */
	private String sysEnumId;
	/**
	 * 枚举内容
	 */
	private String sysEnumName;
}
