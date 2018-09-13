package com.repository.crm.Dto.account.client.leads;

public class OldLeadsRequest {
	private String token;
	private String name;
	private String phone;
	private String startGiveUpDate;
	private String endGiveUpDate;
	private String signStatus;
    private  String oldUserName;
    private Integer pageIndex;
    private Integer pageNumber;
    private String orderBy; 
    private String sortType;
    private String channelLevel;
    private String subject;
    private String grade;
    private String isRecommend;
    private String signUpStartDate;
    private String signUpEndDate;
    private String leadsCreateStartDate;
    private String leadsCreateEndDate;
    
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStartGiveUpDate() {
		return startGiveUpDate;
	}
	public void setStartGiveUpDate(String startGiveUpDate) {
		this.startGiveUpDate = startGiveUpDate;
	}
	public String getEndGiveUpDate() {
		return endGiveUpDate;
	}
	public void setEndGiveUpDate(String endGiveUpDate) {
		this.endGiveUpDate = endGiveUpDate;
	}
	public String getSignStatus() {
		return signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getOldUserName() {
		return oldUserName;
	}
	public void setOldUserName(String oldUserName) {
		this.oldUserName = oldUserName;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getSortType() {
		return sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
	public String getChannelLevel() {
		return channelLevel;
	}
	public void setChannelLevel(String channelLevel) {
		this.channelLevel = channelLevel;
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
	public String getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}
	public String getSignUpStartDate() {
		return signUpStartDate;
	}
	public void setSignUpStartDate(String signUpStartDate) {
		this.signUpStartDate = signUpStartDate;
	}
	public String getSignUpEndDate() {
		return signUpEndDate;
	}
	public void setSignUpEndDate(String signUpEndDate) {
		this.signUpEndDate = signUpEndDate;
	}

	public String getLeadsCreateStartDate() {
		return leadsCreateStartDate;
	}

	public void setLeadsCreateStartDate(String leadsCreateStartDate) {
		this.leadsCreateStartDate = leadsCreateStartDate;
	}

	public String getLeadsCreateEndDate() {
		return leadsCreateEndDate;
	}

	public void setLeadsCreateEndDate(String leadsCreateEndDate) {
		this.leadsCreateEndDate = leadsCreateEndDate;
	}
}
