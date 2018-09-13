package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-03 17:10
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class PromotionCode {
    private Integer id;

    private String uuid;

    private String coursePriceUuid;

    private String promotionCode;

    private String promotionName;

    private Byte promotionType;

    private Double fullMoney;

    private String redPassword;

    private BigDecimal promotionMoney;

    private String creater;

    private String updater;

    private Date createDate;

    private Date updateDate;

    private Boolean status;
}
