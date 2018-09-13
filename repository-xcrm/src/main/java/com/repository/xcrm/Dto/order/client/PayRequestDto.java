package com.repository.xcrm.Dto.order.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：支付申请参数
 * @author： denny
 * @create： 2018-05-04 11:57
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class PayRequestDto extends BaseDto{

    private String leadsUuid;

    private  String coursePriceType;

    private String coursePriceActivityType;

    private String buyLength;

    private String promotionCode;

    private String inActivities;

    private String payType;

    private String bank;

    private String giveLength;

    private String payTime;

    private String courseUuid;

    private String payUuid;
}
