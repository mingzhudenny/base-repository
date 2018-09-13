package com.repository.xcrm.constants;

/**
 * @description：订单状态常量类
 * @author： denny
 * @create： 2018-04-12 10:49
 **/
public class OrderStatus {
    /**
     * 待支付
     */
    public static final  int WAIT_PAY = 0;
    /**
     * 支付成功
     */
    public static final  int SUCCESS_PAY = 1;
    /**
     * 支付失败
     */
    public static final  int FAIL_PAY = 2;
    /**
     * 已被拆单
     */
    public static final  int SPLIT_PAY = 3;
    /**
     * 已退费
     */
    public static final  int REFUNDED = 4;
}
