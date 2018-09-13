package com.repository.tcrm.Vo;

/**
 * @Author ywj
 * <p>
 */
public class TeacherCourseRecordVo {
    private String courseUuid;
    private String courseDate;
    private String startTime;
    private String endTime;
    private String subject;
    private String name;
    private Integer courseType;
    private String classTeacherAppraiseUuid;
    private String grade;
    private String subjectVersion;
    private Integer recordStatus; //1:有回放，2:没有回放数据，3:视频转换中，次日方可查看。

    
    public Integer getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(Integer recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getClassTeacherAppraiseUuid() {
		return classTeacherAppraiseUuid;
	}

	public void setClassTeacherAppraiseUuid(String classTeacherAppraiseUuid) {
		this.classTeacherAppraiseUuid = classTeacherAppraiseUuid;
	}

	public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourseType() {
        return courseType;
    }

    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubjectVersion() {
        return subjectVersion;
    }

    public void setSubjectVersion(String subjectVersion) {
        this.subjectVersion = subjectVersion;
    }
}
