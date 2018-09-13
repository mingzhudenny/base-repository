package com.repository.crm.Dto.kpi.client.leads;

import com.base.utils.validate.ValidateUtil;
import com.repository.crm.Dto.LeadsBaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "试听未转化传递参数(试听未提交付费申请的)",description = "试听未转化传递参数")
public class LeadsListenNoConversionClientDto extends LeadsBaseDto{

	@ApiModelProperty(value = "报名开始时间", name = "signUpStartDate",required=false)
	private String signUpStartDate;
	@ApiModelProperty(value = "报名结束时间", name = "signUpEndDate",required=false)
	private String signUpEndDate;
	
	public String getSignUpStartDate() {
		if(ValidateUtil.isNotEmpty(signUpStartDate)){
			signUpStartDate = signUpStartDate +" 00:00:00";
		}
		return signUpStartDate;
	}
	public void setSignUpStartDate(String signUpStartDate) {
		this.signUpStartDate = signUpStartDate;
	}
	public String getSignUpEndDate() {
		if(ValidateUtil.isNotEmpty(signUpEndDate)){
			signUpEndDate = signUpEndDate +" 23:59:59";
		}
		return signUpEndDate;
	}
	public void setSignUpEndDate(String signUpEndDate) {
		this.signUpEndDate = signUpEndDate;
	}
	
	
}
