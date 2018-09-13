package com.repository.xcrm.Dto.account.client.teacher;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 老师的基本信息
 *
 * @author csy
 * @time  2018年4月17日 下午8:01:46
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryTeacherBaseClientDTO extends BaseDto{

	/**
	 * 老师的筛选条件 号码或者姓名
	 */
	private String teacherParam;
}
