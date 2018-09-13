package com.repository.crm.Dto.kpi.server.course;

import lombok.Data;

/**
 * 老师学生对应dto
 *
 * @author csy
 * @time  2018年3月27日 下午5:22:26
 */
@Data
public class LeadsTeacherDto {

	private String leadsUuid;
	private String leadsName;
	private String teacherUuid;
	private String teacherName;
	private String subject;
}
