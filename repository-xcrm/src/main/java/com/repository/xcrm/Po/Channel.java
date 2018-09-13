package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：渠道Po类
 * @author： denny
 * @create： 2018-04-16 14:10
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Channel {

    private Long id;

    private String uuid;

    private String name;

    private String level;

    private String adid;

    private String channelKeyword;

    private Integer type;

    private String putLink;

    private String platForm;

    private String description;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String createUuid;

    private String updateUuid;

    private String remark;

    private Integer version;
}
