package com.repository.crm.Dto.course.server;
/**
 * lead信息
 * @author csy
 *
 * @date 2017年10月14日 上午11:33:56
 */
public class LeadsVo {

	/**
	 * leadsuuid
	 */
	private String leadsUuid;
	/**
	 * leads姓名
	 */
	private String leadsName;
	/**
	 * leads电话号码
	 */
	private String leadsPhone;
	@Override
	public String toString() {
		return "LeadsVo [leadsUuid=" + leadsUuid + ", leadsName=" + leadsName + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getLeadsPhone() {
		return leadsPhone;
	}
	public void setLeadsPhone(String leadsPhone) {
		this.leadsPhone = leadsPhone;
	}
	public String getLeadsUuid() {
		return leadsUuid;
	}
	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
	}
	public String getLeadsName() {
		return leadsName;
	}
	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}
	
}
