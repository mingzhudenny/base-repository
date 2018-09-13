package com.repository.crm.Dto.account.client.leads;

import com.repository.crm.Po.User;

/**
 * user扩展类
 * 
 * @author Administrator
 *
 */
public class UserVo extends User {

	private String organizationName;// 部门名称

	private String postsName; // 职位名称

	private String roleName; // 角色名称
	
	private String alias;//角色别名

	private String teamName; // 团队名称
	
	private String agentUuid;//代理的UUID
	/** 安澜的账号 */
	private String anlanAccount;
	/** 安澜的密码 */
	private String anlanPwd;	
	/** 安澜的登录状态   */
	private Integer anlanStatus;
	/** 安澜的分机号 */
	private String anlanPhone;
	/** 安澜的分机号de密码 */
	private String phonePwd;		
	
	
	public String getAnlanPhone() {
		return anlanPhone;
	}

	public void setAnlanPhone(String anlanPhone) {
		this.anlanPhone = anlanPhone;
	}

	public String getPhonePwd() {
		return phonePwd;
	}

	public void setPhonePwd(String phonePwd) {
		this.phonePwd = phonePwd;
	}

	public String getAnlanAccount() {
		return anlanAccount;
	}

	public void setAnlanAccount(String anlanAccount) {
		this.anlanAccount = anlanAccount;
	}

	public String getAnlanPwd() {
		return anlanPwd;
	}

	public void setAnlanPwd(String anlanPwd) {
		this.anlanPwd = anlanPwd;
	}

	public Integer getAnlanStatus() {
		return anlanStatus;
	}

	public void setAnlanStatus(Integer anlanStatus) {
		this.anlanStatus = anlanStatus;
	}

	public String getAgentUuid() {
		return agentUuid;
	}

	public void setAgentUuid(String agentUuid) {
		this.agentUuid = agentUuid;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getPostsName() {
		return postsName;
	}

	public void setPostsName(String postsName) {
		this.postsName = postsName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
}
