package com.repository.crm.constant;

/**
 * 支付方式枚举
 * @author csy
 * @date 2017年3月14日
 */
public enum PayStyleType {

	BANK("bank","银行支付"),
	TAOBAO("taobao","淘宝"),
	ALIPAY("alipay","支付宝"),
	WEINXIN("weixin","微信"),
	WEBPAY("webpay","官网支付"),
	PINGPP("pingpp","ping++"),
	BAIDUPAY("baiduStaging","百度分期"),
	LOVEHAIMI("lovehaimi","爱海米分期"),
	KUSTAGING("kuStaging","库分期");

	private String value;
	private String name;

	PayStyleType(String value,String name){
		this.name = name;
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	
}
