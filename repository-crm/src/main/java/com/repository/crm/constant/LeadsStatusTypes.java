package com.repository.crm.constant;

/**
 * leads的状态类型
 * @author csy
 * @since 20161210
 * @version 1.0
 */
public class LeadsStatusTypes {
	
	//数据状态
    /**启用 **/ 
    public static final boolean COLUMN_STATUS_ENABLE = true;
    /**禁用  **/
    public static final boolean COLUMN_STATUS_DISABLE = false;
    
    //leads联系状态
    /** 新建 */
    public static final String CONNECT_STATUS_CREATE = "create";//对应新leads名单
    /** 待拨打 待跟进 */
    public static final String CONNECT_STATUS_WAIT = "wait"; //对应待跟进leads
    /** 未接通,待跟进  **/
    public static final String CONNECT_STATUS_NOCONNECT_WAIT = "noconnectwait";
    /**已接通,待跟进 **/
    public static final String CONNECT_STATUS_CONNECT_WAIT = "connectwait";
    /**已接通,同意排课 **/
    public static final String CONNECT_STATUS_AGREE = "successwait";
    /**未接通,放弃 **/
    public static final String CONNECT_STATUS_NOCONNECT_GIVEUP = "noconnectgiveup";
    /**已接通,放弃**/
    public static final String CONNECT_STATUS_CONNECT_GIVEUP = "connectgiveup";
    
    //leads分配状态
    /** 未被分配  */
    public static final byte DISTRIBUTE_STATUS_NO = 0;
    /** 已被分配  */
    public static final byte DISTRIBUTE_STATUS_YES = 1;
    
    //leads是否进入藏经阁状态
    /**未进藏金阁**/
    public static final byte STUDENGT_STATUS_NO =  0;
     /**已进藏金阁**/
    public static final byte STUDENGT_STATUS_YES = 1;
}
