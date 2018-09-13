package com.repository.threeparty.constant;

/**
 * errorInfo
 * @ClassName: ErrorInfo
 * @author csy
 * @date 2017年12月30日 上午11:11:53
 */
public class ErrorInfo {
	/**
	 * 返回状态码
	 */
	private String errno;
	/**
	 * 返回码说明
	 */
	private String error;
	@Override
	public String toString() {
		return "ErrorInfo [errno=" + errno + ", error=" + error + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getErrno() {
		return errno;
	}
	public void setErrno(String errno) {
		this.errno = errno;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
