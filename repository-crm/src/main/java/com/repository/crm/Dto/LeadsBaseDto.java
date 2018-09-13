package com.repository.crm.Dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * leads基本信息dto
 *
 * @author csy
 * @time  2018年6月20日 上午11:23:02
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "leads基本信息", description = "leads基本信息dto")
public class LeadsBaseDto extends BaseDto{

	@ApiModelProperty(value = "leadsuuid", name = "leadsUuid",dataType= "String",required=false)
	private String leadsUuid;
	@ApiModelProperty(value = "leads姓名", name = "leadsName",dataType= "String",required=false)
	private String leadsName;
	@ApiModelProperty(value = "leads电话", name = "leadsPhone",dataType= "String",required=false)
	private String leadsPhone;
	@ApiModelProperty(value = "科目", name = "subject",dataType= "String",required=false)
	private String subject;
	@ApiModelProperty(value = "年级", name = "grade",dataType= "String",required=false)
	private String grade;
}
