package com.repository.crm.Dto.account.client.leads;

import java.io.Serializable;

import com.repository.crm.Dto.BaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * leads基本传输参数
 *
 * @author csy
 * @time  2018年3月19日 下午7:15:11
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "LeadsDto", description = "leads基本参数")
public class LeadsDto extends BaseDto implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "leads的uuid", name = "uuid",required=false,example="")
	private String uuid;

	@ApiModelProperty(value = "leads姓名", name = "name",required=true,example="")
	private String name;

	@ApiModelProperty(value = "leads电话", name = "phone",required=true,example="")
	private String phone;

	@ApiModelProperty(value = "leads年级", name = "grade",required=false,example="")
	private String grade;

	@ApiModelProperty(value = "leads科目", name = "subject",required=false,example="")
	private String subject;
}

