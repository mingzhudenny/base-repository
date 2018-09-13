package com.repository.crm.Dto.anlan.client;
import com.repository.crm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-07-09 10:50
 **/
@Data
public class AnLanObCallRecordClientDto extends BaseDto {
    private String leadsParam;
    private String saleName;
    private String saleType;
    private String teamName;
    private String startCallTime;
    private String endCallTime;
    private String isArchive;
    private String distributionStartTime;
    private String distributionEndTime;
    private String userUuid;
}

