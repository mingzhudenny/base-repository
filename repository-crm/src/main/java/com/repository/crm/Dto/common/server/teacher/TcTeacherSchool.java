package com.repository.crm.Dto.common.server.teacher;

import java.util.Date;

public class TcTeacherSchool {
	
	   private Long id;

	    private String uuid;

	    private String schoolName;

	    private String schoolNo;

	    private String department;

	    private String location;

	    private String schoolLevel;

	    private Integer is985;

	    private String remark;

	    private Integer enabled;

	    private Date createDate;

	    private String createUserId;

	    private Date updateDate;

	    private String updateUserId;

	    private Integer version;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getUuid() {
	        return uuid;
	    }

	    public void setUuid(String uuid) {
	        this.uuid = uuid == null ? null : uuid.trim();
	    }

	    public String getSchoolName() {
	        return schoolName;
	    }

	    public void setSchoolName(String schoolName) {
	        this.schoolName = schoolName == null ? null : schoolName.trim();
	    }

	    public String getSchoolNo() {
	        return schoolNo;
	    }

	    public void setSchoolNo(String schoolNo) {
	        this.schoolNo = schoolNo == null ? null : schoolNo.trim();
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department == null ? null : department.trim();
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location == null ? null : location.trim();
	    }

	    public String getSchoolLevel() {
	        return schoolLevel;
	    }

	    public void setSchoolLevel(String schoolLevel) {
	        this.schoolLevel = schoolLevel == null ? null : schoolLevel.trim();
	    }

	    public Integer getIs985() {
	        return is985;
	    }

	    public void setIs985(Integer is985) {
	        this.is985 = is985;
	    }

	    public String getRemark() {
	        return remark;
	    }

	    public void setRemark(String remark) {
	        this.remark = remark == null ? null : remark.trim();
	    }

	    public Integer getEnabled() {
	        return enabled;
	    }

	    public void setEnabled(Integer enabled) {
	        this.enabled = enabled;
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