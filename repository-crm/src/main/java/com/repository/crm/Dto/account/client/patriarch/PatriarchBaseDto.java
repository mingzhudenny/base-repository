package com.repository.crm.Dto.account.client.patriarch;

import com.repository.crm.Dto.BaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value="PatriarchBaseDto",description="家长基本信息dto类")
public class PatriarchBaseDto extends BaseDto{
	
	@ApiModelProperty(value = "家长uuid", name = "patriarchUuid", example = "csy")
	private String patriarchUuid;
	@ApiModelProperty(value = "家长姓名", name = "patriarchName", example = "csy")
	private String patriarchName;
	@ApiModelProperty(value = "家长电话", name = "patriarchPhone", example = "csy123456")
	private String patriarchPhone;
	@ApiModelProperty(value = "家长角色id", name = "partriarchRoleId", example = "0")
	private Integer partriarchRoleId;
	@ApiModelProperty(value = "家长角色", name = "partriarchRole", example = "家长角色")
	private String partriarchRoleName;
	@ApiModelProperty(value = "家长学生uuid", name = "leadsUuid", example = "")
	private String leadsUuid;
}
