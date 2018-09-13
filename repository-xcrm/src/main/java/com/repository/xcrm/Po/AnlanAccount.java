package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-07 20:08
 **/
@Data
public class AnlanAccount {
    private Integer id;

    private String uuid;

    private String userUuid;

    private String userLogin;

    private String userPass;

    private String userLevel;

    private String userGroup;

    private String groupList;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String phoneLogin;

    private String phonePass;

    private Integer loginStatus;
}
