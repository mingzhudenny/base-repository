package com.repository.threeparty.constant;

/**
 * 添加过个学生的信息
 * @ClassName: StudentJson
 * @author csy
 * @date 2018年1月3日 上午11:07:03
 */
public class StudentJson {

	private String account;
	private String name;
	private String password;
	private String customColumn;
	@Override
	public String toString() {
		return "StudentJson [account=" + account + ", name=" + name + ", password=" + password + ", customColumn="
				+ customColumn + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomColumn() {
		return customColumn;
	}
	public void setCustomColumn(String customColumn) {
		this.customColumn = customColumn;
	}
}
