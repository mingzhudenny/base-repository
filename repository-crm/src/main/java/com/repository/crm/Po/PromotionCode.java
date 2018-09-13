package com.repository.crm.Po;

import java.util.Date;

public class PromotionCode {
    private Integer id;

    private String uuid;

    private String coursePriceUuid;

    private String promotionCode;

    private String promotionName;

    private Byte promotionType;

    private Double fullMoney;

    private String redPassword;

    private Double promotionMoney;

    private String creater;

    private String updater;

    private Date createDate;

    private Date updateDate;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getCoursePriceUuid() {
        return coursePriceUuid;
    }

    public void setCoursePriceUuid(String coursePriceUuid) {
        this.coursePriceUuid = coursePriceUuid == null ? null : coursePriceUuid.trim();
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode == null ? null : promotionCode.trim();
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName == null ? null : promotionName.trim();
    }

    public Byte getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Byte promotionType) {
        this.promotionType = promotionType;
    }

    public Double getFullMoney() {
        return fullMoney;
    }

    public void setFullMoney(Double fullMoney) {
        this.fullMoney = fullMoney;
    }

    public String getRedPassword() {
        return redPassword;
    }

    public void setRedPassword(String redPassword) {
        this.redPassword = redPassword == null ? null : redPassword.trim();
    }

    public Double getPromotionMoney() {
        return promotionMoney;
    }

    public void setPromotionMoney(Double promotionMoney) {
        this.promotionMoney = promotionMoney;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}