package com.repository.xcrm.Dto.order.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-04 11:12
 **/
@Data
@EqualsAndHashCode(callSuper = false)
    public class WaitPayLeadsDto extends BaseDto{
    /**
     * 学生姓名和手机号码
     */
    private String leadsParams;

    private String userUuid;
}
