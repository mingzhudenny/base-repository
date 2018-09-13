package com.repository.xcrm.Dto.account.server.distribution;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：销售助理分配操作记录Dto
 * @author： denny
 * @create： 2018-04-20 19:27
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class DistributeRecordDto {
    /**
     * leadsUuid
     */
    private String leadsUuid;
    /**
     * leads姓名
     */
    private String leadsName;
    /**
     * leads电话号码
     */
    private String leadsPhone;
    /**
     * 分配给的销售
     */
    private String saleUserName;
    /**
     * 分配操作时间
     */
    private String distributeTime;
    /**
     * 分配人
     */
    private String distributer;
    /**
     * 分配团队
     */
    private String distributeTeamName;
    /**
     * 分配渠道类别
     */
    private byte type;
    /**
     * 本团队分配者
     */
    private String teamDistributer;
    /**
     * 渠道级别
     */
    private String channelLevel;
    /**
     * 年级
     */
    private String grade;
    /**
     * 科目
     */
    private String subject;
}
