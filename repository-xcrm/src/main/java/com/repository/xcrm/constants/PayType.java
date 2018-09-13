package com.repository.xcrm.constants;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-02 13:14
 **/
public enum PayType {
    BANK("bank","银行支付"),
    TAOBAO("taobao","淘宝"),
    ALIPAY("alipay","支付宝"),
    WEIXIN("weixin","微信"),
    BAIDUSTAGING("baiduStaging","百度分期"),
    PINGPP("pingpp","ping++支付");
    private String key;
    private String value;

    PayType(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static PayType findByValue(String key){
        switch (key){
            case "bank":
                return BANK;
            case "taobao":
                return TAOBAO;
            case "alipay":
                return ALIPAY;
            case "weixin":
                return WEIXIN;
            case "baiduStaging":
                return BAIDUSTAGING;
            case "pingpp":
                return PINGPP;
            default:
                return null;
        }
    }
}
