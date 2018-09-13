package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-29 11:00
 **/
@Data
public class SysEnum {
    private Long id;
    private String uuid;
    private String enumType;
    private String enumName;
    private String enumValue;
    private Integer enabled;
    private Long createUserId;
    private Date createDate;
    private Long updateUserId;
    private Date updateDate;
    private String version;
}
