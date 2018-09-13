package com.repository.xcrm.Po;

import lombok.Data;

import java.util.Date;

/**
 * @description：
 * @author： denny
 * @create： 2018-04-10 22:04
 **/
@Data
public class Message {
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

    private Integer platformSource;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msgId='" + msgId + '\'' +
                ", sendPhone='" + sendPhone + '\'' +
                ", sendMsg='" + sendMsg + '\'' +
                ", code='" + code + '\'' +
                ", sendTime=" + sendTime +
                ", sendType=" + sendType +
                ", status=" + status +
                ", sendInfo='" + sendInfo + '\'' +
                ", extno='" + extno + '\'' +
                ", platformSource='" + platformSource + '\'' +
                '}';
    }
}
