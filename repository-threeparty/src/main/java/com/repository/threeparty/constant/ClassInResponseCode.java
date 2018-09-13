package com.repository.threeparty.constant;

/**
 * classIn注册老师接口的code描述
 * @ClassName: AddTeacherCode 
 * @author csy
 * @date 2017年12月28日 下午3:09:55 
 *
 */
public enum ClassInResponseCode {
	CODE_1("1","表示执行成功"),
	CODE_100("100","表示参数不全或错误"),
	CODE_102("102","表示无权限（安全验证没通过）"),
	CODE_103("103","文件上传到服务器失败"),
	CODE_104("104","表示操作失败"),
	CODE_114("114","表示服务器异常"),
	CODE_131("131","表示注册失败"),
	CODE_133("133","该帐户已经在机构下存在"),
	CODE_134("134","表示手机号不合法"),
	CODE_135("135","表示手机号已注册"),
	CODE_137("137","表示密码长度不合法(6-20位)"),
	CODE_145("145","表示该课节已经结束"),
	CODE_149("149","表示该课程已删除"),
	CODE_151("151","表示过期时间至少要一天以后"),
	CODE_154("154","表示过期时间只能是1年以内的时间"),
	CODE_160("160","表示机构下无此云盘目录"),
	CODE_212("212","表示该课节已删除"),
	CODE_224("224","表示上传图片类型错误"),
	CODE_260("260","表示添加班主任失败"),
	CODE_280("280","表示课节创建成功，录课参数设置错误，录课开启失败"),
	CODE_281("281","表示课节创建成功，视频服务有问题，录课开启失败"),
	CODE_288("288","表示此号码段不合法"),
	CODE_331("331","表示班主任账号格式不正确"),
	CODE_334("334","表示班主任不存在"),
	CODE_340("340","表示注册成功，用户头像设置失败"),
	CODE_341("341","表示上传图片尺寸错误（300*300）"),
	CODE_342("342","表示上传图片大小超出限制（1M）");
	
	private String code;
	private String value;
	private ClassInResponseCode(String code, String value) {
		this.code = code;
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public static ClassInResponseCode findByCode(String code){
		switch (code) {
		case "1":
			return CODE_1;
		case "100":
			return CODE_100;
		case "102":
			return CODE_102;
		case "114":
			return CODE_114;
		case "131":
			return CODE_131;
		case "133":
			return CODE_133;
		case "134":
			return CODE_134;
		case "135":
			return CODE_135;
		case "137":
			return CODE_137;
		case "224":
			return CODE_224;
		case "288":
			return CODE_288;
		case "340":
			return CODE_340;
		case "341":
			return CODE_341;
		case "342":
			return CODE_342;
		default:
			return null;
		}
	}
}
