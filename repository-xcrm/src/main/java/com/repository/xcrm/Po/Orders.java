package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-28 14:02
 **/
@Data
public class Orders {
    private Long orderId;

    private String orderNo;

    private String courseName;

    private String courseId;

    private Integer classHour;

    private Double totalPrice;

    private Double accountPayable;

    private Double alreadyPay;

    private Double pendingPay;

    private Double subtotal;

    private Double total;

    private Date orderTime;

    private Integer payStatus;

    private String payMethod;

    private Long contactId;

    private String userId;

    private Date createDate;

    private Date updateDate;

    private String loanName;//贷款人姓名

    private String loanPhone;//贷款人手机号

    private Integer loanPeriod;//贷款期数

    private Integer payType;
}
