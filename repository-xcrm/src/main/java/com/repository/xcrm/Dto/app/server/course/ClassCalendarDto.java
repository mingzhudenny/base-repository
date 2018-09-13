package com.repository.xcrm.Dto.app.server.course;

import lombok.Data;

/**
 * @description：课程日历类
 * @author： denny
 * @create： 2018-06-01 13:41
 **/
@Data
public class ClassCalendarDto {
    /**
     * 日期
     */
    private int dateDay;
    /**
     * 0:不属于这个月的日期，1:没有课，2:有课
     */
    private int dateStatus;
    /**
     * 是否是今天，true：是，false：否
     */
    private boolean isToday;
}
