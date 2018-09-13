package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-23 12:58
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class TeamLeads {
    private Integer id;

    private String teamUuid;

    private String leadsUuid;

    private Integer isDistribution;

    private Boolean status;

    private String creater;

    private String updater;

    private Date createDate;

    private Date updateDate;
}
