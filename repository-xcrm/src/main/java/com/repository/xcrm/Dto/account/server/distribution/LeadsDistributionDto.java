package com.repository.xcrm.Dto.account.server.distribution;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：leads分配 返回给前端展示参数Dto
 * @author： denny
 * @create： 2018-04-16 14:27
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LeadsDistributionDto {

    /**
     * leadsUuid
     */
    private String uuid;
    /**
     * leads姓名
     */
    private String name;
    /**
     * leads电话号码
     */
    private String phone;
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
     * 是否为S名单
     */
    private Integer isSign;

    /**
     * 报名日期
     */
    private String signUpDate;
    /**
     * 号码归属地
     */
    private String phoneLocation;
    /**
     * 放弃时间
     */
    private String giveUpTime;
    /**
     * 放弃原因
     */
    private String giveUpCause;
    /**
     * 放弃备注
     */
    private String giveUpDes;
    /**
     * 前销售
     */
    private String oldSaleName;
    /**
     * 转交时间
     */
    private String managerTime;

    /**
     *  当前标记状态0:否1:是
     */
    private Integer signStatus;

    /**
     * 分配人
     */
    private String distributionName;
    /**
     * 分配时间
     */
    private Date distributionTime;
    /**
     * 操作人
     */
    private String operator;

    /**
     * 通用状态
     * 0:新名单
     * 1:藏经阁
     * 2:离职leads名单
     * 3:离职正式生名单
     * 4:回收站
     */
    private String commonStatus;
}
