/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 保存题集的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: SaveTeacherExamDTO.java, v 0.1 2018年7月31日 下午3:00:43  Exp $
 */
@Data
public class SaveTeacherExamDTO {
	
	private String userCode;
	/** 提交人的uuid */
	private String createUserId;
	/** 教材版本Id   */
	private Integer bookVersionId;
	/** 题集名称  */
	private String teacherExamName;
	/** 题目列表  */
	private List<QuestionInfoDTO> questionInfoList;	
	

}
