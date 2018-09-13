package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-06-28 13:10
 **/
@Data
public class LeadsImportRecord {
    private Long id;
    private String leadsUuid;
    private String channel;
    private Integer importType;
    private String name;
    private String phone;
    private String grade;
    private String remark;
    private Date registDate;
    private String subject;
    private Integer isSuccess;
    private Boolean status;
    private String createUserUuid;
    private Date createDate;
    private Date updateDate;
    private String updateUserUuid;
    private Integer version;
}
