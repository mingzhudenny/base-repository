package com.repository.crm.Dto.tr.client.realtimeoutbound;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2017/4/14.
 */
public class CoursewareEditVo {
    private String coursewareUuid;
    private String originalName;
    private String subject;
    private String grade;
    private Integer courseClasses;
    private String coursewareName;
    private String coursewarePreviewUrl;
    private String courseKnowledgeUuids;
    private String remark;
    /** 版本 */
    private String courseVersionUuid;  
    /**
     * 课件url
     */
    private String coursewareUrl;

    public String getCoursewareUrl() {
		return coursewareUrl;
	}

	public void setCoursewareUrl(String coursewareUrl) {
		this.coursewareUrl = coursewareUrl;
	}

	public String getCourseVersionUuid() {
		return courseVersionUuid;
	}

	public void setCourseVersionUuid(String courseVersionUuid) {
		this.courseVersionUuid = courseVersionUuid;
	}

	public String getCoursewareUuid() {
        return coursewareUuid;
    }

    public void setCoursewareUuid(String coursewareUuid) {
        this.coursewareUuid = coursewareUuid;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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
        this.coursewareName = coursewareName;
    }

    public String getCoursewarePreviewUrl() {
        return coursewarePreviewUrl;
    }

    public void setCoursewarePreviewUrl(String coursewarePreviewUrl) {
        this.coursewarePreviewUrl = coursewarePreviewUrl;
    }

    public String getCourseKnowledgeUuids() {
        return courseKnowledgeUuids;
    }

    public void setCourseKnowledgeUuids(String courseKnowledgeUuids) {
        this.courseKnowledgeUuids = courseKnowledgeUuids;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
