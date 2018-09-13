/**
 * onlyhiedu.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.repository.crm.Dto.tr.client.realtimeoutbound;

/**
 * <pre>
 * 查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CoursewareParams.java, v 0.1 2018年3月5日 下午4:06:25  Exp $
 */
public class CoursewareParams {
	

    /**
     * 科目
     */
    private String subject;

    /**
     * 年级
     */
    private String grades;


    /**
     * 课程类别：1：普通、2：精品
     */
    private Integer courseClasses;

    /**
     * 课件名称
     */
    private String coursewareName;

    /**
     * 所有属课程的知识点id（包括一级二级三级...）
     */
    private String courseKnowledgeUuids;
    /** 版本 */
    private String  courseVersionUuid;   
    
    /**
     * 课件类型:系统和教师
     */
    private String coursewareType;

	public String getCoursewareType() {
		return coursewareType;
	}

	public void setCoursewareType(String coursewareType) {
		this.coursewareType = coursewareType;
	}

	public String getCourseVersionUuid() {
		return courseVersionUuid;
	}

	public void setCourseVersionUuid(String courseVersionUuid) {
		this.courseVersionUuid = courseVersionUuid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
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

	public String getCourseKnowledgeUuids() {
		return courseKnowledgeUuids;
	}

	public void setCourseKnowledgeUuids(String courseKnowledgeUuids) {
		this.courseKnowledgeUuids = courseKnowledgeUuids;
	}
    
    
	
	

}
