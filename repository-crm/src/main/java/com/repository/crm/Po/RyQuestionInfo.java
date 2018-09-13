package com.repository.crm.Po;

import java.util.Date;

public class RyQuestionInfo {
    private Integer id;

    private Integer questionId;

    private Integer questionCategoryId;

    private String questionCategoryName;

    private String stem;

    private Integer knowledgePointId;

    private String analyticMethod;

    private String abilityStructure;

    private Integer questionLevel;

    private String analysis;

    private Integer questionStatus;

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

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionCategoryId() {
        return questionCategoryId;
    }

    public void setQuestionCategoryId(Integer questionCategoryId) {
        this.questionCategoryId = questionCategoryId;
    }

    public String getQuestionCategoryName() {
        return questionCategoryName;
    }

    public void setQuestionCategoryName(String questionCategoryName) {
        this.questionCategoryName = questionCategoryName == null ? null : questionCategoryName.trim();
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem == null ? null : stem.trim();
    }

    public Integer getKnowledgePointId() {
        return knowledgePointId;
    }

    public void setKnowledgePointId(Integer knowledgePointId) {
        this.knowledgePointId = knowledgePointId;
    }

    public String getAnalyticMethod() {
        return analyticMethod;
    }

    public void setAnalyticMethod(String analyticMethod) {
        this.analyticMethod = analyticMethod == null ? null : analyticMethod.trim();
    }

    public String getAbilityStructure() {
        return abilityStructure;
    }

    public void setAbilityStructure(String abilityStructure) {
        this.abilityStructure = abilityStructure == null ? null : abilityStructure.trim();
    }

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }

    public Integer getQuestionStatus() {
        return questionStatus;
    }

    public void setQuestionStatus(Integer questionStatus) {
        this.questionStatus = questionStatus;
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