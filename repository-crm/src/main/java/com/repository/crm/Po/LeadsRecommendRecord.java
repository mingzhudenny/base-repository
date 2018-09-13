package com.repository.crm.Po;

import java.util.Date;

public class LeadsRecommendRecord {
    private Integer id;

    private String leadsUuid;

    private Integer recommendType;

    private String recommendCcUuid;

    private String recommendCrUuid;

    private String recommendTcUuid;

    private String recommendCcName;

    private String recommendCrName;

    private String recommendTcName;

    private Integer isIntroduced;

    private String introducer;

    private String remark;

    private Integer recommendStatus;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public Integer getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Integer recommendType) {
        this.recommendType = recommendType;
    }

    public String getRecommendCcUuid() {
        return recommendCcUuid;
    }

    public void setRecommendCcUuid(String recommendCcUuid) {
        this.recommendCcUuid = recommendCcUuid == null ? null : recommendCcUuid.trim();
    }

    public String getRecommendCrUuid() {
        return recommendCrUuid;
    }

    public void setRecommendCrUuid(String recommendCrUuid) {
        this.recommendCrUuid = recommendCrUuid == null ? null : recommendCrUuid.trim();
    }

    public String getRecommendTcUuid() {
        return recommendTcUuid;
    }

    public void setRecommendTcUuid(String recommendTcUuid) {
        this.recommendTcUuid = recommendTcUuid == null ? null : recommendTcUuid.trim();
    }

    public String getRecommendCcName() {
        return recommendCcName;
    }

    public void setRecommendCcName(String recommendCcName) {
        this.recommendCcName = recommendCcName == null ? null : recommendCcName.trim();
    }

    public String getRecommendCrName() {
        return recommendCrName;
    }

    public void setRecommendCrName(String recommendCrName) {
        this.recommendCrName = recommendCrName == null ? null : recommendCrName.trim();
    }

    public String getRecommendTcName() {
        return recommendTcName;
    }

    public void setRecommendTcName(String recommendTcName) {
        this.recommendTcName = recommendTcName == null ? null : recommendTcName.trim();
    }

    public Integer getIsIntroduced() {
        return isIntroduced;
    }

    public void setIsIntroduced(Integer isIntroduced) {
        this.isIntroduced = isIntroduced;
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer == null ? null : introducer.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}