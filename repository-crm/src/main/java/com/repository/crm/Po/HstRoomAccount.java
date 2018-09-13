package com.repository.crm.Po;

import java.util.Date;

/**
 * @author ywj
 * Created by ywj on 2018/05/09
 */
public class HstRoomAccount{
    private Integer id;

    /**
     * 会议室名称
     */
    private String name;

    /**
     * 好视通账号前缀
     */
    private String accountPrefix;

    /**
     * 老师账号
     */
    private String teacherAccount;

    /**
     * 学生账号
     */
    private String studentAccount;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 更新者
     */
    private String updater;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAccountPrefix() {
        return accountPrefix;
    }

    public void setAccountPrefix(String accountPrefix) {
        this.accountPrefix = accountPrefix == null ? null : accountPrefix.trim();
    }

    public String getTeacherAccount() {
        return teacherAccount;
    }

    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount == null ? null : teacherAccount.trim();
    }

    public String getStudentAccount() {
        return studentAccount;
    }

    public void setStudentAccount(String studentAccount) {
        this.studentAccount = studentAccount == null ? null : studentAccount.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}