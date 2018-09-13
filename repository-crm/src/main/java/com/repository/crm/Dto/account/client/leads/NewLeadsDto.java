/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.leads;

import java.util.List;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 新名单查询条件
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: NewLeadsDto.java; v 0.1 2018年6月21日 下午4:12:31  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class NewLeadsDto extends BaseDto {	
	
	private Long id;
	
	private String uuid;
	
	private String password;
	
	private Byte status;
	
	private Byte distributeStatus;
	
	private String connectStatus;
	
	private String contactTime;
	
	private String channelUuid;
	
	private String jh;
	
	private String dy;
	
	private String keyNum;
	
	private Byte studentStatus;
	
	private String type;
	/**  */
	private Byte signStatus;
	/**  姓名*/
	private String name;
	/**   电话 */
	private String phone;
	/**  年级  */
	private String grade;
	/**  科目  */
	private String subject;
	/**  渠道级别  */
	private String channelLevel;
	/**  报名开始时间  */
	private String startDate;
	/**  报名结束时间  */
	private String endDate;
	/** 是否是推荐 */	
	private Byte isRecommend;
	/** 推荐的cc的姓名*/
	private String recommendCcName;
	/** 推荐的cr的姓名*/
	private String recommendCrName;
	/** 超时 传1 */
	private String isOutTime;
	/** 省 */
	private String province;
	/** 市 */
	private String city;
	/** 区 */
	private String count;
	/** 学校名称 */	
	private String schoolName;
	/** 年级排名 */	
	private String gradeRank;
	/** 手机号码 */
	List<String> phones;
	
	private String nowDate;
}
