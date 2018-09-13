package com.repository.crm.Dto.course.client;

/**
 * 查询的参数接收类
 * @author ywj
 *
 */
/**
 * 
 * <pre>
 * 正式课批量排课查询参数
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: SearchCourseParams.java, v 0.1 2018年4月11日 下午7:58:38  Exp $
 */
public class SearchCourseParams {

	
	private String studentParams;//学生的手机号
	
	private String teacherParams;//老师的姓名
	
	private String grade;//所报年级
	
	private String subject;//所报的科目
	
	private String userName;//cr的名字
	
	private String courseDateStart;//课程开始时间
	
	private String courseDateEnd;//课程结束时间
	
	private Integer pageIndex;
	
	private Integer pageNumber;
	
	private String orderBy;	


	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getStudentParams() {
		return studentParams;
	}

	public void setStudentParams(String studentParams) {
		this.studentParams = studentParams;
	}

	public String getTeacherParams() {
		return teacherParams;
	}

	public void setTeacherParams(String teacherParams) {
		this.teacherParams = teacherParams;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCourseDateStart() {
		return courseDateStart;
	}

	public void setCourseDateStart(String courseDateStart) {
		this.courseDateStart = courseDateStart;
	}

	public String getCourseDateEnd() {
		return courseDateEnd;
	}

	public void setCourseDateEnd(String courseDateEnd) {
		this.courseDateEnd = courseDateEnd;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}




	

}
