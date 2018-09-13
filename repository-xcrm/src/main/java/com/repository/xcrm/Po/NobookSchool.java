package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-24 19:06
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class NobookSchool {
    private Long id;

    private String schoolname;

    private Integer cityId;

    private Integer schoolType;

    private String firstPy;

    private String py;

    private Integer countyId;

    private Integer provinceId;

    private Integer status;

    private Integer sctype;

    private Integer userDefine;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;
}
