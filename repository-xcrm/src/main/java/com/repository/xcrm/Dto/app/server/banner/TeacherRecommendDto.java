package com.repository.xcrm.Dto.app.server.banner;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：app 名师推荐 dto
 * @author： denny
 * @create： 2018-04-11 16:57
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class TeacherRecommendDto {
    /**
     * uuid
     */
    private String teacherRecommendUuid;
    /**
     * 老师姓名
     */
    private String name;

    /**
     *教师图片
     */
    private String image;

    /**
     * 教师年龄
     */
    private String teachingAge;
    /**
     * 带毕业班
     */
    private String graduateClass;
    /**
     *平均提分
     */
    private String improveScore;
    /**
     * 教师介绍
     */
    private String introduction;
    /**
     *设备类型：1:手机,2:平板
     */
    private Integer deviceType;

    private String osskey;

    private String fileName;
}
