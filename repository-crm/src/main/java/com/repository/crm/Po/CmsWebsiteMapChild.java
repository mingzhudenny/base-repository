package com.repository.crm.Po;

import java.util.Date;

/**
 * @author ywj
 * Created by ywj on 2018/05/23
 */
public class CmsWebsiteMapChild{
    private Long id;

    private String uuid;

    private String childName;

    private String childLink;

    /**
     * 所属一级栏目uuid
     */
    private String columnUuid;

    private Boolean status;

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName == null ? null : childName.trim();
    }

    public String getChildLink() {
        return childLink;
    }

    public void setChildLink(String childLink) {
        this.childLink = childLink == null ? null : childLink.trim();
    }

    public String getColumnUuid() {
        return columnUuid;
    }

    public void setColumnUuid(String columnUuid) {
        this.columnUuid = columnUuid == null ? null : columnUuid.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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