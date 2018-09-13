package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-19 15:01
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class AppVersionInfo {
    private Integer id;
    private String appInfoUuid;
    private String url;
    private String version;
    private String deviceType;
    private Integer status;
    private Integer sort;
    private String remark;
    private Date createtime;
    private Date updateTime;
    private String createUid;
    private String updateUid;
}
