package com.repository.crm.Dto.account.server.course;


/**
 * 
 * <pre>
 * 错题集描述
 * </pre>
 *
 * @author chenzhongxing
 * @version $Id: ErrorQuestion.java, v 0.1 2018年5月19日 下午3:45:15  Exp $
 */
public class ErrorQuestion {

	private String originalFileName;//文件名称
	private String fileAddress;//文件地址
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getFileAddress() {
		return fileAddress;
	}
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}
}
