package com.repository.threeparty.Dto.anlan.user.client;

import com.repository.threeparty.Dto.BaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * anlan新增用户传递的参数
 *
 * @author csy
 * @time  2018年5月29日 下午4:52:42
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "AddUserClientDTO", description = "新增用户传递的参数")
public class AddUserClientDTO extends BaseDto{
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
	 * 账户级别：5-Agent 6-QA 7-Supervisor 8-Manager 9-Admin
	 */
	@ApiModelProperty(value = "账户级别", name = "userLevel", example = "5-Agent")
	private String userLevel;
	/**
	 *  用户组
	 */
	@ApiModelProperty(value = "用户组", name = "userGroup", example = "OnlyhiTEST")
	private String userGroup;
	/**
	 * 技能组A_id：技能组A_rank|技能组B_id：技能组B_rank技能组和技能组权重用’：’分割，多个技能组间用’|’号分割
	 */
	@ApiModelProperty(value = "技能组", name = "groupList", example = "Hiapiadmin")
	private String groupList;
	/**
	 * 是否激活 “Y” 激活 “N” 不可用
	 */
	@ApiModelProperty(value = "是否激活", name = "active", example = "Y")
	private String active;
}
