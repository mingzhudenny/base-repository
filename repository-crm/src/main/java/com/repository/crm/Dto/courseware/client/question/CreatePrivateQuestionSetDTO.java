/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 新增私有题集的参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CreatePrivateQuestionSetDTO.java, v 0.1 2018年8月7日 下午5:02:55  Exp $
 */
@Data
public class CreatePrivateQuestionSetDTO {
	
	private String userCode;
	private Integer courseId;
	private List<PrivateQuestion> privateQuestions;

}
