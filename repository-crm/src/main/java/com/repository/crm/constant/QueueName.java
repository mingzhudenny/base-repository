package com.repository.crm.constant;

/**
 * @description：mq名称队列枚举
 * @author： denny
 * @create： 2018-01-18 15:30
 **/
public enum QueueName {

    LOG_QUEUE("crm_log","crmLogQueue", "Crm业务日志监控队列"),
    CLIENT_QUEUE("client_log","clientLogQueue", "Client业务日志监控队列"),
    APP_QUEUE("app_log","appLogQueue","App业务日志监控队列"),
    WEBSITE_QUEUE("webSite_log","webSiteLogQueue","Web业务日志监控队列"),
    THIRDPARTY_QUEUE("thirdparty_log","thirdpartyQueue","第三方接口日志监控队列"),
    MESSAGE_QUEUE("message","messageQueue","系统消息发送队列");

    private String type;
    private String code;
    private String name;

    QueueName(String type, String code, String name) {
        this.type = type;
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public static String findByType(String type){
        if (type.equals("crm_log")){
            return LOG_QUEUE.getCode();
        }else if (type.equals("client_log")){
           return  CLIENT_QUEUE.getCode();
        }else if (type.equals("app_log")){
           return APP_QUEUE.getCode();
        }else if (type.equals("webSite_log")){
           return WEBSITE_QUEUE.getCode();
        }else if (type.equals("thirdparty_log")){
            return THIRDPARTY_QUEUE.getCode();
        }else if (type.equals("message")){
            return MESSAGE_QUEUE.getCode();
        }
        return null;
    }
}
