package com.repository.crm.Dto.kpi.client.pay;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 团队到期续费率传递参数
 *
 * @author csy
 * @time  2018年3月23日 下午5:03:03
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class TeamExpireRenewPayClientDto extends BaseDto{
	
	private String teamUuid;
	private String renewPayDate;
}
