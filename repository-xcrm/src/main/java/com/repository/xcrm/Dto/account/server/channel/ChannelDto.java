package com.repository.xcrm.Dto.account.server.channel;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-16 14:15
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class ChannelDto {
    /**
     * 渠道uuid
     */
    private String uuid;
    /**
     * 渠道名称
     */
    private String name;
    /**
     * 渠道等级
     */
    private String level;
    /**
     * 渠道唯一标识
     */
    private String adid;
    /**
     * 关键字
     */
    private String channelKeyword;
    /**
     * 渠道类别
     */
    private Integer type;
    /**
     * 投放链接
     */
    private String putLink;
    /**
     * 设备平台
     */
    private String platForm;
    /**
     * 渠道描述
     */
    private String description;
    /**
     * 通用状态 0:删除,1:正常
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
}
