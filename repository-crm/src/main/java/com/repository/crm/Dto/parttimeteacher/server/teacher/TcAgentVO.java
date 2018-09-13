package com.repository.crm.Dto.parttimeteacher.server.teacher;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.base.utils.date.DateUtil;


public class TcAgentVO {
	private Long id;

	private String uuid;
	
	private String teacherUuid;//老师的UUID
	
	 private Long loginId;
	 
	 private String openId;
	 
	 private Long agentGradeId;

	private String agentName;

	private String sex;

	private Integer generalAgent;

	private String phone;

	private String idNumber;

	private String email;

	private String qq;

	private String agentArea;

	private String schoolLocation;

	private String agentType;

	private Integer bankId;

	private String cardNumber;

	private String bankAddress;

	private String url;

	private Integer enabled;

	private Date createDate;

	private String createUserId;

	private Date updateDate;

	private String updateUserId;

	private Long version;

	private String token;

	private int pageIndex;

	private int pageNumber;

	private String orderBy;

	private String sortBy;

	private String params;//查询参数

	private String agentSchool;//代理学校显示

	private String agentUrl;//代理Url显示

	private Integer teacherCount;// 老师数量	
	
	private Integer lecturerCount;// 讲师数量	

	private String parentAgent;//上级代理显示

	private String logoUrl;//头像的URL

	private String idNumberUrl;//身份证的URL

	private String contractUrl;//合同文件的URL	 

	private String otherUrl;//其它文件URL	
	
	private String bank;

	private Date CreateDateStart;

	private Date CreateDateEnd;

	private int startIndex;
	// 代理类型
	private String agentTypeList;

	private String agentFileList;//文件列表

	 private Integer salary;//薪资
	 
	private Long templateId;	
	
	private Integer index;
	
	private String createTime;
	
	private String parentName;//上级代理的名字
	
	private String teachingSubject;//第一科目  示例 :"48"
	
	@SuppressWarnings("unused")
	private String isTeacher;//是否是老师
	
	private String advLinks;//推广链接
	
	private String createUser;//代理创建人
	
	
   public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

   public String getAdvLinks() {
		return advLinks;
	}

	public void setAdvLinks(String advLinks) {
		this.advLinks = advLinks;
	}

	public String getIsTeacher() {
	   
	   if(StringUtils.isNotBlank(this.getTeacherUuid())){
		   
		   return "是老师";
	   }else{
		   
		   return "不是老师";
	   }
	  
		
	}

	public void setIsTeacher(String isTeacher) {
		this.isTeacher = isTeacher;
	}

public String getTeacherUuid() {
		return teacherUuid;
	}

	public void setTeacherUuid(String teacherUuid) {
		this.teacherUuid = teacherUuid;
	}

public Long getAgentGradeId() {
		return agentGradeId;
	}

	public void setAgentGradeId(Long agentGradeId) {
		this.agentGradeId = agentGradeId;
	}

    public String getTeachingSubject() {
		return teachingSubject;
	}

	public void setTeachingSubject(String teachingSubject) {
		this.teachingSubject = teachingSubject;
	}

public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

public String getCreateTime() {
	   
	   if(this.getCreateDate()!=null){
		   return DateUtil.parseDateTimeToStr(this.getCreateDate());
	   }
	   
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Integer getLecturerCount() {
		return lecturerCount;
	}

	public void setLecturerCount(Integer lecturerCount) {
		this.lecturerCount = lecturerCount;
	}

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getAgentTypeList() {
		return agentTypeList;
	}

	public void setAgentTypeList(String agentTypeList) {
		this.agentTypeList = agentTypeList;
	}

	public String getAgentFileList() {
		return agentFileList;
	}	

	public void setAgentFileList(String agentFileList) {
		this.agentFileList = agentFileList;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	private String areaDesc;

	    public String getAreaDesc() {
			return areaDesc;
		}

		public void setAreaDesc(String areaDesc) {
			this.areaDesc = areaDesc;
		}
	

    public String getIdNumberUrl() {
		return idNumberUrl;
	}

	public void setIdNumberUrl(String idNumberUrl) {
		this.idNumberUrl = idNumberUrl;
	}

	public String getContractUrl() {
		return contractUrl;
	}

	public void setContractUrl(String contractUrl) {
		this.contractUrl = contractUrl;
	}

	public String getOtherUrl() {
		return otherUrl;
	}

	public void setOtherUrl(String otherUrl) {
		this.otherUrl = otherUrl;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	
	public String getParentAgent() {
		return parentAgent;
	}

	public void setParentAgent(String parentAgent) {
		this.parentAgent = parentAgent;
	}

	

	public String getAgentSchool() {
		return agentSchool;
	}

	public void setAgentSchool(String agentSchool) {
		this.agentSchool = agentSchool;
	}

	public String getAgentUrl() {
		return agentUrl;
	}

	public void setAgentUrl(String agentUrl) {
		this.agentUrl = agentUrl;
	}

	public Integer getTeacherCount() {
		return teacherCount;
	}

	public void setTeacherCount(Integer teacherCount) {
		this.teacherCount = teacherCount;
	}

	public Date getCreateDateStart() {
		return CreateDateStart;
	}

	public void setCreateDateStart(Date createDateStart) {
		CreateDateStart = createDateStart;
	}

	public Date getCreateDateEnd() {
		return CreateDateEnd;
	}

	public void setCreateDateEnd(Date createDateEnd) {
		CreateDateEnd = createDateEnd;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

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
        this.uuid = uuid;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getGeneralAgent() {
        return generalAgent;
    }

    public void setGeneralAgent(Integer generalAgent) {
        this.generalAgent = generalAgent ;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getAgentArea() {
        return agentArea;
    }

    public void setAgentArea(String agentArea) {
        this.agentArea = agentArea == null ? null : agentArea.trim();
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation == null ? null : schoolLocation.trim();
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType == null ? null : agentType.trim();
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        this.version = version ;
    }
}