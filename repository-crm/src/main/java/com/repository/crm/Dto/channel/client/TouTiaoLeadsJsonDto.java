package com.repository.crm.Dto.channel.client;

import lombok.Data;

/**
 * 今日头条的传递参数
 *
 * @author csy
 * @time  2018年3月28日 下午5:52:53
 */
@Data
public class TouTiaoLeadsJsonDto {

	private String site_id;
	private String ad_id;
	private String data;
}
