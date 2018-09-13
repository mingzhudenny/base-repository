package com.repository.crm.Dto.course.server;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import com.base.utils.date.DateUtil;
import com.base.utils.validate.ValidateUtil;



public class HaveCourseVo {
	private String uuid;//课程订单uuid
	private String courseUuid;
	private String leadsUuid;
	private String leadsPhone;
	private String requestUuid;
	private String payUuid;
	private Byte type;
	private BigDecimal length;
	private Byte style;
	private String hz;
	private Byte level;
	private String teacherUuid;
    private String teacherName;//匹配老师
    private String teacherPhone;//匹配老师的电话
	private Byte teacherSex;
	private String teachRequest;
	private String grade;
	private String subject;
	private String subjectVersion;
	private String studyStatus;
	private String monthSocre;
	private String fullMonthScore;
	private String termScore;
	private String fullTeamScore;
	private String otherScore;
	private String fullOtherScore;
	private String monthPoint;
    private String termPoint;
	private String otherPoint;
	private Byte feedbackStaus;
    private Boolean ispay; //是否付费
	private String leadsName;//leads姓名
	private String ccName;//销售姓名
	private String saleUserUuid;//销售的uuid
	private String studyTeacherName;//排课老师姓名
	private String dates;//上课日期
	private String startTime;//上课开始时间
	private String offerTeacher;//建议老师
	private String endTime;//上课结束时间
	private String otherRequest;//其他请求
	private Date handleTime;//排课时间
	private String cpCourseUuid;//教学排课的uuid;
	private String isBackOut;//是否被撤销
	private String submitTime;//提交时间
	private Integer hstRoomAcountId;
	private String hstRoomName;
	private String hstRoomTeacherAccont;
	private String hstRoomStudentAccont;
	private Integer isSendMessage;
	
	public String getSaleUserUuid() {
		return saleUserUuid;
	}
	public void setSaleUserUuid(String saleUserUuid) {
		this.saleUserUuid = saleUserUuid;
	}
	public Integer getIsSendMessage() {
		return isSendMessage;
	}
	public void setIsSendMessage(Integer isSendMessage) {
		this.isSendMessage = isSendMessage;
	}
	public String getCourseUuid() {
		return courseUuid;
	}
	public void setCourseUuid(String courseUuid) {
		this.courseUuid = courseUuid;
	}
	public String getLeadsPhone() {
		return leadsPhone;
	}
	public void setLeadsPhone(String leadsPhone) {
		this.leadsPhone = leadsPhone;
	}
	public String getTeacherUuid() {
		return teacherUuid;
	}
	public void setTeacherUuid(String teacherUuid) {
		this.teacherUuid = teacherUuid;
	}
	public String getHstRoomName() {
		if(ValidateUtil.isNotEmpty(hstRoomName)){
			return hstRoomName;
		}
		return "";
	}
	public void setHstRoomName(String hstRoomName) {
		this.hstRoomName = hstRoomName;
	}
	public String getHstRoomTeacherAccont() {
		if(ValidateUtil.isNotEmpty(hstRoomTeacherAccont)){
			return hstRoomTeacherAccont;
		}
		return "";
	}
	public void setHstRoomTeacherAccont(String hstRoomTeacherAccont) {
		this.hstRoomTeacherAccont = hstRoomTeacherAccont;
	}
	public String getHstRoomStudentAccont() {
		if(ValidateUtil.isNotEmpty(hstRoomStudentAccont)){
			return hstRoomStudentAccont;
		}
		return "";
	}
	public void setHstRoomStudentAccont(String hstRoomStudentAccont) {
		this.hstRoomStudentAccont = hstRoomStudentAccont;
	}
	public Integer getHstRoomAcountId() {
		return hstRoomAcountId;
	}
	public void setHstRoomAcountId(Integer hstRoomAcountId) {
		this.hstRoomAcountId = hstRoomAcountId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public Boolean getIspay() {
		return ispay;
	}
	public void setIspay(Boolean ispay) {
		this.ispay = ispay;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getLeadsUuid() {
		return leadsUuid;
	}
	public void setLeadsUuid(String leadsUuid) {
		this.leadsUuid = leadsUuid;
	}
	public String getRequestUuid() {
		return requestUuid;
	}
	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}
	public String getPayUuid() {
		return payUuid;
	}
	public void setPayUuid(String payUuid) {
		this.payUuid = payUuid;
	}
	public Byte getType() {
		return type;
	}
	public void setType(Byte type) {
		this.type = type;
	}
	public BigDecimal getLength() {
		return length;
	}
	public void setLength(BigDecimal length) {
		this.length = length;
	}
	public Byte getStyle() {
		return style;
	}
	public void setStyle(Byte style) {
		this.style = style;
	}
	public String getHz() {
		return hz;
	}
	public void setHz(String hz) {
		this.hz = hz;
	}
	public Byte getLevel() {
		return level;
	}
	public void setLevel(Byte level) {
		this.level = level;
	}
	public Byte getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(Byte teacherSex) {
		this.teacherSex = teacherSex;
	}
	public String getTeachRequest() {
		return teachRequest;
	}
	public void setTeachRequest(String teachRequest) {
		this.teachRequest = teachRequest;
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
	public String getSubjectVersion() {
		return subjectVersion;
	}
	public void setSubjectVersion(String subjectVersion) {
		this.subjectVersion = subjectVersion;
	}
	public String getStudyStatus() {
		return studyStatus;
	}
	public void setStudyStatus(String studyStatus) {
		this.studyStatus = studyStatus;
	}
	public String getMonthSocre() {
		return monthSocre;
	}
	public void setMonthSocre(String monthSocre) {
		this.monthSocre = monthSocre;
	}
	public String getFullMonthScore() {
		return fullMonthScore;
	}
	public void setFullMonthScore(String fullMonthScore) {
		this.fullMonthScore = fullMonthScore;
	}
	public String getTermScore() {
		return termScore;
	}
	public void setTermScore(String termScore) {
		this.termScore = termScore;
	}
	public String getFullTeamScore() {
		return fullTeamScore;
	}
	public void setFullTeamScore(String fullTeamScore) {
		this.fullTeamScore = fullTeamScore;
	}
	public String getOtherScore() {
		return otherScore;
	}
	public void setOtherScore(String otherScore) {
		this.otherScore = otherScore;
	}
	public String getFullOtherScore() {
		return fullOtherScore;
	}
	public void setFullOtherScore(String fullOtherScore) {
		this.fullOtherScore = fullOtherScore;
	}
	public String getMonthPoint() {
		return monthPoint;
	}
	public void setMonthPoint(String monthPoint) {
		this.monthPoint = monthPoint;
	}
	public String getTermPoint() {
		return termPoint;
	}
	public void setTermPoint(String termPoint) {
		this.termPoint = termPoint;
	}
	public String getOtherPoint() {
		return otherPoint;
	}
	public void setOtherPoint(String otherPoint) {
		this.otherPoint = otherPoint;
	}
	public Byte getFeedbackStaus() {
		return feedbackStaus;
	}
	public void setFeedbackStaus(Byte feedbackStaus) {
		this.feedbackStaus = feedbackStaus;
	}
	public String getLeadsName() {
		return leadsName;
	}
	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}
	public String getCcName() {
		return ccName;
	}
	public void setCcName(String ccName) {
		this.ccName = ccName;
	}
	public String getStudyTeacherName() {
		return studyTeacherName;
	}
	public void setStudyTeacherName(String studyTeacherName) {
		this.studyTeacherName = studyTeacherName;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getOfferTeacher() {
		return offerTeacher;
	}
	public void setOfferTeacher(String offerTeacher) {
		this.offerTeacher = offerTeacher;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getOtherRequest() {
		return otherRequest;
	}
	public void setOtherRequest(String otherRequest) {
		this.otherRequest = otherRequest;
	}
	public String getHandleTime() {
		return DateUtil.parseDateToStr(handleTime);
	}
	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}
	public String getCpCourseUuid() {
		return cpCourseUuid;
	}
	public void setCpCourseUuid(String cpCourseUuid) {
		this.cpCourseUuid = cpCourseUuid;
	}
	public int getIsBackOut() {
		try {
			if(daysBetween(handleTime, new Date())>1){
				return 0;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 1;
	}
	public void setIsBackOut(String isBackOut) {
		this.isBackOut = isBackOut;
	}
	public String getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}
	  public static int daysBetween(Date smdate,Date bdate) throws ParseException    
	    {    
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(smdate);    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(bdate);    
	        long time2 = cal.getTimeInMillis(); 
//	        System.out.println(time1+":"+time2+":"+(time2-time1));
	        long betweenDays=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(betweenDays));           
	    } 
	
}
