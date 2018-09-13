package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

@Data
public class StudentAwardRecord {
    private Long id;

    private String uuid;

    private String leadsUuid;

    private String phone;

    private String prizeId;

    private String activityId;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}