package com.repository.tcrm.Dto.course.client;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AdjustCourseRequest extends BaseRequest{
	private String courseOrderUuid;
	
	private String courseRequestUuid;
	
	private String coursePayRequestUuid;
	
	private String CrUuid;
	
	private String leadsUuid;
	
	private String courseUuid;
	
	private String stuName;
	
	private String stuPhone;
	
	private String subject;
	
	private String courseTime;
	
	private String courseAdjustDate;
	
	private String courseAdjustStartTime;
	
	private Integer courseAdjustLength;

}
