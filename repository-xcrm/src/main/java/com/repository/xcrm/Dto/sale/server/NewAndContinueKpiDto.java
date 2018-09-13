package com.repository.xcrm.Dto.sale.server;

import com.base.utils.validate.ValidateUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @description：
 * @author： denny
 * @create： 2018-07-06 16:23
 **/
public class NewAndContinueKpiDto {

    private BigDecimal rate = new BigDecimal(100);

    private String realityMonery;//实收金额　时间段内，付费金额总和
    private String sumRealityMonery;//总营收金额　时间段内，付费金额总和
    private Integer makeContractPeople;//签约人数　时间段内，付费人数总和
    private Integer havePayMakeContractPeople;//已支付的签约人数　时间段内，付费人数总和
    private Integer waitPayMakeContractPeople;//未支付的签约人数　时间段内，付费人数总和
    private double averageSingleBottom;//平均单底 realityMonery除以makeContractPeople
    private int leadsLists;//名单数  时间段内，销售被分配的名单数量总和
    private int arrangeCourseNumber;//排课数：时间段内，匹配排课成功的测评课数量
    private BigDecimal arrangeCourseRate;//排课率=排课数/名单数*100%
    private BigDecimal arrangeCourseChangeRate;//排课转化率=签约人数/排课数*100%
    private BigDecimal totalChangeRate;//总转化率=签约人数/名单数*100%
    @Override
    public String toString() {
        return "NewAndContinueKpiVo [realityMonery=" + realityMonery + ", sumRealityMonery=" + sumRealityMonery
                + ", makeContractPeople=" + makeContractPeople + ", averageSingleBottom=" + averageSingleBottom
                + ", leadsLists=" + leadsLists + ", arrangeCourseNumber=" + arrangeCourseNumber + ", arrangeCourseRate="
                + arrangeCourseRate + ", arrangeCourseChangeRate=" + arrangeCourseChangeRate + ", totalChangeRate="
                + totalChangeRate + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
    public String getRealityMonery() {
        return realityMonery;
    }
    public void setRealityMonery(String realityMonery) {
        this.realityMonery = realityMonery;
    }
    public String getSumRealityMonery() {
        double sumRealityMonery1;
        double realityMonery1;
        if(!ValidateUtil.isNotEmpty(sumRealityMonery)){
            sumRealityMonery1 = 0;
        }else{
            sumRealityMonery1 = Double.valueOf(sumRealityMonery);
        }

        if(!ValidateUtil.isNotEmpty(realityMonery)){
            realityMonery1 = 0;
        }else{
            realityMonery1 = Double.valueOf(realityMonery);
        }
        double money = sumRealityMonery1 + realityMonery1;
        return String.valueOf(money);
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
                    .divide(new BigDecimal(getLeadsLists()),4, RoundingMode.HALF_UP)
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
