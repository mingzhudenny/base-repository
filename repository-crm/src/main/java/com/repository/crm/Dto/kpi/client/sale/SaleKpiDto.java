package com.repository.crm.Dto.kpi.client.sale;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import com.base.utils.validate.ValidateUtil;

/**
 * 销售kpi要展示的数据vo
 * @author csy
 * @date 2017年2月23日
 */
public class SaleKpiDto implements Comparable<SaleKpiDto>{
	
   private BigDecimal rate = new BigDecimal(100);
   
   private String teamUuid;//团队uuid
   private String teamName;//团队名称
   private String teamType;//团队职位
   private String userUuid;//用户uuid
   private String userName;//用户姓名
   private String userType;//用户职位
   private String realityMonery;//实收金额　时间段内，付费金额总和
   private String sumRealityMonery;//总营收金额　时间段内，付费金额总和
   private Integer makeContractPeople;//签约人数　时间段内，付费人数总和
   private Integer havePayMakeContractPeople;//已支付的签约人数　时间段内，付费人数总和
   private Integer waitPayMakeContractPeople;//未支付的签约人数　时间段内，付费人数总和
   private double averageSingleBottom;//平均单底 realityMonery除以makeContractPeople
   private int leadsLists;//名单数  时间段内，销售被分配的名单数量总和
   private int arrangeCourseNumber;//排课数：时间段内，cc提交的匹配排课成功的测评课数量
   private BigDecimal arrangeCourseRate;//排课率=排课数/名单数*100%
   private BigDecimal arrangeCourseChangeRate;//排课转化率=签约人数/排课数*100%
   private BigDecimal totalChangeRate;//总转化率=签约人数/名单数*100% 
   
   private String ArealityMonery;//A渠道实收金额　时间段内，付费金额总和
   private String AsumRealityMonery;//A渠道总营收金额　时间段内，付费金额总和
   private Integer AmakeContractPeople;//A渠道签约人数　时间段内，付费人数总和
   private Integer AhavePayMakeContractPeople;//已支付的签约人数　时间段内，付费人数总和
   private Integer AwaitPayMakeContractPeople;//未支付的签约人数　时间段内，付费人数总和
   private double AaverageSingleBottom;//A渠道平均单底 realityMonery除以makeContractPeople
   private int AleadsLists;//A渠道名单数  时间段内，销售被分配的名单数量总和
   private int AarrangeCourseNumber;//A渠道排课数：时间段内，匹配排课成功的测评课数量
   private BigDecimal AarrangeCourseRate;//A渠道排课率=排课数/名单数*100%
   private BigDecimal AarrangeCourseChangeRate;//A渠道排课转化率=签约人数/排课数*100%
   private BigDecimal AtotalChangeRate;//A渠道总转化率=签约人数/名单数*100% 
   
   private String b_realityMonery;//B渠道实收金额　时间段内，付费金额总和
   private String b_sumRealityMonery;//B渠道总营收金额　时间段内，付费金额总和
   private Integer b_makeContractPeople;//B渠道签约人数　时间段内，付费人数总和
   private Integer b_havePayMakeContractPeople;//已支付的签约人数　时间段内，付费人数总和
   private Integer b_waitPayMakeContractPeople;//未支付的签约人数　时间段内，付费人数总和
   private double b_averageSingleBottom;//B渠道平均单底 realityMonery除以makeContractPeople
   private int b_leadsLists;//B渠道名单数  时间段内，销售被分配的名单数量总和
   private int b_arrangeCourseNumber;//B渠道排课数：时间段内，匹配排课成功的测评课数量
   private BigDecimal b_arrangeCourseRate;//B渠道排课率=排课数/名单数*100%
   private BigDecimal b_arrangeCourseChangeRate;//B渠道排课转化率=签约人数/排课数*100%
   private BigDecimal b_totalChangeRate;//B渠道总转化率=签约人数/名单数*100% 
   
   
   private String c_realityMonery;//C渠道实收金额　时间段内，付费金额总和
   private String c_sumRealityMonery;//C渠道总营收金额　时间段内，付费金额总和
   private Integer c_makeContractPeople;//C渠道签约人数　时间段内，付费人数总和
   private Integer c_havePayMakeContractPeople;//已支付的签约人数　时间段内，付费人数总和
   private Integer c_waitPayMakeContractPeople;//未支付的签约人数　时间段内，付费人数总和
   private double c_averageSingleBottom;//C渠道平均单底 realityMonery除以makeContractPeople
   private int c_leadsLists;//C渠道名单数  时间段内，销售被分配的名单数量总和
   private int c_arrangeCourseNumber;//C渠道排课数：时间段内，匹配排课成功的测评课数量
   private BigDecimal c_arrangeCourseRate;//C渠道排课率=排课数/名单数*100%
   private BigDecimal c_arrangeCourseChangeRate;//C渠道排课转化率=签约人数/排课数*100%
   private BigDecimal c_totalChangeRate;//C渠道总转化率=签约人数/名单数*100% 
   
/* private String d_realityMonery;//D渠道实收金额　时间段内，付费金额总和
   private String d_sumRealityMonery;//D渠道总营收金额　时间段内，付费金额总和
   private Integer d_makeContractPeople;//D渠道签约人数　时间段内，付费人数总和
   private double d_averageSingleBottom;//D渠道平均单底 realityMonery除以makeContractPeople
   private Integer d_leadsLists;//D渠道名单数  时间段内，销售被分配的名单数量总和
   private Integer d_arrangeCourseNumber;//D渠道排课数：时间段内，匹配排课成功的测评课数量
   private BigDecimal d_arrangeCourseRate;//D渠道排课率=排课数/名单数*100%
   private BigDecimal d_arrangeCourseChangeRate;//D渠道排课转化率=签约人数/排课数*100%
   private BigDecimal d_totalChangeRate;//D渠道总转化率=签约人数/名单数*100%
*/   
   private String e_realityMonery;//E渠道实收金额　时间段内，付费金额总和
   private String e_sumRealityMonery;//E渠道总营收金额　时间段内，付费金额总和
   private Integer e_makeContractPeople;//E渠道签约人数　时间段内，付费人数总和
   private Integer e_havePayMakeContractPeople;//已支付的签约人数　时间段内，付费人数总和
   private Integer e_waitPayMakeContractPeople;//未支付的签约人数　时间段内，付费人数总和
   private double e_averageSingleBottom;//E渠道平均单底 realityMonery除以makeContractPeople
   private int e_leadsLists;//E渠道名单数  时间段内，销售被分配的名单数量总和
   private int e_arrangeCourseNumber;//E渠道排课数：时间段内，匹配排课成功的测评课数量
   private BigDecimal e_arrangeCourseRate;//E渠道排课率=排课数/名单数*100%
   private BigDecimal e_arrangeCourseChangeRate;//E渠道排课转化率=签约人数/排课数*100%
   private BigDecimal e_totalChangeRate;//E渠道总转化率=签约人数/名单数*100% 
   
	@Override
	public String toString() {
	return "SaleKpiVo [teamUuid=" + teamUuid + ", teamName=" + teamName + ", teamType=" + teamType + ", userUuid="
			+ userUuid + ", userName=" + userName + ", userType=" + userType + ", realityMonery=" + realityMonery
			+ ", sumRealityMonery=" + sumRealityMonery + ", makeContractPeople=" + makeContractPeople
			+ ", averageSingleBottom=" + averageSingleBottom + ", leadsLists=" + leadsLists + ", arrangeCourseNumber="
			+ arrangeCourseNumber + ", arrangeCourseRate=" + arrangeCourseRate + ", arrangeCourseChangeRate="
			+ arrangeCourseChangeRate + ", totalChangeRate=" + totalChangeRate + ", ArealityMonery=" + ArealityMonery
			+ ", AsumRealityMonery=" + AsumRealityMonery + ", AmakeContractPeople=" + AmakeContractPeople
			+ ", AaverageSingleBottom=" + AaverageSingleBottom + ", AleadsLists=" + AleadsLists
			+ ", AarrangeCourseNumber=" + AarrangeCourseNumber + ", AarrangeCourseRate=" + AarrangeCourseRate
			+ ", AarrangeCourseChangeRate=" + AarrangeCourseChangeRate + ", AtotalChangeRate=" + AtotalChangeRate
			+ ", getTeamUuid()=" + getTeamUuid() + ", getSumRealityMonery()=" + getSumRealityMonery()
			+ ", getTeamName()=" + getTeamName() + ", getUserUuid()=" + getUserUuid() + ", getUserName()="
			+ getUserName() + ", getRealityMonery()=" + getRealityMonery() + ", getMakeContractPeople()="
			+ getMakeContractPeople() + ", getAverageSingleBottom()=" + getAverageSingleBottom() + ", getLeadsLists()="
			+ getLeadsLists() + ", getArrangeCourseNumber()=" + getArrangeCourseNumber() + ", getArrangeCourseRate()="
			+ getArrangeCourseRate() + ", getArrangeCourseChangeRate()=" + getArrangeCourseChangeRate()
			+ ", getTotalChangeRate()=" + getTotalChangeRate() + ", getTeamType()=" + getTeamType() + ", getUserType()="
			+ getUserType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
	
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

	public String getArealityMonery() {
		return ArealityMonery;
	}

	public void setArealityMonery(String arealityMonery) {
		ArealityMonery = arealityMonery;
	}

	public Integer getAhavePayMakeContractPeople() {
		return AhavePayMakeContractPeople;
	}

	public void setAhavePayMakeContractPeople(Integer ahavePayMakeContractPeople) {
		AhavePayMakeContractPeople = ahavePayMakeContractPeople;
	}

	public Integer getAwaitPayMakeContractPeople() {
		return AwaitPayMakeContractPeople;
	}

	public void setAwaitPayMakeContractPeople(Integer awaitPayMakeContractPeople) {
		AwaitPayMakeContractPeople = awaitPayMakeContractPeople;
	}

	public String getAsumRealityMonery() {
		double sumRealityMonery1;
		double realityMonery1;
		if(!ValidateUtil.isNotEmpty(AsumRealityMonery)){
			sumRealityMonery1 = 0;
		}else{
			sumRealityMonery1 = Double.valueOf(AsumRealityMonery);
		}
		
		if(!ValidateUtil.isNotEmpty(getArealityMonery())){
			realityMonery1 = 0;
		}else{
			realityMonery1 = Double.valueOf(getArealityMonery());
		}
		double money = sumRealityMonery1 + realityMonery1;
		return String.valueOf(money);
	}

	public Integer getB_havePayMakeContractPeople() {
		return b_havePayMakeContractPeople;
	}

	public void setB_havePayMakeContractPeople(Integer b_havePayMakeContractPeople) {
		this.b_havePayMakeContractPeople = b_havePayMakeContractPeople;
	}

	public Integer getB_waitPayMakeContractPeople() {
		return b_waitPayMakeContractPeople;
	}

	public void setB_waitPayMakeContractPeople(Integer b_waitPayMakeContractPeople) {
		this.b_waitPayMakeContractPeople = b_waitPayMakeContractPeople;
	}

	public Integer getC_havePayMakeContractPeople() {
		return c_havePayMakeContractPeople;
	}

	public void setC_havePayMakeContractPeople(Integer c_havePayMakeContractPeople) {
		this.c_havePayMakeContractPeople = c_havePayMakeContractPeople;
	}

	public Integer getC_waitPayMakeContractPeople() {
		return c_waitPayMakeContractPeople;
	}

	public void setC_waitPayMakeContractPeople(Integer c_waitPayMakeContractPeople) {
		this.c_waitPayMakeContractPeople = c_waitPayMakeContractPeople;
	}

	public Integer getE_havePayMakeContractPeople() {
		return e_havePayMakeContractPeople;
	}

	public void setE_havePayMakeContractPeople(Integer e_havePayMakeContractPeople) {
		this.e_havePayMakeContractPeople = e_havePayMakeContractPeople;
	}

	public Integer getE_waitPayMakeContractPeople() {
		return e_waitPayMakeContractPeople;
	}

	public void setE_waitPayMakeContractPeople(Integer e_waitPayMakeContractPeople) {
		this.e_waitPayMakeContractPeople = e_waitPayMakeContractPeople;
	}

	public void setAsumRealityMonery(String asumRealityMonery) {
		AsumRealityMonery = asumRealityMonery;
	}


	public Integer getAmakeContractPeople() {
		if(getAhavePayMakeContractPeople() == null ){
			AhavePayMakeContractPeople = 0;
		}
		if(getAwaitPayMakeContractPeople() == null ){
			AwaitPayMakeContractPeople = 0;
		}
		AmakeContractPeople =AhavePayMakeContractPeople + AwaitPayMakeContractPeople;
		return AmakeContractPeople;
	}


	public void setAmakeContractPeople(Integer amakeContractPeople) {
		AmakeContractPeople = amakeContractPeople;
	}


	public double getAaverageSingleBottom() {
		DecimalFormat df =new DecimalFormat("#.00");  
		return Double.valueOf(df.format(AaverageSingleBottom));
	}


	public void setAaverageSingleBottom(double aaverageSingleBottom) {
		AaverageSingleBottom = aaverageSingleBottom;
	}


	public int getAleadsLists() {
		return AleadsLists;
	}


	public void setAleadsLists(int aleadsLists) {
		AleadsLists = aleadsLists;
	}


	public int getAarrangeCourseNumber() {
		return AarrangeCourseNumber;
	}


	public void setAarrangeCourseNumber(int aarrangeCourseNumber) {
		AarrangeCourseNumber = aarrangeCourseNumber;
	}


	public BigDecimal getAarrangeCourseRate() {
		if(getAleadsLists() > 0){
			//排课率=排课数/名单数*100%
			AarrangeCourseRate = new BigDecimal(getAarrangeCourseNumber())
					.divide(new BigDecimal(getAleadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return AarrangeCourseRate;
	}


	public void setAarrangeCourseRate(BigDecimal aarrangeCourseRate) {
		AarrangeCourseRate = aarrangeCourseRate;
	}


	public BigDecimal getAarrangeCourseChangeRate() {
		if(getAarrangeCourseNumber()>0){
			AarrangeCourseChangeRate = new BigDecimal(getAmakeContractPeople())
					.divide(new BigDecimal(getAarrangeCourseNumber()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return AarrangeCourseChangeRate;
	}


	public void setAarrangeCourseChangeRate(BigDecimal aarrangeCourseChangeRate) {
		AarrangeCourseChangeRate = aarrangeCourseChangeRate;
	}


	public BigDecimal getAtotalChangeRate() {
		if(getAleadsLists()>0){
			//总转化率=签约人数/名单数*100% 
			AtotalChangeRate = new BigDecimal(getAmakeContractPeople())
					.divide(new BigDecimal(getAleadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return AtotalChangeRate;
	}


	public void setAtotalChangeRate(BigDecimal atotalChangeRate) {
		AtotalChangeRate = atotalChangeRate;
	}


	public String getTeamUuid() {
		return teamUuid;
	}
	public void setTeamUuid(String teamUuid) {
		this.teamUuid = teamUuid;
	}
	public String getSumRealityMonery() {
		double sumRealityMonery1;
		double realityMonery1;
		if(!ValidateUtil.isNotEmpty(sumRealityMonery)){
			sumRealityMonery1 = 0;
		}else{
			sumRealityMonery1 = Double.valueOf(sumRealityMonery);
		}
		
		if(!ValidateUtil.isNotEmpty(getRealityMonery())){
			realityMonery1 = 0;
		}else{
			realityMonery1 = Double.valueOf(getRealityMonery());
		}
		double money = sumRealityMonery1 + realityMonery1;
		return String.valueOf(money);
	}
	public void setSumRealityMonery(String sumRealityMonery) {
		this.sumRealityMonery = sumRealityMonery;
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
	public Integer getMakeContractPeople() {
		if(getHavePayMakeContractPeople() == null ){
			havePayMakeContractPeople = 0;
		}
		if(getWaitPayMakeContractPeople() == null ){
			waitPayMakeContractPeople = 0;
		}
		makeContractPeople = havePayMakeContractPeople + waitPayMakeContractPeople;
		return makeContractPeople;
	}
	public void setMakeContractPeople(Integer makeContractPeople) {
		this.makeContractPeople = makeContractPeople;
	}
	public double getAverageSingleBottom() {
		DecimalFormat df =new DecimalFormat("#.00");  
		return Double.valueOf(df.format(averageSingleBottom));
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
	
	public String getTeamType() {
		if(ValidateUtil.isNotEmpty(teamType)){
			if(teamType.equals("1")){
				return "cr团队";
			}else if(teamType.equals("0")){
				return "cc团队";
			}
		}
		return "暂无职位";
	}
	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}
	public String getUserType() {
		if(ValidateUtil.isNotEmpty(userType)){
			if(userType.contains("cc")){
				return "cc";
			}else if(userType.contains("cr")){
				return "cr";
			}
		}
		return "暂无职位";
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getB_realityMonery() {
		return b_realityMonery;
	}
	public void setB_realityMonery(String b_realityMonery) {
		this.b_realityMonery = b_realityMonery;
	}
	public String getB_sumRealityMonery() {
		double sumRealityMonery1;
		double realityMonery1;
		if(!ValidateUtil.isNotEmpty(b_sumRealityMonery)){
			sumRealityMonery1 = 0;
		}else{
			sumRealityMonery1 = Double.valueOf(b_sumRealityMonery);
		}
		
		if(!ValidateUtil.isNotEmpty(getB_realityMonery())){
			realityMonery1 = 0;
		}else{
			realityMonery1 = Double.valueOf(getB_realityMonery());
		}
		double money = sumRealityMonery1 + realityMonery1;
		b_sumRealityMonery= String.valueOf(money);
		return b_sumRealityMonery;
	}
	public void setB_sumRealityMonery(String b_sumRealityMonery) {
		this.b_sumRealityMonery = b_sumRealityMonery;
	}
	public Integer getB_makeContractPeople() {
		if(getB_havePayMakeContractPeople() == null ){
			b_havePayMakeContractPeople = 0;
		}
		if(getB_waitPayMakeContractPeople() == null ){
			b_waitPayMakeContractPeople = 0;
		}
		b_makeContractPeople =b_havePayMakeContractPeople + b_waitPayMakeContractPeople;
		return b_makeContractPeople;
	}
	public void setB_makeContractPeople(Integer b_makeContractPeople) {
		this.b_makeContractPeople = b_makeContractPeople;
	}
	public double getB_averageSingleBottom() {
		DecimalFormat df =new DecimalFormat("#.00");  
		return Double.valueOf(df.format(b_averageSingleBottom));
	}
	public void setB_averageSingleBottom(double b_averageSingleBottom) {
		this.b_averageSingleBottom = b_averageSingleBottom;
	}
	public int getB_leadsLists() {
		return b_leadsLists;
	}
	public void setB_leadsLists(int b_leadsLists) {
		this.b_leadsLists = b_leadsLists;
	}
	public int getB_arrangeCourseNumber() {
		return b_arrangeCourseNumber;
	}
	public void setB_arrangeCourseNumber(int b_arrangeCourseNumber) {
		this.b_arrangeCourseNumber = b_arrangeCourseNumber;
	}
	public BigDecimal getB_arrangeCourseRate() {
		if(getB_leadsLists()>0){
			//排课率=排课数/名单数*100%
			b_arrangeCourseRate = new BigDecimal(getB_arrangeCourseNumber())
					.divide(new BigDecimal(getB_leadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}	
		return b_arrangeCourseRate;
	}
	public void setB_arrangeCourseRate(BigDecimal b_arrangeCourseRate) {
		this.b_arrangeCourseRate = b_arrangeCourseRate;
	}
	public BigDecimal getB_arrangeCourseChangeRate() {
		if(getB_arrangeCourseNumber()>0){
			//排课率=排课数/名单数*100%
			b_arrangeCourseChangeRate = new BigDecimal(getB_makeContractPeople())
					.divide(new BigDecimal(getB_arrangeCourseNumber()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return b_arrangeCourseChangeRate;
	}
	public void setB_arrangeCourseChangeRate(BigDecimal b_arrangeCourseChangeRate) {
		this.b_arrangeCourseChangeRate = b_arrangeCourseChangeRate;
	}
	public BigDecimal getB_totalChangeRate() {
		if(getB_leadsLists()>0){
			//总转化率=签约人数/名单数*100% 
			b_totalChangeRate = new BigDecimal(getB_makeContractPeople())
					.divide(new BigDecimal(getB_leadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return b_totalChangeRate;
	}
	public void setB_totalChangeRate(BigDecimal b_totalChangeRate) {
		this.b_totalChangeRate = b_totalChangeRate;
	}
	
	public String getC_realityMonery() {
		return c_realityMonery;
	}
	public void setC_realityMonery(String c_realityMonery) {
		this.c_realityMonery = c_realityMonery;
	}
	public String getC_sumRealityMonery() {
		double sumRealityMonery1;
		double realityMonery1;
		if(!ValidateUtil.isNotEmpty(c_sumRealityMonery)){
			sumRealityMonery1 = 0;
		}else{
			sumRealityMonery1 = Double.valueOf(c_sumRealityMonery);
		}
		
		if(!ValidateUtil.isNotEmpty(getC_realityMonery())){
			realityMonery1 = 0;
		}else{
			realityMonery1 = Double.valueOf(getC_realityMonery());
		}
		double money = sumRealityMonery1 + realityMonery1;
		c_sumRealityMonery = String.valueOf(money);
		return c_sumRealityMonery;
	}
	public void setC_sumRealityMonery(String c_sumRealityMonery) {
		this.c_sumRealityMonery = c_sumRealityMonery;
	}
	public Integer getC_makeContractPeople() {
		if(getC_havePayMakeContractPeople() == null ){
			c_havePayMakeContractPeople = 0;
		}
		if(getC_waitPayMakeContractPeople() == null ){
			c_waitPayMakeContractPeople = 0;
		}
		c_makeContractPeople = c_havePayMakeContractPeople + c_waitPayMakeContractPeople;
		return c_makeContractPeople;
	}
	public void setC_makeContractPeople(Integer c_makeContractPeople) {
		this.c_makeContractPeople = c_makeContractPeople;
	}
	public double getC_averageSingleBottom() {
		DecimalFormat df =new DecimalFormat("#.00");  
		return Double.valueOf(df.format(c_averageSingleBottom));
	}
	public void setC_averageSingleBottom(double c_averageSingleBottom) {
		this.c_averageSingleBottom = c_averageSingleBottom;
	}
	public int getC_leadsLists() {
		return c_leadsLists;
	}
	public void setC_leadsLists(int c_leadsLists) {
		this.c_leadsLists = c_leadsLists;
	}
	public int getC_arrangeCourseNumber() {
		return c_arrangeCourseNumber;
	}
	public void setC_arrangeCourseNumber(int c_arrangeCourseNumber) {
		this.c_arrangeCourseNumber = c_arrangeCourseNumber;
	}
	public BigDecimal getC_arrangeCourseRate() {
		if(getC_leadsLists()>0){
			//排课率=排课数/名单数*100%
			c_arrangeCourseRate = new BigDecimal(getC_arrangeCourseNumber())
					.divide(new BigDecimal(getC_leadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}	
		return c_arrangeCourseRate;
	}
	public void setC_arrangeCourseRate(BigDecimal c_arrangeCourseRate) {
		this.c_arrangeCourseRate = c_arrangeCourseRate;
	}
	public BigDecimal getC_arrangeCourseChangeRate() {
		if(getC_arrangeCourseNumber()>0){
			//排课率=排课数/名单数*100%
			c_arrangeCourseChangeRate = new BigDecimal(getC_makeContractPeople())
					.divide(new BigDecimal(getC_arrangeCourseNumber()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return c_arrangeCourseChangeRate;
	}
	public void setC_arrangeCourseChangeRate(BigDecimal c_arrangeCourseChangeRate) {
		this.c_arrangeCourseChangeRate = c_arrangeCourseChangeRate;
	}
	public BigDecimal getC_totalChangeRate() {
		if(getC_leadsLists()>0){
			//总转化率=签约人数/名单数*100% 
			c_totalChangeRate = new BigDecimal(getC_makeContractPeople())
					.divide(new BigDecimal(getC_leadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return c_totalChangeRate;
	}
	public void setC_totalChangeRate(BigDecimal c_totalChangeRate) {
		this.c_totalChangeRate = c_totalChangeRate;
	}
	
/*	public String getD_realityMonery() {
		return d_realityMonery;
	}
	public void setD_realityMonery(String d_realityMonery) {
		this.d_realityMonery = d_realityMonery;
	}
	public String getD_sumRealityMonery() {
		double sumRealityMonery1;
		double realityMonery1;
		if(!ValidateUtil.isNotEmpty(d_sumRealityMonery)){
			sumRealityMonery1 = 0;
		}else{
			sumRealityMonery1 = Double.valueOf(d_sumRealityMonery);
		}
		
		if(!ValidateUtil.isNotEmpty(d_realityMonery)){
			realityMonery1 = 0;
		}else{
			realityMonery1 = Double.valueOf(d_realityMonery);
		}
		double money = sumRealityMonery1 + realityMonery1;
		return String.valueOf(money);
	}
	public void setD_sumRealityMonery(String d_sumRealityMonery) {
		this.d_sumRealityMonery = d_sumRealityMonery;
	}
	public Integer getD_makeContractPeople() {
		return d_makeContractPeople;
	}
	public void setD_makeContractPeople(Integer d_makeContractPeople) {
		this.d_makeContractPeople = d_makeContractPeople;
	}
	public double getD_averageSingleBottom() {
		DecimalFormat df =new DecimalFormat("#.00");  
		return Double.valueOf(df.format(d_averageSingleBottom));
	}
	public void setD_averageSingleBottom(double d_averageSingleBottom) {
		this.d_averageSingleBottom = d_averageSingleBottom;
	}
	public Integer getD_leadsLists() {
		return d_leadsLists;
	}
	public void setD_leadsLists(Integer d_leadsLists) {
		this.d_leadsLists = d_leadsLists;
	}
	public Integer getD_arrangeCourseNumber() {
		return d_arrangeCourseNumber;
	}
	public void setD_arrangeCourseNumber(Integer d_arrangeCourseNumber) {
		this.d_arrangeCourseNumber = d_arrangeCourseNumber;
	}
	public BigDecimal getD_arrangeCourseRate() {
		if(d_leadsLists>0){
			//排课率=排课数/名单数*100%
			d_arrangeCourseRate = new BigDecimal(d_arrangeCourseNumber)
					.divide(new BigDecimal(d_leadsLists),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}	
		return d_arrangeCourseRate;
	}
	public void setD_arrangeCourseRate(BigDecimal d_arrangeCourseRate) {
		this.d_arrangeCourseRate = d_arrangeCourseRate;
	}
	public BigDecimal getD_arrangeCourseChangeRate() {
		if(d_leadsLists>0){
			//排课率=排课数/名单数*100%
			d_arrangeCourseChangeRate = new BigDecimal(d_arrangeCourseNumber)
					.divide(new BigDecimal(d_leadsLists),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return d_arrangeCourseChangeRate;
	}
	public void setD_arrangeCourseChangeRate(BigDecimal d_arrangeCourseChangeRate) {
		this.d_arrangeCourseChangeRate = d_arrangeCourseChangeRate;
	}
	public BigDecimal getD_totalChangeRate() {
		if(leadsLists>0){
			//总转化率=签约人数/名单数*100% 
			d_totalChangeRate = new BigDecimal(d_makeContractPeople)
					.divide(new BigDecimal(d_leadsLists),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return d_totalChangeRate;
	}
	public void setD_totalChangeRate(BigDecimal d_totalChangeRate) {
		this.d_totalChangeRate = d_totalChangeRate;
	}*/
	
	
	public String getE_realityMonery() {
		return e_realityMonery;
	}
	public void setE_realityMonery(String e_realityMonery) {
		this.e_realityMonery = e_realityMonery;
	}
	public String getE_sumRealityMonery() {
		double sumRealityMonery1;
		double realityMonery1;
		if(!ValidateUtil.isNotEmpty(e_sumRealityMonery)){
			sumRealityMonery1 = 0;
		}else{
			sumRealityMonery1 = Double.valueOf(e_sumRealityMonery);
		}
		
		if(!ValidateUtil.isNotEmpty(getE_realityMonery())){
			realityMonery1 = 0;
		}else{
			realityMonery1 = Double.valueOf(getE_realityMonery());
		}
		double money = sumRealityMonery1 + realityMonery1;
		e_sumRealityMonery = String.valueOf(money);
		return e_sumRealityMonery;
	}
	public void setE_sumRealityMonery(String e_sumRealityMonery) {
		this.e_sumRealityMonery = e_sumRealityMonery;
	}
	public Integer getE_makeContractPeople() {
		if(getE_havePayMakeContractPeople() == null ){
			e_havePayMakeContractPeople = 0;
		}
		if(getE_waitPayMakeContractPeople() == null ){
			e_waitPayMakeContractPeople = 0;
		}
		e_makeContractPeople =e_havePayMakeContractPeople + e_waitPayMakeContractPeople;
		return e_makeContractPeople;
	}
	public void setE_makeContractPeople(Integer e_makeContractPeople) {
		this.e_makeContractPeople = e_makeContractPeople;
	}
	public double getE_averageSingleBottom() {
		DecimalFormat df =new DecimalFormat("#.00");  
		return Double.valueOf(df.format(e_averageSingleBottom));
	}
	public void setE_averageSingleBottom(double e_averageSingleBottom) {
		this.e_averageSingleBottom = e_averageSingleBottom;
	}
	public int getE_leadsLists() {
		return e_leadsLists;
	}
	public void setE_leadsLists(int e_leadsLists) {
		this.e_leadsLists = e_leadsLists;
	}
	public int getE_arrangeCourseNumber() {
		return e_arrangeCourseNumber;
	}
	public void setE_arrangeCourseNumber(int e_arrangeCourseNumber) {
		this.e_arrangeCourseNumber = e_arrangeCourseNumber;
	}
	public BigDecimal getE_arrangeCourseRate() {
		if(getE_leadsLists()>0){
			//排课率=排课数/名单数*100%
			e_arrangeCourseRate = new BigDecimal(getE_arrangeCourseNumber())
					.divide(new BigDecimal(getE_leadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}	
		return e_arrangeCourseRate;
	}
	public void setE_arrangeCourseRate(BigDecimal e_arrangeCourseRate) {
		this.e_arrangeCourseRate = e_arrangeCourseRate;
	}
	public BigDecimal getE_arrangeCourseChangeRate() {
		if(getE_arrangeCourseNumber()>0){
			//排课率=排课数/名单数*100%
			e_arrangeCourseChangeRate = new BigDecimal(getE_makeContractPeople())
					.divide(new BigDecimal(getE_arrangeCourseNumber()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return e_arrangeCourseChangeRate;
	}
	public void setE_arrangeCourseChangeRate(BigDecimal e_arrangeCourseChangeRate) {
		this.e_arrangeCourseChangeRate = e_arrangeCourseChangeRate;
	}
	public BigDecimal getE_totalChangeRate() {
		if(getE_leadsLists()>0){
			//总转化率=签约人数/名单数*100% 
			e_totalChangeRate = new BigDecimal(getE_makeContractPeople())
					.divide(new BigDecimal(getE_leadsLists()),4,RoundingMode.HALF_UP)
					.multiply(rate);
		}
		return e_totalChangeRate;
	}
	public void setE_totalChangeRate(BigDecimal e_totalChangeRate) {
		this.e_totalChangeRate = e_totalChangeRate;
	}
	
	@Override
	public int compareTo(SaleKpiDto o) {
 		double RealityMoneryDes;
 		double realityMonerySrc;
         if(!ValidateUtil.isNotEmpty(this.getRealityMonery())){
        	 RealityMoneryDes = 0;
 		}else{
 			RealityMoneryDes = Double.valueOf(this.getRealityMonery());
 		}
 		
 		if(!ValidateUtil.isNotEmpty(o.getRealityMonery())){
 			realityMonerySrc = 0;
 		}else{
 			realityMonerySrc = Double.valueOf(o.getRealityMonery());
 		}
		double i = realityMonerySrc - RealityMoneryDes;//先按实收金额进行排序 
	        if(i == 0){  
	            return o.getLeadsLists() - this.getLeadsLists();
	        } 
	        if(i>0){
	        	return 1;
	        }else{
	        	return -1;  
	        }
	}
}
