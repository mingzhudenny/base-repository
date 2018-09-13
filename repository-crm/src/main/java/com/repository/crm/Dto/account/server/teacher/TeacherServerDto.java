package com.repository.crm.Dto.account.server.teacher;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * 师资管理-师资库老师离职
 * 
 * @ClassName:
 * @author wqz
 * @date 2018年4月10日
 * @version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class TeacherServerDto {
	/** 老师姓名 */
	private String tcName;
	/** 联系电话 */
	private String phone;
	/** 工作性质    1,"社招全职"  2,"兼职"  3,"校招全职" */
	private String natureOfWork;
	/** 离职时间 */
	private String teacherLeaveTime;
	/** 时薪 */
	private Integer hourlyWage;
	/** 薪资等级  对应 tc_pay_grade  的ID */
	private Integer payGrade;
	/** 面试人姓名*/
	private String interviewUser;
	/** 老师唯一*/
	private String uuid;
	
}
