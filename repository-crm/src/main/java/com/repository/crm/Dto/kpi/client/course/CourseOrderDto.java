package com.repository.crm.Dto.kpi.client.course;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * <pre>
 * 合肥-老师课表订单查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseOrderDto.java, v 0.1 2018年6月26日 下午2:57:16  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class CourseOrderDto extends  BaseDto{

	
	private String studentParams;//学生的手机号
	
	private String teacherParams;//老师的姓名
	
	private String grade;//所报年级
	
	private String subject;//所报的科目
	
	private String userName;//cr的名字
	
	private String courseDateStart;//课程开始时间
	
	private String courseDateEnd;//课程结束时间
	
	/** 师训中心 1 上海  2 合肥  */
	private String branch;
	
	private Integer pageIndex;
	
	private Integer pageNumber;
	
	private String orderBy;	
	
	

	
}
