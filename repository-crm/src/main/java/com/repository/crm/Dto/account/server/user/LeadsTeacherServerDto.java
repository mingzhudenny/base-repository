package com.repository.crm.Dto.account.server.user;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * 系统全局搜索,学生列表返回实体
 * 
 * @ClassName:
 * @author wqz
 * @date 2018年4月10日
 * @version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LeadsTeacherServerDto {
	/** 身份，学生或老师 */
	private Integer identity;
	/** 学生姓名 */
	private String name;
	/** 联系电话 */
	private String phone;
	/** 所属销售 */
	private String ccName;
	/** 所属电话 */
	private String ccPhone;
	/** 是否被标记过0：否1是 */
	private Integer isSign;
	/**
	 * 跟进状态 渠道0:新名单1：藏经阁2:离职leads名单3：离职正式生名单4；新名单待分配
	 * 5；CC跟进中6；回收站7；离职leads库8；新正式生待分配9；本团队正式生待分配 10；CR跟进中
	 * 11；结课12；退费13；停课14；离职学员库
	 */
	private Integer studentStatus;
	/** 老师状态 1 待面试 2 待培训 3 待完善资料 4 待二次培训 5 讲师可排课 6不可排课20 回收站 */
	private Integer teacherStatus;
	/** 是否标记S名单 */
	private Integer signStatus;
}
