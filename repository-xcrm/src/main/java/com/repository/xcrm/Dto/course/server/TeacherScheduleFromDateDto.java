package com.repository.xcrm.Dto.course.server;

import com.repository.xcrm.Dto.account.server.course.CourseLeadsDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-27 11:28
 **/
@Data
public class TeacherScheduleFromDateDto {
    private String teacherScheduleUuid;
    private String scheduleDate;
    private String scheduleStartTime;
    private String scheduleEndTime;
    private String subject;
    private String grade;
    private String teacherName;
    private String teacherUuid;
    private String courseUuid;
    private String des;
    private List<CourseLeadsDto> courseLeadsVos = new ArrayList<>();
}
