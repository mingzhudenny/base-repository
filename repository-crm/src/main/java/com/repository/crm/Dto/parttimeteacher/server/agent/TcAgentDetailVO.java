package com.repository.crm.Dto.parttimeteacher.server.agent;

import java.util.Date;
import java.util.List;

import com.repository.crm.Po.TcAgentFile;
import com.repository.crm.Po.TcAgentType;


public class TcAgentDetailVO {
	private Long id;

	private String uuid;
	
	 private String openId;
	
	 private Long agentGradeId;

	private String parentAgent;

	private String agentName;

	private String sex;

	private Integer generalAgent;

	private String phone;

	private String idNumber;

	private String email;

	private String qq;

	private String agentArea;

	private String areaDesc;

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

	private String logoUrl;

	private String idNumberUrl;//身份证的URL

	private String contractUrl;//合同文件的URL	 

	private String otherUrl;//其它文件URL	 
	
    private Long loginId;//LoginUser 的ID    

	private String agentSchool;//代理学校显示

	private String agentUrl;//代理Url显示

	private Integer teacherCount;// 老师数量

	private String bank;//显示银行
	
	private Integer salary;
	
	private Long templateId;

	// 代理类型
	private List<String> agentTypeList;

	private List<TcAgentFile> agentFileList;//文件列表
	
	private List<TcAgentType> typeList;//代理类型列表
	
	
    public List<TcAgentType> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<TcAgentType> typeList) {
		this.typeList = typeList;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getAgentGradeId() {
		return agentGradeId;
	}

	public void setAgentGradeId(Long agentGradeId) {
		this.agentGradeId = agentGradeId;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getLoginId() {
  		return loginId;
  	}

  	public void setLoginId(Long loginId) {
  		this.loginId = loginId;
  	}

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

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getParentAgent() {
		return parentAgent;
	}

	public void setParentAgent(String parentAgent) {
		this.parentAgent = parentAgent;
	}


	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public List<TcAgentFile> getAgentFileList() {
		return agentFileList;
	}

	public void setAgentFileList(List<TcAgentFile> agentFileList) {
		this.agentFileList = agentFileList;
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

	public List<String> getAgentTypeList() {
		return agentTypeList;
	}

	public void setAgentTypeList(List<String> agentTypeList) {
		this.agentTypeList = agentTypeList;
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
		this.generalAgent = generalAgent;
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
	
}