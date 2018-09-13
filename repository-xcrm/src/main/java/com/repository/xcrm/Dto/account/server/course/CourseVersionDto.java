package com.repository.xcrm.Dto.account.server.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：教材版本dto
 * @author： denny
 * @create： 2018-04-24 20:07
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class CourseVersionDto {
    private String uuid;
    private String grade;
    private String version;
}
