package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-29 10:52
 **/
@Data
public class LeadsLog {
    private Long id;
    private String name;
    private String phone;
    private String grade;
    private String subject;
    private Date signupDate;
    private String contactTime;
    private String connectStatus;
    private String channelUuid;
    private String jh;
    private String dy;
    private String keyNum;
    private Boolean status;
    private Date createDate;
    private Date updateDate;
    private String gradeRank;
    private String city;
    private String province;
    private String count;
    private String school;
    private Integer isHaveMic;
    private Integer isHaveHeadset;
    private Integer isHaveComputer;
    private Integer isHavePad;
    private Integer cityId;
    private Integer provinceId;
    private Integer countId;
    private String phoneLocaltion;
}
