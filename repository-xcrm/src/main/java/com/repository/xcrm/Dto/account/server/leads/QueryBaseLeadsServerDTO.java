package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;

/**
 * 获取leads基本信息
 *
 * @author csy
 * @time  2018年5月7日 上午10:52:24
 */
@Data
public class QueryBaseLeadsServerDTO {

	/**
	 * leadsuuid
	 */
	private String leadsUuid;
	/**
	 * leads姓名
	 */
	private String leadsName;
	/**
	 * leads电话号码
	 */
	private String leadsPhone;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 科目
	 */
	private String subject;
}
