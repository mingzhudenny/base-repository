package com.repository.threeparty.Dto;

/**
 * 基础传递参数
 *
 * @author csy
 * @time  2018年3月23日 下午2:24:18
 */
public class BaseDto {

	/**
	 * 用户token验证
	 */
	private String token;
	
	private Integer pageIndex;
	
	private Integer pageNumber;
	
	private Integer startIndex;
	/**
	 * avaiable/no_ avaiable
	 */
	private String actionValue;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public Integer getStartIndex() {
		if(pageIndex != null && pageNumber != null){
			startIndex = (pageIndex - 1) * pageNumber;
		}
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public String getActionValue() {
		return actionValue;
	}

	public void setActionValue(String actionValue) {
		this.actionValue = actionValue;
	}
}

