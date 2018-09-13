package com.repository.crm.Dto.common.client;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询基本的枚举参数
 *
 * @author csy
 * @time  2018年4月18日 下午1:28:42
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QuerySysEnumBaseClientDTO extends BaseDto{

	/**
	 * 枚举类型
	 */
	private Integer sysEnumType;
}
