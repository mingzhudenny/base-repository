package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-24 17:05
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LeadsHandoutRemarkDto {
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
}
