package com.repository.xcrm.Po;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：应用软件的意见反馈
 * @author： denny
 * @create： 2018-04-12 15:28
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class AppFeedBack {
    private Integer id;
    private String conent;
    private Integer appType;
    private Integer status;
    private Date createDate;
    private Date updateDate;
    private String createUser;
    private String updateUser;

}
