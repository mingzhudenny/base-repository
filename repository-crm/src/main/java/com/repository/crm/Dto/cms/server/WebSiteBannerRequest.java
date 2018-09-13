package com.repository.crm.Dto.cms.server;

public class WebSiteBannerRequest {
	private Long id;
	private Integer sort;//原本得排序号
	private Integer changeSort;//调整得排序号
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getChangeSort() {
		return changeSort;
	}
	public void setChangeSort(Integer changeSort) {
		this.changeSort = changeSort;
	}

	

}
