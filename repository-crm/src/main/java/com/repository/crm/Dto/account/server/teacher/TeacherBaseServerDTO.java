package com.repository.crm.Dto.account.server.teacher;

import lombok.Data;

/**
 * 老师的基本信息
 *
 * @author csy
 * @time  2018年5月22日 下午3:43:22
 */
@Data
public class TeacherBaseServerDTO {

	/**
	 * 老师uuid
	 */
	private String teacheruuid;
	/**
	 * 老师姓名
	 */
	private String teacherName;
	/**
	 * 老师电话号码
	 */
	private String teacherPhone;
}
