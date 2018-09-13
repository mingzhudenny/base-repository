package com.repository.crm.constant;
/**
 * 业务日志，操作类型
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: OperationType.java, v 0.1 2017年2月15日 下午5:41:09 chenzhongxing Exp $
 */
public enum OperationType { 
	
	GET(0,"获取"),ADD(1,"新增"),UPDATE(2,"更新"),DELETE(3,"删除"),GIVE_UP(4,"放弃要求"),ASSIGN(5,"分配"),
	REMARK(6,"备注"),TRANSFER(7,"移交"),LOGIN(8,"登录"),RESERVATION_COURSE(9,"预约课程"),
	EDIT_CALL_STATE(10,"记录电话拨打状态"),INTERVIEW(12,"面试/培训"),HAVE_VIDEO(13,"是否有视频"),
	PASS(14,"审核通过"),REFUSE(15,"拒绝"),DISPLAY_PHONE(16,"显示手机号码"),STOP_SCHEDULE(17,"停止排课"),
	START_SCHEDULE(18,"恢复排课"),EDIT_REMARK(19,"编辑老师排课备注"),
	ROLL_BACK_INTERVIEW(20,"回收面试"),WAIVER(21,"自动放弃"),PERFECT_TEACHER(22,"老师完善资料"),
	DELETE_FILE(23,"删除文件"),TEACHER_LOGIN(24,"微信老师-登录账号"),
	BINDING_ACCOUNT(25,"微信老师-绑定账号"),
	TEACHER_DATE(26,"调整空闲时间"),
	TRAINING_DATE(27,"调整培训日期"),UPLOAD_FILE(28,"上传文件"),DOWNLOAD_FILE(29,"下载文件"),
	SEND_MAIL(30,"发送邮件"),IN_INVENTORY(31,"老师入库"),GET_CORSE_ORDER(32,"查看排课信息"),
	BIND_TR(33,"绑定天润"),MAKE_UP_LESSONS(34,"补课"),GREEN_CHANNEL(35,"创建绿色通道"),
	ADD_SIGN(36,"添加标记"),REMOVE_SIGN(36,"取消标记"),BATCH_ADD(37,"批量新增"),
	ONLINE(38,"上线"),OFFLINE(39,"下线"),MESSAGE_SEND(40,"短信通知"),CREATE_COURSE(41,"排课"),
	BACK_OUT_COURSE(42,"撤销"),SEAT_BIND(43,"绑定"),SEAT_ONLINE_BIND(44,"绑定并上线"),
	CHANGE_SUBJECT_OR_TEACHER(45,"换科换老师"),ADD_COURSE(46,"扩科"),
	EDIT_LEADS_FAMILY(47,"编辑家长信息"),ADD_NOTES(48,"新增监课备注"),ADD_INTERVIEW(49,"新增面试评价"),
	AUDIT_WORK_FLOW(50,"工单审核"),COPY_TEACHER_INFO(51,"复制老师信息"),ROLL_BACK_AGENT(52,"激活代理"),
	TRAINING_ANSWER(54,"培训老师考试"),PLAY_AUDIO(55,"播放音频文件"),
	INTERVIEW_SCHEDULE(56,"更新面试账号"),ADD_INTERVIEW_SCHEDULE(57,"新增面试安排"),
	UPLOAD_COURSEWARE(58,"上传课件"),UPDATE_COURSEWARE(59,"更新课件"),DOWNLOAD_COURSEWARE(60,"下载课件"),
	EXPORT_EXCEL(61,"导出excel"),BATCH_UPDATE(62,"批量更新"),ADD_COURSE_ORDER(63,"新增课程订单"),
	UPDATE_PHONE(64,"修改手机号码"),UPDATE_RECEIPT_STATUS(65,"更新发票状态");
		
	OperationType(Integer value,String name){
		this.value = value;
		this.name = name;
	}
	private String name;
	private Integer value;
	
	public String getName() {
		return name;
	}
	public Integer getValue() {
		return value;
	}

}
