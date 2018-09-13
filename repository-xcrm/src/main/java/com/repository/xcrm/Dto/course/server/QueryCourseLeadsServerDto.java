package com.repository.xcrm.Dto.course.server;

import lombok.Data;

/**
 * 课程关联leads信息
 *
 * @author csy
 * @time  2018年4月28日 上午9:59:22
 */
@Data
public class QueryCourseLeadsServerDto {

	/**
	 * 课程uuid
	 */
	private String courseUuid;
	/**
	 * leadsUuid
	 */
	private String leadsUuid;
	/**
	 * leads姓名
	 */
	private String leadsName;
	/**
	 * leads所属销售
	 */
	private String saleName;
}
