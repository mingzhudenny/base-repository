package com.repository.crm.constant;

/**
 * @description：Mq Exchanges枚举
 * @author： denny
 * @create： 2018-01-23 10:52
 **/
public enum QueueExchanges {

    QUEUE_EXCHANGES("operation_log","operation_monitoring_exchange","业务日志监控Exchanges");

    private String type;
    private String code;
    private String name;

    QueueExchanges(String type, String code, String name) {
        this.code = code;
        this.name = name;
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static String findByType(String type){
        if (type.equals("operation_log")){
            return QUEUE_EXCHANGES.code;
        }
        return null;
    }
}
