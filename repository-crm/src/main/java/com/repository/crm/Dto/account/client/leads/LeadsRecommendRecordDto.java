package com.repository.crm.Dto.account.client.leads;

import java.util.Date;

import lombok.Data;
/**
 * 
 * <pre>
 * 新增推荐leads 
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: LeadsRecommendRecordDto.java, v 0.1 2018年6月21日 下午1:24:20  Exp $
 */
@Data
public class LeadsRecommendRecordDto {   

    private String leadsUuid;
    
    private  String leadsName;
    
    private String leadsPhone;
    
    private String grade;
    
    private String subject;

    private Integer recommendType;

    private String recommendCcUuid;

    private String recommendCrUuid;

    private String recommendTcUuid;

    private String recommendCcName;

    private String recommendCrName;

    private String recommendTcName;

    private Integer isIntroduced;

    private String introducer;

    private String remark;

    private Integer recommendStatus;

    private Date createDate;

    private String createUserId;


  
}