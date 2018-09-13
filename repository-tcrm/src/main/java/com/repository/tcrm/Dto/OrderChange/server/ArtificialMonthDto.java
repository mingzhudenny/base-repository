package com.repository.tcrm.Dto.OrderChange.server;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper=false)
public class ArtificialMonthDto {
	 private Integer id;

	    /**
	     * 人工月份
	     */
	    private String month;

	    /**
	     * 人工月开始时间
	     */
	    private String startDate;

	    /**
	     * 人工月结束时间
	     */
	    private String endDate;

	    /**
	     * 通用状态 0:删除,1:正常
	     */
	    private Integer status;

	    /**
	     * 创建时间
	     */
	    private Date createTime;

	    /**
	     * 更新时间
	     */
	    private Date updateTime;

	    /**
	     * 创建人uuid
	     */
	    private String createUuid;

	    /**
	     * 更新人uuid
	     */
	    private String updateUuid;

	    /**
	     * 通用备注
	     */
	    private String remark;

	    /**
	     * 版本号
	     */
	    private Integer version;

}
