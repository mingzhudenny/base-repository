package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：老师课表dto
 * @author： denny
 * @create： 2018-06-21 17:03
 **/
@Data
public class TeacherScheduleClientDTO extends BaseDto {
    private String teacherParam;
    private String subject;
    private String courseStartDate;
    private String courseEndDate;
}
