package com.repository.xcrm.Dto.account.server.course;

/**
 * @description：
 * @author： denny
 * @create： 2018-03-21 11:23
 **/
public class StudentJsonDto {
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
