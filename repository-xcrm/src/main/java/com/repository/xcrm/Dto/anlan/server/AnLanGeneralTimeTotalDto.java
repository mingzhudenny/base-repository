package com.repository.xcrm.Dto.anlan.server;

import com.base.utils.date.DateUtil;
import com.base.utils.validate.ValidateUtil;

/**
 * @description：安莱外呼通时通次总计返回参数
 * @author： denny
 * @create： 2018-07-11 15:25
 **/
public class AnLanGeneralTimeTotalDto {

    /**
     * 总外呼次数
     */
    private String sumObCallNumber;
    /**
     * 总外呼人数
     */
    private String sumObCallPeople;
    /**
     * 外呼双方接听次数
     */
    private String sumObCallReceivedNumber;
    /**
     * 外呼双方接听人数
     */
    private String sumObCallReceivedPeopleNumber;
    /**
     * 外呼总通话时长
     */
    private String  sumOutboundCallDuration;

    public String getSumObCallNumber() {
        return sumObCallNumber;
    }

    public void setSumObCallNumber(String sumObCallNumber) {
        this.sumObCallNumber = sumObCallNumber;
    }

    public String getSumObCallPeople() {
        return sumObCallPeople;
    }

    public void setSumObCallPeople(String sumObCallPeople) {
        this.sumObCallPeople = sumObCallPeople;
    }

    public String getSumObCallReceivedNumber() {
        return sumObCallReceivedNumber;
    }

    public void setSumObCallReceivedNumber(String sumObCallReceivedNumber) {
        this.sumObCallReceivedNumber = sumObCallReceivedNumber;
    }

    public String getSumObCallReceivedPeopleNumber() {
        return sumObCallReceivedPeopleNumber;
    }

    public void setSumObCallReceivedPeopleNumber(String sumObCallReceivedPeopleNumber) {
        this.sumObCallReceivedPeopleNumber = sumObCallReceivedPeopleNumber;
    }

    public String getSumOutboundCallDuration() {
        if (ValidateUtil.isNotEmpty(sumOutboundCallDuration)){
            sumOutboundCallDuration = DateUtil.getHourAndMinutesAndSecond(sumOutboundCallDuration);
        }
        return sumOutboundCallDuration;
    }

    public void setSumOutboundCallDuration(String sumOutboundCallDuration) {
        this.sumOutboundCallDuration = sumOutboundCallDuration;
    }
}
