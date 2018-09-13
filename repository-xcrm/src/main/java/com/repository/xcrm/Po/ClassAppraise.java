package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：学生对的老师评价实体类
 * @author： denny
 * @create： 2018-04-20 13:55
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class ClassAppraise {

     private Integer id;

     private String classAppraiseUuid;

     private String courseUuid;

     private String appraiserUuid;

     private Integer appraiserIdentity;

     private Integer star;

     private String classAppraiseStarUuids;

     private Integer status;

     private Integer sort;

     private String remark;

     private Date createTime;

     private Date updateTime;

     private String createUid;

     private String updateUid;

     private Integer platformSource;
}
