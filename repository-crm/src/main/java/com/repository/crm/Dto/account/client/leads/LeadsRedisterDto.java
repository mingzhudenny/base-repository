package com.repository.crm.Dto.account.client.leads;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * leads报名注册传输参数
 *
 * @author csy
 * @time  2018年3月19日 下午7:18:42
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "LeadsRedisterDto", description = "新增leads所需参数")
public class LeadsRedisterDto extends LeadsDto{

	private static final long serialVersionUID = 3105423170839257888L;
	
	@ApiModelProperty(value = "渠道adid", name = "adid",required=false,example="")
	private String adid;
	
	@ApiModelProperty(value = "渠道投放计划", name = "jh",required=false,example="")
	private String jh;
	
	@ApiModelProperty(value = "渠道投放单元", name = "dy",required=false,example="")
	private String dy;
	
	@ApiModelProperty(value = "渠道投放关键字", name = "keyNumber",required=false,example="")
	private String keyNumber;

	@ApiModelProperty(value = "是否赠送免费教学视频", name = "isGiveFree",required=false,example="")
	private String isGiveFree;
}
