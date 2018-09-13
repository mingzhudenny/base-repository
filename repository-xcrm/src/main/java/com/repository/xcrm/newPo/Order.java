package com.repository.xcrm.newPo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer id;

    private String uuid;

    private String orderNo;

    private String coursePriceUuid;

    private String promotionCodeUuid;

    private String promotionCode;

    private String checkUserUuid;

    private String checkUserName;

    private String leadsUuid;

    private String leadsName;

    private String leadsPhone;

    private BigDecimal buyLength;

    private Integer courseLevel;

    private String pingppChargeId;

    private String pingppChannel;

    private String pingppTransactionNo;

    private String payName;

    private String payPhone;

    private String payType;

    private String bank;

    private String payMoney;

    private Integer payChannel;

    private Date payTime;

    private Integer checkStatus;

    private String checkRemark;

    private Integer isMerge;

    private Integer isSplit;

    private BigDecimal residueLength;

    private String teamUuid;

    private String teamName;

    private String commitUserName;

    private Long giveLength;

    private Integer isEnd;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String createUuid;

    private String updateUuid;

    private String remark;

    private Integer version;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getCoursePriceUuid() {
        return coursePriceUuid;
    }

    public void setCoursePriceUuid(String coursePriceUuid) {
        this.coursePriceUuid = coursePriceUuid == null ? null : coursePriceUuid.trim();
    }

    public String getPromotionCodeUuid() {
        return promotionCodeUuid;
    }

    public void setPromotionCodeUuid(String promotionCodeUuid) {
        this.promotionCodeUuid = promotionCodeUuid == null ? null : promotionCodeUuid.trim();
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode == null ? null : promotionCode.trim();
    }

    public String getCheckUserUuid() {
        return checkUserUuid;
    }

    public void setCheckUserUuid(String checkUserUuid) {
        this.checkUserUuid = checkUserUuid == null ? null : checkUserUuid.trim();
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName == null ? null : checkUserName.trim();
    }

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public String getLeadsName() {
        return leadsName;
    }

    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName == null ? null : leadsName.trim();
    }

    public String getLeadsPhone() {
        return leadsPhone;
    }

    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone == null ? null : leadsPhone.trim();
    }

    public BigDecimal getBuyLength() {
        return buyLength;
    }

    public void setBuyLength(BigDecimal buyLength) {
        this.buyLength = buyLength;
    }

    public Integer getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(Integer courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getPingppChargeId() {
        return pingppChargeId;
    }

    public void setPingppChargeId(String pingppChargeId) {
        this.pingppChargeId = pingppChargeId == null ? null : pingppChargeId.trim();
    }

    public String getPingppChannel() {
        return pingppChannel;
    }

    public void setPingppChannel(String pingppChannel) {
        this.pingppChannel = pingppChannel == null ? null : pingppChannel.trim();
    }

    public String getPingppTransactionNo() {
        return pingppTransactionNo;
    }

    public void setPingppTransactionNo(String pingppTransactionNo) {
        this.pingppTransactionNo = pingppTransactionNo == null ? null : pingppTransactionNo.trim();
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getPayPhone() {
        return payPhone;
    }

    public void setPayPhone(String payPhone) {
        this.payPhone = payPhone == null ? null : payPhone.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney == null ? null : payMoney.trim();
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark == null ? null : checkRemark.trim();
    }

    public Integer getIsMerge() {
        return isMerge;
    }

    public void setIsMerge(Integer isMerge) {
        this.isMerge = isMerge;
    }

    public Integer getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(Integer isSplit) {
        this.isSplit = isSplit;
    }

    public BigDecimal getResidueLength() {
        return residueLength;
    }

    public void setResidueLength(BigDecimal residueLength) {
        this.residueLength = residueLength;
    }

    public String getTeamUuid() {
        return teamUuid;
    }

    public void setTeamUuid(String teamUuid) {
        this.teamUuid = teamUuid == null ? null : teamUuid.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getCommitUserName() {
        return commitUserName;
    }

    public void setCommitUserName(String commitUserName) {
        this.commitUserName = commitUserName == null ? null : commitUserName.trim();
    }

    public Long getGiveLength() {
        return giveLength;
    }

    public void setGiveLength(Long giveLength) {
        this.giveLength = giveLength;
    }

    public Integer getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getCreateUuid() {
        return createUuid;
    }

    public void setCreateUuid(String createUuid) {
        this.createUuid = createUuid == null ? null : createUuid.trim();
    }

    public String getUpdateUuid() {
        return updateUuid;
    }

    public void setUpdateUuid(String updateUuid) {
        this.updateUuid = updateUuid == null ? null : updateUuid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}