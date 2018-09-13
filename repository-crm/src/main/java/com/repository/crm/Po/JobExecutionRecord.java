package com.repository.crm.Po;

import java.util.Date;

public class JobExecutionRecord {
    private Integer id;

    private String jobName;

    private Integer executionResult;

    private Integer executionTotal;

    private Integer successTotal;

    private Date startTime;

    private Date endTime;

    private String remark;

    private Date createDate;

    private String errorMessage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public Integer getExecutionResult() {
        return executionResult;
    }

    public void setExecutionResult(Integer executionResult) {
        this.executionResult = executionResult;
    }

    public Integer getExecutionTotal() {
        return executionTotal;
    }

    public void setExecutionTotal(Integer executionTotal) {
        this.executionTotal = executionTotal;
    }

    public Integer getSuccessTotal() {
        return successTotal;
    }

    public void setSuccessTotal(Integer successTotal) {
        this.successTotal = successTotal;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }
}