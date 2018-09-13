package com.repository.crm.Po;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class RyStudentAnswer implements Serializable{
    /**  */
	private static final long serialVersionUID = 1748093744360677491L;

	private Integer id;

    private String leadsUuid;

    private String teacherExamId;

    private String examResultId;

    private Double score;

    private Double totalScore;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;
   
}