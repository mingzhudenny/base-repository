package com.repository.xcrm.Dto.remark.client;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 新增跟进备注参数
 *
 * @author csy
 * @time  2018年4月17日 下午5:57:34
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class SaveFollowRemarkClientDTO extends BaseDto{
	
	/**
	 * 备注的uuid
	 */
	private String remarkUuid;
	/**
	 * leadsuuid
	 */
	private String leadsUuid;
	/**
	 * 备注类型
	 */
	private Integer remarkType;
	/**
	 * 备注内容
	 */
	private String followRemark;
}
