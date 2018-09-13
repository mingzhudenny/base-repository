package com.repository.threeparty.constant;

/**
 * @description：;连银分期响应code枚举
 * @author： denny
 * @create： 2018-06-11 13:38
 **/
public enum LianYinResponseCode {

    CODE_000000("000000","成功"),

    CODE_010001("010001","参数不能为空"),

    CODE_010002("010002","参数不合法"),

    CODE_020003("020003","信息不存在"),

    CODE_020002("020002","信息已经存在"),

    CODE_999999("999999","系统未知异常");

    private String code;
    private String value;

    LianYinResponseCode(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static LianYinResponseCode findByCode(String code){
        switch (code) {
            case "000000":
                return LianYinResponseCode.CODE_000000;
            case "010001":
                return LianYinResponseCode.CODE_010001;
            case "010002":
                return LianYinResponseCode.CODE_010002;
            case "020003":
                return LianYinResponseCode.CODE_020003;
            case "020002":
                return LianYinResponseCode.CODE_020002;
            case "999999":
                return LianYinResponseCode.CODE_999999;
            default:
                return null;
        }
    }
}
