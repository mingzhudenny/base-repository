package com.repository.crm.Dto.account.server.student;

public class StudentVO {

	private String leadsUuid;
	private String leadsName;
	private String leadsPhone;
	private String grade;
	private String subject;
	private String ccName;
	private String crName;
	private String crTeam;
	private String handOutRemark;
	private String handOutTime;
	private String ccTeam;
	private Integer keyPoint;
	public String getCcTeam() {
		return ccTeam;
	}
	public void setCcTeam(String ccTeam) {
		this.ccTeam = ccTeam;
	}
	public String getLeadsUuid() {
		return leadsUuid;
	}
	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
	}
	public String getLeadsName() {
		return leadsName;
	}
	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}
	public String getLeadsPhone() {
		return leadsPhone;
	}
	public void setLeadsPhone(String leadsPhone) {
		this.leadsPhone = leadsPhone;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getCrName() {
		return crName;
	}
	public void setCrName(String crName) {
		this.crName = crName;
	}
	public String getCrTeam() {
		return crTeam;
	}
	public void setCrTeam(String crTeam) {
		this.crTeam = crTeam;
	}
	public String getHandOutRemark() {
		return handOutRemark;
	}
	public void setHandOutRemark(String handOutRemark) {
		this.handOutRemark = handOutRemark;
	}
	public String getHandOutTime() {
		return handOutTime;
	}
	public void setHandOutTime(String handOutTime) {
		this.handOutTime = handOutTime;
	}
	public String getKeyPoint() {
		if (keyPoint !=null) {
			switch (keyPoint) {
				case 0:
					return "暂未被标记";
				case 1:
					return "本月可维护";
				case 2:
					return "本月可续费";
				case 3:
					return "常规维护";
				case 4:
					return "本月重点维护";
				case 5:
					return "退费";
				case 6:
					return "结课";
				case 7:
					return "停课";
				default:
					return "暂未被标记";
			}
		} else {
			return "暂未被标记";
		}

	}
	public void setKeyPoint(Integer keyPoint) {
		this.keyPoint = keyPoint;
	}
}
