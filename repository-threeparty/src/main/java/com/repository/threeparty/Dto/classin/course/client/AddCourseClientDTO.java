package com.repository.threeparty.Dto.classin.course.client;

import com.repository.threeparty.Dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AddCourseClientDTO extends BaseDto{

	/**
	 * 必填 课程名称
	 */
	private String courseName;
	/**
	 * 非必填 可用资源文件夹 ID
	 */
	private String folderId;
	/**
	 * 非必填 上传的课程封面图片
	 */
	private String Filedata;
	/**
	 * 非必填 过期时间
	 */
	private String expiryTime;
	/**
	 * 非必填 班主任账号(手机号)
	 */
	private String mainTeacherAccount;
	/**
	 * 非必填 课程简介
	 */
	private String courseIntroduce;
}
