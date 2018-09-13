package com.repository.crm.Dto.account.server.user;



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
