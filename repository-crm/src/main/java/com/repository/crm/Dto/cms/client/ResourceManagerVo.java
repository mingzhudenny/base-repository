package com.repository.crm.Dto.cms.client;

import java.util.List;

import com.base.utils.validate.ValidateUtil;


/**
 * 资源管理 要传送的数据
 * @author csy
 * @date 2017-01-21
 */
public class ResourceManagerVo {

	private long id;//资源id
	private Long pid;
	private String uuid; //资源uuid
	private String name; //资源名称
	private String isHaving; //是否拥有该资源权限
	private String iconCls;//图标
	private int seq;// 排序
	private String url;
	private List<ResourceManagerVo> ResourceManagerVo;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsHaving() {
		if(ValidateUtil.isNotEmpty(isHaving)&&ValidateUtil.isNotStringNull(isHaving)){
			return true;
		}else{
			return false;
		}
	}
	public void setIsHaving(String isHaving) {
		this.isHaving = isHaving;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public List<ResourceManagerVo> getResourceManagerVo() {
		return ResourceManagerVo;
	}
	public void setResourceManagerVo(List<ResourceManagerVo> resourceManagerVo) {
		ResourceManagerVo = resourceManagerVo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	
}
