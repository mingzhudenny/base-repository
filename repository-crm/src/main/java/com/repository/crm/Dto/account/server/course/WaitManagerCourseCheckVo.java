package com.repository.crm.Dto.account.server.course;

/**
 * 待排课中查看课程请求vo
 * @author csy
 * @date 2017年3月8日
 */
public class WaitManagerCourseCheckVo {

	    private String dates;//上课日期
	    
	    private String startTime; //上课开始时间

	    private String endTime;//上课结束时间
	    
	    private String fileAddress;//是否有无错题
	    
	    private String teacherName;//建议老师

	    private String other;//其他要求
	
	    private Byte type; //课程类型

	    private String length;//课程时长

	    private Byte style;//上课形式

	    private String hz;//上课频率

	    private Byte level;//上课级别

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

		public String getEndTime() {
			return endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getFileAddress() {
			return fileAddress;
		}

		public void setFileAddress(String fileAddress) {
			this.fileAddress = fileAddress;
		}

		public String getTeacherName() {
			return teacherName;
		}

		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}

		public String getOther() {
			return other;
		}

		public void setOther(String other) {
			this.other = other;
		}

		public Byte getType() {
			return type;
		}

		public void setType(Byte type) {
			this.type = type;
		}

		public String getLength() {
			return length;
		}

		public void setLength(String length) {
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
	    
}
