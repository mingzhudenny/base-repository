package com.repository.crm.Dto.account.client.teacher;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper=false)
public class InterviewClientDto {

    private String uuid;

    private String teacherUuid;

    private Integer recordType;

    private Integer payGrade;

    private String interviewResult;

    private String remark;

    private String interviewUser;

    private Date createDate;

    private String createUserId;

    private Long version;
    
    private Integer enabled;
    

}