package com.repository.xcrm.Dto.sale.server;

import lombok.Data;

/**
 * @description：
 * @author： denny
 * @create： 2018-05-17 22:36
 **/
@Data
public class TopTenUserSaleKpiDto {
    private String userUuid;
    private String userName;
    private String teamUuid;
    private String teamName;
    private String sumRealityMonery;
}
