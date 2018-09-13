package com.repository.crm.Dto.kpi.client.pay;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 续费kpi前端传递参数
 *
 * @author csy
 * @time  2018年3月23日 下午2:23:38
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class RenewPayDto extends BaseDto{

	/**
	 * 续费月份
	 */
	private String renewPayDate;
}
