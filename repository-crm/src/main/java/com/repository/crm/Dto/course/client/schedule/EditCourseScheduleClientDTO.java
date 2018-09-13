package com.repository.crm.Dto.course.client.schedule;

import com.repository.crm.Dto.BaseDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 编辑课表信息dto
 *
 * @author csy
 * @time  2018年5月22日 下午1:16:03
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(value = "编辑课表信息DTO", description = "编辑课表信息DTO")
public class EditCourseScheduleClientDTO extends BaseDto{

	@ApiModelProperty(value = "课表uuid", name = "uuid",required=true)
	private String uuid;
	
	@ApiModelProperty(value = "leadsuuid", name = "leadsUuid",required=false)
	private String leadsUuid;

	@ApiModelProperty(value = "老师电话号码", name = "teacherPhone",required=false)
	private String teacherPhone;
	
	@ApiModelProperty(value = "科目", name = "subject",required=false)
	private String subject;
	
	@ApiModelProperty(value = "年级", name = "subject",required=false)
	private String grade;
	
	
}
