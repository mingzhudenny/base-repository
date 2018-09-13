package com.repository.crm.Dto.course.client.score;

import com.repository.crm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 保存leads分数的参数信息
 *
 * @author csy
 * @time  2018年4月18日 下午1:51:52
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class SaveLeadsScoreClientDTO extends BaseDto{

	/**
	 * leadsUuid
	 */
	private String leadsUuid;
	/**
	 * 分数类型
	 */
	private String scoreType;
	/**
	 * 科目
	 */
	private String subject;
	/**
	 * 分数
	 */
	private String score;
	/**
	 * 满分
	 */
	private String fullScore;
}
