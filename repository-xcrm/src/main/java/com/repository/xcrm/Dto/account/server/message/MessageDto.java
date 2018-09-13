package com.repository.xcrm.Dto.account.server.message;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-10 22:10
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class MessageDto {
    private Long id;

    private String msgId;

    private String sendPhone;

    private String sendMsg;

    private String code;

    private Date sendTime;

    private Integer sendType;

    private Integer status;

    private String sendInfo;

    private String extno;
}
