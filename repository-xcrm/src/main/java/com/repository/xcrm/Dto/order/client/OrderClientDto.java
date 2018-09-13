package com.repository.xcrm.Dto.order.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：订单搜索条件查询Dto
 * @author： denny
 * @create： 2018-04-28 21:06
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderClientDto extends BaseDto{
    /**
     * 学生姓名和手机号
     */
    private String leadsParams;
    /**
     * 支付类型
     */
    private String payType;
    /**
     * 提交者
     */
    private String submitter;
    /**
     * 开始提交时间
     */
    private String submitStartTime;
    /**
     * 结束提交时间
     */
    private String submitEndTime;
    /**
     * 审核状态
     */
    private String checkStatus;

    /**
     * 支付订单uuid
     */
    private String payUuid;
    /**
     * 学生uuid
     */
    private String leadsUuid;

    /**
     * 审核拒绝原因
     */
    private String refuseCause;
    /**
     * 购买时长
     */
    private String buyLength;
    /**
     * 金额
     */
    private String money;
    /**
     * 赠送课时
     */
    private String giveLength;
    /**
     * 销售姓名
     */
    private String saleName;
    /**
     * 团队名称
     */
    private String teamName;
}
