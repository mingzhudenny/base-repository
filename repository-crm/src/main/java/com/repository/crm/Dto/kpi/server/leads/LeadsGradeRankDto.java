package com.repository.crm.Dto.kpi.server.leads;
/**
 * leads年级分布vo
 *
 * @author csy
 *
 * @date 2017年12月15日 上午11:31:48
 *
 */
public class LeadsGradeRankDto implements Comparable<LeadsGradeRankDto>{

	/**
	 * 年级名称
	 */
	private String gradeName;
	/**
	 * 报名人数
	 */
	private Integer count;
	/**
	 * 各年级占比
	 */
	private double countRate;
	
	@Override
	public String toString() {
		return "LeadsGradeRankVo [gradeName=" + gradeName + ", count=" + count + ", countRate=" + countRate
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public double getCountRate() {
		return countRate;
	}

	public void setCountRate(double countRate) {
		this.countRate = countRate;
	}

	@Override
	public int compareTo(LeadsGradeRankDto o) {
		return o.getCount() - this.getCount();
	}
}
