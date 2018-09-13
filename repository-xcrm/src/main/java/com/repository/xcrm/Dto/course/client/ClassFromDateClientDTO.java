package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

import java.util.List;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-27 11:23
 **/
@Data
public class ClassFromDateClientDTO extends BaseDto {
    private String courseStartDate;
    private String courseEndDate;
    private String teacherParam;
    private String subject;
    private String grade;
    private String courseStartTime;
    private String courseEndTime;
    private List<String> teacherUuids;
}
