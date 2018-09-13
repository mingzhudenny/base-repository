/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.courseware.client.question;


import lombok.Data;

/**
 * 
 * <pre>
 * 根据章节获取题目列表查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: GetQuestionsByChapterSectionDTO.java, v 0.1 2018年7月31日 上午11:42:08  Exp $
 */
@Data
public class GetQuestionsByChapterSectionDTO {
	
	/** 客户平台的用户标识 */	
	private String userCode;
	/** 教材版本Id */
	private Integer bookVersionId;
	/** 教材IDId */
	private Integer courseMappingId;
	/** 章节ID */
	private Integer knowledgePointOrSectionId;
	/** 题型ID */
	private Integer questionCategoryId;
	/** 难度ID */
	private Integer questionLevelId;
	/** 是否只获取所属机构的私有题目
            （若未建立私有题库，传入0） */
	private Integer  isOnlyProprietaryQuestion;
	/** 当前所在页,从1开始 */
	private Integer pageIndex;	
	/** 每页显示多少条数据，最多显示20条  */
	private Integer pageSize;

}
