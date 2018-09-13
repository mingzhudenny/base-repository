package com.repository.crm.constant;

/**
 * @description：天润外呼接口配置信息
 * @author： denny
 * @create： 2018-01-11 13:22
 **/
public class TianRunInstanceConfig {
    /**
     * 座席接口-新建或修改
     */
    public static final String SAVE_SEAT_URL = "http://api.clink.cn/interfaceAction/clientInterface!save.action";
    /**
     *座席接口-删除座席
     */
    public static  final String DELETE_SEAT_URL = "http://api.clink.cn/interfaceAction/clientInterface!delete.action";

    public static  final  String OUT_CALL_URL = "http://api.clink.cn/interface/PreviewOutcall";

    /**
     * 外呼通话记录接口地址
     */
    public static  final  String CDROB_INTERFACE_URL = "http://api.clink.cn/interfaceAction/cdrObInterface!listCdrOb.action";

    /**
     * 来电通话记录接口地址
     */
    public static final  String CDRIB_INTERFACE_URL = "http://api.clink.cn/interfaceAction/cdrIbInterface!listCdrIb.action";

    /**
     * 修改座席绑定电话
     */
    public static  final  String SEATS_BIND_URL = "http://api.clink.cn/interface/client/ChangeBindTel";

    /**
     * 座席下线
     */
    public static  final  String SEATS_OFFLINE_URL = "http://api.clink.cn/interface/client/ClientOffline";

    /**
     *座席上线
     */
    public static  final  String SEATS_ONLINE_URL = "http://api.clink.cn/interface/client/ClientOnline";
}
