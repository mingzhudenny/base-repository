package com.repository.crm.Dto.common.server.businesslog;
import java.util.Date;

import com.repository.crm.constant.OperationModule;
import com.repository.crm.constant.OperationType;



/**
 * BusinessLog VO
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: BusinessLogVo.java, v 0.1 2017骞�2鏈�15鏃� 涓嬪崍4:47:14 chenzhongxing Exp $
 */
public class BusinessLogVo {
	

    private Long id;

    private Integer platform;

    private Integer optModule;

    private Integer optType;

    private String ipAddress;

    private Integer businessStatus;

    private String roleName;

    private String operator;

    private String remark;

    private Long createUserId;

    private Date createDate;

	private Long version;
	
	private String createDateStart;
	
	private String createDateEnd;	
	
	private String platformDesc;
	
	private String optModuleDesc;
	
	private String optTypeDesc;
	
	private String token;
	
	private int pageIndex;
	
	private int pageNumber;
	
	private String orderBy;
	
	private String sortBy;
	
	private int startIndex;
	
	
    

    public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public String getPlatformDesc() {
    	Integer platform = this.getPlatform();
    	if(platform==null){
    		return null;
    	}else if(platform.equals(1)){
    		return "后台管理系统";
    		
    	}
		return platformDesc;
	}

	public void setPlatformDesc(String platformDesc) {
		this.platformDesc = platformDesc;
	}

	public String getOptModuleDesc() {
		Integer optModule =this.getOptModule();
    	if(optModule==null){
    		return null;
    	}else if(optModule.compareTo(OperationModule.CC_CR_100001.getValue())==0){
    		return OperationModule.CC_CR_100001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100002.getValue())==0){
    		return OperationModule.CC_CR_100002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100003.getValue())==0){
    		return OperationModule.CC_CR_100003.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100004.getValue())==0){
    		return OperationModule.CC_CR_100004.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100005.getValue())==0){
    		return OperationModule.CC_CR_100005.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100006.getValue())==0){
    		return OperationModule.CC_CR_100006.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100007.getValue())==0){
    		return OperationModule.CC_CR_100007.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100008.getValue())==0){
    		return OperationModule.CC_CR_100008.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100009.getValue())==0){
    		return OperationModule.CC_CR_100009.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100010.getValue())==0){
    		return OperationModule.CC_CR_100010.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100011.getValue())==0){
    		return OperationModule.CC_CR_100011.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_101001.getValue())==0){
    		return OperationModule.TC_101001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_101002.getValue())==0){
    		return OperationModule.TC_101002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.RULE_101001.getValue())==0){
    		return OperationModule.RULE_101001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.RULE_102002.getValue())==0){
    		return OperationModule.RULE_102002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.RULE_102003.getValue())==0){
    		return OperationModule.RULE_102003.getName();
    		
    	}else if(optModule.compareTo(OperationModule.RULE_102004.getValue())==0){
    		return OperationModule.RULE_102004.getName();
    		
    	}else if(optModule.compareTo(OperationModule.RULE_102005.getValue())==0){
    		return  OperationModule.RULE_102005.getName();
    		
    	}else if(optModule.compareTo(OperationModule.RULE_102006.getValue())==0){
    		return OperationModule.RULE_102006.getName();
    		
    	}else if(optModule.compareTo(OperationModule.MD_103000.getValue())==0){
    		return OperationModule.MD_103000.getName();
    		
    	}else if(optModule.compareTo(OperationModule.MD_103001.getValue())==0){
    		return OperationModule.MD_103001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.MD_103002.getValue())==0){
    		return  OperationModule.MD_103002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.MD_103003.getValue())==0){
    		return OperationModule.MD_103003.getName();   		
    		
    	}else if(optModule.compareTo(OperationModule.MD_103005.getValue())==0){
    		return OperationModule.MD_103005.getName();
    		
    	}else if(optModule.compareTo(OperationModule.USER_104001.getValue())==0){
    		
    		return OperationModule.USER_104001.getName();   		
    	}else if(optModule.compareTo(OperationModule.TC_AGENT_105001.getValue())==0){
    		
    		return OperationModule.TC_AGENT_105001.getName();   		
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106001.getValue())==0){
    		
    		return OperationModule.TC_TEACHER_106001.getName();   		
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106002.getValue())==0){
    		
    		return OperationModule.TC_TEACHER_106002.getName();   		
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106003.getValue())==0){
    		
    		return OperationModule.TC_TEACHER_106003.getName();   		
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106004.getValue())==0){
    		
    		return OperationModule.TC_TEACHER_106004.getName();   		
    	}else if(optModule.compareTo(OperationModule.PH_PHONE_107001.getValue())==0){
    		
    		return OperationModule.PH_PHONE_107001.getName();
    	}else if(optModule.compareTo(OperationModule.PSD_110001.getValue())==0){
    		
    		return OperationModule.PSD_110001.getName();
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106005.getValue())==0){
    		
    		return OperationModule.TC_TEACHER_106005.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_AGENT_108001.getValue())==0){    		
    		return OperationModule.TC_AGENT_108001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_MANAGE_111001.getValue())==0){    		
    		return OperationModule.TC_MANAGE_111001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_MANAGE_111002.getValue())==0){    		
    		return OperationModule.TC_MANAGE_111002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_MANAGE_111003.getValue())==0){    		
    		return OperationModule.TC_MANAGE_111003.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_MANAGE_111004.getValue())==0){    		
    		return OperationModule.TC_MANAGE_111004.getName();
    		
    	}else if(optModule.compareTo(OperationModule.KPI_112001.getValue())==0){    		
    		return OperationModule.KPI_112001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.KPI_112002.getValue())==0){    		
    		return OperationModule.KPI_112002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TIMED_TASK_113001.getValue())==0){    		
    		return OperationModule.TIMED_TASK_113001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106006.getValue())==0){    		
    		return OperationModule.TC_TEACHER_106006.getName();
    		
    	}else if(optModule.compareTo(OperationModule.PAY_MANAGE_114001.getValue())==0){    		
    		return OperationModule.PAY_MANAGE_114001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.KPI_112003.getValue())==0){    		
    		return OperationModule.KPI_112003.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WECHAT_TC_BINDING_115001.getValue())==0){    		
    		return OperationModule.WECHAT_TC_BINDING_115001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WECHAT_TC_DATE_115002.getValue())==0){    		
    		return OperationModule.WECHAT_TC_DATE_115002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WECHAT_TC_STATUS_115003.getValue())==0){    		
    		return OperationModule.WECHAT_TC_STATUS_115003.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WECHAT_TC_COURSE_115004.getValue())==0){    		
    		return OperationModule.WECHAT_TC_COURSE_115004.getName();
    		
    	}else if(optModule.compareTo(OperationModule.MD_103004.getValue())==0){
    		return OperationModule.MD_103004.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WECHAT_AGENT_BINDING_116001.getValue())==0){
    		return OperationModule.WECHAT_AGENT_BINDING_116001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.FULL_TIME_TEACHER_117001.getValue())==0){
    		return OperationModule.FULL_TIME_TEACHER_117001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106007.getValue())==0){
    		return OperationModule.TC_TEACHER_106007.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_MANAGE_111005.getValue())==0){
    		return OperationModule.TC_MANAGE_111005.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_MANAGE_111006.getValue())==0){
    		return OperationModule.TC_MANAGE_111006.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_MANAGE_111007.getValue())==0){
    		return OperationModule.TC_MANAGE_111007.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_MANAGE_111008.getValue())==0){
    		return OperationModule.TC_MANAGE_111008.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_AGENT_108002.getValue())==0){
    		return OperationModule.TC_AGENT_108002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.DIMISSION_SALE_LEADS_118001.getValue())==0){
    		return OperationModule.DIMISSION_SALE_LEADS_118001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.DIMISSION_SALE_STUDENT_118002.getValue())==0){
    		return OperationModule.DIMISSION_SALE_STUDENT_118002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CREATE_COURSE_119001.getValue())==0){
    		return OperationModule.CREATE_COURSE_119001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.LEADS_OR_STUDENT_INFO_102003.getValue())==0){
    		return OperationModule.LEADS_OR_STUDENT_INFO_102003.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TEAM_DISTRIBUTION_STUDENT.getValue())==0){
    		return OperationModule.TEAM_DISTRIBUTION_STUDENT.getName();
    		
    	}else if(optModule.compareTo(OperationModule.FORMAL_COURSE.getValue())==0){
    		return OperationModule.FORMAL_COURSE.getName();
    		
    	}else if(optModule.compareTo(OperationModule.STUDENT_AGAIN_DISTRIBUTION.getValue())==0){
    		return OperationModule.STUDENT_AGAIN_DISTRIBUTION.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WAIT_CHECK_CHILD_ORDER.getValue())==0){
    		return OperationModule.WAIT_CHECK_CHILD_ORDER.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WAIT_CHECK_ORDER.getValue())==0){
    		return OperationModule.WAIT_CHECK_ORDER.getName();
    		
    	}else if(optModule.compareTo(OperationModule.COURSE_PRICE_124001.getValue())==0){
    		return OperationModule.COURSE_PRICE_124001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.LEADS_ASSESSMENT_125001.getValue())==0){
    		return OperationModule.LEADS_ASSESSMENT_125001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.PROMOTION_CODE_126001.getValue())==0){
    		return OperationModule.PROMOTION_CODE_126001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.NEW_STUDENT_DISTRIBUTION_127001.getValue())==0){
    		return OperationModule.NEW_STUDENT_DISTRIBUTION_127001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.HAVE_COURSE_128001.getValue())==0){
    		return OperationModule.HAVE_COURSE_128001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WAIT_COURSE_129001.getValue())==0){
    		return OperationModule.WAIT_COURSE_129001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TR_130001.getValue())==0){
    		return OperationModule.TR_130001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CC_CR_100012.getValue())==0){
    		return OperationModule.CC_CR_100012.getName();
    		
    	}else if(optModule.compareTo(OperationModule.WORK_FLOW_180001.getValue())==0){
    		return OperationModule.WORK_FLOW_180001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.DEBUG_COURSE_190001.getValue())==0){
    		return OperationModule.DEBUG_COURSE_190001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CLIENT_MANAGE_200001.getValue())==0){
    		return OperationModule.CLIENT_MANAGE_200001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.CLIENT_DOWNLOAD_COUNT_210001.getValue())==0){
    		
    		return OperationModule.CLIENT_DOWNLOAD_COUNT_210001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TR_OUT_BOUND_230001.getValue())==0){
    		
    		return OperationModule.TR_OUT_BOUND_230001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_DATE_111009.getValue())==0){
    		
    		return OperationModule.TC_DATE_111009.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106008.getValue())==0){
    		
    		return OperationModule.TC_TEACHER_106008.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TC_TEACHER_106009.getValue())==0){
    		
    		return OperationModule.TC_TEACHER_106009.getName();
    		
    	}else if(optModule.compareTo(OperationModule.REPEAT_SIGN_UP_LEADS_220001.getValue())==0){
    		
    		return OperationModule.REPEAT_SIGN_UP_LEADS_220001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.COURSE_ADJUSTMENT_220003.getValue())==0){
    		
    		return OperationModule.COURSE_ADJUSTMENT_220003.getName();
    		
    	}else if(optModule.compareTo(OperationModule.COURSEWARE_MANAGE_240001.getValue())==0){
    		
    		return OperationModule.COURSEWARE_MANAGE_240001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.SALE_TARGET_250001.getValue())==0){
    		
    		return OperationModule.SALE_TARGET_250001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.FN_AUDITED_260001.getValue())==0){
    		
    		return OperationModule.FN_AUDITED_260001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.SALE_KPI_270001.getValue())==0){
    		
    		return OperationModule.SALE_KPI_270001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.FN_OFFLINE_260001.getValue())==0){
    		
    		return OperationModule.FN_OFFLINE_260001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.ARRANGE_COURSE_250002.getValue())==0){
    		
    		return OperationModule.ARRANGE_COURSE_250002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.RECOMMEND_LEADS_250003.getValue())==0){
    		
    		return OperationModule.RECOMMEND_LEADS_250003.getName();
    		
    	}else if(optModule.compareTo(OperationModule.TEAM_SALE_TARGET_280001.getValue())==0){
    		
    		return OperationModule.TEAM_SALE_TARGET_280001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.SALE_TARGET_280002.getValue())==0){
    		
    		return OperationModule.SALE_TARGET_280002.getName();
    		
    	}else if(optModule.compareTo(OperationModule.PROD_COUPON_CODE_290001.getValue())==0){
    		
    		return OperationModule.PROD_COUPON_CODE_290001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.UPDATE_PHONE_300001.getValue())==0){
    		
    		return OperationModule.UPDATE_PHONE_300001.getName();
    		
    	}else if(optModule.compareTo(OperationModule.LEAVE_TEACHER_111010.getValue())==0){
    		
    		return OperationModule.LEAVE_TEACHER_111010.getName();
    		
    	}
    	
    	 	 		
		return optModuleDesc;
	}

	public void setOptModuleDesc(String optModuleDesc) {
		this.optModuleDesc = optModuleDesc;
	}

	public String getOptTypeDesc() {
		Integer optType =this.getOptType();
    	if(optType==null){
    		return null; 
    	}else if(optType.compareTo(OperationType.ADD.getValue())==0){
    		return OperationType.ADD.getName();   
    		
    	}else if(optType.compareTo(OperationType.UPDATE.getValue())==0){
    		return OperationType.UPDATE.getName();  
    		
    	}else if(optType.compareTo(OperationType.DELETE.getValue())==0){
    		return OperationType.DELETE.getName();  
    		
    	}else if(optType.compareTo(OperationType.GIVE_UP.getValue())==0){
    		return OperationType.GIVE_UP.getName();  
    		
    	}else if(optType.compareTo(OperationType.ASSIGN.getValue())==0){
    		return OperationType.ASSIGN.getName(); 
    		
    	}else if(optType.compareTo(OperationType.REMARK.getValue())==0){
    		return OperationType.REMARK.getName(); 
    		
    	}else if(optType.compareTo(OperationType.TRANSFER.getValue())==0){
    		return OperationType.TRANSFER.getName(); 
    		
    	} else if(optType.compareTo(OperationType.LOGIN.getValue())==0){
    		return OperationType.LOGIN.getName(); 
    		
    	} else if(optType.compareTo(OperationType.RESERVATION_COURSE.getValue())==0){
    		return OperationType.RESERVATION_COURSE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.EDIT_CALL_STATE.getValue())==0){
    		return OperationType.EDIT_CALL_STATE.getName(); 
    		
    	}else if(optType.compareTo(OperationType.INTERVIEW.getValue())==0){
    		return OperationType.INTERVIEW.getName(); 
    		
    	} else if(optType.compareTo(OperationType.HAVE_VIDEO.getValue())==0){
    		return OperationType.HAVE_VIDEO.getName(); 
    		
    	}else if(optType.compareTo(OperationType.GET.getValue())==0){
    		return OperationType.GET.getName(); 
    	}else if(optType.compareTo(OperationType.PASS.getValue())==0){
    		return OperationType.PASS.getName(); 
    		
    	} else if(optType.compareTo(OperationType.REFUSE.getValue())==0){
    		return OperationType.REFUSE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.STOP_SCHEDULE.getValue())==0){
    		return OperationType.STOP_SCHEDULE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.START_SCHEDULE.getValue())==0){
    		return OperationType.START_SCHEDULE.getName(); 
    		
    	}else if(optType.compareTo(OperationType.EDIT_REMARK.getValue())==0){
    		return OperationType.EDIT_REMARK.getName(); 
    		
    	}else if(optType.compareTo(OperationType.DISPLAY_PHONE.getValue())==0){
    		return OperationType.DISPLAY_PHONE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.ROLL_BACK_INTERVIEW.getValue())==0){
    		return OperationType.ROLL_BACK_INTERVIEW.getName(); 
    		
    	} else if(optType.compareTo(OperationType.WAIVER.getValue())==0){
    		return OperationType.WAIVER.getName(); 
    		
    	}else if(optType.compareTo(OperationType.PERFECT_TEACHER.getValue())==0){
    		return OperationType.PERFECT_TEACHER.getName(); 
    		
    	} else if(optType.compareTo(OperationType.DELETE_FILE.getValue())==0){
    		return OperationType.DELETE_FILE.getName(); 
    		
    	}else if(optType.compareTo(OperationType.BINDING_ACCOUNT.getValue())==0){
    		return OperationType.BINDING_ACCOUNT.getName(); 
    		
    	} else if(optType.compareTo(OperationType.TEACHER_DATE.getValue())==0){
    		return OperationType.TEACHER_DATE.getName(); 
    		
    	}else if(optType.compareTo(OperationType.TEACHER_LOGIN.getValue())==0){
    		return OperationType.TEACHER_LOGIN.getName(); 
    		
    	}else if(optType.compareTo(OperationType.TRAINING_DATE.getValue())==0){
    		return OperationType.TRAINING_DATE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.UPLOAD_FILE.getValue())==0){
    		return OperationType.UPLOAD_FILE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.DOWNLOAD_FILE.getValue())==0){
    		return OperationType.DOWNLOAD_FILE.getName(); 
    		
    	}  else if(optType.compareTo(OperationType.SEND_MAIL.getValue())==0){
    		return OperationType.SEND_MAIL.getName(); 
    		
    	}  else if(optType.compareTo(OperationType.IN_INVENTORY.getValue())==0){
    		return OperationType.IN_INVENTORY.getName(); 
    		
    	} else if(optType.compareTo(OperationType.GET_CORSE_ORDER.getValue())==0){
    		return OperationType.GET_CORSE_ORDER.getName(); 
    		
    	} else if(optType.compareTo(OperationType.BIND_TR.getValue())==0){
    		return OperationType.BIND_TR.getName(); 
    		
    	} else if(optType.compareTo(OperationType.MAKE_UP_LESSONS.getValue())==0){
    		return OperationType.MAKE_UP_LESSONS.getName(); 
    		
    	} else if(optType.compareTo(OperationType.GREEN_CHANNEL.getValue())==0){
    		return OperationType.GREEN_CHANNEL.getName(); 
    		
    	} else if(optType.compareTo(OperationType.ADD_SIGN.getValue())==0){
    		return OperationType.ADD_SIGN.getName(); 
    		
    	} else if(optType.compareTo(OperationType.REMOVE_SIGN.getValue())==0){
    		return OperationType.REMOVE_SIGN.getName(); 
    		
    	} else if(optType.compareTo(OperationType.BATCH_ADD.getValue())==0){
    		return OperationType.BATCH_ADD.getName(); 
    		
    	} else if(optType.compareTo(OperationType.ONLINE.getValue())==0){
    		return OperationType.ONLINE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.OFFLINE.getValue())==0){
    		return OperationType.OFFLINE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.MESSAGE_SEND.getValue())==0){
    		return OperationType.MESSAGE_SEND.getName(); 
    		
    	} else if(optType.compareTo(OperationType.CREATE_COURSE.getValue())==0){
    		return OperationType.CREATE_COURSE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.BACK_OUT_COURSE.getValue())==0){
    		return OperationType.BACK_OUT_COURSE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.SEAT_BIND.getValue())==0){
    		return OperationType.SEAT_BIND.getName(); 
    		
    	} else if(optType.compareTo(OperationType.SEAT_ONLINE_BIND.getValue())==0){
    		return OperationType.SEAT_ONLINE_BIND.getName(); 
    		
    	} else if(optType.compareTo(OperationType.CHANGE_SUBJECT_OR_TEACHER.getValue())==0){
    		return OperationType.CHANGE_SUBJECT_OR_TEACHER.getName(); 
    		
    	} else if(optType.compareTo(OperationType.ADD_COURSE.getValue())==0){
    		
    		return OperationType.ADD_COURSE.getName(); 
    		
    	} else if(optType.compareTo(OperationType.EDIT_LEADS_FAMILY.getValue())==0){
    		
    		return OperationType.EDIT_LEADS_FAMILY.getName();
    		
    	}else if(optType.compareTo(OperationType.ADD_NOTES.getValue())==0){
    		
    		return OperationType.ADD_NOTES.getName(); 
    		
    		
    	}else if(optType.compareTo(OperationType.ADD_INTERVIEW.getValue())==0){
    		
    		return OperationType.ADD_INTERVIEW.getName(); 
    		
    	}else if(optType.compareTo(OperationType.AUDIT_WORK_FLOW.getValue())==0){
    		
    		return OperationType.AUDIT_WORK_FLOW.getName(); 
    		
    	}else if(optType.compareTo(OperationType.COPY_TEACHER_INFO.getValue())==0){
    		
    		return OperationType.COPY_TEACHER_INFO.getName(); 
    		
    	}else if(optType.compareTo(OperationType.ROLL_BACK_AGENT.getValue())==0){
    		
    		return OperationType.ROLL_BACK_AGENT.getName(); 
    		
    	}else if(optType.compareTo(OperationType.TRAINING_ANSWER.getValue())==0){
    		
    		return OperationType.TRAINING_ANSWER.getName(); 
    		
    	}else if(optType.compareTo(OperationType.PLAY_AUDIO.getValue())==0){
    		
    		return OperationType.PLAY_AUDIO.getName(); 
    		
    	}else if(optType.compareTo(OperationType.UPLOAD_COURSEWARE.getValue())==0){
    		
    		return OperationType.UPLOAD_COURSEWARE.getName(); 
    		
    	}else if(optType.compareTo(OperationType.UPDATE_COURSEWARE.getValue())==0){
    		
    		return OperationType.UPDATE_COURSEWARE.getName(); 
    		
    	}else if(optType.compareTo(OperationType.DOWNLOAD_COURSEWARE.getValue())==0){
    		
    		return OperationType.DOWNLOAD_COURSEWARE.getName(); 
    		
    	}else if(optType.compareTo(OperationType.EXPORT_EXCEL.getValue())==0){
    		
    		return OperationType.EXPORT_EXCEL.getName(); 
    		
    	}else if(optType.compareTo(OperationType.BATCH_UPDATE.getValue())==0){
    		
    		return OperationType.BATCH_UPDATE.getName(); 
    		
    	}else if(optType.compareTo(OperationType.ADD_COURSE_ORDER.getValue())==0){
    		
    		return OperationType.ADD_COURSE_ORDER.getName(); 
    		
    	}else if(optType.compareTo(OperationType.UPDATE_PHONE.getValue())==0){
    		
    		return OperationType.UPDATE_PHONE.getName(); 
    		
    	}
    		
		return optTypeDesc;
	}

	public void setOptTypeDesc(String optTypeDesc) {
		this.optTypeDesc = optTypeDesc;
	}

	

	public String getCreateDateStart() {
		return createDateStart;
	}

	public void setCreateDateStart(String createDateStart) {
		this.createDateStart = createDateStart;
	}

	public String getCreateDateEnd() {
		return createDateEnd;
	}

	public void setCreateDateEnd(String createDateEnd) {
		this.createDateEnd = createDateEnd;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getOptModule() {
        return optModule;
    }

    public void setOptModule(Integer optModule) {
        this.optModule = optModule;
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public Integer getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


}
