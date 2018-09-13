package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：省份城市po
 * @author： denny
 * @create： 2018-04-12 19:57
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class NobookCity {
    private Long id;

    private String name;

    private Integer parentid;

    private Integer level;

    private String first;

    private Integer ismunicipality;

    private Integer hasschool;

    private Integer enabled;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private Integer version;

}
