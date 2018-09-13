package com.repository.xcrm.Po;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：职位 po类
 * @author： denny
 * @create： 2018-03-22 14:10
 **/
public class Posts implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String uuid;

    private String name;

    private String code;

    private String description;

    private Long adminUser;

    private Boolean status;

    private Date createDate;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(Long adminUser) {
        this.adminUser = adminUser;
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
