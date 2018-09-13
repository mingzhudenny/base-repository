package com.repository.crm.Dto.kpi.server.leads;
/**
 * leads城市分布vo
 *
 * @author csy
 *
 * @date 2017年12月15日 上午11:31:34
 *
 */
public class LeadsCityRankDto implements Comparable<LeadsCityRankDto>{
	
	/**
	 * 城市名称
	 */
	private String cityName;
    /**
     * 报名人数
     */
	private Integer count;
	@Override
	public String toString() {
		return "LeadsCityRankVo [cityName=" + cityName + ", count=" + count + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public int compareTo(LeadsCityRankDto o) {
		return o.getCount() - this.getCount();
	}
}
