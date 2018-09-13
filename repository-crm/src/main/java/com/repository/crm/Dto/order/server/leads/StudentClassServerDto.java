package com.repository.crm.Dto.order.server.leads;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *  
 *销售部-我的学生课时列表返回实体
 * @ClassName:  
 * @author  wqz
 * @date 2018年4月10日
 * @version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class StudentClassServerDto { 
	/**学生姓名*/
	private String name;
	/**联系电话*/
	private String phone;
	/**购买时长*/
	private Integer buyLength;
	/**购买时长*/
	private Integer giveLength;
	/**消耗课时*/
	private Integer consumeLength;
	/**消耗购买课时*/
	private Integer consumeBuyLength;
	/**消耗赠送课时*/
	private Integer consumeGiveLength;
	/**剩余时长*/
	private Integer residueLength;
	/**剩余购买课时*/
	private Integer residueBuyLength;
	/**剩余赠送课时*/
	private Integer residueGiveLength;
	/**消耗购买时长*//*
	private Integer consumptionBuy;
	*//**消耗赠与时长*//*
	private Integer consumptionGive;
	*//**购买剩余时长*//*
	private Integer residueBuy;
	*//**赠与剩余时长*//*
	private Integer residueGive;*/
	/**对应的leadsUuid*/
	private String leadUuid;
	
}
