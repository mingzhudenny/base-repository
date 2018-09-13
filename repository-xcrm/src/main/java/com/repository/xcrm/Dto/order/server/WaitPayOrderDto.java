package com.repository.xcrm.Dto.order.server;

import com.base.utils.validate.ValidateUtil;
import com.repository.xcrm.constants.PayType;

/**
 * @description：待支付页面查看支付信息
 * @author： denny
 * @create： 2018-05-04 14:50
 **/
public class WaitPayOrderDto {
    private String buyLength; //购买课时

    private Integer courseLevel; //课程级别

    private String money;//购买金额

    private String inActivities;//参与活动

    private String payType;//付费方式

    private String payTime;//支付时间

    private String createDate;//提交时间

    private String giveLength; //赠送课时

    public String getBuyLength() {
        return buyLength;
    }

    public void setBuyLength(String buyLength) {
        this.buyLength = buyLength;
    }

    public String getCourseLevel() {
        if (null != courseLevel){
            if (courseLevel==1){
                return "清北";
            }else if (courseLevel == 2){
                return "明星";
            }else {
                return "普通";
            }
        }
        return "";
    }

    public void setCourseLevel(Integer courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getInActivities() {
        return inActivities;
    }

    public void setInActivities(String inActivities) {
        this.inActivities = inActivities;
    }

    public String getPayType() {
        if (ValidateUtil.isNotEmpty(payType)){
            return PayType.findByValue(payType).getValue();
        }
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getGiveLength() {
        return giveLength;
    }

    public void setGiveLength(String giveLength) {
        this.giveLength = giveLength;
    }
}
