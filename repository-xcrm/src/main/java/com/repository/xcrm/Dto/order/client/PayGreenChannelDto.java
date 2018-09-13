package com.repository.xcrm.Dto.order.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：绿色通道参数
 * @author： denny
 * @create： 2018-05-03 16:34
 **/
@Data
@EqualsAndHashCode(callSuper = false)
    public class PayGreenChannelDto extends BaseDto {

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
}
