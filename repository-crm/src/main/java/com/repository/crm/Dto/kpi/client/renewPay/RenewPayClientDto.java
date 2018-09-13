package com.repository.crm.Dto.kpi.client.renewPay;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 团队续费客户端传递参数
 *
 * @author csy
 * @time  2018年3月23日 下午9:08:55
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class RenewPayClientDto extends BaseDto{

	/**
	 * 团队uuid
	 */
	private String teamUuid;
	/**
	 * 查询日期
	 */
	private String renewPayDate;
}
