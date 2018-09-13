package com.repository.xcrm.Dto.account.server.distribution;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：正式生再分配
 * @author： denny
 * @create： 2018-04-20 20:28
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentAgainDistributionDto {
    private String leadsUuid;
    private String studentName;
    private String studentPhone;
    private String saleUserUuid;
    private String saleUserName;
    private String crUserName;
    private String crUserUuid;
    private String ccUserName;
    private String ccuserUuid;
    private String responsibleTime;
}
