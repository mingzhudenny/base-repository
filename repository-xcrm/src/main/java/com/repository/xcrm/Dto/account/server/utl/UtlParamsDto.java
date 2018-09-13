package com.repository.xcrm.Dto.account.server.utl;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description：用户/学生/老师参数dto
 * @author： denny
 * @create： 2018-04-02 15:39
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class UtlParamsDto {

     private String userName;

     private String userPhone;

     private String leadsName;

     private String leadsPhone;

     private String teacherName;

     private String teacherPhone;
}
