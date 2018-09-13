package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * leads基本传输参数
 *
 * @author csy
 * @time  2018年3月19日 下午7:15:11
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LeadsDto implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * leadsUuid
	 */
	private String uuid;
	/**
	 * leads姓名
	 */
	private String name;
	/**
	 * leads电话号码
	 */
	private String phone;
	/**
	 * leads年级
	 */
	private String grade;
	/**
	 * leads科目
	 */
	private String subject;

	/**
	 * 性别
	 */
	private Integer sex;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;

	/**
	 * 省份id
	 */
	private Integer provinceId;

	/**
	 * 城市id
	 */
	private Integer cityId;
	/**
	 * 密码
	 */
    private String password;
	/**
	 * 区
	 */
	private String count;
	/**
	 * 区id
	 */
    private Integer countId;
}
