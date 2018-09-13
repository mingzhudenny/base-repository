package com.repository.crm.Dto.cms.client;

import java.util.Date;
import java.util.List;

import com.repository.crm.Po.CmsWebsiteMapChild;

/**
 * @author ywj
 * Created by ywj on 2018/05/23
 */
public class CmsWebsiteMapRequest{
    private Long id;

    private String uuid;

    /**
     * 一级栏目名字
     */
    private String firstColumnName;

    /**
     * 状态0:被撤销1:未被撤销
     */
    private Boolean status;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;
    
    private List<CmsWebsiteMapChild> websiteMapChildList;

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

    public String getFirstColumnName() {
        return firstColumnName;
    }

    public void setFirstColumnName(String firstColumnName) {
        this.firstColumnName = firstColumnName == null ? null : firstColumnName.trim();
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

	public List<CmsWebsiteMapChild> getWebsiteMapChildList() {
		return websiteMapChildList;
	}

	public void setWebsiteMapChildList(List<CmsWebsiteMapChild> websiteMapChildList) {
		this.websiteMapChildList = websiteMapChildList;
	}
    
    
}