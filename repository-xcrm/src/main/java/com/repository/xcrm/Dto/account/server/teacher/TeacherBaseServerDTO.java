package com.repository.xcrm.Dto.account.server.teacher;

import lombok.Data;

/**
 * 获取老师的基本业务参数
 *
 * @author csy
 * @time  2018年4月17日 下午8:08:07
 */
@Data
public class TeacherBaseServerDTO {
	/**
	 * 老师的uuid
	 */
	private String teacherUuid;
	/**
	 * 老师姓名
	 */
	private String teacheName;
	/**
	 * 老师的电话号码
	 */
	private String teacherPhone;
	/**
	 * 科目
	 */
	private String subject;
}
