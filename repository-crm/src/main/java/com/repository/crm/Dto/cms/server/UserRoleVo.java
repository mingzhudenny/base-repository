package com.repository.crm.Dto.cms.server;

import com.base.utils.validate.ValidateUtil;

public class UserRoleVo {

	private String roleUuid;
	private String roleName;
	private String nowRoleUuid;
	
	public int getNowRoleUuid() {
		if(ValidateUtil.isNotEmpty(nowRoleUuid)){
			if(nowRoleUuid.equals(roleUuid)){
				return 1;
			}
		}
		return 0;
	}
	public void setNowRoleUuid(String nowRoleUuid) {
		this.nowRoleUuid = nowRoleUuid;
	}
	public String getRoleUuid() {
		return roleUuid;
	}
	public void setRoleUuid(String roleUuid) {
		this.roleUuid = roleUuid;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
