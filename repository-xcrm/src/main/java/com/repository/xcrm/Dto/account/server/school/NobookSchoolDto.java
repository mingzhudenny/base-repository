package com.repository.xcrm.Dto.account.server.school;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-24 19:07
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class NobookSchoolDto {
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
}
