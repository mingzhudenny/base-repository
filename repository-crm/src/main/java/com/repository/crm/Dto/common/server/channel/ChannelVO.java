package com.repository.crm.Dto.common.server.channel;

import java.util.UUID;

import com.base.utils.validate.ValidateUtil;

import lombok.Data;

/**
 * 
 * <pre>
 * 渠道投放
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ChannelVO.java, v 0.1 2018年3月29日 下午4:45:41  Exp $
 */
@Data
public class ChannelVO{
	 
	 private Long id;
	 private String uuid; //渠道uuid

	 private String name; //渠道名称
	 
	 private String channelUserUuid;

	 private String level; //渠道等级

	 private String adid; // 渠道adid

	 private String channelKeyword; // 渠道关键字

	 private Integer type; //渠道类别

	 private String lpPage;// 渠道落地页
	 
	 private String putLink; //投放连接

	 private String platform;//设备平台

	 private String description; //渠道描述
	
	 private String channelTypeName;//渠道类别名称
	 
	 private String pageAddress;//投放链接

	 
	public String getPageAddress() {

		if(ValidateUtil.isNotEmpty(getLpPage())){
			
			pageAddress = getLpPage()+"?adid="+getAdid()+"&jh=&dy=&keynum=";
		}
		return pageAddress;
	}

	public void setPageAddress(String pageAddress) {
		this.pageAddress = pageAddress;
	}

	public String getChannelTypeName() {
		return channelTypeName;
	}

	public void setChannelTypeName(String channelTypeName) {
		this.channelTypeName = channelTypeName;
	}

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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getAdid() {
		return adid;
	}

	public void setAdid(String adid) {
		this.adid = adid;
	}

	public String getChannelKeyword() {
		return channelKeyword;
	}

	public void setChannelKeyword(String channelKeyword) {
		this.channelKeyword = channelKeyword;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getLpPage() {
		return lpPage;
	}

	public void setLpPage(String lpPage) {
		this.lpPage = lpPage;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPutLink() {
		return putLink;
	}

	public void setPutLink(String putLink) {
		this.putLink = putLink;
	}

	public String getChannelUserUuid() {
		return channelUserUuid;
	}

	public void setChannelUserUuid(String channelUserUuid) {
		this.channelUserUuid = channelUserUuid;
	}
}
