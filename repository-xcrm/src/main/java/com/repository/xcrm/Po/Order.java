package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description： 新数据库表订单
 * @author： denny
 * @create： 2018-04-28 20:31
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Order {

   private Integer id;

   private String uuid;

   private String orderNo;

   private String coursePriceUuid;

   private String promotionCodeUuid;

   private String promotionCode;

   private String checkUserUuid;

   private String checkUserName;

   private String leadsUuid;

   private String leadsName;

   private String leadsPhone;

   private BigDecimal buyLength;

   private Integer courseLevel;

   private String pingppChargeId;

   private String pingppChannel;

   private String pingppTransactionNo;

   private String payName;

   private String payPhone;

   private String payType;

   private String bank;

   private String payMoney;

   private Integer payChannel;

   private String payTime;

   private Integer checkStatus;

   private String checkRemark;

   private Integer isMerge;

   private Integer isSplit;

   private String residueLength;

   private String teamUuid;

   private  String teamName;

   private String commitUserName;

   private Double giveLength;

   private Integer isEnd;

   private Integer status;

   private Date createTime;

   private Date updateTime;

   private String createUuid;

   private String updateUuid;

   private String remark;

   private Integer version;
}
