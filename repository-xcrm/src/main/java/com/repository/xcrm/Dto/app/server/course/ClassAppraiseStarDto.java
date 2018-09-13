package com.repository.xcrm.Dto.app.server.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-20 14:16
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class ClassAppraiseStarDto {
    /**
     * 评价星级uuid
     */
        private String classAppraiseStarUuid;
    /**
     * 星级
     */
    private Integer star;
    /**
     * 星级内容
     */
    private String content;
    /**
     * 评价满意度 0.相当不满意;1.很不满意;2.不满意;3.不满意;4.非常满意
     */
    private Integer appraiseSatisfaction;
}
