package com.repository.threeparty.Dto.anlan.call.log;

import lombok.Data;

/**
 * @description：通话记录参数
 * @author： denny
 * @create： 2018-06-19 11:09
 **/
@Data
public class CallLogClientDTO {
    private String userLogin;
    private String userPass;
    private String startTime;
    private String endtime;
    private String action;
    private String campaignId;
    private String userGroup;
    private String uniqueId;
}
