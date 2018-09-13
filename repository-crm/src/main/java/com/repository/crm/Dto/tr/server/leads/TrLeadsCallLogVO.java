package com.repository.crm.Dto.tr.server.leads;

/**
 * 
 * <pre>
 * 拨打电话的详细记录
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TrLeadsCallLogVO.java, v 0.1 2018年4月26日 下午4:35:16  Exp $
 */
public class TrLeadsCallLogVO{
  
    private String leadsUuid;

    private String leadsName;

    private String leadsPhone;
    /** /电话进入系统时间 */
    private String  startTime;

    private String saleName;

    private String team;

    private String bridgeDuration;  
    
    private String status;
    
   
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

    public String getLeadsUuid() {
        return leadsUuid;
    }

    public void setLeadsUuid(String leadsUuid) {
        this.leadsUuid = leadsUuid == null ? null : leadsUuid.trim();
    }

    public String getLeadsName() {
        return leadsName;
    }

    public void setLeadsName(String leadsName) {
        this.leadsName = leadsName == null ? null : leadsName.trim();
    }

    public String getLeadsPhone() {
        return leadsPhone;
    }

    public void setLeadsPhone(String leadsPhone) {
        this.leadsPhone = leadsPhone == null ? null : leadsPhone.trim();
    }
   
    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }
    
    public String getBridgeDuration() {
        return bridgeDuration;
    }

    public void setBridgeDuration(String bridgeDuration) {
        this.bridgeDuration = bridgeDuration == null ? null : bridgeDuration.trim();
    }
  
}