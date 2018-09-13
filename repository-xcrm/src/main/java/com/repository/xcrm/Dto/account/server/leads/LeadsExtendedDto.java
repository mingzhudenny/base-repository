package com.repository.xcrm.Dto.account.server.leads;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：leadsDto扩展参数
 * @author： denny
 * @create： 2018-03-30 11:05
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class LeadsExtendedDto extends LeadsDto{
    /**  */
	private static final long serialVersionUID = -4644194629152376676L;
	/**
     *  Cr uuid
     */
   private String crUuid;
    /**
     * Cc uuid
     */
   private String ccUuid;
    /**
     * 密码
     */
   private String passWord;
    /**
     * 报名时间
     */
   private String signUpDate;

    /**
     * 方便联系时间
     */
   private String contactTime;

    /**
     * 负责销售uuid
     */
   private String saleUuid;
    /**
     * 学校
     */
   private String school;
}
