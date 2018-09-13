/**
 * 
 */
package com.repository.crm.Dto.kpi.server.course;

import lombok.Data;

/**
 * 精品课报表服务端返回数据
 * @author csy
 * @time  2018年3月26日 下午1:38:06
 */
@Data
public class OutiqueCourseServerDto {

	/**
	 * 所属销售
	 */
	private String saleName;
	/**
	 * 销售所属团队
	 */
	private String saleTeam;
	/**
	 * leadsUuid
	 */
	private String leadsUuid;
	/**
	 * 学生姓名
	 */
	private String leadsName;
	/**
	 * 学生电话号码
	 */
	private String leadsPhone;
	/**
	 * 号码归属地
	 */
	private String phoneLocation;
	/**
	 * 课程包级别
	 */
	private String coursePriceType;
	/**
	 * 是否推荐
	 */
	private String isRecommend;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 区/县
	 */
	private String count;
	/**
	 * leads年级
	 */
	private String leadsGrade;
	/**
	 * leads科目
	 */
	private String leadsSubject;
	/**
	 * 年级
	 */
	private String grade;
	/**
	 * 科目
	 */
	private String subject;
	/**
	 * 购买课时
	 */
	private String buyLength;
	/**
	 * 课时级别
	 */
	private String courseLevel;
	/**
	 * 购买金额
	 */
	private String money;
	/**
	 * 支付方式
	 */
	private String payType;
	/**
	 * 课程包参与活动
	 */
	private String courseActivitiyLevel;
	/**
	 * 参与活动
	 */
	private String inActivity;
	/**
	 * 优惠码
	 */
	private String promotionCode;
	/**
	 * 支付时间
	 */
	private String payTime;
	/**
	 * 提交时间
	 */
	private String commitTime;
	/**
	 * 分配时间
	 */
	private String distributionTime;
	/**
	 * 审核状态
	 */
	private String checkStatus;
	/**
	 * 负责时间
	 */
	private String updateTime;
}
