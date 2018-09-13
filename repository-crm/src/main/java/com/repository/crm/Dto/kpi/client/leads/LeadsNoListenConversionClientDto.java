package com.repository.crm.Dto.kpi.client.leads;

import com.base.utils.validate.ValidateUtil;
import com.repository.crm.Dto.LeadsBaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * leads未试听转化的客户端传递信息
 *
 * @author csy
 * @time  2018年6月20日 上午11:28:04
 */
@ApiModel(value = "未试听转化传递参数(未试听提交付费申请的)",description = "未试听转化传递参数")
public class LeadsNoListenConversionClientDto extends LeadsBaseDto{

	@Setter
	@Getter
	@ApiModelProperty(value = "所属cc姓名", name = "ccName",required=false)
	private String ccName;
	@Setter
	@Getter
	@ApiModelProperty(value = "所属cc团队名称", name = "ccTeam",required=false)
	private String ccTeam;
	@Setter
	@Getter
	@ApiModelProperty(value = "所属cr姓名", name = "crName",required=false)
	private String crName;
	@Setter
	@Getter
	@ApiModelProperty(value = "所属cr团队名称", name = "crTeam",required=false)
	private String crTeam;
	@ApiModelProperty(value = "业绩提交开始时间", name = "payCommitStartDate",required=false)
	private String payCommitStartDate;
	@ApiModelProperty(value = "业绩提交结束时间", name = "payCommitEndDate",required=false)
	private String payCommitEndDate;
	public String getPayCommitStartDate() {
		if(ValidateUtil.isNotEmpty(payCommitStartDate)){
			payCommitStartDate = payCommitStartDate +" 00:00:00";
		}
		return payCommitStartDate;
	}
	public void setPayCommitStartDate(String payCommitStartDate) {
		this.payCommitStartDate = payCommitStartDate;
	}
	public String getPayCommitEndDate() {
		if(ValidateUtil.isNotEmpty(payCommitEndDate)){
			payCommitEndDate = payCommitEndDate +" 23:59:59";
		}
		return payCommitEndDate;
	}
	public void setPayCommitEndDate(String payCommitEndDate) {
		this.payCommitEndDate = payCommitEndDate;
	}
	
}
