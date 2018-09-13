package com.repository.xcrm.constants;

/**
 * @description：创蓝短信状态吗枚举
 * @author： denny
 * @create： 2018-03-16 11:45
 **/
public enum ChuangLanSmsResponseCode {

    CODE_0("0","提交成功"),
    CODE_101("101","API账号错误"),
    CODE_102("102","API密码错误"),
    CODE_103("103","提交过快"),
    CODE_104("104","系统忙碌"),
    CODE_105("105","敏感短信"),
    CODE_106("106","短信内容长度错误"),
    CODE_107("107","手机号码格式错误"),
    CODE_108("108","手机号码个数错误"),
    CODE_109("109","无发送额度"),
    CODE_110("110","不在发送时间内"),
    CODE_113("113","扩展码格式错"),
    CODE_114("114","可用参数组个数错误"),
    CODE_116("116","msg签名不合法或未带签名"),
    CODE_117("117","IP地址认证错"),
    CODE_118("118","用户没有相应的发送权限"),
    CODE_119("119","用户已过期"),
    CODE_120("120","超过日发送条数限制"),
    CODE_123("123","发送类型错误"),
    CODE_124("124","白模板匹配错误"),
    CODE_125("125","匹配到驳回模板，提交失败"),
    CODE_126("126","审核通过模板匹配错误"),
    CODE_127("127","定时发送时间格式错误"),
    CODE_128("128","内容解码失败"),
    CODE_129("129","JSON格式错误"),
    CODE_130("130","请求参数错误");

    private String code;
    private String value;
    private ChuangLanSmsResponseCode(String code, String value) {
        this.code = code;
        this.value = value;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public static ChuangLanSmsResponseCode findByCode(String code){
        switch (code) {
            case "0":
                return CODE_0;
            case "101":
                return CODE_101;
            case "102":
                return CODE_102;
            case "103":
                return CODE_103;
            case "104":
                return CODE_104;
            case "105":
                return CODE_105;
            case "106":
                return CODE_106;
            case "107":
                return CODE_107;
            case "108":
                return CODE_108;
            case "109":
                return CODE_109;
            case "110":
                return CODE_110;
            case "113":
                return CODE_113;
            case "114":
                return CODE_114;
            case "116":
                return CODE_116;
            case "117":
                return CODE_117;
            case "118":
                return CODE_118;
            case "119":
                return CODE_119;
            case "120":
                return CODE_120;
            case "123":
                return CODE_123;
            case "124":
                return CODE_124;
            case "125":
                return CODE_125;
            case "126":
                return CODE_126;
            case "127":
                return CODE_127;
            case "128":
                return CODE_128;
            case "129":
                return CODE_129;
            case "130":
                return CODE_130;
            default:
                return null;
        }
    }


}
