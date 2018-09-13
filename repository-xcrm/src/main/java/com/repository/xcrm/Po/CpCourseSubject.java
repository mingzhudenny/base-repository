package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-12 19:41
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class CpCourseSubject {
    private Integer id;

    /**
     *  科目
     */
    private String subject;
}
