package com.repository.crm.Dto.kpi.client.sale;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 渠道销售kpi报表
 * @author csy
 * @date 2017年8月8日
 */
public class ChannelSaleKpiDto {
	
	   private BigDecimal rate = new BigDecimal(100);

	   private String teamUuid;//团队uuid
	   private String teamName;//团队名称
	   private String userUuid;//用户uuid
	   private String userName;//用户姓名
	   private String realityMonery;//渠道实收金额　时间段内，付费金额总和
	   private String sumRealityMonery;//渠道总营收金额　时间段内，付费金额总和
	   private Integer makeContractPeople;//渠道签约人数　时间段内，付费人数总和
	   private Integer havePayMakeContractPeople;//已支付的签约人数　时间段内，付费人数总和
	   private Integer waitPayMakeContractPeople;//未支付的签约人数　时间段内，付费人数总和
	   private double averageSingleBottom;//渠道平均单底 realityMonery除以makeContractPeople
	   private int leadsLists;//渠道名单数  时间段内，销售被分配的名单数量总和
	   private int arrangeCourseNumber;//渠道排课数：时间段内，匹配排课成功的测评课数量
	   private BigDecimal arrangeCourseRate;//渠道排课率=排课数/名单数*100%
	   private BigDecimal arrangeCourseChangeRate;//渠道排课转化率=签约人数/排课数*100%
	   private BigDecimal totalChangeRate;//渠道总转化率=签约人数/名单数*100%
	   
	public Integer getHavePayMakeContractPeople() {
		return havePayMakeContractPeople;
	}
	public void setHavePayMakeContractPeople(Integer havePayMakeContractPeople) {
		this.havePayMakeContractPeople = havePayMakeContractPeople;
	}
	public Integer getWaitPayMakeContractPeople() {
		return waitPayMakeContractPeople;
	}
	public void setWaitPayMakeContractPeople(Integer waitPayMakeContractPeople) {
		this.waitPayMakeContractPeople = waitPayMakeContractPeople;
	}
	public String getTeamUuid() {
		return teamUuid;
	}
	public void setTeamUuid(String teamUuid) {
		this.teamUuid = teamUuid;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
	public String getRealityMonery() {
		return realityMonery;
	}
	public void setRealityMonery(String realityMonery) {
		this.realityMonery = realityMonery;
	}
	public String getSumRealityMonery() {
		return sumRealityMonery;
	}
	public void setSumRealityMonery(String sumRealityMonery) {
		this.sumRealityMonery = sumRealityMonery;
	}
	public Integer getMakeContractPeople() {
		if(havePayMakeContractPeople == null ){
			havePayMakeContractPeople = 0;
		}
		if(waitPayMakeContractPeople == null ){
			waitPayMakeContractPeople = 0;
		}
		makeContractPeople =havePayMakeContractPeople + waitPayMakeContractPeople;
		return makeContractPeople;
	}
	public void setMakeContractPeople(Integer makeContractPeople) {
		this.makeContractPeople = makeContractPeople;
	}
	public double getAverageSingleBottom() {
		return averageSingleBottom;
	}
	public void setAverageSingleBottom(double averageSingleBottom) {
		this.averageSingleBottom = averageSingleBottom;
	}
	public int getLeadsLists() {
		return leadsLists;
	}
	public void setLeadsLists(int leadsLists) {
		this.leadsLists = leadsLists;
	}
	public int getArrangeCourseNumber() {
		return arrangeCourseNumber;
	}
	public void setArrangeCourseNumber(int arrangeCourseNumber) {
		this.arrangeCourseNumber = arrangeCourseNumber;
	}
	public BigDecimal getArrangeCourseRate() {
		if(getLeadsLists()>0){
			//排课率=排课数/名单数*100%
			arrangeCourseRate = new BigDecimal(getArrangeCourseNumber())
					.divide(new BigDecimal(getLeadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}	
		return arrangeCourseRate;
	}
	public void setArrangeCourseRate(BigDecimal arrangeCourseRate) {
		this.arrangeCourseRate = arrangeCourseRate;
	}
	public BigDecimal getArrangeCourseChangeRate() {
		if(arrangeCourseNumber>0){
			//排课率=排课数/名单数*100%
			arrangeCourseChangeRate = new BigDecimal(getMakeContractPeople())
					.divide(new BigDecimal(getArrangeCourseNumber()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return arrangeCourseChangeRate;
	}
	public void setArrangeCourseChangeRate(BigDecimal arrangeCourseChangeRate) {
		this.arrangeCourseChangeRate = arrangeCourseChangeRate;
	}
	public BigDecimal getTotalChangeRate() {
		if(getLeadsLists()>0){
			//总转化率=签约人数/名单数*100% 
			totalChangeRate = new BigDecimal(getMakeContractPeople())
					.divide(new BigDecimal(getLeadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return totalChangeRate;
	}
	public void setTotalChangeRate(BigDecimal totalChangeRate) {
		this.totalChangeRate = totalChangeRate;
	}
	   
}
