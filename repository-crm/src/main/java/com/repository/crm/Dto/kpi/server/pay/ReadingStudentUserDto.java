package com.repository.crm.Dto.kpi.server.pay;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 在读人数用户分布dto
 *
 * @author csy
 * @time  2018年3月27日 上午10:57:34
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ReadingStudentUserDto{
	
	/**
	 * 用户uuid
	 */
	private String userUuid;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 用户的续费人数
	 */
	private Integer renewPayNum;
	/**
	 * 用户负责的在读人数
	 */
	private Integer readingStudentNum;
	/**
	 * 续费率(readingStudentNum/renewPayNum)
	 */
	private String renewPayRate;
	
}
