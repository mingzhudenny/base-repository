package com.repository.crm.Po;

import lombok.Data;

import java.util.Date;

@Data
public class AnlanObCallHistoryLog {
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

    private String status;

    private String statusValue;

    private String statusType;

    private Date createTime;

    private Date updateTime;
}