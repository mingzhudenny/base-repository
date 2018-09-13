package com.repository.xcrm.Dto.account.server.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：用户基本信息 dto
 * @author： denny
 * @create： 2018-03-22 14:29
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseUserDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 用户uuid
     */
    private String uuid;
    /**
     * 用户登录名
     */
    private String loginName;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新日期
     */
    private Date updateDate;

    /**
     * 团队uuid
     */
    private String teamUuid;
}
