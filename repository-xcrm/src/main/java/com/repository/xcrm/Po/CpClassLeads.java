package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-27 16:10
 **/
@Data
public class CpClassLeads {
    private Integer id;

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
