package com.repository.xcrm.Dto.account.server.leads;
import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-29 14:56
 **/
@Data
public class QueryTmkLeadsServerDTO {
    /**
     * 导入状态(成功|失败)
     */
    private String isSuccess;
    /**
     * 学生姓名
     */
    private String name;
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
     * 报名时间
     */
    private Date registDate;

    /**
     * 学生手机号码
     */
    private String phone;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createDate;
}
