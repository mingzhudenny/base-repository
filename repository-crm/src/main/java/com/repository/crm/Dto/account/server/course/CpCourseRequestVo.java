package com.repository.crm.Dto.account.server.course;

import com.repository.crm.Po.CpCourseRequest;

/**
 * 
 * <pre>
 *  课程请求实体类扩展
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: CpCourseRequestVo.java, v 0.1 2018年5月19日 下午3:39:21  Exp $
 */
public class CpCourseRequestVo extends CpCourseRequest{
	
	    private Byte type; //课程类型

	    private String length;//课程时长

	    private Byte style;//上课形式

	    private String hz;//上课频率

	    private Byte level;//上课级别

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
