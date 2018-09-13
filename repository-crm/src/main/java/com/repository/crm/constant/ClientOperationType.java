package com.repository.crm.constant;

/**
 * @description：客户端具体操作行为枚举
 * @author： denny
 * @create： 2018-01-26 20:18
 **/
public enum ClientOperationType {
    CLIENT_GET(0,"查询"),
    CLIENT_ADD(1,"添加"),
    CLIENT_UPDATE(2,"编辑"),
    CLIENT_DELETE(3,"删除"),
    CLIENT_REMARK(4,"备注"),
    CLIENT_LOGIN(5,"登录"),
    CLIENT_LOGOUT(6,"退出登录"),
    CLIENT_INTO_CLASS_ROOM(7,"进入教室"),
    CLIENT_PLAYBACK_VIDEO(8,"播放回放视频"),
    CLIENT_GET_VERIFICATION_CODE(9,"获取验证码"),
    CLIENT_LOGOUT_CLASS_ROOM(10,"退出教室"),
    CLIENT_EQUIPMENT_TEST(11,"点击测试设备"),
    CLIENT_UPLOAD_FILE(12,"上传课件"),
    CLIENT_DOWNLOAD_FILE(13,"下载课件"),
    CLIENT_REFRESH(14,"刷新"),
    CLIENT_SELECT_COURSE(15,"马上去选课程");
    ClientOperationType(Integer value,String name){
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

    public static  ClientOperationType findByValue(Integer value){
        switch (value){
            case 0:
                return CLIENT_GET;
            case 1:
                return CLIENT_ADD;
            case 2:
                return CLIENT_UPDATE;
            case 3:
                return CLIENT_DELETE;
            case 4:
                return CLIENT_REMARK;
            case 5:
                return CLIENT_LOGIN;
            case 6:
                return CLIENT_LOGOUT;
            case 7:
                return CLIENT_INTO_CLASS_ROOM;
            case 8:
                return CLIENT_PLAYBACK_VIDEO;
            case 9:
                return CLIENT_GET_VERIFICATION_CODE;
            case 10:
                return CLIENT_LOGOUT_CLASS_ROOM;
            case 11:
                return CLIENT_EQUIPMENT_TEST;
            case 12:
                return CLIENT_UPLOAD_FILE;
            case 13:
                return CLIENT_DOWNLOAD_FILE;
            case 14:
                return CLIENT_REFRESH;
            case 15:
                return CLIENT_SELECT_COURSE;
            default:
                return null;
        }
    }
}
