package com.repository.xcrm.Dto.app.server.city;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-12 19:58
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class NobookCityDto {
    /**
     * 名称
     */
    private String name;

    /**
     * 父级id
     */
    private Integer parentid;
}
