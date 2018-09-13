package com.repository.crm.Dto.kpi.server.student;

import lombok.Data;

@Data
public class StudentByStatusServerDto {

	private String leadsUuid;
	private String leadsName;
	private String leadsPhone;
	private String grade;
	private String subject;
	private String ccName;
	private String crName;
	private String crTeam;
	private String handOutRemark;
	private String handOutTime;
	private String ccTeam;
	private String keyPoint;
}
