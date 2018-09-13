package com.repository.crm.Dto.kpi.client.course;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 客户端精品课报表传递数据
 *
 * @author csy
 * @time  2018年3月26日 下午1:34:17
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class OutiqueCourseClientDto extends BaseDto{

	/**
	 * 学生姓名或者电话号码
	 */
	private String leadsParam;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 科目
	 */
	private String subject;
	/**
	 * 课程类型
	 */
	private String courseType;
}
