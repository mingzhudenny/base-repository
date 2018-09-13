package com.repository.tcrm.Dto.course.server;

import java.util.Date;

import com.repository.tcrm.Dto.order.server.CourseOrderDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class TcTeacherDateDto {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 老师的UUID
     */
    private String teacherUuid;

    /**
     * 日期
     */
    private String tcDate;

    /**
     * 时间
     */
    private String tcTime;

    /**
     * 非空闲原因 1 该时间段已经排课
     */
    private Integer notIdle;

    /**
     * 是否可用 0 可用
     */
    private Integer enabled;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建人
     */
    private String createUserId;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 更新人
     */
    private String updateUserId;

    /**
     * 版本
     */
    private Long version;

    /**
     * 空闲的月份:yyyy-MM
     */
    private String freetimeMonth;

    /**
     * 月的第几周
     */
    private Integer weekOfMonth;

    /**
     * 空闲结束时间: HH:mm
     */
    private String endTime;
}
