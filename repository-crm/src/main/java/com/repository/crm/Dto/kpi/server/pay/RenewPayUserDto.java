package com.repository.crm.Dto.kpi.server.pay;

import lombok.Data;

/**
 * 个人续费kpi报表参数
 *
 * @author csy
 * @time  2018年3月23日 下午2:33:01
 */
@Data
public class RenewPayUserDto {

	/**
	 * 用户uuid
	 */
	private String userUuid;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 日期
	 */
	private String renewPayDate;	
	/**
	 * 用户产生续费人数
	 */
	private Integer renewPayNum;
	/**
	 * renewPayDate时间段内分配给用户的新签人数
	 */
	private Integer newPayNum;
	/**
	 * 续费率
	 */
	private String renewPayRate;
}
