package com.repository.threeparty.constant;

import lombok.Data;

/**
 * @description：用户统计信息查询返回参数
 * @author： denny
 * @create： 2018-07-11 14:04
 **/
@Data
public class AnLanUserReportResponseBody {
    private String user_login;
    private String user_group;
    private String call_count;
    private String inbound_count;
    private String outbound_count;
    private String outbound_archive_count;
}
