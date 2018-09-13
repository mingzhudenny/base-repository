package com.repository.crm.Dto.course.server;

/**
 * 好视通房间信息
 * @author csy
 *
 * @date 2017年10月13日 上午11:28:56
 */
public class HstRoomVo {

	private String roomName;
	private String roomId;
	private String courseUuid;
	private String courseEndDate;
	public String getCourseEndDate() {
		return courseEndDate;
	}
	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getCourseUuid() {
		return courseUuid;
	}
	public void setCourseUuid(String courseUuid) {
		this.courseUuid = courseUuid;
	}
	@Override
	public String toString() {
		return "HstRoomVo [roomName=" + roomName + ", roomId=" + roomId + ", courseUuid=" + courseUuid
				+ ", getRoomName()=" + getRoomName() + ", getRoomId()=" + getRoomId() + ", getCourseUuid()="
				+ getCourseUuid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
