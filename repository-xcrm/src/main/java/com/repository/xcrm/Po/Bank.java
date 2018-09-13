package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-03 16:24
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class Bank {
    private Integer id;

    private String bank;
}
