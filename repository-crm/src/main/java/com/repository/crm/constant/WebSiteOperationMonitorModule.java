package com.repository.crm.constant;


/**
 * @description：网站操作模块枚举
 * @author： denny
 * @create： 2018-01-30 15:43
 **/
public enum  WebSiteOperationMonitorModule {

    WEB_HOME_BANNER(100001,"首页-banner"),
    WEB_HOME_COOPERATION_AREA(100002,"首页_合作专区"),
    WEB_HOME_MEDIA_COVERAGE(100003,"首页_媒体报道"),
    WEB_HOME_COMPANY_PROFILE(100004,"首页_公司简介"),
    WEB_HOME_COURSE_SYSTM(100005,"首页_课程体系"),
    WEB_HOME_DREAM_VIDEO(100006,"首页_明星学员视频"),

    WEB_SITE_COURSE_SUPERIOR(100007,"课程优势介绍"),
    WEB_SITE_GENERAL_COACH(100008,"全科专业辅导"),
    WEB_SITE_BOTTOM_LINK(100009,"底部链接导航"),
    WEB_SITE_TEACHING_METHOD(100010,"教学方法"),
    WEB_SITE_RESERVATION_NOW(100011,"学霸立即预约"),
    WEB_SITE_COURSE_SYSTM(100012,"科学课程体系"),

    WEB_PRIMARY_SCHOOL_COURSE_OUTLINE(100013,"小学_课程大纲"),
    WEB_PRIMARY_SCHOOL_TEACHER_INTRODUCTION(100014,"小学_名校老师介绍"),

    WEB_JUNIOR_HIGH_TRY_LISTEN(100015,"初中_免费预约试听"),
    WEB_JUNIOR_HIGH_COURSE_OUTLINE(100016,"初中_课程大纲"),
    WEB_JUNIOR_HIGH_TEACHER_INTRODUCTION(100017,"初中_名校老师介绍"),

    WEB_HIGH_SCHOOL_TRY_LISTEN(100018,"高中_免费预约试听"),
    WEB_HIGH_SCHOOL_COURSE_OUTLINE(100019,"高中_课程大纲"),
    WEB_HIGH_SCHOOL_TEACHER_INTRODUCTION(100020,"高中_名校老师介绍"),

    WEB_BOUTIQUE_CLASS_TRY_LISTEN(100021,"精品课_免费预约试听"),
    WEB_BOUTIQUE_CLASS_COURSE_OUTLINE(100022,"精品课_课程大纲"),
    WEB_BOUTIQUE_CLASS_TEACHER_INTRODUCTION(100023,"精品课_名校老师介绍"),

    WEB_TEACHING_TEAM_INTRODUCTION(100024,"教研师资_名师团队介绍"),
    WEB_TEACHING_ASSESSMENT_TRANING(100025,"教研师资_考核培训介绍"),
    WEB_TEACHING_MATCHING_TEACHER(100026,"教研师资_为你匹配老师"),
    WEB_TEACHING_ACCOMPANY_TEACHING(100027,"教研师资_陪伴式教学"),

    WEB_COURSE_SYSTM_TRY_LISTEN(100028,"课程体系_免费预约试听"),
    WEB_COURSE_SYSTM_HIGH_SCHOOL_SYNC_COURSE(100029,"课程体系_高中同步课程"),
    WEB_COURSE_SYSTM_JUNIOR_HIGH_SYNC_COURSE(100030,"课程体系_初中同步课程"),
    WEB_COURSE_SYSTM_TEACHER_INTRODUCTION(100031,"课程体系_小学同步课程"),

    WEB_SITE_LEARN_ASSESSMENT(100032,"学习力测评"),
    WEB_ABOUT_US_COMPANY_PROFILE(100033,"关于我们_公司简介"),
    WEB_ABOUT_US_COMPANY_BRIEF(100034,"关于我们_嗨课堂简报"),
    WEB_ABOUT_US_HONOR(100035,"关于我们_公司荣誉"),

    WEB_SITE_CLIENT_DOWNLOADS(100036,"客户端下载"),
    WEB_SITE_EXTRAORDINARY_PARTNER(100037,"非凡搭档"),
    WEB_SITE_LECTURER_CONTEST(100038,"师说大赛"),
    WEB_SITE_GOLD_LIST_TITLE(100039,"金榜题名"),
    WEB_SITE_AFFECT_LIFE_WITH_LIFE(100040,"用生命影响生命"),

    WEB_SITE_MY_INFORMATION(100041,"我的嗨课堂"),
    WEB_SITE_COURSE_BENEFITS(100042,"课程优惠"),
    WEB_SITE_WINTER_VACATION_REPORT(100043,"寒假联报"),
    WEB_SITE_ORDER_PAY_PAGE(100044,"订单支付页面"),

    WEB_SITE_USER_LOGIN(100045,"用户登录"),
    WEB_SITE_USER_REGISTERED(100046,"用户注册"),
    WEB_SITE_CLIENT_DOWNLOADS_WINDOWS(100047,"客户端下载_windows下载详情页"),
    WEB_SITE_CLIENT_DOWNLOADS_ANDROID(100048,"客户端下载_Android下载详情页"),
    WEB_SITE_CLIENT_DOWNLOADS_IPHONE(100049,"客户端下载_iPhone下载详情页"),
    WEB_SITE_CLIENT_DOWNLOADS_IPAD(100050,"客户端下载_iPad下载详情页"),
    WEB_SITE_CLIENT_DOWNLOADS_ANDROIDPAD(100051,"客户端下载_Android平板下载详情页");


    WebSiteOperationMonitorModule(Integer value,String name){
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

    public static WebSiteOperationMonitorModule findByValue(Integer value){
        switch (value){
            case 100001:
                return WebSiteOperationMonitorModule.WEB_HOME_BANNER;
            case 100002:
                return WebSiteOperationMonitorModule.WEB_HOME_COOPERATION_AREA;
            case 100003:
                return WebSiteOperationMonitorModule.WEB_HOME_MEDIA_COVERAGE;
            case 100004:
                return WebSiteOperationMonitorModule.WEB_HOME_COMPANY_PROFILE;
            case 100005:
                return WebSiteOperationMonitorModule.WEB_HOME_COURSE_SYSTM;
            case 100006:
                return WebSiteOperationMonitorModule.WEB_HOME_DREAM_VIDEO;
            case 100007:
                return WebSiteOperationMonitorModule.WEB_SITE_COURSE_SUPERIOR;
            case 100008:
                return WebSiteOperationMonitorModule.WEB_SITE_GENERAL_COACH;
            case 100009:
                return WebSiteOperationMonitorModule.WEB_SITE_BOTTOM_LINK;
            case 100010:
                return WebSiteOperationMonitorModule.WEB_SITE_TEACHING_METHOD;
            case 100011:
                return WebSiteOperationMonitorModule.WEB_SITE_RESERVATION_NOW;
            case 100012:
                return WebSiteOperationMonitorModule.WEB_SITE_COURSE_SYSTM;
            case 100013:
                return WebSiteOperationMonitorModule.WEB_PRIMARY_SCHOOL_COURSE_OUTLINE;
            case 100014:
                return WebSiteOperationMonitorModule.WEB_PRIMARY_SCHOOL_TEACHER_INTRODUCTION;
            case 100015:
                return WebSiteOperationMonitorModule.WEB_JUNIOR_HIGH_TRY_LISTEN;
            case 100016:
                return WebSiteOperationMonitorModule.WEB_JUNIOR_HIGH_COURSE_OUTLINE;
            case 100017:
                return WebSiteOperationMonitorModule.WEB_JUNIOR_HIGH_TEACHER_INTRODUCTION;
            case 100018:
                return WebSiteOperationMonitorModule.WEB_HIGH_SCHOOL_TRY_LISTEN;
            case 100019:
                return WebSiteOperationMonitorModule.WEB_HIGH_SCHOOL_COURSE_OUTLINE;
            case 100020:
                return WebSiteOperationMonitorModule.WEB_HIGH_SCHOOL_TEACHER_INTRODUCTION;
            case 100021:
                return WebSiteOperationMonitorModule.WEB_BOUTIQUE_CLASS_TRY_LISTEN;
            case 100022:
                return WebSiteOperationMonitorModule.WEB_BOUTIQUE_CLASS_COURSE_OUTLINE;
            case 100023:
                return WebSiteOperationMonitorModule.WEB_BOUTIQUE_CLASS_TEACHER_INTRODUCTION;
            case 100024:
                return WebSiteOperationMonitorModule.WEB_TEACHING_TEAM_INTRODUCTION;
            case 100025:
                return WebSiteOperationMonitorModule.WEB_TEACHING_ASSESSMENT_TRANING;
            case 100026:
                return WebSiteOperationMonitorModule.WEB_TEACHING_MATCHING_TEACHER;
            case 100027:
                return WebSiteOperationMonitorModule.WEB_TEACHING_ACCOMPANY_TEACHING;
            case 100028:
                return WebSiteOperationMonitorModule.WEB_COURSE_SYSTM_TRY_LISTEN;
            case 100029:
                return WebSiteOperationMonitorModule.WEB_COURSE_SYSTM_HIGH_SCHOOL_SYNC_COURSE;
            case 100030:
                return WebSiteOperationMonitorModule.WEB_COURSE_SYSTM_JUNIOR_HIGH_SYNC_COURSE;
            case 100031:
                return WebSiteOperationMonitorModule.WEB_COURSE_SYSTM_TEACHER_INTRODUCTION;
            case 100032:
                return WebSiteOperationMonitorModule.WEB_SITE_LEARN_ASSESSMENT;
            case 100033:
                return WebSiteOperationMonitorModule.WEB_ABOUT_US_COMPANY_PROFILE;
            case 100034:
                return WebSiteOperationMonitorModule.WEB_ABOUT_US_COMPANY_BRIEF;
            case 100035:
                return WebSiteOperationMonitorModule.WEB_ABOUT_US_HONOR;
            case 100036:
                return WebSiteOperationMonitorModule.WEB_SITE_CLIENT_DOWNLOADS;
            case 100037:
                return WebSiteOperationMonitorModule.WEB_SITE_EXTRAORDINARY_PARTNER;
            case 100038:
                return WebSiteOperationMonitorModule.WEB_SITE_LECTURER_CONTEST;
            case 100039:
                return WebSiteOperationMonitorModule.WEB_SITE_GOLD_LIST_TITLE;
            case 100040:
                return WebSiteOperationMonitorModule.WEB_SITE_AFFECT_LIFE_WITH_LIFE;
            case 100041:
                return WebSiteOperationMonitorModule.WEB_SITE_MY_INFORMATION;
            case 100042:
                return WebSiteOperationMonitorModule.WEB_SITE_COURSE_BENEFITS;
            case 100043:
                return WebSiteOperationMonitorModule.WEB_SITE_WINTER_VACATION_REPORT;
            case 100044:
                return WebSiteOperationMonitorModule.WEB_SITE_ORDER_PAY_PAGE;
            case 100045:
                return WebSiteOperationMonitorModule.WEB_SITE_USER_LOGIN;
            case 100046:
                return WebSiteOperationMonitorModule.WEB_SITE_USER_REGISTERED;
            case 100047:
                return WebSiteOperationMonitorModule.WEB_SITE_CLIENT_DOWNLOADS_WINDOWS;
            case 100048:
                return WebSiteOperationMonitorModule.WEB_SITE_CLIENT_DOWNLOADS_ANDROID;
            case 100049:
                return WebSiteOperationMonitorModule.WEB_SITE_CLIENT_DOWNLOADS_IPHONE;
            case 100050:
                return WebSiteOperationMonitorModule.WEB_SITE_CLIENT_DOWNLOADS_IPAD;
            case 100051:
                return WebSiteOperationMonitorModule.WEB_SITE_CLIENT_DOWNLOADS_ANDROIDPAD;
            default:
                return null;
        }
    }

}
