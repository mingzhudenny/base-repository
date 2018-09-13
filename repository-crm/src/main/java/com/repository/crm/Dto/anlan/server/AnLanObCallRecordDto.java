package com.repository.crm.Dto.anlan.server;

import com.base.utils.date.DateUtil;
import com.base.utils.validate.ValidateUtil;

import java.util.Date;

/**
 * @description：安莱外呼通话记录
 * @author： denny
 * @create： 2018-07-09 10:49
 **/
public class AnLanObCallRecordDto {
    /**
     * 用户名
     */
    private String userLogin;
    /**
     * 用户组
     */
    private String userGroup;
    /**
     * 座席绑定电话
     */
    private String extension;
    /**
     * 客户电话
     */
    private String phoneNumber;
    /**
     * 电话进入时间
     */
    private String startTime;
    /**
     * 是否接起 0.未接通 1.接通
     */
    private String isArchive;
    /**
     * 接起时间
     */
    private String archiveTime;
    /**
     * 挂断时间
     */
    private String endTime;
    /**
     * 总时长
     */
    private String totalSeconds;
    /**
     * 等待时长
     */
    private String queueSeconds;
    /**
     * 通话时长
     */
    private String talkSeconds;
    /**
     * 录音连接
     */
    private String recordingUrl;
    /**
     * 电话唯一id
     */
    private String uniqueid;
    /**
     * (呼出)外显号码
     */
    private String callerId;
    private Date createTime;
    private String status;
    private String statusValue;
    private String statusType;
    /**
     * 销售姓名
     */
    private String saleName;
    /**
     * 销售类别
     */
    private String saleType;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 学生姓名
     */
    private String leadsName;
    /**
     * 学生手机号码
     */
    private String leadsPhone;
    /**
     * 报名时间
     */
    private String signUpdate;
    /**
     * 用户密码
     */
    private String userPass;
    /**
     * 累计外呼次数
     */
    private String callNums;
    /**
     * 累计通话时长
     */
    private String talkSecondsTotal;

    /**
     * 渠道等级
     */
    private String channelLevel;
    /**
     * 分配时间
     */
    private String distributionDate;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getIsArchive() {
        if (ValidateUtil.isNotEmpty(isArchive)){
             if ("0".equals(isArchive)){
                 return "未接通";
             }else {
                 return "接通";
             }
        }
        return isArchive;
    }

    public void setIsArchive(String isArchive) {
        this.isArchive = isArchive;
    }

    public String getArchiveTime() {
        return archiveTime;
    }

    public void setArchiveTime(String archiveTime) {
        this.archiveTime = archiveTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTotalSeconds() {
        return totalSeconds;
    }

    public void setTotalSeconds(String totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public String getQueueSeconds() {
        return queueSeconds;
    }

    public void setQueueSeconds(String queueSeconds) {
        this.queueSeconds = queueSeconds;
    }

    public String getTalkSeconds() {
        if (ValidateUtil.isNotEmpty(talkSeconds)){
            talkSeconds = DateUtil.getHourAndMinutesAndSecond(talkSeconds);
        }
        return talkSeconds;
    }

    public void setTalkSeconds(String talkSeconds) {
        this.talkSeconds = talkSeconds;
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeadsName() {
        return leadsName;
    }

    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName;
    }

    public String getLeadsPhone() {
        return leadsPhone;
    }

    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone;
    }

    public String getSignUpdate() {
        return signUpdate;
    }

    public void setSignUpdate(String signUpdate) {
        this.signUpdate = signUpdate;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getCallNums() {
        return callNums;
    }

    public void setCallNums(String callNums) {
        this.callNums = callNums;
    }

    public String getTalkSecondsTotal() {
        if (ValidateUtil.isNotEmpty(talkSecondsTotal)){
            talkSecondsTotal = DateUtil.getHourAndMinutesAndSecond(talkSecondsTotal);
        }
        return talkSecondsTotal;
    }

    public void setTalkSecondsTotal(String talkSecondsTotal) {
        this.talkSecondsTotal = talkSecondsTotal;
    }

    public String getChannelLevel() {
        return channelLevel;
    }

    public void setChannelLevel(String channelLevel) {
        this.channelLevel = channelLevel;
    }

    public String getDistributionDate() {
        return distributionDate;
    }

    public void setDistributionDate(String distributionDate) {
        this.distributionDate = distributionDate;
    }
}
