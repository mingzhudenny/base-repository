package com.repository.threeparty.Dto.lianyin;

import lombok.Data;

/**
 * @description：连银分期所需参数
 * @author： denny
 * @create： 2018-06-11 13:46
 **/
@Data
public class LianYinPayDto {

    /**
     * 终端类型
     */
    private String terminalType;
    /**
     * 订单编号
     */
    private String merchantOrderNo;
    /**
     * 商品名称
     */
    private String merchantProductName;
    /**
     * 课时数
     */
    private String classHour;
    /**
     * 贷款金额
     */
    private String loanAmount;
    /**
     * 销售人员编号
     */
    private String salesmanNo;
    /**
     * 销售人员姓名
     */
    private String salesmanName;
    /**
     * 客户手机号码
     */
    private String customerPhoneNo;

    /**
     *  客户姓名
     */
    private String customerName;

    /**
     * 学生姓名
     */
    private String studentName;
}
