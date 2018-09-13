package com.repository.crm.Dto.cms.client;

import java.util.List;

public class CmsResourceVo {
	private Long id;
	private String title;
	private String name;
	private String path;
	private boolean hidden;
	private boolean alwaysShow;
	private String component;
	private List<CmsResourceVo> children;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public boolean isAlwaysShow() {
		return alwaysShow;
	}
	public void setAlwaysShow(boolean alwaysShow) {
		this.alwaysShow = alwaysShow;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public List<CmsResourceVo> getChildren() {
		return children;
	}
	public void setChildren(List<CmsResourceVo> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "CmsResourceVo [id=" + id + ", title=" + title + ", name=" + name + ", path=" + path + ", hidden="
				+ hidden + ", alwaysShow=" + alwaysShow + ", component=" + component + ", children=" + children + "]";
	}
	
}
