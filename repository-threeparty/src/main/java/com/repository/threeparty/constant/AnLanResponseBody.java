package com.repository.threeparty.constant;

import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-07 17:55
 **/
@Data
public class AnLanResponseBody {
    /**
     * 0：失败，1：成功
     */
    private String result;
    /**
     * 失败原因
     */
    private String msg;
    /**
     * 电话唯一标志
     */
    private String uniqueid;
    /**
     * 用户组
     */
    private String usergroup;
    /**
     * 拨打日志
     */
    private String calllog;
    /**
     * 用户实时状态
     */
    private String status;
    /**
     * 0：电话已挂断，1：电话还在通话中
     */
    private String is_active;
    /**
     * 用户统计信息
     */
    private String report;
    /**
     * 电话录音url
     */
    private String url;
}
