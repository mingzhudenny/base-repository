package com.repository.crm.Dto.account.client.leads;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * 入参
 * 
 * @author wqz
 * @ClassName: LeadsTeacherVO
 * @date
 * @version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LeadsTeacherClientDto extends BaseDto implements Serializable{
	private static final long serialVersionUID = 4414443092452126840L;
	/** 学生姓名或手机 */
    //@JsonProperty("word")
    //@JsonInclude(JsonInclude.Include.NON_NULL)
	private String word;
}
