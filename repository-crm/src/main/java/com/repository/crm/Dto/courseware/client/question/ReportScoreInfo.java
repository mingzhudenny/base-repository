package com.repository.crm.Dto.courseware.client.question;

import lombok.Data;

/**
 * 
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ReportScoreInfo.java, v 0.1 2018年8月1日 下午5:15:54  Exp $
 */
@Data
public class ReportScoreInfo {
	
	/** 题目序号 */
	private Integer questionNumber;
	/** 题目得分，保留一位小数 */
	private Double score;

}
