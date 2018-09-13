/**
 * onlyhi.cn Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.account.client.leads;

import lombok.Data;

/**
 * <pre>
 * cc放弃leads DTO
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: GiveUpLeadsDto.java, v 0.1 2018年5月25日 上午11:33:37  Exp $
 */
@Data
public class GiveUpLeadsDto {
	
	private String userUuid;
	private String roleUuid;
	private String leadsUuid;
	private  String connectStatus;
	private  String giveUpCause;
	private String giveUpDes;

}
