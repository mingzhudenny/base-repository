package com.repository.crm.Dto.kpi.server.sale;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import com.base.utils.validate.ValidateUtil;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(value = "销售总的kpi服务端返回总计信息", description = "销售总的kpi服务端返回总计信息")
public class SaleTotalKpiServerDto {

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
	@ApiModelProperty(value = "销售金额预测指标(销售本月业绩预测)", name = "saleTarget")
	private BigDecimal saleTargetMoney;

	@ApiModelProperty(value = "销售指标完成率(总实收/销售金额预测指标)", name = "saleTargetCompleteRate")
	private BigDecimal saleTargetCompleteRate;

	@Setter
	@Getter
	@ApiModelProperty(value = "总名单数(入库时间段内报名leads数)", name = "signUpLeadsNum")
	private Integer signUpLeadsNum;
	@Setter
	@Getter
	@ApiModelProperty(value = "名单内已分配数(总名单数内分配时间段内新名单的分配人数)", name = "signUpLeadsDistributionNum")
	private Integer signUpLeadsDistributionNum;
	@Setter
	@Getter
	@ApiModelProperty(value = "总排课数(上课日期内的测评课排课数,去除放鸽子)", name = "arrangeCourseNumber")
	private Integer arrangeCourseNum;
	@Setter
	@Getter
	@ApiModelProperty(value = "新名单分配数(分配时间段内新名单的分配数)", name = "newLeadsDistributionNum")
	private Integer newLeadsDistributionNum;
	@Setter
	@Getter
	@ApiModelProperty(value = "总新签人数(提交业绩时间内的新签人数,已审核)", name = "newPayLeadsNum")
	private Integer newPayLeadsNum;
	@ApiModelProperty(value = "排课率(总排课数/总名单数)", name = "arrangeCourseRate")
	private BigDecimal arrangeCourseRate;
	@ApiModelProperty(value = "排课转化率(总新签人数/总排课数)", name = "arrangeCourseChangeRate")
	private BigDecimal arrangeCourseChangeRate;
	@ApiModelProperty(value = "总转化率(总新签人数/总名单数)", name = "newPayLeadsChangerRate")
	private BigDecimal newPayLeadsChangerRate;
	@Setter
	@Getter
	@ApiModelProperty(value = "总新签金额(提交时间段内已审核的新签金额)", name = "newPayMoney")
	private String newPayMoney;
	@ApiModelProperty(value = "新签金额占比(总新签金额/总实收金额)", name = "newPayMoneyRate")
	private BigDecimal newPayMoneyRate;
	@Setter
	@Getter
	@ApiModelProperty(value = "总续费金额(提交业绩时间段内已审核续费金额)", name = "renewPayMoney")
	private String renewPayMoney;
	@Setter
	@Getter
	@ApiModelProperty(value = "总续费人数(提交业绩时间段内已审核续费人数)", name = "renewPayNum")
	private Integer renewPayLeadsNum;
	@Setter
	@Getter
	@ApiModelProperty(value = "在读学生", name = "readingStudentNum")
	private Integer readingStudentNum;
	@ApiModelProperty(value = "续费人数率(总续费人数/在读人数)", name = "renewPayRate")
	private BigDecimal renewPayRate;
	@ApiModelProperty(value = "总续费金额占比(总续费金额/总实收金额)", name = "newPayMoneyRate")
	private BigDecimal renewPayMoneyRate;

	public double getAverageSingleBottom() {
		if (getMakeContractPeople() > 0 && ValidateUtil.isNotEmpty(getSumRealityMoney())) {
			averageSingleBottom = Double.valueOf(getSumRealityMoney()) / getMakeContractPeople();
		}
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.valueOf(df.format(averageSingleBottom));
	}

	public void setAverageSingleBottom(double averageSingleBottom) {
		this.averageSingleBottom = averageSingleBottom;
	}

	public BigDecimal getSaleTargetCompleteRate() {
		if (getSaleTargetMoney() != null && ValidateUtil.isNotEmpty(getSumRealityMoney())) {
			saleTargetCompleteRate = new BigDecimal(getSumRealityMoney())
					.divide(getSaleTargetMoney(), 4, RoundingMode.HALF_UP).multiply(rate);
		} else {
			saleTargetCompleteRate = new BigDecimal(0);
		}
		return saleTargetCompleteRate;
	}

	public void setSaleTargetCompleteRate(BigDecimal saleTargetCompleteRate) {
		this.saleTargetCompleteRate = saleTargetCompleteRate;
	}

	public BigDecimal getArrangeCourseChangeRate() {
		if (getArrangeCourseNum() >0 && getNewPayLeadsNum() > 0) {
			arrangeCourseChangeRate = new BigDecimal(getNewPayLeadsNum())
					.divide(new BigDecimal(getArrangeCourseNum()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return arrangeCourseChangeRate;
	}

	public void setArrangeCourseChangeRate(BigDecimal arrangeCourseChangeRate) {
		this.arrangeCourseChangeRate = arrangeCourseChangeRate;
	}

	public BigDecimal getNewPayLeadsChangerRate() {
		if (getSignUpLeadsNum() >0 && getNewPayLeadsNum()>0) {
			newPayLeadsChangerRate = new BigDecimal(getNewPayLeadsNum())
					.divide(new BigDecimal(getSignUpLeadsNum()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return newPayLeadsChangerRate;
	}

	public void setNewPayLeadsChangerRate(BigDecimal newPayLeadsChangerRate) {
		this.newPayLeadsChangerRate = newPayLeadsChangerRate;
	}

	public BigDecimal getNewPayMoneyRate() {
		if (ValidateUtil.isNotEmpty(getSumRealityMoney()) && ValidateUtil.isNotEmpty(getNewPayMoney())) {
			newPayMoneyRate = new BigDecimal(getNewPayMoney())
					.divide(new BigDecimal(getSumRealityMoney()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return newPayMoneyRate;
	}

	public void setNewPayMoneyRate(BigDecimal newPayMoneyRate) {
		this.newPayMoneyRate = newPayMoneyRate;
	}

	public BigDecimal getRenewPayRate() {
		if (getReadingStudentNum() >0 && getRenewPayLeadsNum() >0) {
			newPayMoneyRate = new BigDecimal(getRenewPayLeadsNum())
					.divide(new BigDecimal(getReadingStudentNum()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return renewPayRate;
	}

	public void setRenewPayRate(BigDecimal renewPayRate) {
		this.renewPayRate = renewPayRate;
	}

	public BigDecimal getRenewPayMoneyRate() {
		if (ValidateUtil.isNotEmpty(getSumRealityMoney()) && ValidateUtil.isNotEmpty(getRenewPayMoney())) {
			renewPayMoneyRate = new BigDecimal(getRenewPayMoney())
					.divide(new BigDecimal(getSumRealityMoney()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return renewPayMoneyRate;
	}

	public void setRenewPayMoneyRate(BigDecimal renewPayMoneyRate) {
		this.renewPayMoneyRate = renewPayMoneyRate;
	}

	public BigDecimal getArrangeCourseRate() {
		if (getSignUpLeadsNum() >0 && getArrangeCourseNum()>0) {
			arrangeCourseRate = new BigDecimal(getArrangeCourseNum())
					.divide(new BigDecimal(getSignUpLeadsNum()), 4, RoundingMode.HALF_UP).multiply(rate);
		}
		return arrangeCourseRate;
	}

	public void setArrangeCourseRate(BigDecimal arrangeCourseRate) {
		this.arrangeCourseRate = arrangeCourseRate;
	}
}
