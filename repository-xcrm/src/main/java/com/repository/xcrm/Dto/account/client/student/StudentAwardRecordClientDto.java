package com.repository.xcrm.Dto.account.client.student;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：正式生中奖纪录参数
 * @author： denny
 * @create： 2018-08-01 12:00
 **/
@Data
public class StudentAwardRecordClientDto extends BaseDto{
    private String phone;
    private String prizeId;
    private String activityId;
}
