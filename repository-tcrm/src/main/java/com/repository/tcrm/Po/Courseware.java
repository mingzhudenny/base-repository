package com.repository.tcrm.Po;

import java.util.Date;

/**
 * 课件表
 * @author ywj
 * Created by ywj on 2017/08/15
 */
public class Courseware  {
    /**  */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -2678452158771051046L;

	private Integer id;

    private String coursewareUuid;

    /**
     * 教师uuid
     */
    private String teacherUuid;

    /**
     * 课件url
     */
    private String coursewareUrl;

    /**
     * 服务器路径
     */
    private String coursewarePath;

    /**
     * 上传的原课件名称
     */
    private String originalName;

    /**
     * 转换成pdf名称
     */
    private String pdfName;

    /**
     * 页数
     */
    private Integer pageNum;

    /**
     * 课件类型:系统和教师
     */
    private String coursewareType;

    /**
     * 科目
     */
    private String subject;

    /**
     * 年级
     */
    private String grade;

    /**
     * 课程知识点id
     */
    private String courseKnowledgeUuid;

    /**
     * 课程类别：1：普通、2：精品
     */
    private Integer courseClasses;

    /**
     * 课件名称
     */
    private String coursewareName;

    /**
     * 课件pdf预览路径
     */
    private String coursewarePreviewUrl;

    /**
     * 所有属课程的知识点id（包括一级二级三级...）
     */
    private String courseKnowledgeUuids;

    /**
     * 状态:0:删除，1：正常
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人uuid
     */
    private String createUid;

    /**
     * 更新人uuid
     */
    private String updateUid;
    
    private Integer ConverStatus;    
    
    /** 版本 */
    private String courseVersionUuid;    
    
    private String coursewareDirUuid;
    
    
    
    public String getCoursewareDirUuid() {
		return coursewareDirUuid;
	}

	public void setCoursewareDirUuid(String coursewareDirUuid) {
		this.coursewareDirUuid = coursewareDirUuid;
	}

	public String getCourseVersionUuid() {
		return courseVersionUuid;
	}

	public void setCourseVersionUuid(String courseVersionUuid) {
		this.courseVersionUuid = courseVersionUuid;
	}

	public Integer getConverStatus() {
		return ConverStatus;
	}

	public void setConverStatus(Integer converStatus) {
		ConverStatus = converStatus;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoursewareUuid() {
        return coursewareUuid;
    }

    public void setCoursewareUuid(String coursewareUuid) {
        this.coursewareUuid = coursewareUuid == null ? null : coursewareUuid.trim();
    }

    public String getTeacherUuid() {
        return teacherUuid;
    }

    public void setTeacherUuid(String teacherUuid) {
        this.teacherUuid = teacherUuid == null ? null : teacherUuid.trim();
    }

    public String getCoursewareUrl() {
        return coursewareUrl;
    }

    public void setCoursewareUrl(String coursewareUrl) {
        this.coursewareUrl = coursewareUrl == null ? null : coursewareUrl.trim();
    }

    public String getCoursewarePath() {
        return coursewarePath;
    }

    public void setCoursewarePath(String coursewarePath) {
        this.coursewarePath = coursewarePath == null ? null : coursewarePath.trim();
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName == null ? null : originalName.trim();
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName == null ? null : pdfName.trim();
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getCoursewareType() {
        return coursewareType;
    }

    public void setCoursewareType(String coursewareType) {
        this.coursewareType = coursewareType == null ? null : coursewareType.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getCourseKnowledgeUuid() {
        return courseKnowledgeUuid;
    }

    public void setCourseKnowledgeUuid(String courseKnowledgeUuid) {
        this.courseKnowledgeUuid = courseKnowledgeUuid == null ? null : courseKnowledgeUuid.trim();
    }

    public Integer getCourseClasses() {
        return courseClasses;
    }

    public void setCourseClasses(Integer courseClasses) {
        this.courseClasses = courseClasses;
    }

    public String getCoursewareName() {
        return coursewareName;
    }

    public void setCoursewareName(String coursewareName) {
        this.coursewareName = coursewareName == null ? null : coursewareName.trim();
    }

    public String getCoursewarePreviewUrl() {
        return coursewarePreviewUrl;
    }

    public void setCoursewarePreviewUrl(String coursewarePreviewUrl) {
        this.coursewarePreviewUrl = coursewarePreviewUrl == null ? null : coursewarePreviewUrl.trim();
    }

    public String getCourseKnowledgeUuids() {
        return courseKnowledgeUuids;
    }

    public void setCourseKnowledgeUuids(String courseKnowledgeUuids) {
        this.courseKnowledgeUuids = courseKnowledgeUuids == null ? null : courseKnowledgeUuids.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid == null ? null : updateUid.trim();
    }
}