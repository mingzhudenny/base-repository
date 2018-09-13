package com.repository.crm.Dto.order.client.fn;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * 
 * <pre>
 * 导出线下业务统计查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ImportOfflineDeesDto.java; v 0.1 2018年5月9日 上午11:00:05  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ImportOfflineDeesDto extends BaseDto{
	
	/**  学生姓名 */
	private String studentName;
	/**  学生电话号码 */
	private  String studentPhone;
	/**  审核开始时间 */
	private String checkStartTime;
	/**  审核结束时间 */
	private String checkEndTime;
	/**   支付开始时间 */
	private String payStartTime;
	/**  支付结束时间 */
	private String payEndTime;
	/**  支付方式  */
	private String payType;
	/**  销售姓名 */
	private String saleName;
	/**   团队名称 */
	private  String teamName;	
	
}
