package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-27 14:48
 **/
@Data
public class TestCourseLeadsClientDTO extends BaseDto{
    /**
     * 课程uuid
     */
    private String courseUuid;
    /**
     * 老师课表uuid
     */
    private String teacherScheduleUuid;
    /**
     * 老师uuid
     */
    private String teacherUuid;
    /**
     * 学生uuid集合
     */
    private String leadsUuids;
    /**
     * 备注
     */
    private String remark;
    /**
     * 学生uuid
     */
    private String leadsUuid;
    /**
     * 教材版本
     */
    private String teachingMaterialVersion;

}
