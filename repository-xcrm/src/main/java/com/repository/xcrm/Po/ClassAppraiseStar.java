package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：学生对老师评价的星级实体类
 * @author： denny
 * @create： 2018-04-20 14:00
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class ClassAppraiseStar {

    private int id;

    private String classAppraiseStarUuid;

    private Integer star;

    private String content;

    private Integer status;

    private Integer sort;

    private Integer appraiseSatisfaction;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String createUid;

    private String updateUid;
}
