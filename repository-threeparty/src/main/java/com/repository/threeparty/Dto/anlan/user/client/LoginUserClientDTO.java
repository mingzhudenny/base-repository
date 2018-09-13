package com.repository.threeparty.Dto.anlan.user.client;

import com.repository.threeparty.Dto.BaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户登录需要传递的参数
 *
 * @author csy
 * @time  2018年5月29日 下午5:03:35
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "LoginUserClientDTO",description = "用户登录传递参数")
public class LoginUserClientDTO extends BaseDto{

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
	 * 项目组id
	 */
	@ApiModelProperty(value = "项目组id", name = "campaignId", example = "Onlyhi")
	private String campaignId;
	/**
	 * authorize
	 */
	@ApiModelProperty(value = "authorize", name = "action", example = "authorize")
	private String action;
	/**
	 * LOGIN/LOGOUT
	 */
	@ApiModelProperty(value = "LOGIN/LOGOUT", name = "actionValue", example = "LOGIN")
	private String actionValue;
}
