/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;

import java.util.List;

import lombok.Data;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: GetQuestionsByIntelligentQuestionDTO.java, v 0.1 2018年8月3日 上午10:23:17  Exp $
 */
@Data
public class GetQuestionsByIntelligentQuestionDTO {
	
	/** 客户平台的用户标识 */
	private String userCode;
	/** 学科 */
	private Integer courseId;
	/** 教材版本Id   */
	private Integer bookVersionId;
	/** 1:章节 ,0：知识点 */
	private Integer byCourseMapping;
	/** 知识点Id集合  */
	private List<Integer> knowledgePointIds;
	/** 教材和章节Id对象集合  */
	private List<IntelligentChapterModel> chapterIds;
	/** 题型数量对象集合 */
	private List< IntelligentCategoryCountModel> questionCounts;
	/** 难度ID */
	private Integer  questionLevelId;

}
