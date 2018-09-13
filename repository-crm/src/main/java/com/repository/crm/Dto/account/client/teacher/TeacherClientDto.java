package com.repository.crm.Dto.account.client.teacher;

import java.io.Serializable;
import java.util.Date;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * 师资管理-师资库老师离职 入参
 * 
 * @author wqz
 * @ClassName: TeacherClientDto
 * @date
 * @version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TeacherClientDto extends BaseDto implements Serializable {
	private static final long serialVersionUID = 3036999289570936874L;
	/** 老师唯一 */
	private String uuid;
	/** 老师状态 1 待面试 2 待培训 3 待完善资料 4 待二次培训 5 讲师可排课 6不可排课20 回收站 */
	private String teacherStatus;
	/** 更新时间 */
	private Date updateDate;
	private String updateUserId;
	private String remark;
	/** 姓名或手机 */
	private String word;
	/** 类型（工作性质    1,"社招全职"  2,"兼职"  3,"校招全职"） */
	private String natureOfWork;
	/** 更新开始时间 */
	private String startDate;
	/** 更新结束时间 */
	private String endDate;
	/** 面试时的薪资评级 */
	private Integer payGrade;
	/** 面试人 */
    private String interviewUser;
	/** 老师唯一*/
	private String teacherUuid;
	private String loginName;
	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId == null ? null : updateUserId.trim();
	}

}
