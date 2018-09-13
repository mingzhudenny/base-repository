package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 批量关联leads客户端传递参数
 *
 * @author csy
 * @time  2018年5月2日 上午11:59:20
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AddBatchTestCourseLeadsClientDTO extends BaseDto{

	/**
	 * 课程uuid
	 */
	private String courseUuid;
	/**
	 * 关联的leadsUuid 格式为leadsUuid1,leadsUuids2,leadsUuid3……
	 */
	private String leadsUuids;
}
