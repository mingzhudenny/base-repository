package com.repository.crm.constant;

/**
 * 支付方式枚举
 * @author csy
 * @date 2017年3月14日
 */
public enum HstCode {

	CODE_1111("1111","暂无相关描述"),
	CODE_0000("0000","操作成功"),
	CODE_0003("0003","用户名已存在或者参数不全"),
	CODE_0004("0004","用户名为空"),
	CODE_0005("0005","用户名格式不正确，包括长度、字符"),
	CODE_0006("0006","密码为空"),
	CODE_0007("0007","密码格式不正确，包括长度、字符"),
	CODE_0008("0008","密码不是MD5密码字符串"),
	CODE_0009("0009","昵称为空"),
	CODE_0010("0010","昵称格式不正确，包括长度、字符"),
	CODE_0011("0011","数字必须是1-100"),
	CODE_0012("0012","用户名前缀不能为空"),
	CODE_0013("0013","用户名前缀格式不正确，包括长度，字符"),
	CODE_0014("0014","前缀名已经存在"),
	CODE_0015("0015","D和名称不能同时为空"),
	CODE_0016("0016","会议id不能为空"),
	CODE_0017("0017","会议名称为空"),
	CODE_0018("0018","登录校验模型为空"),
	CODE_0019("0019","会议类型为空"),
	CODE_0020("0020","会议容量必须大于0"),
	CODE_0021("0021","不存在该数据信息或操作失败"),
	CODE_0022("0022","密钥错误"),
	CODE_0023("0023","密钥过期"),
	CODE_0024("0024","预约开始时间和结束时间为空"),
	CODE_0025("0025","数据不存在或者数据库连接异常"),
	CODE_0036("0036","产品服务id不能为空"),
	CODE_0037("0037","主席密码验证模式不能为空"),
	CODE_0038("0038","周例会议按月模式必须指定几号"),
	CODE_0039("0039","周例会议模式不能为空"),
	CODE_0040("0040","周例会议按周模式必须指定星期几"),
	CODE_0042("0042","企业没有购买该产品服务"),
	CODE_0043("0043","查询会议室日志的时间段太长"),
	CODE_0044("0044","查询记录数过多"),
	CODE_0045("0045","日期格式不对"),
	CODE_0046("0046","参数错误"),
	CODE_0047("0047","该用户不存在"),
	CODE_0048("0048","服务端连接超时"),
	CODE_0049("0049","会议室已经关闭"),
	CODE_0997("0997","操作频繁"),
	CODE_0998("0998","未知错误"),
	CODE_0999("0999","系统错误");
	
	private String code;
	private String value;
	private HstCode(String code, String value) {
		this.code = code;
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public String getValue() {
		return value;
	}
	
	public static HstCode findByCode(String code) { 
	    switch (code) {
		    case "0000":
		    	return CODE_0000;
		    case "0003":
		    	return CODE_0003;
		    case "0004":
		    	return CODE_0004;
		    case "0005":
		    	return CODE_0005;
		    case "0006":
		    	return CODE_0006;
		    case "0007":
		    	return CODE_0007;
		    case "0008":
		    	return CODE_0008;
		    case "0009":
		    	return CODE_0009;
		    case "0010":
		    	return CODE_0010;
		    case "0011":
		    	return CODE_0011;
		    case "0012":
		    	return CODE_0012;
		    case "0013":
		    	return CODE_0013;
		    case "0014":
		    	return CODE_0014;
		    case "0015":
		    	return CODE_0015;
		    case "0016":
		    	return CODE_0016;
		    case "0017":
		    	return CODE_0017;
		    case "0018":
		    	return CODE_0018;
		    case "0019":
		    	return CODE_0019;
		    case "0020":
		    	return CODE_0020;
		    case "0021":
		    	return CODE_0021;
		    case "0022":
		    	return CODE_0022;
		    case "0023":
		    	return CODE_0023;
		    case "0024":
		    	return CODE_0024;
		    case "0025":
		    	return CODE_0025;
		    case "0036":
		    	return CODE_0036;
		    case "0037":
		    	return CODE_0037;
		    case "0038":
		    	return CODE_0038;
		    case "0039":
		    	return CODE_0039;
		    case "0040":
		    	return CODE_0040;
		    case "0042":
		    	return CODE_0042;
		    case "0043":
		    	return CODE_0043;
		    case "0044":
		    	return CODE_0044;
		    case "0045":
		    	return CODE_0045;
		    case "0046":
		    	return CODE_0046;
		    case "0047":
		    	return CODE_0047;
		    case "0048":
		    	return CODE_0048;
		    case "0049":
		    	return CODE_0049;
		    case "0997":
		    	return CODE_0997;
		    case "0998":
		    	return CODE_0998;
		    case "0999":
		    	return CODE_0999;
	      default:
	        return CODE_1111;
	    }
	  }
	
	
}
