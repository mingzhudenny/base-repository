package com.repository.crm.Dto.kpi.server.course;

import lombok.Data;

/**
 * 
 * <pre>
 * 合肥-老师课表订单显示
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CourseOrderVo.java, v 0.1 2018年6月26日 下午2:54:54  Exp $
 */
@Data
public class CourseOrderVo {
	
	private String studentName;
	private String teacherName;
	private String userName;
	private String courseOrderUuid;//课程订单uuid
	private String leadsUuid;
	private String teacherUuid;
	private String courseRequestUuid;//课程需求uuid
	private String firstCourseDate;//首次课程日期
	private String courseStuNum;//以上课程数
	private String courseArrNum;//安排课程数
	private String crUuid;//cr的uuid
	private String grade;//年级
	private String subject;//科目
	private String tcPhone;//老师电话
	private String stuPhone;//学生电话		
	
}
