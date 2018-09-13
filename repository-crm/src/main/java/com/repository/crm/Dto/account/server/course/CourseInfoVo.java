package com.repository.crm.Dto.account.server.course;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.base.utils.validate.ValidateUtil;
import com.repository.crm.Dto.account.server.course.ErrorQuestion;


/**
 * 课程详情信息vo
 * @author csy
 * @date 2017年3月17日
 */
public class CourseInfoVo {

	private Byte type;//课程类型
	private BigDecimal length;//课程时长
	private Byte style;//课程形式
	private String hz;//课程频率
	private Byte level;//课程级别
	private Byte teacherSex;//老师姓名
	private String teachRequest;//老师要求
	private String grade;//年级
	private String subject;//科目
	private String subjectVersion;// 科目版本
	private String studyStatus;//学习情况
	private String monthSocre;//
	private String fullMonthScore;
	private String termScore;
	private String fullTeamScore;
	private String otherScore;
	private String fullOtherScore;
	private String monthPoint;
    private String termPoint;
	private String otherPoint;
	private String dates;//上课日期
	private String startTime;//上课开始时间
	private String offerTeacher;//建议老师
	private String endTime;//上课结束时间
	private String otherRequest;//其他请求
	private String fileAddress;//文件根路径
	private String originalFileName;//文件的原始名称
	private String serverFileName;//文件的服务器名称
	
	private List<ErrorQuestion> images = new ArrayList<>();//图片地址
	private List<ErrorQuestion> texts = new ArrayList<>();//文本地址
    
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
	public String getFileAddress() {
		return fileAddress;
	}
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getServerFileName() {
		return serverFileName;
	}
	public void setServerFileName(String serverFileName) {
		this.serverFileName = serverFileName;
	}
	public List<ErrorQuestion> getImages() {
		/*if(ValidateUtil.isNotEmpty(originalFileName)){
			String originalName[] = originalFileName.split(",");

			String serverName[] = serverFileName.split(",");

			for (int i = 0; i < serverName.length; i++) {
			   String address = fileAddress + "/" + serverName[i];
			   if (serverName[i].contains(".jpg") || serverName[i].contains(".png")
						|| serverName[i].contains(".gif")) {
				   ErrorQuestion errorQuestion = new ErrorQuestion();
				   errorQuestion.setOriginalFileName(originalName[i]);
				   errorQuestion.setFileAddress(address);
				   images.add(errorQuestion);
				} 
			}
		}*/
		return images;
	}
	public void setImages(List<ErrorQuestion> images) {
		this.images = images;
	}
	public List<ErrorQuestion> getTexts() {
		if(ValidateUtil.isNotEmpty(originalFileName)){
			String originalName[] = originalFileName.split(",");
	
			String serverName[] = serverFileName.split(",");
	
			for (int i = 0; i < serverName.length; i++) {
			   String address = fileAddress + "/" + serverName[i];
			   if (serverName[i].contains(".doc") || serverName[i].contains(".docx")
						|| serverName[i].contains(".txt")) {
					   ErrorQuestion errorQuestion = new ErrorQuestion();
					   errorQuestion.setOriginalFileName(originalName[i]);
					   errorQuestion.setFileAddress(address);
					   texts.add(errorQuestion);
				}
			}
		}
		return texts;
	}
	public void setTexts(List<ErrorQuestion> texts) {
		this.texts = texts;
	}
}
