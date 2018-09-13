package com.repository.xcrm.Dto.account.client.distribution;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：正式生分配接收前端传的参数dto
 * @author： denny
 * @create： 2018-04-20 19:48
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentDistributionParamsDto {
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 分配销售
     */
    private String distributeUser;
    /**
     * 渠道级别
     */
    private String channelLevel;
    /**
     * 操作开始时间
     */
    private String operateStartTime;
    /**
     * 操作结束时间
     */
    private String operateEndTime;
    /**
     * 分配类别
     */
    private String distributeType;
    /**
     * 年级
     */
    private String grade;
    /**
     * 科目
     */
    private String subject;

}
