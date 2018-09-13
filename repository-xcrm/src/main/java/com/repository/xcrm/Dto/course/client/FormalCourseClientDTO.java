package com.repository.xcrm.Dto.course.client;

import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;

/**
 * @description：正式课查询须传参数
 * @author： denny
 * @create： 2018-06-22 10:55
 **/
@Data
public class FormalCourseClientDTO extends BaseDto{
    private String teacherParam;
    private String leadsParam;
    private String subject;
    private String grade;
}
