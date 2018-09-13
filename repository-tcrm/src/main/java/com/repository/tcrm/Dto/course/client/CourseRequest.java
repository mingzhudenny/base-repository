package com.repository.tcrm.Dto.course.client;



import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CourseRequest extends BaseRequest{
//	@NotBlank(message = "上课日期不能为空！")
//	@Pattern(regexp = "^(\\d{4}-\\d{2}-\\d{2})|$", message = "开始日期格式错误，正确格式：yyyy-MM-dd！")
	private String courseDate;//上课日期
//	@NotBlank(message = "上课开始时间不能为空！")
	private String courseStartTime;//上课开始时间
//	@NotBlank(message = "上课时长不能为空！")
	private Integer courseLength;//上课时长
	
	private String courseOrderUuid;
	
	private String courseRequestUuid;
	
	private String coursePayRequestUuid;
	
	private String leadsUuid;
	
	private String crUuid;
}
