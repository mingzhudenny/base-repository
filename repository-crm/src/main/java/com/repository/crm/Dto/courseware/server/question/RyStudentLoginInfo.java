package com.repository.crm.Dto.courseware.server.question;

import lombok.Data;

/**
 * 
 * <pre>
 * 软云学生的登录信息
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: RyStudentLoginInfo.java, v 0.1 2018年8月27日 下午2:55:06  Exp $
 */
@Data
public class RyStudentLoginInfo {
	
	/** 学生姓名*/
	private String stuName;
	/** 学生手机号码  */
	private String phone;
	/** 软云的地区id (可能为空) */
	private Integer locationId;

}
