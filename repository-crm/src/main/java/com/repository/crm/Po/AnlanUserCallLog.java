package com.repository.crm.Po;

import lombok.Data;

import java.util.Date;
/**
 * @description：安莱用户通话统计日志
 * @author： denny
 * @create： 2018-07-05 13:08
 **/
@Data
public class AnlanUserCallLog {
    private Integer id;

    private String userLogin;

    private String userGroup;

    private String callCount;

    private String inboundCount;

    private String outboundCount;

    private String outboundArchiveCount;

    private Date createTime;

    private Date updateTime;
}