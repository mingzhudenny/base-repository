package com.repository.crm.Dto.order.client.leads;

import java.io.Serializable;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * 入参
 * 
 * @author wqz
 * @ClassName: StudentClassVO
 * @date
 * @version: V1.0
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class StudentClassClientDto extends BaseDto implements Serializable{
	private static final long serialVersionUID = 4414443092452126840L;
	/** 学生姓名或手机 */
	private String word;
	/** 当前登录销售的cc的UUid */
	private String ccUuid;
}
