package com.repository.crm.Dto.kpi.server.sale;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import com.base.utils.validate.ValidateUtil;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "销售总的kpi客户端传递参数", description = "销售总的kpi客户端传递参数")
public class SaleTotalChannelServerDto {

	private BigDecimal rate = new BigDecimal(100);

	@Setter
	@Getter
	@ApiModelProperty(value = "总营收金额(待审核+已审核总业绩)", name = "realityMonery")
	private String realityMoney;
	@Setter
	@Getter
	@ApiModelProperty(value = "总实收金额(已审核总业绩)", name = "sumRealityMonery")
	private String sumRealityMoney;
	@Setter
	@Getter
	@ApiModelProperty(value = "总付费人数(已审核状态的总人数)", name = "makeContractPeople")
	private Integer makeContractPeople;
	@ApiModelProperty(value = "平均单底(总实收金额/总付费人数)", name = "averageSingleBottom")
	private double averageSingleBottom;
	@Setter
	@Getter
	@ApiModelProperty(value = "总名单数(入库时间段内报名leads数)", name = "signUpLeadsNum")
	private Integer signUpLeadsNum;
	@Setter
	@Getter
	@ApiModelProperty(value = "新名单分配数(分配时间段内新名单的分配数)", name = "signUpLeadsDistributionNum")
	private Integer newLeadsDistributionNum;
	@Setter
	@Getter
	@ApiModelProperty(value = "总排课数(上课日期内的测评课排课数,去除放鸽子)", name = "arrangeCourseNumber")
	private Integer arrangeCourseNum;
	@ApiModelProperty(value = "排课率(排课数/总名单数)", name = "arrangeCourseNumberRate")
	private BigDecimal arrangeCourseNumRate;
	@ApiModelProperty(value = "排课转化率(总新签人数/总排课数)", name = "arrangeCourseChangeRate")
	private BigDecimal arrangeCourseChangeRate;
	@ApiModelProperty(value = "总转化率(总新签人数/总排课数)", name = "newPayLeadsChangerRate")
	private BigDecimal newPayLeadsChangerRate;

	public Double getAverageSingleBottom() {
		if (getMakeContractPeople() > 0 && ValidateUtil.isNotEmpty(getSumRealityMoney())) {
			averageSingleBottom = Double.valueOf(getSumRealityMoney()) / getMakeContractPeople();
		}
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.valueOf(df.format(averageSingleBottom));
	}

	public void setAverageSingleBottom(double averageSingleBottom) {
		this.averageSingleBottom = averageSingleBottom;
	}

	public BigDecimal getArrangeCourseNumRate() {
		if (signUpLeadsNum > 0 && arrangeCourseNum > 0) {
			arrangeCourseNumRate = new BigDecimal(getArrangeCourseNum())
					.divide(new BigDecimal(getSignUpLeadsNum()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return arrangeCourseNumRate;
	}

	public void setArrangeCourseNumRate(BigDecimal arrangeCourseNumRate) {
		this.arrangeCourseNumRate = arrangeCourseNumRate;
	}

	public BigDecimal getArrangeCourseChangeRate() {
		if (arrangeCourseNum > 0 && getMakeContractPeople() > 0) {
			arrangeCourseChangeRate = new BigDecimal(getMakeContractPeople())
					.divide(new BigDecimal(getArrangeCourseNum()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return arrangeCourseChangeRate;
	}

	public void setArrangeCourseChangeRate(BigDecimal arrangeCourseChangeRate) {
		this.arrangeCourseChangeRate = arrangeCourseChangeRate;
	}

	public BigDecimal getNewPayLeadsChangerRate() {
		if (signUpLeadsNum > 0 && getMakeContractPeople() > 0) {
			newPayLeadsChangerRate = new BigDecimal(getMakeContractPeople())
					.divide(new BigDecimal(getSignUpLeadsNum()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return newPayLeadsChangerRate;
	}

	public void setNewPayLeadsChangerRate(BigDecimal newPayLeadsChangerRate) {
		this.newPayLeadsChangerRate = newPayLeadsChangerRate;
	}

}
