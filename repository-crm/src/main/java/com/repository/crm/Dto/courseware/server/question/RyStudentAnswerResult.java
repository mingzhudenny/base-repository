package com.repository.crm.Dto.courseware.server.question;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
/**
 * 
 * <pre>
 * 学生的答题信息
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyStudentAnswerResult.java, v 0.1 2018年8月13日 下午4:58:18  Exp $
 */
@Data
public class RyStudentAnswerResult implements Serializable{
    /**  */
	private static final long serialVersionUID = -4412824200364066884L;

	/**  */

	private Integer id;

    private String leadsUuid;

    private String teacherExamId;
    /** 题集名称 */
    private String teacherExamName;

    private String examResultId;

    private Double score;

    private Double totalScore;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;
   
}