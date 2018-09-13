package com.repository.xcrm.Dto.sale.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：销售业绩明细查询条件dto
 * @author： denny
 * @create： 2018-04-28 17:08
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class SaleDetailKpiClientDto extends BaseDto {
    private String name;
    private String phone;
    private String grade;
    private String subject;
    private String buyLength;
    private String courseLevel;
    private String money;
    private String saleName;
    private String teamName;
    private String payType;
    private String promotionCode;
    private String payStartTime;
    private String payEndTime;
    private String commitStartTime;
    private String commitEndTime;
    private String firstDistribitionStartTime;
    private String firstDistribitionEndTime;
    private String courseActivityType;
    private String checkStatus;
    private String province;
    private String city;
    private String isRecommend;
    private String coursePriceType;
    private String count;
    private String schoolName;

}
