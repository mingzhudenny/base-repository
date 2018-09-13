package com.repository.xcrm.Dto.sale.client;
import com.repository.xcrm.Dto.BaseDto;
import lombok.Data;
/**
 * @description：数据报表-销售部kpi查询条件dto
 * @author： denny
 * @create： 2018-07-06 11:24
 **/
@Data
public class SaleKpiClientDto extends BaseDto{
    private String startTime;
    private String endTime;
    /**
     * 用户入职类型(0:全部1:入职小于90天2:入职大于90天)
     */
    private String type;
    private String newSaleDate;
    /**
     * 查询时间类型(0:人工月1:人工周)
     */
    private String checkDateAndWeekType;
    /**
     * 查询人工月份/人工周
     */
    private String checkDate;
}
