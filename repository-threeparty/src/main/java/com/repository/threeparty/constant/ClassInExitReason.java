package com.repository.threeparty.constant;

/**
 * @description：classIn退出教室的原因枚举
 * @author： denny
 * @create： 2018-03-30 18:08
 **/
public enum ClassInExitReason {

    NORMAL_EXIT(1,"正常退出"),
    CLASS_ROOM_CLOSE(2,"教室关闭"),
    ABNORMAL_EXIT(3,"异常退出"),
    KICK_OUT_CLASS_ROOM(4,"被踢出教室"),
    SERVICE_CLOSE(5,"服务关闭");
    ClassInExitReason(Integer value, String name){
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

    public static ClassInExitReason findByValue(Integer value){
        switch (value){
            case 1:
                return ClassInExitReason.NORMAL_EXIT;
            case 2:
                return ClassInExitReason.CLASS_ROOM_CLOSE;
            case 3:
                return ClassInExitReason.ABNORMAL_EXIT;
            case 4:
                return ClassInExitReason.KICK_OUT_CLASS_ROOM;
            case 5:
                return ClassInExitReason.SERVICE_CLOSE;
            default:
                return null;
        }
    }

}
