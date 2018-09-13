package com.repository.xcrm.Dto.course.server;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-07-03 13:02
 **/
@Data
public class ClassLeadsDto {
    private String courseUuid;

    private String leadsUuid;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    private String feedbackStaus;

    private String feedbackDes;

    private String courseStatus;

    private String materialVersion;
}
