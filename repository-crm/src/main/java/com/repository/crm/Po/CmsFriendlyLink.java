package com.repository.crm.Po;

import java.util.Date;

/**
 * @author ywj
 * Created by ywj on 2018/05/17
 */
public class CmsFriendlyLink {
    private Long id;

    /**
     * 网站名字
     */
    private String websiteName;

    /**
     * 网址
     */
    private String websiteUrl;

    /**
     * 网站简介
     */
    private String websiteRemark;

    /**
     * 站长email
     */
    private String managerEmail;

    /**
     * 状态 0：下线 1：上线
     */
    private Byte enabled;

    /**
     * 排序
     */
    private Long sort;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName == null ? null : websiteName.trim();
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl == null ? null : websiteUrl.trim();
    }

    public String getWebsiteRemark() {
        return websiteRemark;
    }

    public void setWebsiteRemark(String websiteRemark) {
        this.websiteRemark = websiteRemark == null ? null : websiteRemark.trim();
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail == null ? null : managerEmail.trim();
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }
}