package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：待跟进要展示的dto
 * @author： denny
 * @create： 2018-04-02 19:18
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class WaitFollowUpDto {
    private String uuid;//leadsuuid
    private String name;//leads姓名
    private String phone;//电话号码
    private String grade;//年级
    private String subject;//科目
    private String connectStatus;//接通状态
    private String signupDate;//报名时间
    private String inChargeDate;//负责时间
    private boolean keyPoint;//是否优先跟进

    private String remarkContent;//最新备注内容
    private Boolean isWarn;//是否是警告leads
    private int signUpCount;//报名次数
    private Boolean isRedLeads;//是否要标红leads
    /**
     * 号码归属地
     */
    private String phoneLocaltion;

}
