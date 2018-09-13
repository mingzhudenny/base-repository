package com.repository.crm.Dto.account.client.leads;

import java.util.Date;

public class LpRemarkDTO {
    private Integer id;

    private String uuid;

    private String lesdsPhone;
    /** 之前的手机号码 */
    private String beforePhone;

    private String userUuid;

    private String content;

    private Boolean status;

    private Date createDate;   
    

    public String getBeforePhone() {
		return beforePhone;
	}

	public void setBeforePhone(String beforePhone) {
		this.beforePhone = beforePhone;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getLesdsPhone() {
        return lesdsPhone;
    }

    public void setLesdsPhone(String lesdsPhone) {
        this.lesdsPhone = lesdsPhone == null ? null : lesdsPhone.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}