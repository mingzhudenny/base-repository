package com.repository.xcrm.Dto.sale.server;

import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-07-10 11:24
 **/
@Data
public class DateArtificialMonthDto {
    private String month;

    private Integer type;

    private String startDate;

    private String endDate;

    private Integer status;

    private String remark;
}
