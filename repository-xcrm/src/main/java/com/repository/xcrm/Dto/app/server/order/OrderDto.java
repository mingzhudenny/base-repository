package com.repository.xcrm.Dto.app.server.order;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-12 11:06
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderDto {

    /**
     * uuid
     */
    private String uuid;
    /**
     *  订单号
     */
    private String orderNo;
    /**
     * 购买课程时长
     */
    private String buyLength;
    /**
     * 课程级别 0：普通1：清北2:明星
     */
    private Byte courseLevel;
    /**
     * 金额
     */
    private Double money;
    /**
     * 支付方式 bank:银行支付,taobao:淘宝,alipay:支付宝,weixin:微信,baiduStaging:百度分期,pingpp:ping++支付
     */
    private String payType;
    /**
     * 支付时间
     */
    private String payTime;
    /**
     * 是否支付状态0：待审核(待支付)1：支付成功2：支付失败3:已被拆单
     */
    private Byte isPay;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 课程包类型
     */
    private String courseType;

}
