package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 获取没有满班的测评课信息
 *
 * @author csy
 * @time  2018年4月27日 下午10:13:27
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryNoFullTestCourseClientDTO extends BaseDto{

	/**
	 * 老师姓名
	 */
	private String teacherName;
	/**
	 * 科目
	 */
	private String subject;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 课程开始日期
	 */
	private String courseStartDate;
	/**
	 * 课程结束日期
	 */
	private String courseEndDate;
}
