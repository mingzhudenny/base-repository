package com.repository.crm.Dto.task.server;

import java.util.Date;

import com.repository.crm.constant.PayManageEnum.GradeStatus;
import com.repository.crm.constant.PayManageEnum.GradeType;
import com.repository.crm.constant.PayNatureOfWork;



public class TcPayGradeVO {
	
    private Long id;

    private Integer gradeType;

    private String grade;

    private Integer hourlyWage;

    private String description;

    private Integer gradeStatus;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Long version;
    
	private int pageIndex;

	private int pageNumber;

	private String orderBy;
	
	private String gradeTypeDesc;//显示等级的类型
	
	private String gradeStatusDesc;//显示状态
	
	private Integer natureOfWork;
	
	private String natureOfWorkDesc;
	
	private String shortUrl;
	    
	private String url;	
	
    public String getShortUrl() {
		return shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNatureOfWorkDesc() {
    	if(this.getNatureOfWork()==null){
			return null;
		}
		if(PayNatureOfWork.FULL_TIME.getValue().equals(this.getNatureOfWork())){
			return PayNatureOfWork.FULL_TIME.getName();
			
		}else if(PayNatureOfWork.PART_TIME.getValue().equals(this.getNatureOfWork())){
			return PayNatureOfWork.PART_TIME.getName();
			
		}else if(PayNatureOfWork.SCHOOL_RECRUIT.getValue().equals(this.getNatureOfWork())){
			return PayNatureOfWork.SCHOOL_RECRUIT.getName();
			
		}
		return natureOfWorkDesc;
	}

	public void setNatureOfWorkDesc(String natureOfWorkDesc) {
		this.natureOfWorkDesc = natureOfWorkDesc;
	}

	public Integer getNatureOfWork() {
		return natureOfWork;
	}

	public void setNatureOfWork(Integer natureOfWork) {
		this.natureOfWork = natureOfWork;
	}

	public String getGradeStatusDesc() {
    	
    	if(this.getGradeStatus() == null){
    		return null;    		
    	}
    	if(GradeStatus.DISABLED.getValue().equals(this.getGradeStatus())){
    		return GradeStatus.DISABLED.getName();
    		
    	}else if(GradeStatus.ENABLED.getValue().equals(this.getGradeStatus())){
    		
    		return GradeStatus.ENABLED.getName();
    	}
		return gradeStatusDesc;
	}

	public void setGradeStatusDesc(String gradeStatusDesc) {
		this.gradeStatusDesc = gradeStatusDesc;
	}

	public String getGradeTypeDesc() {
    	
    	if(this.getGradeType() == null){
    		return null;    		
    	}
    	if(GradeType.QINBEI.getValue().equals(this.getGradeType())){
    		return GradeType.QINBEI.getName();
    		
    	}else if(GradeType.GENERAL.getValue().equals(this.getGradeType())){
    		
    		return GradeType.GENERAL.getName();
    	}
		return gradeTypeDesc;
	}

	public void setGradeTypeDesc(String gradeTypeDesc) {
		this.gradeTypeDesc = gradeTypeDesc;
	}
	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGradeType() {
        return gradeType;
    }

    public void setGradeType(Integer gradeType) {
        this.gradeType = gradeType;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Integer hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getGradeStatus() {
        return gradeStatus;
    }

    public void setGradeStatus(Integer gradeStatus) {
        this.gradeStatus = gradeStatus;
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}