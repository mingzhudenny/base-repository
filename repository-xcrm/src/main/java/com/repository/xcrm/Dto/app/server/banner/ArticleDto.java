package com.repository.xcrm.Dto.app.server.banner;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-11 17:28
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class ArticleDto {
    /**
     * uuid
     */
    private String articleUuid;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String image;
    /**
     * 链接
     */
    private String link;
    /**
     * 设备类型：1:手机,2:平板
     */
    private Integer deviceType;
}
