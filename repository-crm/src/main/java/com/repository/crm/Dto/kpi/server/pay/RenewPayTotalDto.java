package com.repository.crm.Dto.kpi.server.pay;

import lombok.Data;

/**
 * 服务端总续费kpi参数
 *
 * @author csy
 * @time  2018年3月23日 下午2:26:43
 */
@Data
public class RenewPayTotalDto {
	
	/**
	 * 日期
	 */
	private String renewPayDate;
	/**
	 * 总的续费人数
	 */
	private Integer renewPayNum;
	/**
	 * 总的新签人数
	 */
	private Integer newPayNum;
	/**
	 * 续费率(renewPayNum/newPayNum)
	 */
	private String renewPayRate;
}
