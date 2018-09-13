package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-27 15:32
 **/
@Data
public class ClassinRegisterAccount {
    private Integer id;

    private String accountUuid;

    private Integer accountType;

    private String classInId;

    private String accountPwd;

    private Date createDate;

    private Date updateDate;

    private Integer version;

    private String creater;

    private String updater;

    private Integer status;
}
