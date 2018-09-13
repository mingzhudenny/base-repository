package com.repository.xcrm.Dto.account.client.teacher;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 新增老师课表的客户端参数
 *
 * @author csy
 * @time  2018年4月17日 下午8:57:34
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class SaveTeacherScheduleClientDTO extends BaseDto{

	/**
	 * 老师的uuid
	 */
	private String teacherUuid;
	/**
	 * 老师课表日期
	 */
	private String scheduleDate;
	/**
	 * 老师课表开始时间
	 */
	private String scheduleStartTime;
	/**
	 * 老师课表结束时间
	 */
	private String scheduleEndTime;
}
