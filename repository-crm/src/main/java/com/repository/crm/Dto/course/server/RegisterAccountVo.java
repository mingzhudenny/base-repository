package com.repository.crm.Dto.course.server;
/**
 * 好视通注册用户信息
 * @author csy
 *
 * @date 2017年10月18日 下午9:21:34
 */
public class RegisterAccountVo {

	private String uuid;
	private String accountUuid;
	private Integer accountType;
	private String hstUserName;
	@Override
	public String toString() {
		return "RegisterAccountVo [uuid=" + uuid + ", accountUuid=" + accountUuid + ", accountType=" + accountType
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getHstUserName() {
		return hstUserName;
	}
	public void setHstUserName(String hstUserName) {
		this.hstUserName = hstUserName;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getAccountUuid() {
		return accountUuid;
	}
	public void setAccountUuid(String accountUuid) {
		this.accountUuid = accountUuid;
	}
	public Integer getAccountType() {
		return accountType;
	}
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}
}
