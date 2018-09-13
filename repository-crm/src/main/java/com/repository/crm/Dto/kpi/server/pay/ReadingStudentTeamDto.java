package com.repository.crm.Dto.kpi.server.pay;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 在读人数团队分布dto
 *
 * @author csy
 * @time  2018年3月27日 上午10:57:21
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ReadingStudentTeamDto{

	/**
	 * 团队uuid
	 */
	private String teamUuid;
	/**
	 * 团队名称
	 */
	private String teamName;
	/**
	 * 团队续费人数
	 */
	private Integer renewPayNum;
	/**
	 * 团队在读人数
	 */
	private Integer readingStudentNum;
	/**
	 * 续费率 (readingStudentNum/renewPayNum)
	 */
	private String renewPayRate;
}
