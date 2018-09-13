package com.repository.crm.Dto.kpi.server.pay;

import lombok.Data;

/**
 * 团队续费kpi报表参数
 *
 * @author csy
 * @time  2018年3月23日 下午2:29:16
 */
@Data
public class RenewPayTeamDto {

	/**
	 * 团队uuid
	 */
	private String teamUuid;
	/**
	 * 团队名称
	 */
	private String teamName;
	/**
	 * 日期
	 */
	private String renewPayDate;
	/**
	 * 团队产生的续费人数
	 */
	private Integer renewPayNum;
	/**
	 * 分配给团队的新签人数
	 */
	private Integer newPayNum;
	/**
	 * 续费率(renewPayNum/newPayNum)
	 */
	private String renewPayRate;
}
