package com.repository.crm.Dto.kpi.client.sale;

import java.util.Date;

import com.base.utils.date.DateUtil;
import com.repository.crm.Dto.BaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "销售总的kpi客户端传递参数",description = "销售总的kpi客户端传递参数")
public class SaleTotalKpiClientDto extends BaseDto{

	@Setter
	@Getter
	@ApiModelProperty(value = "用户入职类型(0:全部1:入职小于90天2:入职大于90天)", name = "userInductionType",required=true)
	private Integer userInductionType;
	@ApiModelProperty(value = "用户入职时间界", name = "userInductionDate",required=false)
	private String userInductionDate;
	@Setter
	@Getter
	@ApiModelProperty(value = "查实时间类型(0:人工月1:人工周)", name = "checkDateType",required=true)
	private Integer checkDateType;
	@Setter
	@Getter
	@ApiModelProperty(value = "查询人工月份/人工周", name = "checkDate",required=true)
	private String checkDate;
	@Setter
	@Getter
	@ApiModelProperty(value = "查询开始时间", name = "checkStartDate",required=false)
	private String checkStartDate;
	@Setter
	@Getter
	@ApiModelProperty(value = "查询结束时间", name = "checkEndDate",required=false)
	private String checkEndDate;
	@Setter
	@Getter
	@ApiModelProperty(value = "查询渠道级别", name = "channelLevel",required=false)
	private String channelLevel;
	@Setter
	@Getter
	@ApiModelProperty(value = "查询kpi类型(0:总kpi 1:新签  2:续费)", name = "channelLevel",required=false)
	private Integer checkKpiType;
	public String getUserInductionDate() {
		userInductionDate = DateUtil.parseDateTimeToStr(DateUtil.getAfterDate(new Date(), -90));
		return userInductionDate;
	}
	public void setUserInductionDate(String userInductionDate) {
		this.userInductionDate = userInductionDate;
	}
}
