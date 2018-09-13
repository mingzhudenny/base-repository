package com.repository.xcrm.Dto.account.client.distribution;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：leads分配接收前端传输参数Dto
 * @author： denny
 * @create： 2018-04-16 14:27
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LeadsDistributionParamsDto {

    /**
     * leadsUuid
     */
    private String uuid;
    /**
     * leads姓名/电话号码
     */
    private String leadsParams;
    /**
     * leads年级
     */
    private String grade;
    /**
     * leads科目
     */
    private String subject;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 区
     */
    private String count;
    /**
     * 学校
     */
    private String school;
    /**
     * 学校级别
     */
    private String schoolLevel;
    /**
     * 年级排名
     */
    private String gradeRank;
    /**
     * 渠道级别
     */
    private String channelLevel;

    /**
     * 推荐CC姓名
     */
    private String recommendCcName;
    /**
     * 推荐Cr姓名
     */
    private String recommendCrName;
    /**
     * 是否推荐0:否1:是
     */
    private Integer isRecommend;

    /**
     * '是否被标记过0：否1是'
     */
    private Integer isSign;
    /**
     * 报名日期
     */
    private String signUpDate;
    /**
     * 联系状态
     * 0.新建
     * 1.待拨打,待跟进
     * 2.未接通,待跟进
     * 3.已接通,待跟进
     * 4.已接通,同意排课
     * 5.未接通,放弃
     * 6.已接通,放弃
     */
    private Integer connectStatus;
    /**
     * 通用状态
     * 0:新名单
     * 1:藏经阁
     * 2:离职leads名单
     * 3:离职正式生名单
     * 4:回收站
     */
    private Integer commonStatus;
    /**
     * 是否分配0:否1:是
     */
    private Integer distributionStatus;
    /**
     * 放弃原因
     */
    private String giveUpCause;
    /**
     * 前销售
     */
    private String oldSaleName;
    /**
     * 当前标记状态0:否1:是
     */
    private Integer signStatus;
    /**
     * 分配人
     */
    private String distributionName;
}