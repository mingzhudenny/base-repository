package com.repository.xcrm.Dto.account.server.user;

import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-13 18:35
 **/
@Data
public class UserDto extends BaseUserDto{
    /**
     * 所属团队
     */
    private String teamName;

    /**
     * 职位
     */
    private String postsName;
    /**
     * 部门名称
     */
    private String organizationName;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色别名
     */
    private String alias;

    private String sex;

    private String status;

    private String userType;

    private String organizationUuid;

    private String password;

    private String userLogin;

    private String userPass;

    private String userLevel;

    private String userGroup;

    private String loginStatus;

    private String phoneLogin;

    private String phonePass;
}
