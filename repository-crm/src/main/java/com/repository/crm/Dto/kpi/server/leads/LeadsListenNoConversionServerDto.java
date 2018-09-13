package com.repository.crm.Dto.kpi.server.leads;

import com.repository.crm.Dto.LeadsBaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * leads试听未转化的客户端传递信息
 *
 * @author csy
 * @time  2018年6月20日 上午11:28:04
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "试听未转化传递参数(试听未提交付费申请的)",description = "试听未转化传递参数")
public class LeadsListenNoConversionServerDto extends LeadsBaseDto{

	@ApiModelProperty(value = "最近一次试听课上课日期", name = "lastListenTime",required=false)
	private String lastListenTime;
	@ApiModelProperty(value = "授课老师", name = "teacherName",required=false)
	private String teacherName;
	@ApiModelProperty(value = "课程提交人", name = "commitUserName",required=false)
	private String commitUserName;
	@ApiModelProperty(value = "所属cc", name = "ccName",required=false)
	private String ccName;
	@ApiModelProperty(value = "报名时间", name = "signUpDate",required=false)
	private String signUpDate;
	
}
