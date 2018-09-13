package com.repository.xcrm.Dto.account.client.leads;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-29 14:51
 **/
@Data
public class QueryTmkLeadsClientDTO extends BaseDto{

    /**
     * 导入状态(成功|失败)
     */
    private String status;
    /**
     * 学生姓名或手机号
     */
    private String leadsParams;
    /**
     * 年级
     */
    private String grade;
    /**
     * 科目
     */
    private String subject;
    /**
     * 渠道名称
     */
    private String channel;
    /**
     * 报名开始时间
     */
    private String signUpStartDate;
    /**
     * 报名结束时间
     */
    private String signUpEndDate;
    /**
     *  开始时间
     */
    private String importStartDate;
    /**
     * 结束时间
     */
    private String importEndDate;
}
