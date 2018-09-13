package com.repository.crm.constant;

/**
 * @description：APP 具体操作行为枚举
 * @author： denny
 * @create： 2018-01-29 15:19
 **/
public enum AppOperationType {

    APP_GET(0,"查询"),
    APP_ADD(1,"新增"),
    APP_UPDATE(2,"编辑"),
    APP_DELETE(3,"删除"),
    APP_REMARK(4,"备注"),
    APP_LOGIN(5,"登录"),
    APP_LOGOUT(6,"退出登录"),
    APP_INTO_CLASS_ROOM(7,"进入教室"),
    APP_PLAYBACK_VIDEO(8,"播放回放视频"),
    APP_GET_VERIFICATION_CODE(9,"获取验证码"),
    APP_LOGOUT_CLASS_ROOM(10,"退出教室"),
    APP_EQUIPMENT_TEST(11,"点击测试设备"),
    APP_REFRESH(12,"刷新"),
    APP_BUY_COUSE(13,"购买课程"),
    APP_PAY_ORDER(14,"确认支付"),
    APP_CALL_HOTLINE(15,"拨打热线电话"),
    APP_WEBSIT(16,"跳转官网"),
    APP_TERMS_SERVICE(17,"服务条款");

    AppOperationType(Integer value,String name){
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

    public static AppOperationType findByValue(Integer value){
        switch (value){
            case 0:
                return AppOperationType.APP_GET;
            case 1:
                return AppOperationType.APP_ADD;
            case 2:
                return AppOperationType.APP_UPDATE;
            case 3:
                return AppOperationType.APP_DELETE;
            case 4:
                return AppOperationType.APP_REMARK;
            case 5:
                return AppOperationType.APP_LOGIN;
            case 6:
                return AppOperationType.APP_LOGOUT;
            case 7:
                return AppOperationType.APP_INTO_CLASS_ROOM;
            case 8:
                return AppOperationType.APP_PLAYBACK_VIDEO;
            case 9:
                return AppOperationType.APP_GET_VERIFICATION_CODE;
            case 10:
                return AppOperationType.APP_LOGOUT_CLASS_ROOM;
            case 11:
                return AppOperationType.APP_EQUIPMENT_TEST;
            case 12:
                return AppOperationType.APP_REFRESH;
            case 13:
                return AppOperationType.APP_BUY_COUSE;
            case 14:
                return AppOperationType.APP_PAY_ORDER;
            case 15:
                return AppOperationType.APP_CALL_HOTLINE;
            case 16:
                return AppOperationType.APP_WEBSIT;
            case 17:
                return AppOperationType.APP_TERMS_SERVICE;
            default:
                return null;
        }
    }
}
