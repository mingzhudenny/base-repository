package com.repository.crm.Dto.cms.client;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.repository.crm.Po.CmsTagSign;

/**
 * @author ywj
 * Created by ywj on 2018/05/24
 */
public class CmsTagSortDTO{
    private Long id;

    /**
     * tag分类uuid
     */
    private String tagSortUuid;

    /**
     * tag分类名
     */
    private String tagSortName;

    /**
     * 状态0:被撤销1:未被撤销
     */
    private Boolean status;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;
    
    private Map<String,Object> resultMap;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagSortUuid() {
        return tagSortUuid;
    }

    public void setTagSortUuid(String tagSortUuid) {
        this.tagSortUuid = tagSortUuid == null ? null : tagSortUuid.trim();
    }

    public String getTagSortName() {
        return tagSortName;
    }

    public void setTagSortName(String tagSortName) {
        this.tagSortName = tagSortName == null ? null : tagSortName.trim();
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

	public Map<String, Object> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}


    
}