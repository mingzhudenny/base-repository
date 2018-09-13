package com.repository.xcrm.Dto.account.client.user;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：用户管理 检索条件
 * @author： denny
 * @create： 2018-06-13 17:57
 **/
@Data
public class UserClientDto extends BaseDto {
    private String param;
    private String startDate;
    private String endDate;
}
