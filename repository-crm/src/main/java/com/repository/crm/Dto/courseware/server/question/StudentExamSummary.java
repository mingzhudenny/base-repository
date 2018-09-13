package com.repository.crm.Dto.courseware.server.question;

import lombok.Data;
/**
 * 
 * <pre>
 * 提交答题结果后返回的测评id
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: StudentExamSummary.java, v 0.1 2018年7月27日 下午4:15:58  Exp $
 */
@Data
public class StudentExamSummary {
	
	private String UserCode;
	
	private String  ExamResultId;

}
