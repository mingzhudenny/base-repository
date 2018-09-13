package com.repository.xcrm.Dto.account.client.leads;

import java.util.Date;

import com.repository.xcrm.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 *
 * @author csy
 * @time  2018年4月17日 下午2:35:16
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class EditLeadsStatusClientDTO extends BaseDto{
	
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

    private String distributionTime;

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
    
    private String newFollowRemark;

    private Integer status;

    private Integer leadsStatus;
}
