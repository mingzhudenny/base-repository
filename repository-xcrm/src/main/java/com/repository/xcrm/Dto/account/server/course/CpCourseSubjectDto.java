package com.repository.xcrm.Dto.account.server.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-12 19:42
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class CpCourseSubjectDto {
    private Integer id;

    /**
     *  科目
     */
    private String subject;
}
