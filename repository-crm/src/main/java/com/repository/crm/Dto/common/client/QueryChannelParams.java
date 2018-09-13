/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.common.client;

import com.repository.crm.Dto.account.client.leads.BaseParams;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: QueryChannelParams.java, v 0.1 2018年3月29日 下午5:01:12  Exp $
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class QueryChannelParams extends BaseParams {
	
	private String channelName;		

}
