package com.repository.threeparty.Dto.anlan.phone;

import com.repository.threeparty.Dto.BaseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 外呼所需传递参数
 *
 * @author csy
 * @time  2018年5月29日 下午5:14:10
 */
@Data
@ApiModel(value = "DialClientDTO",description = "电话外呼传递参数")
public class DialClientDTO extends BaseDto{

	/**
	 * 用户账户
	 */
	@ApiModelProperty(value = "用户账户", name = "userLogin", example = "Hiapiadmin")
	private String userLogin;
	/**
	 * 用户密码
	 */
	@ApiModelProperty(value = "用户密码", name = "userPass", example = "Hiapiadmin")
	private String userPass;
	/**
	 * 分机账号
	 */
	@ApiModelProperty(value = "分机账号", name = "phoneLogin", example = "50155")
	private String phoneLogin;
	/**
	 * 分机密码
	 */
	@ApiModelProperty(value = "分机密码", name = "phonePass", example = "50155")
	private String phonePass;
	/**
	 * 用户电话号码
	 */
	@ApiModelProperty(value = "用户电话号码", name = "phoneNumber", example = "15001962095")
	private String phoneNumber;
	/**
	 * 项目id
	 */
	@ApiModelProperty(value = "项目id", name = "campaignId", example = "Onlyhi")
	private String campaignId;
}
