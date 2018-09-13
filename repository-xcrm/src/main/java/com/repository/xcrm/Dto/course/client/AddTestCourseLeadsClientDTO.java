package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 测评课关联leads信息
 *
 * @author csy
 * @time  2018年4月28日 上午10:56:48
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AddTestCourseLeadsClientDTO extends BaseDto{
	/**
	 * leadsuuid
	 */
	private String leadsUuid;
	/**
	 * 课程uuid
	 */
	private String courseUuid;
	/**
	 * 课程备注
	 */
	private String courseRemark;
}
