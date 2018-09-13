package com.repository.crm.constant;

/**
 * @description：App操作模块枚举
 * @author： denny
 * @create： 2018-01-29 14:25
 **/
public enum AppOperationMonitorModule {

    APP_HOME_BANNER(100001,"首页-banner"),
    APP_HOME_LEARN_ASSESSMENT(100002,"首页-学习力测评"),
    APP_HOME_COURSE_BENEFITS(100003,"首页-课程优惠"),
    APP_HOME_CUSTOMER_CONSULTATIVE(100004,"首页-客服咨询"),
    APP_HOME_CLASS_TIME_CONSUMPPTION(100005,"首页-课时消耗"),
    APP_HOME_TEACHERS_RECOMMEND(100006,"首页-名师推荐"),
    APP_HOME_EDUCATION_HEADLINES(100007,"首页-教育头条"),
    APP_CLASS_WAIT_ON_COURSE(100008,"上课-待上课程"),
    APP_CLASS_COMPLETE_COURSE(100009,"上课-完成课程"),
    APP_LOGIN(100010,"用户登录"),
    APP_PERSONALCENTER_MY_INFORMATION(100011,"个人中心-我的信息"),
    APP_PERSONALCENTER_CT_CONSUMPPTION(100012,"个人中心-课时消耗"),
    APP_PERSONALCENTER_MY_ORDERS(100013,"个人中心-我的订单"),
    APP_PERSONALCENTER_CHANGE_PICTURE(100014,"个人中心-更换头像"),
    APP_PERSONALCENTER_ABOUT_APPLICATION(100015,"个人中心-你可能想知道"),
    APP_PERSONALCENTER_SHARE_APPLICATION(100016,"个人中心-分享嗨课堂"),
    APP_PERSONASET_UPDATE_PWD(100017,"设置-修改密码"),
    APP_PERSONASET_CHECK_EQUIPMENT(100018,"设置-设备检测"),
    APP_PERSONASET_FEEDBACK(100019,"设置-意见反馈"),
    APP_PERSONASET_CLEAR_CACHE(100020,"设置-清除缓存"),
    APP_PERSONASET_ABOUT_US(100021,"设置-关于我们"),
    APP_PERSONASET_PUSH_NOTICE(100022,"设置-推送通知");

    AppOperationMonitorModule(Integer value,String name){
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

    public static AppOperationMonitorModule findByValue(Integer value){
        switch (value){
            case 100001:
                return AppOperationMonitorModule.APP_HOME_BANNER;
            case 100002:
                return AppOperationMonitorModule.APP_HOME_LEARN_ASSESSMENT;
            case 100003:
                return AppOperationMonitorModule.APP_HOME_COURSE_BENEFITS;
            case 100004:
                return AppOperationMonitorModule.APP_HOME_CUSTOMER_CONSULTATIVE;
            case 100005:
                return AppOperationMonitorModule.APP_HOME_CLASS_TIME_CONSUMPPTION;
            case 100006:
                return AppOperationMonitorModule.APP_HOME_TEACHERS_RECOMMEND;
            case 100007:
                return AppOperationMonitorModule.APP_HOME_EDUCATION_HEADLINES;
            case 100008:
                return AppOperationMonitorModule.APP_CLASS_WAIT_ON_COURSE;
            case 100009:
                return AppOperationMonitorModule.APP_CLASS_COMPLETE_COURSE;
            case 100010:
                return AppOperationMonitorModule.APP_LOGIN;
            case 100011:
                return AppOperationMonitorModule.APP_PERSONALCENTER_MY_INFORMATION;
            case 100012:
                return AppOperationMonitorModule.APP_PERSONALCENTER_CT_CONSUMPPTION;
            case 100013:
                return AppOperationMonitorModule.APP_PERSONALCENTER_MY_ORDERS;
            case 100014:
                return AppOperationMonitorModule.APP_PERSONALCENTER_CHANGE_PICTURE;
            case 100015:
                return AppOperationMonitorModule.APP_PERSONALCENTER_ABOUT_APPLICATION;
            case 100016:
                return AppOperationMonitorModule.APP_PERSONALCENTER_SHARE_APPLICATION;
            case 100017:
                return AppOperationMonitorModule.APP_PERSONASET_UPDATE_PWD;
            case 100018:
                return AppOperationMonitorModule.APP_PERSONASET_CHECK_EQUIPMENT;
            case 100019:
                return AppOperationMonitorModule.APP_PERSONASET_FEEDBACK;
            case 100020:
                return AppOperationMonitorModule.APP_PERSONASET_CLEAR_CACHE;
            case 100021:
                return AppOperationMonitorModule.APP_PERSONASET_ABOUT_US;
            case 100022:
                return AppOperationMonitorModule.APP_PERSONASET_PUSH_NOTICE;
            default:
                return null;

        }
    }
}
