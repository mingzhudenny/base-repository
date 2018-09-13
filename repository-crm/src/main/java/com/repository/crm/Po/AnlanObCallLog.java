package com.repository.crm.Po;

import lombok.Data;

import java.util.Date;
/**
 * @description：安莱外呼通话日志
 * @author： denny
 * @create： 2018-07-05 13:08
 **/
@Data
public class AnlanObCallLog {
    private Integer id;

    private String userLogin;

    private String userGroup;

    private String extension;

    private String phoneNumber;

    private String startTime;

    private String isArchive;

    private String archiveTime;

    private String endTime;

    private String totalSeconds;

    private String queueSeconds;

    private String talkSeconds;

    private String recordingUrl;

    private String uniqueid;

    private String callerId;

    private Date createTime;

    private Date updateTime;
    private String status;
    private String statusValue;
    private String statusType;
}