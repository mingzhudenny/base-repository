package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 新增测评课业务功能传递参数
 *
 * @author csy
 * @time  2018年4月27日 上午11:43:41
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AddTestCourseClientDTO extends BaseDto{

	/**
	 * 老师uuid
	 */
	private String teacherUuid;
	/**
	 * 课程日期
	 */
	private String courseDate;
	/**
	 * 课程开始时间
	 */
	private String startTime;
	/**
	 * 课程结束时间
	 */
	private String endTime;
	/**
	 * 课程类型
	 */
	private Integer type;
}
