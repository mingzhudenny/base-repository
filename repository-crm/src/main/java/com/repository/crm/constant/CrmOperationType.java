package com.repository.crm.constant;

/**
 * 业务日志，操作类型
 * @author csy
 * @date 2017年12月18日 下午3:10:10
 */
public enum CrmOperationType {
	
	GET(0,"获取"),
	ADD(1,"新增"),
	UPDATE(2,"更新"),
	DELETE(3,"删除"),
	GIVE_UP(4,"放弃要求"),
	ASSIGN(5,"分配"),
	REMARK(6,"备注"),
	TRANSFER(7,"移交"),
	LOGIN(8,"登录"),
	RESERVATION_COURSE(9,"预约课程"),
	EDIT_CALL_STATE(10,"记录电话拨打状态"),
	INTERVIEW(12,"面试/培训"),
	HAVE_VIDEO(13,"是否有视频"),
	PASS(14,"审核通过"),
	REFUSE(15,"拒绝"),
	DISPLAY_PHONE(16,"显示手机号码"),
	STOP_SCHEDULE(17,"停止排课"),
	START_SCHEDULE(18,"恢复排课"),
	EDIT_REMARK(19,"编辑老师排课备注"),
	ROLL_BACK_INTERVIEW(20,"回收面试"),
	WAIVER(21,"自动放弃"),
	PERFECT_TEACHER(22,"老师完善资料"),
	DELETE_FILE(23,"删除文件"),
	TEACHER_LOGIN(24,"微信老师-登录账号"),
	BINDING_ACCOUNT(25,"微信老师-绑定账号"),
	TEACHER_DATE(26,"微信老师-调整空闲时间"),
	TRAINING_DATE(27,"调整培训日期"),
	UPLOAD_FILE(28,"上传文件"),
	DOWNLOAD_FILE(29,"下载文件"),
	SEND_MAIL(30,"发送邮件"),
	IN_INVENTORY(31,"老师入库"),
	GET_CORSE_ORDER(32,"查看排课信息"),
	BIND_TR(33,"绑定天润"),
	MAKE_UP_LESSONS(34,"补课"),
	GREEN_CHANNEL(35,"创建绿色通道"),
	ADD_SIGN(36,"添加标记"),
	BATCH_ADD(37,"批量新增"),
	ONLINE(38,"上线"),
	OFFLINE(39,"下线"),
	MESSAGE_SEND(40,"短信通知"),
	CREATE_COURSE(41,"排课"),
	BACK_OUT_COURSE(42,"撤销"),
	SEAT_BIND(43,"绑定"),
	SEAT_ONLINE_BIND(44,"绑定并上线"),
	CHANGE_SUBJECT_OR_TEACHER(45,"换科换老师"),
	ADD_COURSE(46,"扩科"),
	EDIT_LEADS_FAMILY(47,"编辑家长信息"),
	ADD_NOTES(48,"新增监课备注"),
	ADD_INTERVIEW(49,"新增面试评价"),
	AUDIT_WORK_FLOW(50,"工单审核"),
	COPY_TEACHER_INFO(51,"复制老师信息"),
	ROLL_BACK_AGENT(52,"激活代理"),
	TRAINING_ANSWER(54,"培训老师考试"),
	EXPORT(55,"导出"),
	MERGE_ORDERS(56,"合并订单"),
	PLAY_AUDIO(57,"播放音频文件"),
	BATCH_ASSIGN(58,"批量分配"),
	ADD_CLASS(59,"开课"),
	RECEIVE_VIDEO(60,"确认接收视频"),
	ENABLED(61,"启用"),
	DISABLED(62,"禁用"),
	PAY_APPLY(63,"付费申请"),
	SCHEDULE_CLASS(64,"排课"),
	BATCH_SCHEDULE_CLASS(65,"批量排课"),
	REMOVE_SIGN(66,"取消标记"),
	RESET_PWD(67,"重置密码");
	CrmOperationType(Integer value, String name){
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

	public static CrmOperationType findByValue(Integer value) {
		switch (value) {
			case 0:
				return GET;
			case 1:
				return ADD;
			case 2:
				return UPDATE;
			case 3:
				return DELETE;
			case 4:
				return GIVE_UP;
			case 5:
				return ASSIGN;
			case 6:
				return REMARK;
			case 7:
				return TRANSFER;
			case 8:
				return LOGIN;
			case 9:
				return RESERVATION_COURSE;
			case 10:
				return EDIT_CALL_STATE;
			case 12:
				return INTERVIEW;
			case 13:
				return HAVE_VIDEO;
			case 14:
				return REFUSE;
			case 15:
				return REFUSE;
			case 16:
				return DISPLAY_PHONE;
			case 17:
				return STOP_SCHEDULE;
			case 18:
				return START_SCHEDULE;
			case 19:
				return EDIT_REMARK;
			case 20:
				return ROLL_BACK_INTERVIEW;
			case 21:
				return WAIVER;
			case 22:
				return PERFECT_TEACHER;
			case 23:
				return DELETE_FILE;
			case 24:
				return TEACHER_LOGIN;
			case 25:
				return BINDING_ACCOUNT;
			case 26:
				return TEACHER_DATE;
			case 27:
				return TRAINING_DATE;
			case 28:
				return UPLOAD_FILE;
			case 29:
				return DOWNLOAD_FILE;
			case 30:
				return SEND_MAIL;
			case 31:
				return IN_INVENTORY;
			case 32:
				return GET_CORSE_ORDER;
			case 33:
				return BIND_TR;
			case 34:
				return MAKE_UP_LESSONS;
			case 35:
				return GREEN_CHANNEL;
			case 36:
				return ADD_SIGN;
			case 37:
				return BATCH_ADD;
			case 38:
				return ONLINE;
			case 39:
				return OFFLINE;
			case 40:
				return MESSAGE_SEND;
			case 41:
				return CREATE_COURSE;
			case 42:
				return BACK_OUT_COURSE;
			case 43:
				return SEAT_BIND;
			case 44:
				return SEAT_ONLINE_BIND;
			case 45:
				return CHANGE_SUBJECT_OR_TEACHER;
			case 46:
				return ADD_COURSE;
			case 47:
				return EDIT_LEADS_FAMILY;
			case 48:
				return ADD_NOTES;
			case 49:
				return ADD_INTERVIEW;
			case 50:
				return AUDIT_WORK_FLOW;
			case 51:
				return COPY_TEACHER_INFO;
			case 52:
				return ROLL_BACK_AGENT;
			case 54:
				return TRAINING_ANSWER;
			case 55:
				return EXPORT;
			case 56:
				return MERGE_ORDERS;
			case 57:
				return PLAY_AUDIO;
			case 58:
				return BATCH_ASSIGN;
			case 59:
				return ADD_CLASS;
			case 60:
				return RECEIVE_VIDEO;
			case 61:
				return ENABLED;
			case 62:
				return DISABLED;
			case 63:
				return PAY_APPLY;
			case 64:
				return SCHEDULE_CLASS;
			case 65:
				return BATCH_SCHEDULE_CLASS;
			case 66:
				return REMOVE_SIGN;
			default:
				return null;
		}
	}

}
