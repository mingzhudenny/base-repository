package com.repository.xcrm.Dto.account.server.distribution;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：本团队正式生分配的展示信息
 * @author： denny
 * @create： 2018-04-23 13:44
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class TeamWaitDistributionStudentDto {
    /**
     *学生uuid
     */
    private String leadsUuid;
    /**
     * 学生姓名
     */
    private String leadsName;
    /**
     * 手机号码
     */
    private String leadsPhone;
    /**
     * 团队uuid
     */
    private String teamUuid;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 付费时间
     */
    private String payTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 移交备注
     */
    private String handOutDes;
}
