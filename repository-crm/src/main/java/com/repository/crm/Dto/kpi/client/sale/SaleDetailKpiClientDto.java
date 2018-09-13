package com.repository.crm.Dto.kpi.client.sale;

import com.repository.crm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：销售业绩明细dto
 * @author： denny
 * @create： 2018-06-25 14:20
 **/
@Data
public class SaleDetailKpiClientDto extends BaseDto{
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
    private String channelUuid;
}
