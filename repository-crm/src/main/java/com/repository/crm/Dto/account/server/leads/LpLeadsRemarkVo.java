package com.repository.crm.Dto.account.server.leads;

import com.repository.crm.Po.LpRemark;

/**
 * leads备注信息扩展类
 * @author csy
 * 
 */
public class LpLeadsRemarkVo extends LpRemark{

	
	private String userName;//备注人

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
