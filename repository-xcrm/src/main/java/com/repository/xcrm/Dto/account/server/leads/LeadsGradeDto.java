package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：学生成绩dto
 * @author： denny
 * @create： 2018-04-24 16:52
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LeadsGradeDto {
    private String leadsUuid;

    private String languageScore;

    private String mathematicsScore;

    private String englishScore;

    private String physicsScore;

    private String chemistryScore;

    private String biologyScore;

    private String politicsScore;

    private String historyScore;

    private String otherScore;

    private String remark;

    private String languageFullScore;

    private String languageVersion;

    private String mathematicsFullScore;

    private String mathematicsVersion;

    private String englishFullScore;

    private String englishVersion;

    private String physicsFullScore;

    private String physicsVersion;

    private String chemistryFullScore;

    private String chemistryVersion;

    private String biologyFullScore;

    private String biologyVersion;

    private String politicsFullScore;

    private String politicsVersion;

    private String historyFullScore;

    private String historyVersion;

    private String otherFullScore;

    private String otherVersion;
    /** 课程时长 */
    private Integer courseLength;

    private String languageTeacherName;

    private String languageTeacherUuid;

    private String mathematicsTeacherName;

    private String mathematicsTeacherUuid;

    private String englishTeacherName;

    private String englishTeacherUuid;

    private String physicsTeacherName;

    private String physicsTeacherUuid;

    private String chemistryTeacherName;

    private String chemistryTeacherUuid;

    private String biologyTeacherName;

    private String biologyTeacherUuid;

    private String politicsTeacherName;

    private String politicsTeacherUuid;

    private String historyTeacherName;

    private String historyTeacherUuid;

    private String otherTeacherName;

    private String otherTeacherUuid;

}
