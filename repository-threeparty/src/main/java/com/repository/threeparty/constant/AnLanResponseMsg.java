package com.repository.threeparty.constant;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-08 13:22
 **/
public enum AnLanResponseMsg {
    CODE_10004("10004","token验证失败"),
    CODE_10016("10016","token存在但没有激活"),
    CODE_10001("10001","用户账号不存在"),
    CODE_10002("10002","用户密码错误"),
    CODE_10003("10003","用户没有激活"),
    CODE_10013("10013","用户没有管理员权限"),
    CODE_70201("70201","查询技能组信息时遇到未知错误"),
    CODE_10101("10101","分机号不存在"),
    CODE_10102("10102","分机号密码错误"),
    CODE_10103("10103","分机号没有激活"),
    CODE_43012("43012","没有坐席使用此分机"),
    CODE_43013("43013","分机错误,电话没有接起,请挂断这通电话"),
    CODE_70401("70401","查询实时分机状态时遇到未知错误"),
    CODE_10011("10011","用户没有登录"),
    CODE_70501("70501","查询客户电话活动时遇到未知错误"),
    CODE_70601("70601","查询录音时遇到未知错误"),
    CODE_10305("10305","转接(坐席/外线)不存在或未登录"),
    CODE_41703("41703","转接uniqueid不存在"),
    CODE_70701("70701","查询转接电话是否接通时遇到未知错误"),
    CODE_70801("70801","查询来电队列时遇到未知错误"),
    CODE_70901("70901","查询用户列表时遇到未知错误"),
    CODE_71001("71001","查询分机列表时遇到未知错误"),
    CODE_10017("10017","用户没有管理员权限"),
    CODE_50001("50001","用户没有登录"),
    CODE_50002("50002","用户组与用户不匹配"),
    CODE_50003("50003","用户组与用户不匹配"),
    CODE_50004("50004","用户与token不匹配"),
    CODE_71101("71101","查询用户实时状态时遇到未知错误"),
    CODE_71201("71201","查询Old日志(IB)时遇到未知错误"),
    CODE_71202("71202","查询Old日志(OB)时遇到未知错误"),
    CODE_44000("44000","campaign_id,user_group,uniqueid3个变量没有被赋值"),
    CODE_44001("44001","campaign_id,user_group,uniqueid3个变量赋值超过一个"),
    CODE_44002("44002","输入的campaign_id不存在"),
    CODE_44003("44003","calllog找不到指定的记录(已弃用)"),
    CODE_71301("71301","查询通话日志(IB)时遇到未知错误"),
    CODE_71302("71302","查询通话日志(OB)时遇到未知错误"),
    CODE_71401("71401","查询技能组实时报表时遇到未知错误"),
    CODE_43003("43003","查询用户报表,用户组不存在"),
    CODE_43004("43004","token权限没有这个用户组"),
    CODE_71501("71501","查询用户报表时遇到未知错误"),
    CODE_10302("10302","技能组不存在"),
    CODE_43103("43103","用户没有管理员权限"),
    CODE_71601("71601","查询Abandon报表(技能组)时遇到未知错误"),
    CODE_44004("44004","输入的campaign_id不存在"),
    CODE_44005("44005","用户没有此项目的权限"),
    CODE_44007("44007","did_id没有找到"),
    CODE_44008("44008","输入的“did_number”有误"),
    CODE_71701("71701","查询Abandon报表(IVR)时遇到未知错误"),
    CODE_10005("10005","用户名不能为空"),
    CODE_10006("10006","密码不能为空"),
    CODE_43100("43100","uniqueid不能为空"),
    CODE_71801("71801","查询通话日志(OB)时遇到未知错误"),
    CODE_43006("43006","电话号码输入有误"),
    CODE_64001("64001","输入的电话号码为空"),
    CODE_74201("74201","查询电话归属地时遇到未知错误"),
    CODE_73201("73201","坐席来电时遇到未知错误"),
    CODE_42703("42703","电话uniqueid不存在"),
    CODE_73301("73301","来电回传时遇到未知错误"),
    CODE_10009("10009","用户账号已存在"),
    CODE_10008("10008","用户密码长度大于20"),
    CODE_10301("10301","技能组不存在"),
    CODE_43007("43007","用户组不存在"),
    CODE_43008("43008","技能组输入错误"),
    CODE_72001("72001","增加用户账号时遇到未知错误"),
    CODE_10021("10021","用户正在使用中，禁止删除"),
    CODE_72201("72201","用户账号删除时遇到未知错误"),
    CODE_10019("10019","用户密码长度小于3"),
    CODE_10020("10020","用户密码长度大于20"),
    CODE_72301("72301","用户密码修改时遇到未知错误"),
    CODE_10108("10108","phone账号已存在"),
    CODE_10105("10105","分机密码长度小于3"),
    CODE_10107("10107","分机密码长度大于20"),
    CODE_72401("72401","分机账号增加时遇到未知错误"),
    CODE_72501("72501","分机账号修改时遇到未知错误"),
    CODE_72601("72601","分机账号删除时遇到未知错误"),
    CODE_72701("72701","技能组配置时遇到未知错误"),
    CODE_10015("10015","用户已经登录"),
    CODE_40305("40305","分机已被其他坐席登陆"),
    CODE_40306("40306","登陆用户大于500"),
    CODE_43020("43020","用户所属技能组没有配置进线模式"),
    CODE_72801("72801","用户登陆时遇到未知错误"),
    CODE_43016("43016","分机账号不匹配"),
    CODE_40405("40405","用户状态不是暂停，不能登出"),
    CODE_72901("72901","用户登出时遇到未知错误"),
    CODE_40503("40503","用户状态非暂停，不能切换可用"),
    CODE_73001("73001","状态切换可用时遇到未知错误"),
    CODE_40504("40504","分机还在通话中,不能切换成暂停(ring模式)"),
    CODE_43011("43011","用户状态不是暂停，不能登出"),
    CODE_73101("73101","状态切换暂停时遇到未知错误"),
    CODE_10012("10012","用户不是暂停状态，不能外呼"),
    CODE_44010("44010","campaign_id不存在"),
    CODE_10201("10201","phonenumber被系统屏蔽"),
    CODE_10202("10202","phonenumber被项目屏蔽"),
    CODE_44009("44009","登录通道已挂断(auto模式)"),
    CODE_73401("73401","电话外呼时遇到未知错误"),
    CODE_43018("43018","uniqueid长度应大于9"),
    CODE_43019("43019","转接uniqueid错误"),
    CODE_50000("50000","用户没有登录"),
    CODE_73501("73501","正常挂断时遇到未知错误"),
    CODE_73502("73502","三方通话挂断自己时遇到未知错误"),
    CODE_73503("73503","挂断全部时遇到未知错误"),
    CODE_73504("73504","挂断第三方时遇到未知错误"),
    CODE_73601("73601","保持通话(Park)时遇到未知错误"),
    CODE_73602("73602","收起电话(UnPark)时遇到未知错误"),
    CODE_41504("41504","找不到会议室号码"),
    CODE_43001("43001","监听分机必须是同一个服务器"),
    CODE_43002("43002","没有可用的会议室号码"),
    CODE_43005("43005","管理员分机号未注册"),
    CODE_43017("43017","分机已被使用"),
    CODE_73701("73701","监听过程遇到未知错误"),
    CODE_73702("73702","强插过程遇到未知错误"),
    CODE_73703("73703","耳语过程遇到未知错误"),
    CODE_43014("43014","查询不到相关录音"),
    CODE_43015("43015","success值只能是0或1"),
    CODE_73801("73801","录音标识时遇到未知错误"),
    CODE_41606("41606","查询不到会议室"),
    CODE_73901("73901","电话转接坐席(Hold)时遇到未知错误"),
    CODE_73902("73902","电话转接坐席(UnHold)时遇到未知错误"),
    CODE_74001("74001","电话转技能组时遇到未知错误"),
    CODE_74101("74101","电话转外线(盲转)时遇到未知错误"),
    CODE_74102("74102","电话转外线(Hold)时遇到未知错误"),
    CODE_74103("74103","电话转外线(UnHold)时遇到未知错误");
    private String code;
    private String value;

    AnLanResponseMsg(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static AnLanResponseMsg findByValue(String code) {
        switch (code) {
            case "10004":
                return AnLanResponseMsg.CODE_10004;
            case "10016":
                return AnLanResponseMsg.CODE_10016;
            case "10001":
                return AnLanResponseMsg.CODE_10001;
            case "10002":
                return AnLanResponseMsg.CODE_10002;
            case "10003":
                return AnLanResponseMsg.CODE_10003;
            case "10013":
                return AnLanResponseMsg.CODE_10013;
            case "70201":
                return AnLanResponseMsg.CODE_70201;
            case "10101":
                return AnLanResponseMsg.CODE_10101;
            case "10102":
                return AnLanResponseMsg.CODE_10102;
            case "10103":
                return AnLanResponseMsg.CODE_10103;
            case "43012":
                return AnLanResponseMsg.CODE_43012;
            case "43013":
                return AnLanResponseMsg.CODE_43013;
            case "70401":
                return AnLanResponseMsg.CODE_70401;
            case "10011":
                return AnLanResponseMsg.CODE_10011;
            case "70501":
                return AnLanResponseMsg.CODE_70501;
            case "70601":
                return AnLanResponseMsg.CODE_70601;
            case "10305":
                return AnLanResponseMsg.CODE_10305;
            case "41703":
                return AnLanResponseMsg.CODE_41703;
            case "70701":
                return AnLanResponseMsg.CODE_70701;
            case "70801":
                return AnLanResponseMsg.CODE_70801;
            case "70901":
                return AnLanResponseMsg.CODE_70901;
            case "71001":
                return AnLanResponseMsg.CODE_71001;
            case "10017":
                return AnLanResponseMsg.CODE_10017;
            case "50001":
                return AnLanResponseMsg.CODE_50001;
            case "50002":
                return AnLanResponseMsg.CODE_50002;
            case "50003":
                return AnLanResponseMsg.CODE_50003;
            case "50004":
                return AnLanResponseMsg.CODE_50004;
            case "71101":
                return AnLanResponseMsg.CODE_71101;
            case "71201":
                return AnLanResponseMsg.CODE_71201;
            case "71202":
                return AnLanResponseMsg.CODE_71202;
            case "44000":
                return AnLanResponseMsg.CODE_44000;
            case "44001":
                return AnLanResponseMsg.CODE_44001;
            case "44002":
                return AnLanResponseMsg.CODE_44002;
            case "44003":
                return AnLanResponseMsg.CODE_44003;
            case "71301":
                return AnLanResponseMsg.CODE_71301;
            case "71302":
                return AnLanResponseMsg.CODE_71302;
            case "71401":
                return AnLanResponseMsg.CODE_71401;
            case "43003":
                return AnLanResponseMsg.CODE_43003;
            case "43004":
                return AnLanResponseMsg.CODE_43004;
            case "71501":
                return AnLanResponseMsg.CODE_71501;
            case "10302":
                return AnLanResponseMsg.CODE_10302;
            case "43103":
                return AnLanResponseMsg.CODE_43103;
            case "71601":
                return AnLanResponseMsg.CODE_71601;
            case "44004":
                return AnLanResponseMsg.CODE_44004;
            case "44005":
                return AnLanResponseMsg.CODE_44005;
            case "44007":
                return AnLanResponseMsg.CODE_44007;
            case "44008":
                return AnLanResponseMsg.CODE_44008;
            case "71701":
                return AnLanResponseMsg.CODE_71701;
            case "10005":
                return AnLanResponseMsg.CODE_10005;
            case "10006":
                return AnLanResponseMsg.CODE_10006;
            case "43100":
                return AnLanResponseMsg.CODE_43100;
            case "71801":
                return AnLanResponseMsg.CODE_71801;
            case "43006":
                return AnLanResponseMsg.CODE_43006;
            case "64001":
                return AnLanResponseMsg.CODE_64001;
            case "74201":
                return AnLanResponseMsg.CODE_74201;
            case "73201":
                return AnLanResponseMsg.CODE_73201;
            case "42703":
                return AnLanResponseMsg.CODE_42703;
            case "73301":
                return AnLanResponseMsg.CODE_73301;
            case "10009":
                return AnLanResponseMsg.CODE_10009;
            case "10008":
                return AnLanResponseMsg.CODE_10008;
            case "10301":
                return AnLanResponseMsg.CODE_10301;
            case "43007":
                return AnLanResponseMsg.CODE_43007;
            case "43008":
                return AnLanResponseMsg.CODE_43008;
            case "72001":
                return AnLanResponseMsg.CODE_72001;
            case "10021":
                return AnLanResponseMsg.CODE_10021;
            case "72201":
                return AnLanResponseMsg.CODE_72201;
            case "10019":
                return AnLanResponseMsg.CODE_10019;
            case "10020":
                return AnLanResponseMsg.CODE_10020;
            case "72301":
                return AnLanResponseMsg.CODE_72301;
            case "10108":
                return AnLanResponseMsg.CODE_10108;
            case "10105":
                return AnLanResponseMsg.CODE_10105;
            case "10107":
                return AnLanResponseMsg.CODE_10107;
            case "72401":
                return AnLanResponseMsg.CODE_72401;
            case "72501":
                return AnLanResponseMsg.CODE_72501;
            case "72601":
                return AnLanResponseMsg.CODE_72601;
            case "72701":
                return AnLanResponseMsg.CODE_72701;
            case "10015":
                return AnLanResponseMsg.CODE_10015;
            case "40305":
                return AnLanResponseMsg.CODE_40305;
            case "40306":
                return AnLanResponseMsg.CODE_40306;
            case "43020":
                return AnLanResponseMsg.CODE_43020;
            case "72801":
                return AnLanResponseMsg.CODE_72801;
            case "43016":
                return AnLanResponseMsg.CODE_43016;
            case "40405":
                return AnLanResponseMsg.CODE_40405;
            case "72901":
                return AnLanResponseMsg.CODE_72901;
            case "40503":
                return AnLanResponseMsg.CODE_40503;
            case "73001":
                return AnLanResponseMsg.CODE_73001;
            case "40504":
                return AnLanResponseMsg.CODE_40504;
            case "43011":
                return AnLanResponseMsg.CODE_43011;
            case "73101":
                return AnLanResponseMsg.CODE_73101;
            case "10012":
                return AnLanResponseMsg.CODE_10012;
            case "44010":
                return AnLanResponseMsg.CODE_44010;
            case "10201":
                return AnLanResponseMsg.CODE_10201;
            case "10202":
                return AnLanResponseMsg.CODE_10202;
            case "44009":
                return AnLanResponseMsg.CODE_44009;
            case "73401":
                return AnLanResponseMsg.CODE_73401;
            case "43018":
                return AnLanResponseMsg.CODE_43018;
            case "43019":
                return AnLanResponseMsg.CODE_43019;
            case "50000":
                return AnLanResponseMsg.CODE_50000;
            case "73501":
                return AnLanResponseMsg.CODE_73501;
            case "73502":
                return AnLanResponseMsg.CODE_73502;
            case "73503":
                return AnLanResponseMsg.CODE_73503;
            case "73504":
                return AnLanResponseMsg.CODE_73504;
            case "73601":
                return AnLanResponseMsg.CODE_73601;
            case "73602":
                return AnLanResponseMsg.CODE_73602;
            case "41504":
                return AnLanResponseMsg.CODE_41504;
            case "43001":
                return AnLanResponseMsg.CODE_43001;
            case "43002":
                return AnLanResponseMsg.CODE_43002;
            case "43005":
                return AnLanResponseMsg.CODE_43005;
            case "43017":
                return AnLanResponseMsg.CODE_43017;
            case "73701":
                return AnLanResponseMsg.CODE_73701;
            case "73702":
                return AnLanResponseMsg.CODE_73702;
            case "73703":
                return AnLanResponseMsg.CODE_73703;
            case "43014":
                return AnLanResponseMsg.CODE_43014;
            case "43015":
                return AnLanResponseMsg.CODE_43015;
            case "73801":
                return AnLanResponseMsg.CODE_73801;
            case "41606":
                return AnLanResponseMsg.CODE_41606;
            case "73901":
                return AnLanResponseMsg.CODE_73901;
            case "73902":
                return AnLanResponseMsg.CODE_73902;
            case "74001":
                return AnLanResponseMsg.CODE_74001;
            case "74101":
                return AnLanResponseMsg.CODE_74101;
            case "74102":
                return AnLanResponseMsg.CODE_74102;
            case "74103":
                return AnLanResponseMsg.CODE_74103;
            default:
                return null;
        }
    }
}
