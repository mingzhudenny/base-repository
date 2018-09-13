package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-23 16:14
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LeadsHandoutRemark {
    private Integer id;

    private String leadsUuid;

    private String clientReamrk;

    private String coursePlanRemark;

    private String firstCourseSubject;

    private String firstCourseStartTime;

    private String firstCourseEndTime;

    private Integer isAddSubject;

    private String addSubject;

    private String beforeStudy;

    private String studyInfo;

    private String leadsCharacterFamily;

    private String familyFocus;

    private String courseInfo;

    private String otherInfo;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String createUid;

    private String updateUid;

    private String remark;

    private Integer sort;

}
