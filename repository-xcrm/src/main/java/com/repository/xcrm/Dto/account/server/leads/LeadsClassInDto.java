package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-03 10:34
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LeadsClassInDto {

    /**
     * leadsUuid
     */
    private String uuid;
    /**
     * leads姓名
     */
    private String name;

    /**
     * leads电话号码
     */
    private String phone;

    /**
     * classin id
     */
    private String classInId;
}
