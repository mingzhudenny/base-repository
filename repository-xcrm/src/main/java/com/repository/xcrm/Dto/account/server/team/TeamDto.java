package com.repository.xcrm.Dto.account.server.team;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-23 11:25
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class TeamDto {

    private String uuid;
    /**
     * 团队名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;

    private String organizationUuid;

    private Integer teamType;
    //主管uuid
    private String leaderUuid;
    //总监uuid
    private String superLeadsUuid;

    private Boolean status;

    private Date createDate;

    private Date updateDate;
    //经理uuid
    private String leaderManageUuid;
}
