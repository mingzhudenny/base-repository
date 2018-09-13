/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.server.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 题目
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QuestionInfoModel.java, v 0.1 2018年7月24日 下午6:48:33  Exp $
 */
@Data
public class QuestionInfoModel {
	
	/** 题目id*/
	private Integer questionId;
	/** 题目类型id（通过获取题型信息接口可获取）*/
	private Integer questionCategoryId;
	/** 题目类型名称*/
	private String questionCategoryName;
	/** 题干内容，小题会拼接到题干中*/
	private String stem;
	/** 答案，各小题的答案会换行拼接在一起*/
	private List<String> answer;
	/** 知识点id（通过获取知识点信息接口可获取）*/
	private Integer knowledgePointId;
	/** 解题方法标签id（暂不提供对应数据字典）*/
	private String analyticMethod;
	/** 能力结构标签id（暂不提供对应数据字典）*/
	private String abilityStructure;
	/** 题目难度（参见字典数据）*/
	private Integer questionLevel;
	/** 题目解析*/
	private String analysis;
	/** 章节id（通过获取章节信息接口可获取）*/
	private List<Integer> sectionMappings;
	/** 选项，选择题才有 */
	private List<String> options;
	/** 题目展示模板 */
	private Integer questionDisplayId;

}
