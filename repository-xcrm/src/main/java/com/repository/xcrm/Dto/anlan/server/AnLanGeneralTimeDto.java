package com.repository.xcrm.Dto.anlan.server;

import com.base.utils.validate.ValidateUtil;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @description：安莱外呼通时通次明细返回参数
 * @author： denny
 * @create： 2018-07-11 15:33
 **/
public class AnLanGeneralTimeDto {

    private BigDecimal rate = new BigDecimal(100);
    /**
     * 销售姓名
     */
    @Setter
    @Getter
    private String saleName;
    /**
     * 销售类型
     */
    @Setter
    @Getter
    private String saleType;
    /**
     * 总外呼次数
     */
    @Setter
    @Getter
    private String sumObCallNumber;
    /**
     * 总外呼人数
     */
    @Setter
    @Getter
    private String sumObCallPeople;
    /**
     * 外呼双方接听次数
     */
    @Setter
    @Getter
    private String sumObCallReceivedNumber;
    /**
     * 外呼双方接听人数
     */
    @Setter
    @Getter
    private String sumObCallReceivedPeopleNumber;
    /**
     * 外呼总通话时长
     */
    private String sumOutboundCallDuration;
    /**
     * 外呼接通率(外呼接听次数/总外呼次数*100%)
     */
    private BigDecimal outboundCallRate;
    /**
     * 团队uuid
     */
    @Setter
    @Getter
    private String teamUuid;
    /**
     * 团队名称
     */
    @Setter
    @Getter
    private String teamName;
    /**
     * 团队职位
     */
    @Setter
    @Getter
    private String teamType;
    /**
     * 用户uuid
     */
    @Setter
    @Getter
    private String userUuid;
    /**
     * 登录名
     */
    @Setter
    @Getter
    private String loginName;

    @Setter
    @Getter
    private String userPass;

    @Setter
    @Getter
    private String userGroup;

    public BigDecimal getOutboundCallRate() {
        if (ValidateUtil.isNotEmpty(getSumObCallNumber()) && ValidateUtil.isNotEmpty(getSumObCallReceivedNumber())&&Integer.parseInt(getSumObCallNumber())!=0) {
            outboundCallRate = new BigDecimal(getSumObCallReceivedNumber())
                    .divide(new BigDecimal(getSumObCallNumber()), 4, RoundingMode.HALF_UP).multiply(rate);
        }
        return outboundCallRate;
    }

    public void setOutboundCallRate(BigDecimal outboundCallRate) {
        this.outboundCallRate = outboundCallRate;
    }

    public String getSumOutboundCallDuration() {
        return sumOutboundCallDuration;
    }

    public void setSumOutboundCallDuration(String sumOutboundCallDuration) {
        this.sumOutboundCallDuration = sumOutboundCallDuration;
    }
}
