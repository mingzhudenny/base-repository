package com.repository.crm.constant;

/**
 * @description：客户端操作模块枚举
 * @author： denny
 * @create： 2018-01-26 18:47
 **/
public enum ClientOperationMonitorModule {

       CLIENT_lOGIN(10001,"用户登录"),
       CLIENT_USER_HELP(10002,"用户帮助"),
       CLIENT_FEEDBACK(10003,"意见反馈"),
       CLIENT_HOME(10004,"首页"),
       CLIENT_WAIT_ON_COURSE(10005,"我的课程-待上课程"),
       CLIENT_COURSE_RECORD(10006,"我的课程-课程记录"),
       CLIENT_ASSESSMENT_LEARN(10007,"学情记录-学习力测评"),
       CLIENT_RESET_PASSWORD(10008,"个人中心-重置密码"),
       CLIENT_CHECK_EQUIPMENT(10009,"设备测试"),
       CLIENT_MY_CURRICULUM(10010,"我的课表"),
       CLIENT_MY_COURSE_WARE(10011,"我的课件");

    ClientOperationMonitorModule(Integer value,String name){
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

    public static ClientOperationMonitorModule findByValue(Integer value){
        switch (value){
            case 10001:
                return CLIENT_lOGIN;
            case 10002:
                return CLIENT_USER_HELP;
            case 10003:
                return CLIENT_FEEDBACK;
            case 10004:
                return CLIENT_HOME;
            case 10005:
                return CLIENT_WAIT_ON_COURSE;
            case 10006:
                return CLIENT_COURSE_RECORD;
            case 10007:
                return CLIENT_ASSESSMENT_LEARN;
            case 10008:
                return CLIENT_RESET_PASSWORD;
            case 10009:
                return CLIENT_CHECK_EQUIPMENT;
            case 10010:
                return CLIENT_MY_CURRICULUM;
            case 10011:
                return CLIENT_MY_COURSE_WARE;
             default:
                 return null;
        }
    }
}
