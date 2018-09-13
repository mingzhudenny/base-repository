package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

@Data
public class GetIntelligentExerciseResult {
	
	/**  题集id，用于提交成绩 */
	private String TeacherExamId;
	/**  题集的题目信息集合 */
	private List<TeacherExamQuestionModel> Questions;

}
