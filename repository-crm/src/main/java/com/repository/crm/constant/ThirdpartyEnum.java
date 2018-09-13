package com.repository.crm.constant;

/**
 * @description：第三方接口枚举
 * @author： denny
 * @create： 2018-02-01 21:03
 **/
public enum  ThirdpartyEnum {

    CREATE_BLUE_SMS(1," 创蓝短信"),
    HST(2,"好视通"),
    PING(3,"ping++"),
    BAIDU_STAGING(4,"百度分期"),
    TIAN_RUN(5,"天润"),
    JING_SHU_JU(6,"金数据"),
    CLASS_IN(7,"classin"),
    XUE_KE_WANG(8,"学科网"),
    YD_PAYMENT(9,"安硕金融"),
    LOVE_HAI_MI(10,"爱海米分期");

    ThirdpartyEnum(Integer value, String name){
		this.value = value;
		this.name = name;
    }
    private String name;
    private Integer value;

    public static ThirdpartyEnum findByValue(Integer value){
        switch (value){
            case 1:
                return ThirdpartyEnum.CREATE_BLUE_SMS;
            case 2:
                return ThirdpartyEnum.HST;
            case 3:
                return ThirdpartyEnum.PING;
            case 4:
                return ThirdpartyEnum.BAIDU_STAGING;
            case 5:
                return ThirdpartyEnum.TIAN_RUN;
            case 6:
                return ThirdpartyEnum.JING_SHU_JU;
            case 7:
                return ThirdpartyEnum.CLASS_IN;
            case 8:
                return ThirdpartyEnum.XUE_KE_WANG;
            case 9:
                return ThirdpartyEnum.YD_PAYMENT;
            case 10:
                return ThirdpartyEnum.LOVE_HAI_MI;
            default:
                return null;
        }
    }

}
