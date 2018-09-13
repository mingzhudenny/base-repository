package com.repository.crm.constant;

/**
 * @description：定义routing_key
 * @author： denny
 * @create： 2018-01-18 15:33
 **/
public enum QueueEnum {
    LOG_ROUTING_KEY("LOGROUTINGKEY", "业务日志监控队列key");

    private String code;
    private String name;

    QueueEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
