package com.repository.xcrm.Dto.course.server;

import java.util.List;

import lombok.Data;

@Data
public class QueryNoFullTestCourseServerDto {

	/**
	 * 课程uuid
	 */
	private String courseUuid;
	/**
	 * 老师uuid
	 */
	private String teacherUuid;
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
	 * 上课日期
	 */
	private String courseDate;
	/**
	 * 上课开始时间
	 */
	private String startTime;
	/**
	 * 上课结束时间
	 */
	private String endTime;
	
	/**
	 * 关联学生的信息
	 */
	private List<QueryCourseLeadsServerDto> queryCourseLeadsServerDtos;
}
