package com.repository.crm.constant;

public enum Platform {
	
	CRM(1,"后台管理系统"),WECHAT(2,"微信"),
	WEBSITE(3,"网站"),ORDER(4,"工单系统"),
	KPI(5,"报表系统"),TCRM(6,"老师web端"),
	XCRM(7,"学在家系统"),CHANNEL(8,"渠道商平台"),
	CLIENT(9,"客户端"),IOS(10,"iOS"),
	ANDROID(11,"android"),SCRM(12,"学生端");
	
	Platform(Integer value,String name){
		this.value = value;
		this.name = name;
	}
	private String name;
	private Integer value;
	
	public String getName() {
		return name;
	}
	public Integer getValue() {
		return value;
	}

	public static Platform findByValue(Integer value){
		switch (value){
			case 1:
				return CRM;
			case 2:
				return WECHAT;
			case 3:
				return WEBSITE;
			case 4:
				return ORDER;
			case 5:
				return KPI;
			case 6:
				return TCRM;
			case 7:
				return XCRM;
			case 8:
				return CHANNEL;
			case 9:
				return CLIENT;
			case 10:
				return IOS;
			case 11:
				return ANDROID;
			case 12:
				return SCRM;

			default:
				return null;
		}

	}

}
