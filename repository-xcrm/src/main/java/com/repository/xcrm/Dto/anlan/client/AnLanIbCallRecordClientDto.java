package com.repository.xcrm.Dto.anlan.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-07-12 11:02
 **/
@Data
public class AnLanIbCallRecordClientDto extends BaseDto {
    private String leadsParam;
    private String saleName;
    private String saleType;
    private String teamName;
    private String startCallTime;
    private String endCallTime;
    private String userUuid;
}
