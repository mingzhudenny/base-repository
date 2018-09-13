package com.repository.crm.Dto.cms.server;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2017-10-31 16:11
 **/
public class WebSiteBannerVo {
    private Long id;

    private String bannerName;

    private String bannerUrl;

    private String fileAddress;

    private String fileOriginalName;

    private String fileName;

    private Byte enabled;

    private Long sort;

    private Long version;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private String OrderByOfType;

    private String bannerSort;

    private String status;

    private String osskey;
    
    private String positionType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName == null ? null : bannerName.trim();
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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

    public String getOrderByOfType() {
        return OrderByOfType;
    }

    public void setOrderByOfType(String orderByOfType) {
        OrderByOfType = orderByOfType;
    }

    public String getBannerSort() {
        return bannerSort;
    }

    public void setBannerSort(String bannerSort) {
        this.bannerSort = bannerSort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOsskey() {
        return osskey;
    }

    public void setOsskey(String osskey) {
        this.osskey = osskey;
    }

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}
    
    
}
