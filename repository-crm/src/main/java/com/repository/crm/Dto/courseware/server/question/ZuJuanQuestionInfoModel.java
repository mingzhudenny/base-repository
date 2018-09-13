/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 查询题目列表返回的题目
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ZuJuanQuestionInfoModel.java, v 0.1 2018年7月31日 下午1:46:47  Exp $
 */
@Data
public class ZuJuanQuestionInfoModel {
	
	/** 题目id */
	private Integer questionId;
	/** 题型id */
	private Integer questionCategoryId;
	/** 题型名称 */
	private String questionCategoryName;
	/** 题干内容，小题会拼接到题干中 */
	private String stem;
	/** 答案，各小题的答案会换行拼接在一起 */
	private List<String> answer;
	/** 题目难度 */
	private Integer questionLevel;
	/** 题目解析 */
	private String analysis;
	/** 章节id */
	private List<Integer> sectionMappings;
	/** 选项，选择题才有 */
	private List<String> options;

}
