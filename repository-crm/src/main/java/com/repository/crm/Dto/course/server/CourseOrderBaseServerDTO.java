package com.repository.crm.Dto.course.server;

import lombok.Data;

/**
 * 
 * 课程订单基本信息
 * @author csy
 * @time  2018年5月22日 下午4:55:44
 */
@Data
public class CourseOrderBaseServerDTO {

	/**
	 * 课程订单uui
	 */
	private String uuid;
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
	 * 老师uuid
	 */
	private String teacherUuid;
	/**
	 * 老师姓名
	 */
	private String teacherName;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 科目
	 */
	private String subject;
	
}
 