package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * leads报名注册传输参数
 *
 * @author csy
 * @time  2018年3月19日 下午7:18:42
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class LeadsRedisterDto extends LeadsDto implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 渠道adid
	 */
	private String adid;
	/**
	 * 计划
	 */
	private String jh;
	/**
	 * 单元
	 */
	private String dy;
	/**
	 * 关键字
	 */
	private String keyNumber;
	/**
	 * 是否赠送免费教学视频
	 */
	private String isGiveFree;
}
