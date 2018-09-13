package com.repository.crm.Dto.tr.client.realtimeoutbound;

import java.util.Date;

/**
 * 
 * <pre>
 * 天润外呼记录 CC跟进
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: TrOutboundRecordVO.java, v 0.1 2018年4月18日 下午8:17:50  Exp $
 */
public class TrOutboundRecordVO {

    private Integer id;

    private String uniqueId;

    private String customerNumber;//
    
    private Date assignTime;//分配leads 的时间
    
    private String leadsName;//学生姓名
    
    private String leadsPhone;//学生手机号码
    
    private String saleName;//销售姓名
    
    private String saleType;//销售类型 （cc or cr）
    
    private String team;//团队
    
    private String status;//接听状态
    
    private String  startTime;//电话进入系统时间
    
    private String bridgeDuration;//通话时长
    
    private String cno;    
    
    private String recordFile;//录音的文件路径
    /** 渠道名称 */
    private String channelName;
    
    private Date inChargeDate;//cc负责时间
    /** 是否排课 */
    private Integer isFirstCourse;
    
    private String isFirstCourseDesc;
    /** 是否付费 */
    private Integer isPay;
    
    private String isPayDesc;
    /**  付费金额 */ 
    private Double  payAmount;
    /**   支付方式 */  
    private String payType;
    /** 销售的Uuid  */
   private String userUuid;
    
   private String leadsUuid;
   
   
	public String getUserUuid() {
		return userUuid;
	}

	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}

	public String getLeadsUuid() {
		return leadsUuid;
	}

	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getIsFirstCourse() {
		return isFirstCourse;
	}

	public void setIsFirstCourse(Integer isFirstCourse) {
		this.isFirstCourse = isFirstCourse;
	}

	public String getIsFirstCourseDesc() {
		return isFirstCourseDesc;
	}

	public void setIsFirstCourseDesc(String isFirstCourseDesc) {
		this.isFirstCourseDesc = isFirstCourseDesc;
	}

	public Integer getIsPay() {
		return isPay;
	}

	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}

	public String getIsPayDesc() {
		return isPayDesc;
	}

	public void setIsPayDesc(String isPayDesc) {
		this.isPayDesc = isPayDesc;
	}

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getRecordFile() {
		return recordFile;
	}

	public Date getInChargeDate() {
		return inChargeDate;
	}

	public void setInChargeDate(Date inChargeDate) {
		this.inChargeDate = inChargeDate;
	}

	public void setRecordFile(String recordFile) {
		this.recordFile = recordFile;
	}

	public String getCno() {
		return cno;
	}

	public Date getAssignTime() {
		return assignTime;
	}

	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber == null ? null : customerNumber.trim();
    }  

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }   

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getBridgeDuration() {
        return bridgeDuration;
    }

    public void setBridgeDuration(String bridgeDuration) {
        this.bridgeDuration = bridgeDuration == null ? null : bridgeDuration.trim();
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

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
    
    
   

}