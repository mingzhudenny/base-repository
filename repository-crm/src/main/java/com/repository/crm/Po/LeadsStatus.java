package com.repository.crm.Po;

import java.util.Date;

public class LeadsStatus {
    private Integer id;

    private String leadsUuid;

    private Integer isMarkCourse;

    private Integer isKeyPoint;

    private Date keyPointTime;

    private Integer isGiveUp;

    private String giveUpCause;

    private String giveUpDes;

    private Date giveUpTime;

    private Integer connectStatus;

    private Date connectTime;

    private Integer isStudent;

    private Integer signUpCount;

    private Integer distributionStatus;

    private String distributionUuid;

    private String distributionName;

    private Date distributionTime;    

    private Integer isRecommend;

    private String recommendCcUuid;

    private String recommendCcName;

    private String recommendCrUuid;

    private String recommendCrName;

    private Date recommendTime;

    private Integer isIntroduced;

    private String introducer;

    private Date introduceTime;

    private Integer signStatus;

    private Integer isSign;

    private Date signTime;

    private Integer isManagerCourse;

    private Date managetTime;

    private Integer isPay;

    private Date payTime;

    private Integer isHaveMic;

    private Integer isHaveHeadset;

    private Integer isHaveComputer;

    private Integer isHavePad;

    private Integer isDebugging;

    private String newFollowRemark;

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

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public Integer getIsMarkCourse() {
        return isMarkCourse;
    }

    public void setIsMarkCourse(Integer isMarkCourse) {
        this.isMarkCourse = isMarkCourse;
    }

    public Integer getIsKeyPoint() {
        return isKeyPoint;
    }

    public void setIsKeyPoint(Integer isKeyPoint) {
        this.isKeyPoint = isKeyPoint;
    }

    public Date getKeyPointTime() {
        return keyPointTime;
    }

    public void setKeyPointTime(Date keyPointTime) {
        this.keyPointTime = keyPointTime;
    }

    public Integer getIsGiveUp() {
        return isGiveUp;
    }

    public void setIsGiveUp(Integer isGiveUp) {
        this.isGiveUp = isGiveUp;
    }

    public String getGiveUpCause() {
        return giveUpCause;
    }

    public void setGiveUpCause(String giveUpCause) {
        this.giveUpCause = giveUpCause == null ? null : giveUpCause.trim();
    }

    public String getGiveUpDes() {
        return giveUpDes;
    }

    public void setGiveUpDes(String giveUpDes) {
        this.giveUpDes = giveUpDes == null ? null : giveUpDes.trim();
    }

    public Date getGiveUpTime() {
        return giveUpTime;
    }

    public void setGiveUpTime(Date giveUpTime) {
        this.giveUpTime = giveUpTime;
    }

    public Integer getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(Integer connectStatus) {
        this.connectStatus = connectStatus;
    }

    public Date getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    public Integer getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(Integer isStudent) {
        this.isStudent = isStudent;
    }

    public Integer getSignUpCount() {
        return signUpCount;
    }

    public void setSignUpCount(Integer signUpCount) {
        this.signUpCount = signUpCount;
    }

    public Integer getDistributionStatus() {
        return distributionStatus;
    }

    public void setDistributionStatus(Integer distributionStatus) {
        this.distributionStatus = distributionStatus;
    }

    public String getDistributionUuid() {
        return distributionUuid;
    }

    public void setDistributionUuid(String distributionUuid) {
        this.distributionUuid = distributionUuid == null ? null : distributionUuid.trim();
    }

    public String getDistributionName() {
        return distributionName;
    }

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName == null ? null : distributionName.trim();
    }

    public Date getDistributionTime() {
        return distributionTime;
    }

    public void setDistributionTime(Date distributionTime) {
        this.distributionTime = distributionTime;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getRecommendCcUuid() {
        return recommendCcUuid;
    }

    public void setRecommendCcUuid(String recommendCcUuid) {
        this.recommendCcUuid = recommendCcUuid == null ? null : recommendCcUuid.trim();
    }

    public String getRecommendCcName() {
        return recommendCcName;
    }

    public void setRecommendCcName(String recommendCcName) {
        this.recommendCcName = recommendCcName == null ? null : recommendCcName.trim();
    }

    public String getRecommendCrUuid() {
        return recommendCrUuid;
    }

    public void setRecommendCrUuid(String recommendCrUuid) {
        this.recommendCrUuid = recommendCrUuid == null ? null : recommendCrUuid.trim();
    }

    public String getRecommendCrName() {
        return recommendCrName;
    }

    public void setRecommendCrName(String recommendCrName) {
        this.recommendCrName = recommendCrName == null ? null : recommendCrName.trim();
    }

    public Date getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(Date recommendTime) {
        this.recommendTime = recommendTime;
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

    public Date getIntroduceTime() {
        return introduceTime;
    }

    public void setIntroduceTime(Date introduceTime) {
        this.introduceTime = introduceTime;
    }

    public Integer getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Integer signStatus) {
        this.signStatus = signStatus;
    }

    public Integer getIsSign() {
        return isSign;
    }

    public void setIsSign(Integer isSign) {
        this.isSign = isSign;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Integer getIsManagerCourse() {
        return isManagerCourse;
    }

    public void setIsManagerCourse(Integer isManagerCourse) {
        this.isManagerCourse = isManagerCourse;
    }

    public Date getManagetTime() {
        return managetTime;
    }

    public void setManagetTime(Date managetTime) {
        this.managetTime = managetTime;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getIsHaveMic() {
        return isHaveMic;
    }

    public void setIsHaveMic(Integer isHaveMic) {
        this.isHaveMic = isHaveMic;
    }

    public Integer getIsHaveHeadset() {
        return isHaveHeadset;
    }

    public void setIsHaveHeadset(Integer isHaveHeadset) {
        this.isHaveHeadset = isHaveHeadset;
    }

    public Integer getIsHaveComputer() {
        return isHaveComputer;
    }

    public void setIsHaveComputer(Integer isHaveComputer) {
        this.isHaveComputer = isHaveComputer;
    }

    public Integer getIsHavePad() {
        return isHavePad;
    }

    public void setIsHavePad(Integer isHavePad) {
        this.isHavePad = isHavePad;
    }

    public Integer getIsDebugging() {
        return isDebugging;
    }

    public void setIsDebugging(Integer isDebugging) {
        this.isDebugging = isDebugging;
    }

    public String getNewFollowRemark() {
        return newFollowRemark;
    }

    public void setNewFollowRemark(String newFollowRemark) {
        this.newFollowRemark = newFollowRemark == null ? null : newFollowRemark.trim();
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