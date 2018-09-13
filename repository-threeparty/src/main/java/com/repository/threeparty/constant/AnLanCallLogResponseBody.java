package com.repository.threeparty.constant;

import lombok.Data;

/**
 * @description：安莱通话记录日志
 * @author： denny
 * @create： 2018-06-19 11:17
 **/
@Data
public class AnLanCallLogResponseBody {
    private String user_login;

    private String user_group;

    private String extension;

    private String phone_number;

    private String start_time;

    private String is_archive;

    private String archive_time;

    private String end_time;

    private String total_seconds;

    private String queue_seconds;

    private String talk_seconds;

    private String recording_url;

    private String uniqueid;

    private String ingroup_id;

    private String ingroup_name;

    private String hotline;

    private String caller_id;

    private String status;

    private String status_value;

    private String status_type;
}
