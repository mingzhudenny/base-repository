package com.repository.crm.Dto.kpi.server.leads;
/**
 * leads渠道分区vo
 *
 * @author csy
 *
 * @date 2017年12月15日 上午11:31:22
 *
 */
public class LeadsChannelRankDto implements Comparable<LeadsChannelRankDto>{

	/**
	 * 渠道名称
	 */
	private String channalName;
	/**
	 * 报名总数
	 */
	private Integer count;
	@Override
	public String toString() {
		return "LeadsChannelRankVo [channalName=" + channalName + ", count=" + count + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getChannalName() {
		return channalName;
	}
	public void setChannalName(String channalName) {
		this.channalName = channalName;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public int compareTo(LeadsChannelRankDto o) {
		return o.getCount() - this.getCount();
	}
	
}
