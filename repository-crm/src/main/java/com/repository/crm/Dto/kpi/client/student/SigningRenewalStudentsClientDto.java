/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.kpi.client.student;

import java.io.Serializable;
import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 销售部-新签学生列表入参
 * </pre>
 *
 * @author wqz
 * @version 
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class SigningRenewalStudentsClientDto extends BaseDto implements Serializable {
	private static final long serialVersionUID = -457524236770259436L;
	/**
     * 学生姓名或手机号
     */
/*    @JsonProperty("word")
    @JsonInclude(JsonInclude.Include.NON_NULL)*/
	private String word;
    
/*    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)*/
	private String name;
    
/*    @JsonProperty("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)*/
	private String phone;

  /*  @JsonProperty("grade")
    @JsonInclude(JsonInclude.Include.NON_NULL)*/
	private String grade;
    
	/** 新签开始时间*/
	private Integer startUpdateDate;
	/** 新签结束时间*/
	private Integer endUpdateDate;
	
	/*@JsonProperty("stu_no")
	@JsonInclude(JsonInclude.Include.NON_NULL)*/
	private String stuNo;

}
