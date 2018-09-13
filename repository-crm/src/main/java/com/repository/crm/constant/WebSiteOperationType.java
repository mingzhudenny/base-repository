package com.repository.crm.constant;

/**
 * @description：web网站具体操作行为枚举
 * @author： denny
 * @create： 2018-01-31 14:36
 **/
public enum WebSiteOperationType {
    WEB_SITE_GET(0,"获取"),
    WEB_SITE_LOGIN(1,"登录"),
    WEB_SITE_LOGOUT(2,"退出登录"),
    WEB_SITE_FORGET_PWD(3,"忘记密码"),
    WEB_SITE_GET_VERIFICATION_CODE(4,"获取验证码"),
    WEB_SITE_DIRECT_LOGIN(5,"直接登录"),
    WEB_SITE_NEXT_STEP(6,"下一步"),
    WEB_SITE_REGISTERED(7,"注册"),
    WEB_SITE_HOT_LINE(8,"热线电话"),
    WEB_SITE_FREE_TRY_LISTEN(9," 免费试听"),
    WEB_SITE_LISTEN_NOW(10,"立即试听"),
    WEB_SITE_HELP_CHILDREN(11,"立即帮助孩子"),
    WEB_SITE_ALL_ORDERS(12,"查看全部订单"),
    WEB_SITE_WAIT_PAY(13,"待支付订单"),
    WEB_SITE_PAY_ORDER_SUCCESS(14,"已支付订单"),
    WEB_SITE_ORDERS_CLOSED(15,"已关闭订单"),
    WEB_SITE_BUY_NOW(16,"立即购买"),
    WEB_SITE_SUBMIT_PURCHASE(17," 提交购买"),
    WEB_SITE_PAYMENT_METHOD_WECHAT(18,"微信支付"),
    WEB_SITE_PAYMENT_METHOD_ALIPAY(19,"支付宝支付"),
    WEB_SITE_PAYMENT_METHOD_BAIDU(20,"百度有钱花"),
    WEB_SITE_PAYMENT_METHOD_LOVEHAIMI(21,"海米分期"),
    WEB_SITE_PAYMENT_METHOD_OFFLINEPAY(22,"线下转账"),
    WEB_SITE_ORDER_PAY(23,"支付订单"),
    WEB_SITE_SUBMIT_STAGING(24,"提交分期"),
    WEB_SITE_PAYMENT_FAIL(25,"支付失败"),
    WEB_SITE_PAYMENT_SUCCESS(26,"支付成功"),
    WEB_SITE_COURSE_BENEFITS(27,"课程优惠"),
    WEB_SITE_STU_WIN7_DOWNLOADS(28,"下载windows7及以上版本"),
    WEB_SITE_STU_XP_SP3_DOWNLOADS(29,"下载XP SP3及以上版本"),
    WEB_SITE_TEACH_WIN7_DOWNLOADS(30,"下载windows7及以上版本"),
    WEB_SITE_TEACH_XP_SP3_DOWNLOADS(31,"下载XP SP3及以上版本"),
    WEB_SITE_STU_ANDROID_DOWNLOADS(32,"安卓学生端下载"),
    WEB_SITE_APP_STORE_DOWNLOADS(33,"APP Store下载"),
    WEB_SITE_ANDROID_IPAD_DOWNLOADS(34,"安卓平板端下载"),
    WEB_SITE_RETURN_HOME_PAGE(35,"返回首页");

    WebSiteOperationType(Integer value,String name){
        this.name = name;
        this.value = value;
    }
    private String name;
    private Integer value;

    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

    public static WebSiteOperationType findByValue(Integer value){
        switch (value){
            case 0:
                return WebSiteOperationType.WEB_SITE_GET;
            case 1:
                return WebSiteOperationType.WEB_SITE_LOGIN;
            case 2:
                return WebSiteOperationType.WEB_SITE_LOGOUT;
            case 3:
                return WebSiteOperationType.WEB_SITE_FORGET_PWD;
            case 4:
                return WebSiteOperationType.WEB_SITE_GET_VERIFICATION_CODE;
            case 5:
                return WebSiteOperationType.WEB_SITE_DIRECT_LOGIN;
            case 6:
                return WebSiteOperationType.WEB_SITE_NEXT_STEP;
            case 7:
                return WebSiteOperationType.WEB_SITE_REGISTERED;
            case 8:
                return WebSiteOperationType.WEB_SITE_HOT_LINE;
            case 9:
                return WebSiteOperationType.WEB_SITE_FREE_TRY_LISTEN;
            case 10:
                return WebSiteOperationType.WEB_SITE_LISTEN_NOW;
            case 11:
                return WebSiteOperationType.WEB_SITE_HELP_CHILDREN;
            case 12:
                return WebSiteOperationType.WEB_SITE_ALL_ORDERS;
            case 13:
                return WebSiteOperationType.WEB_SITE_WAIT_PAY;
            case 14:
                return WebSiteOperationType.WEB_SITE_PAY_ORDER_SUCCESS;
            case 15:
                return WebSiteOperationType.WEB_SITE_ORDERS_CLOSED;
            case 16:
                return WebSiteOperationType.WEB_SITE_BUY_NOW;
            case 17:
                return WebSiteOperationType.WEB_SITE_SUBMIT_PURCHASE;
            case 18:
                return WebSiteOperationType.WEB_SITE_PAYMENT_METHOD_WECHAT;
            case 19:
                return WebSiteOperationType.WEB_SITE_PAYMENT_METHOD_ALIPAY;
            case 20:
                return WebSiteOperationType.WEB_SITE_PAYMENT_METHOD_BAIDU;
            case 21:
                return WebSiteOperationType.WEB_SITE_PAYMENT_METHOD_LOVEHAIMI;
            case 22:
                return WebSiteOperationType.WEB_SITE_PAYMENT_METHOD_OFFLINEPAY;
            case 23:
                return WebSiteOperationType.WEB_SITE_ORDER_PAY;
            case 24:
                return WebSiteOperationType.WEB_SITE_SUBMIT_STAGING;
            case 25:
                return WebSiteOperationType.WEB_SITE_PAYMENT_FAIL;
            case 26:
                return WebSiteOperationType.WEB_SITE_PAYMENT_SUCCESS;
            case 27:
                return WebSiteOperationType.WEB_SITE_COURSE_BENEFITS;
            case 28:
                return WebSiteOperationType.WEB_SITE_STU_WIN7_DOWNLOADS;
            case 29:
                return WebSiteOperationType.WEB_SITE_STU_XP_SP3_DOWNLOADS;
            case 30:
                return WebSiteOperationType.WEB_SITE_TEACH_WIN7_DOWNLOADS;
            case 31:
                return WebSiteOperationType.WEB_SITE_TEACH_XP_SP3_DOWNLOADS;
            case 32:
                return WebSiteOperationType.WEB_SITE_STU_ANDROID_DOWNLOADS;
            case 33:
                return WebSiteOperationType.WEB_SITE_APP_STORE_DOWNLOADS;
            case 34:
                return WebSiteOperationType.WEB_SITE_ANDROID_IPAD_DOWNLOADS;
            case 35:
                return WebSiteOperationType.WEB_SITE_RETURN_HOME_PAGE;
            default:
                return null;
        }
    }

}
