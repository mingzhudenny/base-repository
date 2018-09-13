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
public class CpCoursePrice {
    private Integer id;

    private String uuid;

    private String baiduCourseCode;

    private String taobaoLink;

    private String level;

    private String type;

    private String activityType;

    private Integer length;

    private Long originalUnitPrice;

    private Long originalPrice;

    private BigDecimal nowUnitPrice;

    private BigDecimal nowPrice;

    private BigDecimal specialDiscount;

    private Long specialPrice;

    private Byte onlineStatus;

    private Date createDate;

    private Date updateDate;

    private String creater;

    private String updater;

    private String description;
}
