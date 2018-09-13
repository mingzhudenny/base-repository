package com.repository.threeparty.Dto.anlan.user.client;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description：用户切换自己的状态传递参数
 * @author： denny
 * @create： 2018-06-07 17:32
 **/
@Data
@ApiModel(value = "UserPauseClientDTO",description = "用户切换状态传递参数")
public class UserPauseClientDTO {

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
     * set_status
     */
    @ApiModelProperty(value = "set_status", name = "action", example = "set_status")
    private String action;
    /**
     * avaiable/no_ avaiable
     */
    @ApiModelProperty(value = "avaiable/no_ avaiable", name = "actionValue", example = "no_ avaiable")
    private String actionValue;
}
