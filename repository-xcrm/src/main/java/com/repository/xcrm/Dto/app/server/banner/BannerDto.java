package com.repository.xcrm.Dto.app.server.banner;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-11 16:13
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class BannerDto {
    private Long id;

    private String bannerName;

    private String bannerUrl;

    private String fileAddress;

    private String fileOriginalName;

    private String fileName;

    private Byte enabled;

    private Long sort;

    private Long version;

    private Date createDate;

    private String createUserId;

    private Date updateDate;

    private String updateUserId;

    private String osskey;

    private int deviceType;

    private String bannerSort;

    private String OrderByOfType;

    private String status;
}
