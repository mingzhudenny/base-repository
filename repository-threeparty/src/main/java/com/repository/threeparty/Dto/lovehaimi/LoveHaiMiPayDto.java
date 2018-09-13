package com.repository.threeparty.Dto.lovehaimi;

import lombok.Data;

/**
 * @description：爱海米分期须传参数
 * @author： denny
 * @create： 2018-06-21 11:43
 **/
@Data
public class LoveHaiMiPayDto {
    private String projectNo;
    private String mobile;
    private int applyAmt;
    private int applyTerm;
    private String orderDate;
    private String merProductNo;
    private String commodityName;
    private String contractNo;
    private String studentName;
    private String applicantName;
}
