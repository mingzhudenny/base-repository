package com.repository.crm.Dto.kpi.server.leads;

import com.repository.crm.Dto.LeadsBaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * leads未试听转化的服务端返回信息
 *
 * @author csy
 * @time  2018年6月20日 上午11:40:58
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "未试听转化返回参数(未试听提交付费申请的)",description = "未试听转化返回参数")
public class LeadsNoListenConversionServerDto extends LeadsBaseDto{

	@ApiModelProperty(value = "所属cc姓名", name = "ccName",required=true)
	private String ccName;
	@ApiModelProperty(value = "所属cc团队", name = "ccTeam",required=true)
	private String ccTeam;
	@ApiModelProperty(value = "所属cr姓名", name = "crName",required=true)
	private String crName;
	@ApiModelProperty(value = "所属cr团队", name = "crTeam",required=true)
	private String crTeam;
	@ApiModelProperty(value = "业绩提交时间", name = "payCommitTime",required=true)
	private String payCommitTime;
}
