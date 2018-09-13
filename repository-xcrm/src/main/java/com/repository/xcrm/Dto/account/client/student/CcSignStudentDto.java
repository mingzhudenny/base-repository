package com.repository.xcrm.Dto.account.client.student;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：Cc我的签约学生搜索条件参数
 * @author： denny
 * @create： 2018-04-28 11:36
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class CcSignStudentDto extends BaseDto{

    /**
     * 学生姓名和手机号
     */
    private String leadsParams;
    /**
     * 年级
     */
    private String grade;
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
     * 业绩提交开始日期
     */
    private String startDate;
    /**
     * 业绩提交结束日期
     */
    private String endDate;
    /**
     * 用户uuid
     */
    private String userUuid;
}
