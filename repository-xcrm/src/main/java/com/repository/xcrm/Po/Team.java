package com.repository.xcrm.Po;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：团队 po
 * @author： denny
 * @create： 2018-03-22 13:41
 **/
public class Team implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;

    private String uuid;

    private String name;

    private String description;

    private String organizationUuid;

    private Integer teamType;
    //主管uuid
    private String leaderUuid;
    //总监uuid
    private String superLeadsUuid;

    private Boolean status;

    private Date createDate;

    private Date updateDate;
    //经理uuid
    private String leaderManageUuid;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOrganizationUuid() {
        return organizationUuid;
    }

    public void setOrganizationUuid(String organizationUuid) {
        this.organizationUuid = organizationUuid == null ? null : organizationUuid.trim();
    }

    public Integer getTeamType() {
        return teamType;
    }

    public void setTeamType(Integer teamType) {
        this.teamType = teamType;
    }

    public String getLeaderUuid() {
        return leaderUuid;
    }

    public void setLeaderUuid(String leaderUuid) {
        this.leaderUuid = leaderUuid == null ? null : leaderUuid.trim();
    }

    public String getSuperLeadsUuid() {
        return superLeadsUuid;
    }

    public void setSuperLeadsUuid(String superLeadsUuid) {
        this.superLeadsUuid = superLeadsUuid == null ? null : superLeadsUuid.trim();
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

    public String getLeaderManageUuid() {
        return leaderManageUuid;
    }

    public void setLeaderManageUuid(String leaderManageUuid) {
        this.leaderManageUuid = leaderManageUuid;
    }
}
