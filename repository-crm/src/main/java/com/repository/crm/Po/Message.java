package com.repository.crm.Po;

import java.util.Date;

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
    
    public Message() {
   	}
    
    public Message(	String sendMsg, String code, Date sendTime,
					Integer sendType, Integer status, String sendInfo, String extno,
					String sendPhone) {
		super();		
		this.sendMsg = sendMsg;
		this.code = code;
		this.sendTime = sendTime;
		this.sendType = sendType;
		this.status = status;
		this.sendInfo = sendInfo;
		this.extno = extno;
		this.sendPhone = sendPhone;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone == null ? null : sendPhone.trim();
    }

    public String getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(String sendMsg) {
        this.sendMsg = sendMsg == null ? null : sendMsg.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSendInfo() {
        return sendInfo;
    }

    public void setSendInfo(String sendInfo) {
        this.sendInfo = sendInfo == null ? null : sendInfo.trim();
    }

    public String getExtno() {
        return extno;
    }

    public void setExtno(String extno) {
        this.extno = extno == null ? null : extno.trim();
    }
}