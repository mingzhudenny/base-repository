package com.repository.tcrm.Dto.course.server;



import com.repository.tcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CourseTimeDto extends BaseDto{
	/**  */
	private static final long serialVersionUID = 7985519758426418977L;
	private String courseTime;//格式yyyy-MM-dd HH:mm-HH:mm
	private String courseUuid;
	private String courseOrderUuid;
	private String courseRequestUuid;
	private String CrUuid;
	private String coursePayRequestUuid;
}
