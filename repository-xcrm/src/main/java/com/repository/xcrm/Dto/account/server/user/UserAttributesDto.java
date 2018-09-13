package com.repository.xcrm.Dto.account.server.user;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @description：用户属性dto
 * @author： denny
 * @create： 2018-03-22 14:35
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class UserAttributesDto extends BaseUserDto implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 所属团队
     */
    private String teamName;

    /**
     * 职位
     */
    private String post;
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
    /**
     * 用户uuid
     */
    private String userUuid;
}
