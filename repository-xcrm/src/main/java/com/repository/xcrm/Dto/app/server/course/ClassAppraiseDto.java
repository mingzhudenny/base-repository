package com.repository.xcrm.Dto.app.server.course;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-20 14:47
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class ClassAppraiseDto {
    /**
     * 评价uuid
     */
    private String classAppraiseUuid;

    /**
     * 课程uuid
     */
    private String courseUuid;
    /**
     * 评价人身份
     */
    private Integer appraiserIdentity;
    /**
     * 评价的星级
     */
    private Integer star;
    /**
     * 评价星级uuid
     */
    private String classAppraiseStarUuids;
    /**
     * 评价内容
     */
    private String remark;

    /**
     * 星级内容
     */
    private List<ClassAppraiseStarDto> classAppraiseStarDtos = new ArrayList<>();

    /**
     * 平台来源
     */
    private Integer deviceType;
}
