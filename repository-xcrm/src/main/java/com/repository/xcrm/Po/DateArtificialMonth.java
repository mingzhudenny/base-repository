package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：人工月及人工周
 * @author： denny
 * @create： 2018-07-10 11:19
 **/
@Data
public class DateArtificialMonth {
    private Integer id;

    private String month;

    private Integer type;

    private String startDate;

    private String endDate;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String createUuid;

    private String updateUuid;

    private String remark;

    private Integer version;

    public Integer getId() {
        return id;
    }
}
