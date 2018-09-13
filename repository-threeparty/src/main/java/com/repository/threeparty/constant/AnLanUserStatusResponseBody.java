package com.repository.threeparty.constant;

import lombok.Data;

/**
 * @description：用户实时状态查询返回参数对象
 * @author： denny
 * @create： 2018-07-08 14:32
 **/
@Data
public class AnLanUserStatusResponseBody {
    private String user_login;
    private String user_group;
    private String campaign_id;
    private String extension;
    private String status;
    private String status_time;
    private String inbound_count;
    private String outbound_count;
    private String outbound_archive_count;
    private String phone_number;
    private String ingroup_id;
    private String uniqueid;
    private String inbound_mode;
}
