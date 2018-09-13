package com.repository.tcrm.Dto.OrderChange.server;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper=false)
public class CourseOrderChangeDto {
	private Integer id;

    /**
     * 用户的uuid
     */
    private String accountUuid;

    /**
     * 用户类型0:学生1:老师
     */
    private Integer accountType;

    /**
     * 月份
     */
    private String month;

    /**
     * 排课调整次数
     */
    private Integer changeCount;

    /**
     * 通用状态 0:删除,1:正常
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人uuid
     */
    private String createUuid;

    /**
     * 更新人uuid
     */
    private String updateUuid;

    /**
     * 通用备注
     */
    private String remark;

    /**
     * 版本号
     */
    private Integer version;
}
