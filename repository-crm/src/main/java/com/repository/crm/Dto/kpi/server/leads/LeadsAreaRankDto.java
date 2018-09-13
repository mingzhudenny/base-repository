package com.repository.crm.Dto.kpi.server.leads;

/**
 * leads地区分布vo
 * 
 * @author csy
 *
 * @date 2017年12月15日 上午11:30:56
 *
 */
public class LeadsAreaRankDto implements Comparable<LeadsAreaRankDto> {

	/**
	 * 地区名称
	 */
	private String name;
	/**
	 * 报名总数
	 */
	private Integer value;

	@Override
	public String toString() {
		return "LeadsAreaRankVo [name=" + name + ", value=" + value + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public int compareTo(LeadsAreaRankDto o) {
		return o.getValue() - this.getValue();
	}

}
