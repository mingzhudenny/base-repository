package com.repository.crm.Dto.cms.client;

import java.util.Date;
import java.util.List;

import com.repository.crm.Po.CmsTagSign;

/**
 * @author ywj
 * Created by ywj on 2018/05/25
 */
public class CmsConsultationVo {
    private Long id;

    /**
     * 标题
     */
    private String uuid;
    
    private String url;

    private String title;

    /**
     * 描述
     */
    private String discription;

    /**
     * tag类uuid
     */
    private String tagSortUuid;
    
    private String tagSignUuid;
    
    private String[] tagSignUuids;

    private List<CmsTagSign> tagSignList;

    /**
     * 状态0:被撤销1:未被撤销
     */
    private Boolean status;

    /**
     * 图片地址
     */
    private String fileAddress;

    /**
     * 图片原始名称
     */
    private String fileOriginalName;

    /**
     * 图片重命名后名称
     */
    private String fileName;

    /**
     * osskey
     */
    private String osskey;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    /**
     * 内容
     */
    private String content;

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

    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    public String getTagSortUuid() {
        return tagSortUuid;
    }

    public void setTagSortUuid(String tagSortUuid) {
        this.tagSortUuid = tagSortUuid == null ? null : tagSortUuid.trim();
    }


    public List<CmsTagSign> getTagSignList() {
		return tagSignList;
	}

	public void setTagSignList(List<CmsTagSign> tagSignList) {
		this.tagSignList = tagSignList;
	}

	public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress == null ? null : fileAddress.trim();
    }

    public String getFileOriginalName() {
        return fileOriginalName;
    }

    public void setFileOriginalName(String fileOriginalName) {
        this.fileOriginalName = fileOriginalName == null ? null : fileOriginalName.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getOsskey() {
        return osskey;
    }

    public void setOsskey(String osskey) {
        this.osskey = osskey == null ? null : osskey.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

	public String getTagSignUuid() {
		return tagSignUuid;
	}

	public void setTagSignUuid(String tagSignUuid) {
		this.tagSignUuid = tagSignUuid;
	}

	public String[] getTagSignUuids() {
		return tagSignUuids;
	}

	public void setTagSignUuids(String[] tagSignUuids) {
		this.tagSignUuids = tagSignUuids;
	}
    
    
}