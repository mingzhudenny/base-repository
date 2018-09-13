package com.repository.crm.Dto.order.client.fn;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * 
 * <pre>
 * 线下业务统计查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryOfflineDeesDto.java, v 0.1 2018年5月9日 上午11:00:05  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryOfflineDeesDto extends BaseDto{
	
	
	private String studentName;
	private String studentPhone;
	private String checkStartTime;
	private String checkEndTime;
	private String payStartTime;
	private String payEndTime;
	private String payType;
	private Integer isPay;
	private String saleType;
	private String saleName;
	private String teamName;
	private Integer isRefund;
	
}
