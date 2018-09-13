package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：课节视频直播回放对象
 * @author： denny
 * @create： 2018-05-11 17:00
 **/
@Data
public class ClassVideo {
    private int id;
    private String clientCourseId;
    private String clientClassId;
    private String videoType;
    private String code;
    private String message;
    private String status;
    private String rtmpDownStreamAddress;
    private String hlsDownStreamAddress;
    private String flvDownStreamAddress;
    private String allCount;
    private String startTime;
    private String endTime;
    private String fileName;
    private String videoStatus;
    private String returnMessage;
    private String definition;
    private String url;
    private Date createTime;
    private Date updateTime;
    private String fileId;
}
