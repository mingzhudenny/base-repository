package com.repository.xcrm.Dto.account.server.student;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-21 15:25
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class CrManagerStudentDto {
    private String stuNo; //学号
    private String leadsUuid; //leadsUUid
    private String studentName; //学员姓名
    private String studentPhone;//学员电话
    private String grade; //年级
    private String payUuid;//支付uuid
    private String payTime;//支付时间
    private String isBound;//是否绑定
    private String isIntroduced;//是否转介绍
    private String introducer;//介绍人信息
    private String remarkContent; //跟进记录
    private String responsibleTime;//负责时间
    private Byte keyPoint;//标记类型
    private String handOutDes;
    private String inActivity;
    private String payType;
    private String followDays;//未跟进多少天
    private String suspClasses;//未上课多少天
    private String province;//省
    private String city;//市
    private String count;//区
    private Integer isDebugging;//是否开通未调试的调试课
    private String courseOrderUuid;
}
