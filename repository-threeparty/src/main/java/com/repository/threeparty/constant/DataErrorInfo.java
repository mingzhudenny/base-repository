package com.repository.threeparty.constant;

/**
 * 
 * @ClassName: DataErrorInfo
 * @author csy
 * @date 2017年12月30日 上午11:13:40
 */
public class DataErrorInfo {

	/**
	 * 返回值
	 */
	private String Data;
	/**
	 * 具体返回值
	 */
	private String error_info;
	@Override
	public String toString() {
		return "DataErrorInfo [Data=" + Data + ", error_info=" + error_info + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public String getError_info() {
		return error_info;
	}

	public void setError_info(String error_info) {
		this.error_info = error_info;
	}
}
