package com.repository.crm.Dto.courseware.client.question;

import java.util.Date;
import java.util.List;

import lombok.Data;
/**
 * 
 * <pre>
 * 学生的答题结果
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyStudentAnswerDTO.java, v 0.1 2018年7月27日 下午1:16:47  Exp $
 */
@Data
public class RyStudentAnswerDTO {
	
    private Integer id;
    
    private Integer courseId;
    
    /** 教材版本Id   */
	private Integer bookVersionId;
	
	/** 地区ID */
	private Integer locationId;
	/** 老师的userCode */
	private String teacherCode; 
    
    private String userCode;    
    /** 答题详细记录  */
    private List<RyStudentAnswerRecordDTO> answerRecordList;

    private String teacherExamId;

    private String teacherExamName;

    private String createDateTime;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

   
}