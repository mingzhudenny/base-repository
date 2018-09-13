package com.repository.crm.Dto.kpi.server.leads;

/**
 * Cr推荐leads报表展示数据
 * @author csy
 *
 * @date 2017年10月26日 下午3:15:21
 */
public class CrRecommendLeadsVo implements Comparable<CrRecommendLeadsVo>{

	/**
	 * 用户uuid
	 */
	private String userUuid;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 推荐leads总数 按推荐日期
	 */
	private int RecommendLeadsCount;
	/**
	 * 推荐leads排课数 按测评课上课日期（除去 撤销、学生放鸽子、老师放鸽子）上课的推荐leas排课数
	 */
	private int RecommendLeadsCourseCount;
	/**
	 * 推荐leads付费数 提交付费时间内推荐leads的付费数
	 */
	private int RecommendLeadsPayCount;
	/**
	 * 名单内排课数 推荐时间内的leads的排课数
	 */
	private int recommendLeadsListCourseCount;
	/**
	 * 名单类付费数 推荐时间内的leads的付费数
	 */
	private int recommendLeadsListPayCount;
	
	@Override
	public String toString() {
		return "CrRecommendLeadsVo [userUuid=" + userUuid + ", userName=" + userName + ", RecommendLeadsCount="
				+ RecommendLeadsCount + ", RecommendLeadsCourseCount=" + RecommendLeadsCourseCount
				+ ", RecommendLeadsPayCount=" + RecommendLeadsPayCount + ", recommendLeadsListCourseCount="
				+ recommendLeadsListCourseCount + ", recommendLeadsListPayCount=" + recommendLeadsListPayCount
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getUserUuid() {
		return userUuid;
	}

	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRecommendLeadsCount() {
		return RecommendLeadsCount;
	}

	public void setRecommendLeadsCount(int recommendLeadsCount) {
		RecommendLeadsCount = recommendLeadsCount;
	}



	public int getRecommendLeadsCourseCount() {
		return RecommendLeadsCourseCount;
	}

	public void setRecommendLeadsCourseCount(int recommendLeadsCourseCount) {
		RecommendLeadsCourseCount = recommendLeadsCourseCount;
	}

	public int getRecommendLeadsPayCount() {
		return RecommendLeadsPayCount;
	}

	public void setRecommendLeadsPayCount(int recommendLeadsPayCount) {
		RecommendLeadsPayCount = recommendLeadsPayCount;
	}

	public int getRecommendLeadsListCourseCount() {
		return recommendLeadsListCourseCount;
	}

	public void setRecommendLeadsListCourseCount(int recommendLeadsListCourseCount) {
		this.recommendLeadsListCourseCount = recommendLeadsListCourseCount;
	}

	public int getRecommendLeadsListPayCount() {
		return recommendLeadsListPayCount;
	}

	public void setRecommendLeadsListPayCount(int recommendLeadsListPayCount) {
		this.recommendLeadsListPayCount = recommendLeadsListPayCount;
	}

	@Override
	public int compareTo(CrRecommendLeadsVo o) {
		int i = o.getRecommendLeadsCount() - this.getRecommendLeadsCount();
		if(i == 0)
			return o.getRecommendLeadsCourseCount() - this.getRecommendLeadsCourseCount();
			return i;
	}
}
