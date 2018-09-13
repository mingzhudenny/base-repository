package com.repository.crm.Dto.account.server.user;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-14 14:51
 **/
@Data
public class UserDto {
    private Long id;

    private String uuid;

    private String loginName;

    private String name;

    private String password;

    private String email;

    private String phone;

    private Boolean sex;

    private Integer age;

    private String organizationUuid;

    private String teamUuid;

    private String postsUuid;

    private String roleUuid;

    private Boolean userType;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    private Date passwordExpiration;

    private String seatsNo;

    private String seatsPassword;

    private String hotlinePhone;

    private Integer seatsCallStatus;

    private Integer seatsStatus;

    private Integer dayCallNum;
    /**
     * 部门名称
     */
    private String organizationName;
    /**
     * 职位名称
     */
    private String postsName;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色别名
     */
    private String alias;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 代理的UUID
     */
    private String agentUuid;
    /**
     * 安莱账号
     */
    private String userLogin;
    /**
     * 安莱密码
     */
    private String userPass;
    /**
     * 安莱用户级别
     */
    private String userLevel;
    /**
     * 安莱用户组
     */
    private String userGroup;
    /**
     * 登录状态
     */
    private String loginStatus;
    /**
     * 分机号
     */
    private String phoneLogin;
    /**
     * 分机密码
     */
    private String phonePass;
    /**
     * 安莱绑定状态
     */
    private String anlanStatus;
}

