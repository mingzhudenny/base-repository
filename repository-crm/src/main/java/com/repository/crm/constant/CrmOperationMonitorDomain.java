package com.repository.crm.constant;

/**
 * @description：Crm业务监控主领域枚举
 * @author： denny
 * @create： 2018-01-25 10:52
 **/
public enum CrmOperationMonitorDomain {

    PAY_ORDER_DOMAIN(0,"支付订单领域"),
    USER_DOMAIN(1,"用户领域"),
    PRODUCT_DOMAIN(2,"产品领域"),
    CLASS_DOMAIN(3,"课程领域");

    CrmOperationMonitorDomain(Integer value, String name){
		this.value = value;
		this.name = name;
    }
    private String name;
    private Integer value;

    public String getName() {
        return name;
    }
    public Integer getValue() {
        return value;
    }

    public static CrmOperationMonitorDomain findByValue(Integer value){
        switch (value){
            case 0:
                return PAY_ORDER_DOMAIN;
            case 1:
                return USER_DOMAIN;
            case 2:
                return PRODUCT_DOMAIN;
            case 3:
                return CLASS_DOMAIN;
            default:
                return null;
        }

    }
}
