/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.constant;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author wqz
 * @version $Id: AgentEnum.java, v 0.1 2018年4月19日 上午10:31:06 Exp $
 */
public class TeacherEnum {

	/**
	 * 性别
	 * 
	 * <pre>
	 * 
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年2月25日 下午3:30:14 Exp $
	 */
	public enum Sex {

		FEMALE(0, "女"), MALE(1, "男");
		Sex(Integer value, String name) {
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

	/**
	 * 工作性质
	 * 
	 * <pre>
	 * 
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年2月25日 下午3:30:22 Exp $
	 */
	public enum NatureOfWork {

		FULL_TIME(1, "社招全职"), PART_TIME(2, "兼职"), SCHOOL_RECRUIT(3, "校招全职");

		private Integer value;
		private String name;

		NatureOfWork(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

	/**
	 * 
	 * <pre>
	 * 是否有视频
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年3月1日 下午6:14:37 Exp $
	 */
	public enum HaveVideo {

		NO(0, "否"), YES(1, "是");

		private Integer value;
		private String name;

		HaveVideo(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

	/**
	 * 
	 * <pre>
	 * 学历
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年2月25日 下午3:35:40 Exp $
	 */
	public enum Education {

		UNDERGRADUATE(1, "本科"), MASTER(2, "硕士"), DOCTOR(3, "博士");

		private Integer value;
		private String name;

		Education(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

	/**
	 * 
	 * <pre>
	 * 文科或者理科
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年2月25日 下午3:36:39 Exp $
	 */
	public enum ArtsOrScience {

		ARTS(1, "文科"), SCIENCE(2, "理科");

		private Integer value;
		private String name;

		ArtsOrScience(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

	/**
	 * 
	 * <pre>
	 * 老师状态
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年2月25日 下午3:38:03 Exp $
	 */
	public enum TeacherStatus {

		BEFORE_INTERVIE(0, "待邀约"), INTERVIEW(1, "待面试"), TRAIN(2, "待培训"), FINISH(3, "待完善资料"), SECOND_TRAINING1(4,
				"待第二次培训"), LECTURER_1(5, "讲师可排课"), LECTURER_2(6, "讲师不可排课"), /*DISABLED(10, "已离职"),*/ TRASH(20, "回收站"),DISABLED(21,"已离职");
		private Integer value;
		private String name;

		TeacherStatus(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

	/**
	 * 
	 * <pre>
	 * 面试培训类型 0 待邀约  1 第一次面试 2 培训 3 待完善资料  4  第二次培训'
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年3月2日 下午5:35:35 Exp $
	 */
	public enum RecordType {
		REGISTER(0, "待邀约"), INTERVIEW(1, "待面试"), TRAIN(2, "待培训"), IMPERFECT(3, "待完善资料 "), SECOND_TRAINING1(4,
				"待第二次培训"), ROLLBACK(5, "回收面试"),LEAVE(6,"离职");
		private Integer value;
		private String name;

		RecordType(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

	/**
	 * 
	 * <pre>
	 * 面试结果
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年3月1日 下午7:23:37 Exp $
	 */
	public enum InterviewResult {

		PASS(1, "面试通过"), NO_PASS(2, "面试未通过"), TWO_INTERVIEW(3, "需要二次面试"),LEAVE(4, "已离职");

		private Integer value;

		private String name;

		InterviewResult(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

	/**
	 * 
	 * <pre>
	 * 面试，培训放弃的原因  放弃原因的value 不可以和面试结果InterviewResult 的value 相同
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年3月2日 下午2:33:42 Exp $
	 */
	public enum AbandonReason {

		REASON_1(21, "培训未通过"), REASON_2(22, "老师跑单"), REASON_3(23, "主动放弃"), REASON_4(24, "二次培训不通过");

		private Integer value;
		private String name;

		AbandonReason(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

	/**
	 * 
	 * <pre>
	 * 年级偏好
	 * </pre>
	 *
	 * @author chenzhongxing
	 * @version $Id: TeacherEnum.java, v 0.1 2017年3月3日 上午10:54:12 Exp $
	 */
	public enum GradePreference {

		PRIMARY_1(1, "小学"), PRIMARY_2(2, "小学,初中"), PRIMARY_3(3, "小学,初中,高中"), JUNIOR_1(4, "初中"), JUNIOR_2(5,
				"初中,高中"), HIGH(6, "高中");

		private Integer value;
		private String name;

		GradePreference(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Integer getValue() {
			return value;
		}

	}

}
