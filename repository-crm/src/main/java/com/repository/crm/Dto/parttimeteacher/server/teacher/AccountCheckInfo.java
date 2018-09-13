package com.repository.crm.Dto.parttimeteacher.server.teacher;

/**
 * 全局搜索要展示的数据
 * @author Administrator
 *
 */
public class AccountCheckInfo {
	
	private Byte identity;//身份
	private String name;//姓名
	private String phone;//电话号码
	private String ccName;//cc姓名
	private String ccPhone;//cc电话号码
	private String crName;//cr姓名
	private String crPhone;//cr电话号码
    private Boolean isSign;//以前是否被标记
    private Boolean signStatus;//当前标记状态
    
	@Override
	public String toString() {
		return "AccountCheckInfo [identity=" + identity + ", name=" + name + ", phone=" + phone + ", ccName=" + ccName
				+ ", ccPhone=" + ccPhone + ", crName=" + crName + ", crPhone=" + crPhone + ", isSign=" + isSign
				+ ", signStatus=" + signStatus + ", getIdentity()=" + getIdentity() + ", getName()=" + getName()
				+ ", getPhone()=" + getPhone() + ", getCcName()=" + getCcName() + ", getCcPhone()=" + getCcPhone()
				+ ", getCrName()=" + getCrName() + ", getCrPhone()=" + getCrPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Byte getIdentity() {
		return identity;
	}

	public void setIdentity(Byte identity) {
		this.identity = identity;
	}

	public Boolean getIsSign() {
		return isSign;
	}

	public void setIsSign(Boolean isSign) {
		this.isSign = isSign;
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
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getCcPhone() {
		return ccPhone;
	}
	public void setCcPhone(String ccPhone) {
		this.ccPhone = ccPhone;
	}
	public String getCrName() {
		return crName;
	}
	public void setCrName(String crName) {
		this.crName = crName;
	}
	public String getCrPhone() {
		return crPhone;
	}
	public void setCrPhone(String crPhone) {
		this.crPhone = crPhone;
	}
	public Boolean getSignStatus() {
		if(isSign!=null && signStatus !=null){
			if(isSign && signStatus){
				return true;
			}
			if(isSign && !signStatus){
				return true;
			}
			if(!isSign && !signStatus){
				return false;
			}
		}
		return signStatus;
	}
	public void setSignStatus(Boolean signStatus) {
		this.signStatus = signStatus;
	}
	
}
