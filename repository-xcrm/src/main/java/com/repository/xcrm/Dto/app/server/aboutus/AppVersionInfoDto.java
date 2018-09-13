package com.repository.xcrm.Dto.app.server.aboutus;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-19 15:14
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class AppVersionInfoDto {

    private String appInfoUuid;
    /**
     * 应用app下载路径
     */
    private String url;
    /**
     * 版本号
     */
    private String version;
    /**
     * 设备系统 ANDROID;IOS;APAD;IPAD
     */
    private String deviceType;
    /**
     * 创建时间
     */
    private Date createtime;

    private String osskey;
}
