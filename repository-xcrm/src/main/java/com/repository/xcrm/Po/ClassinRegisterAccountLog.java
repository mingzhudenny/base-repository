package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-27 15:33
 **/
@Data
public class ClassinRegisterAccountLog {
    private Integer id;

    private String accountUuid;

    private String classInId;

    private Integer accountType;

    private String accountPwd;

    private String classInCode;

    private Date createDate;

    private Date updateDate;

    private Integer version;

    private String creater;

    private String updater;

    private Integer status;
}
