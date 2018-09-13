package com.repository.threeparty.Dto.anlan.phone;

import com.repository.threeparty.Dto.BaseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-07 18:51
 **/
@Data
@ApiModel(value = "HangUpClientDTO",description = "电话转接挂断传递参数")
public class HangUpClientDTO extends BaseDto{
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
     * 电话的唯一信息uniqueid
     */
    @ApiModelProperty(value = "唯一信息", name = "uniqueid", example = "1407985993.2975")
    private String uniqueid;

    private String xferUniqueid;

    private String xferNumber;

    private String xferChannel;
    /**
     * hungup/hangup_all/hangup_xfer_me/hangup_xfer
     */
    @ApiModelProperty(value = "hungup/hangup_all/hangup_xfer_me/hangup_xfer", name = "action", example = "hungup")
    private String action;
}
