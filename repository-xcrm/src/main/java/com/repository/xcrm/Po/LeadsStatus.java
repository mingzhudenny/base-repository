package com.repository.xcrm.Po;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

import lombok.Data;

/**
 * @description：Leads状态Po类
 * @author： denny
 * @create： 2018-04-16 14:54
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class LeadsStatus {

    private Integer id;

    private String leadsUuid;

    private Integer isKeyPoint;

    private Date keyPointTime;

    private Integer isGiveUp;

    private String giveUpCause;

    private String giveUpDes;

    private Date giveUpTime;

    private Integer connectStatus;

    private Date connectTime;

    private Integer isStudent;

    private Integer commonStatus;

    private Integer distributionStatus;

    private String distributionUuid;

    private String distributionName;

    private Date distributionTime;

    private Integer isRecommend;

    private String recommendCcUuid;

    private String recommendCcName;

    private String recommendCrUuid;

    private String recommendCrName;

    private Date recommendTime;

    private Integer isIntroduced;

    private String introducer;

    private Date introduceTime;

    private Integer signStatus;

    private Integer isSign;

    private Date signTime;

    private Integer isManagerCourse;

    private Date managetTime;

    private Integer isPay;

    private Date payTime;

    private Integer isHaveMic;

    private Integer isHaveHeadset;

    private Integer isHaveComputer;

    private Integer isHavePad;

    private Integer isDebugging;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String createUuid;

    private String updateUuid;

    private String remark;

    private Integer version;

    private Integer leadsStatus;


}
