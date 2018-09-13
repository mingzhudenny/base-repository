package com.repository.xcrm.Dto.app.server.order;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-12 10:41
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class CpPayRequestDto {

    private String uuid;

    private String orderNo;

    private String parentOrderNo;

    private String courseOrderUuid;

    private String coursePriceUuid;

    private String promotionCodeUuid;

    private String gaUserUuid;

    private String userUuid;

    private String leadsUuid;

    private String buyLength;

    private Byte courseLevel;

    private Double money;

    private String inActivities;

    private String payType;

    private String bank;

    private String chargeId;

    private String transactionNo;

    private Double alreadyPay;

    private Double pendingPay;

    private String payer;

    private String payTime;

    private Date checkTime;

    private Byte isPay;

    private String checkReamrk;

    private String realUserUuid;

    private String webOrderNo;

    private Byte payChannel;

    private Boolean isMerge;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    private Boolean isSplit;

    private String residueLength;

    private String teamUuid;

    private String pingppChannel;

    private String baiduCode;

    private String patriarchName;

    private String patriarchPhone;

    private String giveLength;

    private Integer receiptStatus;//发票状态

    private String consumeLength;//已消耗课时

    private Integer consumeStatus;//课程消耗超出状态 0:否 1:是

    private Integer isRefund;//退费 0.否 1.是

    private String invoiceNum;//发票号

}
